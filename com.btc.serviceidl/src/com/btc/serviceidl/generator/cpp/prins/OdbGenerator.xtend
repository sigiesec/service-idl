/*********************************************************************
 * \author see AUTHORS file
 * \copyright 2015-2018 BTC Business Technology Consulting AG and others
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 **********************************************************************/
package com.btc.serviceidl.generator.cpp.prins

import com.btc.serviceidl.generator.cpp.TypeResolver
import com.btc.serviceidl.idl.AbstractType
import com.btc.serviceidl.idl.AliasDeclaration
import com.btc.serviceidl.idl.EnumDeclaration
import com.btc.serviceidl.idl.PrimitiveType
import com.btc.serviceidl.idl.SequenceDeclaration
import com.btc.serviceidl.idl.StructDeclaration
import com.btc.serviceidl.util.MemberElementWrapper
import java.util.HashSet
import java.util.Set
import java.util.concurrent.atomic.AtomicInteger
import org.eclipse.xtend.lib.annotations.Accessors

import static extension com.btc.serviceidl.generator.cpp.Util.*
import static extension com.btc.serviceidl.util.Extensions.*
import static extension com.btc.serviceidl.util.Util.*

@Accessors
class OdbGenerator
{
    val extension TypeResolver typeResolver

    def generateODBTraitsBody()
    {
        val guidResolved = resolveSymbol(PrinsTypeNames.GUID)
        
        '''
            namespace odb
            {
               // ***** MSSQL *****
               namespace mssql
               {
                  template<>
                  struct default_type_traits<«guidResolved»>
                  {
                     static const database_type_id db_type_id = «resolveSymbol("id_uniqueidentifier")»;
                  };
            
                  template<>
                  class value_traits<«guidResolved», id_uniqueidentifier>
                  {
                  public:
                     typedef «guidResolved»   value_type;
                     typedef «guidResolved»   query_type;
                     typedef uniqueidentifier            image_type;
            
                     static void set_value(value_type& val, const image_type& img, bool is_null)
                     {
                        if (!is_null)
                        {
                           «resolveSymbol("BTC::Commons::CoreExtras::UUID")» uuid;
                           «resolveSymbol("std::array")»<char, 16> db_data;
                           «resolveSymbol("std::memcpy")»(db_data.data(), &img, 16);
                           «resolveSymbol("BTC::PRINS::Commons::Utilities::GUIDHelper")»::guidEncode(db_data.data(), uuid);
                           val = «guidResolved»::FromStringSafe("{" + uuid.ToString() + "}");
                        }
                        else
                           val = «guidResolved»::nullGuid;
                     }
            
                     static void set_image(image_type& img, bool& is_null, const value_type& val)
                     {
                        is_null = false;
                        auto uuid = BTC::Commons::CoreExtras::UUID::ParseString(val.ToString());
                        std::array<char, 16> db_data;
                        BTC::PRINS::Commons::Utilities::GUIDHelper::guidDecode(uuid, db_data.data());
                        std::memcpy(&img, db_data.data(), 16);
                     }
                  };
               }
               
               // ***** ORACLE *****
               namespace oracle
               {
                  template<>
                  struct default_type_traits<«resolveSymbol(PrinsTypeNames.GUID)»>
                  {
                     static const database_type_id db_type_id = «resolveSymbol("id_raw")»;
                  };
            
                  template<>
                  class value_traits<«guidResolved», id_raw>
                  {
                  public:
                     typedef «guidResolved»   value_type;
                     typedef «guidResolved»   query_type;
                     typedef char                        image_type[16];
            
                     static void set_value(value_type& val, const image_type img, std::size_t n, bool is_null)
                     {
                        «resolveSymbol("BTC::Commons::CoreExtras::UUID")» uuid;
                        «resolveSymbol("std::vector")»<char> db_data;
                        db_data.reserve(n);
                        «resolveSymbol("std::memcpy")»(db_data.data(), img, n);
                        «resolveSymbol("BTC::PRINS::Commons::Utilities::GUIDHelper")»::guidEncode(db_data.data(), uuid);
                        val = «guidResolved»::FromStringSafe("{" + uuid.ToString() + "}");
                     }
            
                     static void set_image(image_type img, std::size_t c, std::size_t& n, bool& is_null, const value_type& val)
                     {
                        is_null = false;
                        auto uuid = BTC::Commons::CoreExtras::UUID::ParseString(val.ToString());
                        std::vector<char> db_data;
                        db_data.resize(16);
                        BTC::PRINS::Commons::Utilities::GUIDHelper::guidDecode(uuid, db_data.data());
                        n = db_data.size();
                        std::memcpy (img, db_data.data(), n);
                     }
                  };
               }
            }
        '''

    }

    def private dispatch String resolveODBType(PrimitiveType element)
    {
        if (element.integerType !== null)
        {
            switch element.integerType
            {
                case "int64":
                    return "long"
                case "int32":
                    return "int"
                case "int16":
                    return "short"
                case "byte":
                    return "signed char"
                default:
                    return element.integerType
            }
        }
        else if (element.stringType !== null)
            return resolveSymbol("std::string")
        else if (element.floatingPointType !== null)
            return element.floatingPointType
        else if (element.uuidType !== null)
            return resolveSymbol(PrinsTypeNames.GUID)
        else if (element.booleanType !== null)
            return "bool"
        else if (element.charType !== null)
            return "char"

        throw new IllegalArgumentException("Unknown PrimitiveType: " + element.class.toString)
    }

    def private dispatch String resolveODBType(StructDeclaration element)
    {
        element.name
    }

    def private dispatch String resolveODBType(AliasDeclaration element)
    {
        resolveODBType(element.type)
    }

    def private dispatch String resolveODBType(SequenceDeclaration element)
    {
        '''«resolveSymbol("std::vector")»<«resolveODBType(element.ultimateType)»>'''
    }

    def private dispatch String resolveODBType(EnumDeclaration element)
    {
        return "int"
    }

    def private dispatch String resolveODBType(AbstractType element)
    {
        if (element.primitiveType !== null)
            return resolveODBType(element.primitiveType)
        else if (element.referenceType !== null)
            return resolveODBType(element.referenceType)
        else if (element.collectionType !== null)
            return resolveODBType(element.collectionType)

        throw new IllegalArgumentException("Unknown AbstractType: " + element.class.toString)
    }

    def private String makeODBColumn(MemberElementWrapper member, Set<String> existing_column_names)
    {
        val column_name = member.name.toUpperCase
        val is_uuid = member.type.ultimateType.isUUIDType
        val is_optional = member.optional

        val is_sequence = member.type.isSequenceType
        if (is_sequence)
            return ""

        val ultimate_type = member.type.ultimateType
        if (ultimate_type instanceof StructDeclaration)
        {
            // no content for a DB column: leave
            // otherwise ODB error "No persistent data members in the class" 
            if (ultimate_type.members.empty)
                return ""
        }

        // Oracle does not support column names longer than 30 characters,
        // therefore we need to truncate names which exceeds this limit!
        var normalized_column_name = member.name.toUpperCase
        val size = member.calculateMaximalNameLength
        if (size > 30)
        {
            normalized_column_name = member.name.replaceAll("[a-z]", "").toUpperCase
            var temp_name = normalized_column_name
            var index = new AtomicInteger(1); // TODO why should this be atomic? we only use a single thread
            while (existing_column_names.contains(temp_name))
            {
                temp_name = normalized_column_name + (index.addAndGet(1) ).toString
            }
            normalized_column_name = temp_name
        }

        existing_column_names.add(normalized_column_name)

        '''
            #pragma db «IF is_uuid && column_name == "ID"»id «ENDIF»column("«normalized_column_name»")«IF is_uuid» oracle:type("RAW(16)") mssql:type("UNIQUEIDENTIFIER")«ENDIF»
            «IF is_optional»«resolveSymbol("odb::nullable")»<«ENDIF»«resolveODBType(member.type)»«IF is_optional»>«ENDIF» «column_name»;
        '''
    }

    def generateHxx(StructDeclaration struct)
    {
        val table_name = struct.name.toUpperCase
        val class_name = struct.name.toLowerCase

        val existing_column_names = new HashSet<String>

        '''
            #pragma db object table("«table_name»")
            class «class_name»
            {
            public:
               «class_name» () {}
               
               «FOR member : struct.allMembers»
                   «makeODBColumn(member, existing_column_names)»
               «ENDFOR»
            };
        '''
    }

    def generateCommonHxx(Iterable<StructDeclaration> common_types)
    {
        val existing_column_names = new HashSet<String>

        '''
            «FOR type : common_types»
                «IF !type.members.empty»
                    #pragma db value
                    struct «type.name»
                    {
                       «FOR member : type.allMembers»
                           «makeODBColumn(member, existing_column_names)»
                       «ENDFOR»
                    };
                «ENDIF»
            «ENDFOR»
        '''
    }
}
