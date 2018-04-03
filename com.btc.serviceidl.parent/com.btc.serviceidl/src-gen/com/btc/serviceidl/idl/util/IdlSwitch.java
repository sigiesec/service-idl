/**
 * generated by Xtext 2.13.0
 */
package com.btc.serviceidl.idl.util;

import com.btc.serviceidl.idl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.btc.serviceidl.idl.IdlPackage
 * @generated
 */
public class IdlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IdlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = IdlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case IdlPackage.IDL_SPECIFICATION:
      {
        IDLSpecification idlSpecification = (IDLSpecification)theEObject;
        T result = caseIDLSpecification(idlSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.IMPORT_DECLARATION:
      {
        ImportDeclaration importDeclaration = (ImportDeclaration)theEObject;
        T result = caseImportDeclaration(importDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.MODULE_DECLARATION:
      {
        ModuleDeclaration moduleDeclaration = (ModuleDeclaration)theEObject;
        T result = caseModuleDeclaration(moduleDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.ABSTRACT_MODULE_COMPONENT:
      {
        AbstractModuleComponent abstractModuleComponent = (AbstractModuleComponent)theEObject;
        T result = caseAbstractModuleComponent(abstractModuleComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.ABSTRACT_EXCEPTION:
      {
        AbstractException abstractException = (AbstractException)theEObject;
        T result = caseAbstractException(abstractException);
        if (result == null) result = caseAbstractModuleComponent(abstractException);
        if (result == null) result = caseAbstractTypeDeclaration(abstractException);
        if (result == null) result = caseAbstractCrossReference(abstractException);
        if (result == null) result = caseAbstractInterfaceComponent(abstractException);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.EXCEPTION_REFERENCE_DECLARATION:
      {
        ExceptionReferenceDeclaration exceptionReferenceDeclaration = (ExceptionReferenceDeclaration)theEObject;
        T result = caseExceptionReferenceDeclaration(exceptionReferenceDeclaration);
        if (result == null) result = caseAbstractException(exceptionReferenceDeclaration);
        if (result == null) result = caseAbstractModuleComponent(exceptionReferenceDeclaration);
        if (result == null) result = caseAbstractTypeDeclaration(exceptionReferenceDeclaration);
        if (result == null) result = caseAbstractCrossReference(exceptionReferenceDeclaration);
        if (result == null) result = caseAbstractInterfaceComponent(exceptionReferenceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.EXCEPTION_DECLARATION:
      {
        ExceptionDeclaration exceptionDeclaration = (ExceptionDeclaration)theEObject;
        T result = caseExceptionDeclaration(exceptionDeclaration);
        if (result == null) result = caseAbstractException(exceptionDeclaration);
        if (result == null) result = caseAbstractModuleComponent(exceptionDeclaration);
        if (result == null) result = caseAbstractTypeDeclaration(exceptionDeclaration);
        if (result == null) result = caseAbstractCrossReference(exceptionDeclaration);
        if (result == null) result = caseAbstractInterfaceComponent(exceptionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.ABSTRACT_TYPE_DECLARATION:
      {
        AbstractTypeDeclaration abstractTypeDeclaration = (AbstractTypeDeclaration)theEObject;
        T result = caseAbstractTypeDeclaration(abstractTypeDeclaration);
        if (result == null) result = caseAbstractInterfaceComponent(abstractTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.ABSTRACT_CROSS_REFERENCE:
      {
        AbstractCrossReference abstractCrossReference = (AbstractCrossReference)theEObject;
        T result = caseAbstractCrossReference(abstractCrossReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.ABSTRACT_TYPE:
      {
        AbstractType abstractType = (AbstractType)theEObject;
        T result = caseAbstractType(abstractType);
        if (result == null) result = caseReturnTypeElement(abstractType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.ALIAS_DECLARATION:
      {
        AliasDeclaration aliasDeclaration = (AliasDeclaration)theEObject;
        T result = caseAliasDeclaration(aliasDeclaration);
        if (result == null) result = caseAbstractModuleComponent(aliasDeclaration);
        if (result == null) result = caseAbstractTypeDeclaration(aliasDeclaration);
        if (result == null) result = caseAbstractCrossReference(aliasDeclaration);
        if (result == null) result = caseAbstractInterfaceComponent(aliasDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.ENUM_DECLARATION:
      {
        EnumDeclaration enumDeclaration = (EnumDeclaration)theEObject;
        T result = caseEnumDeclaration(enumDeclaration);
        if (result == null) result = caseAbstractModuleComponent(enumDeclaration);
        if (result == null) result = caseAbstractTypeDeclaration(enumDeclaration);
        if (result == null) result = caseAbstractCrossReference(enumDeclaration);
        if (result == null) result = caseAbstractInterfaceComponent(enumDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.ABSTRACT_COLLECTION:
      {
        AbstractCollection abstractCollection = (AbstractCollection)theEObject;
        T result = caseAbstractCollection(abstractCollection);
        if (result == null) result = caseAbstractCrossReference(abstractCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.SEQUENCE_DECLARATION:
      {
        SequenceDeclaration sequenceDeclaration = (SequenceDeclaration)theEObject;
        T result = caseSequenceDeclaration(sequenceDeclaration);
        if (result == null) result = caseAbstractCollection(sequenceDeclaration);
        if (result == null) result = caseAbstractCrossReference(sequenceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.ABSTRACT_SEQUENCE_HINT:
      {
        AbstractSequenceHint abstractSequenceHint = (AbstractSequenceHint)theEObject;
        T result = caseAbstractSequenceHint(abstractSequenceHint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.TYPICAL_LENGTH_HINT:
      {
        TypicalLengthHint typicalLengthHint = (TypicalLengthHint)theEObject;
        T result = caseTypicalLengthHint(typicalLengthHint);
        if (result == null) result = caseAbstractSequenceHint(typicalLengthHint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.TYPICAL_SIZE_HINT:
      {
        TypicalSizeHint typicalSizeHint = (TypicalSizeHint)theEObject;
        T result = caseTypicalSizeHint(typicalSizeHint);
        if (result == null) result = caseAbstractSequenceHint(typicalSizeHint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.TUPLE_DECLARATION:
      {
        TupleDeclaration tupleDeclaration = (TupleDeclaration)theEObject;
        T result = caseTupleDeclaration(tupleDeclaration);
        if (result == null) result = caseAbstractCollection(tupleDeclaration);
        if (result == null) result = caseAbstractCrossReference(tupleDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.STRUCT_DECLARATION:
      {
        StructDeclaration structDeclaration = (StructDeclaration)theEObject;
        T result = caseStructDeclaration(structDeclaration);
        if (result == null) result = caseAbstractModuleComponent(structDeclaration);
        if (result == null) result = caseAbstractTypeDeclaration(structDeclaration);
        if (result == null) result = caseAbstractCrossReference(structDeclaration);
        if (result == null) result = caseAbstractInterfaceComponent(structDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.MEMBER_ELEMENT:
      {
        MemberElement memberElement = (MemberElement)theEObject;
        T result = caseMemberElement(memberElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.KEY_ELEMENT:
      {
        KeyElement keyElement = (KeyElement)theEObject;
        T result = caseKeyElement(keyElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.INTERFACE_DECLARATION:
      {
        InterfaceDeclaration interfaceDeclaration = (InterfaceDeclaration)theEObject;
        T result = caseInterfaceDeclaration(interfaceDeclaration);
        if (result == null) result = caseAbstractModuleComponent(interfaceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.ABSTRACT_INTERFACE_COMPONENT:
      {
        AbstractInterfaceComponent abstractInterfaceComponent = (AbstractInterfaceComponent)theEObject;
        T result = caseAbstractInterfaceComponent(abstractInterfaceComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.FUNCTION_DECLARATION:
      {
        FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
        T result = caseFunctionDeclaration(functionDeclaration);
        if (result == null) result = caseAbstractInterfaceComponent(functionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.EVENT_DECLARATION:
      {
        EventDeclaration eventDeclaration = (EventDeclaration)theEObject;
        T result = caseEventDeclaration(eventDeclaration);
        if (result == null) result = caseAbstractInterfaceComponent(eventDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.RETURN_TYPE_ELEMENT:
      {
        ReturnTypeElement returnTypeElement = (ReturnTypeElement)theEObject;
        T result = caseReturnTypeElement(returnTypeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.PARAMETER_ELEMENT:
      {
        ParameterElement parameterElement = (ParameterElement)theEObject;
        T result = caseParameterElement(parameterElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.DOC_COMMENT_ELEMENT:
      {
        DocCommentElement docCommentElement = (DocCommentElement)theEObject;
        T result = caseDocCommentElement(docCommentElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IdlPackage.PRIMITIVE_TYPE:
      {
        PrimitiveType primitiveType = (PrimitiveType)theEObject;
        T result = casePrimitiveType(primitiveType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IDL Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IDL Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIDLSpecification(IDLSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportDeclaration(ImportDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuleDeclaration(ModuleDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Module Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Module Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractModuleComponent(AbstractModuleComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Exception</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Exception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractException(AbstractException object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exception Reference Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exception Reference Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExceptionReferenceDeclaration(ExceptionReferenceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exception Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exception Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExceptionDeclaration(ExceptionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractTypeDeclaration(AbstractTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Cross Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Cross Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractCrossReference(AbstractCrossReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractType(AbstractType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAliasDeclaration(AliasDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumDeclaration(EnumDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractCollection(AbstractCollection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceDeclaration(SequenceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Sequence Hint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Sequence Hint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractSequenceHint(AbstractSequenceHint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typical Length Hint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typical Length Hint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypicalLengthHint(TypicalLengthHint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typical Size Hint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typical Size Hint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypicalSizeHint(TypicalSizeHint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTupleDeclaration(TupleDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructDeclaration(StructDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMemberElement(MemberElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyElement(KeyElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceDeclaration(InterfaceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Interface Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Interface Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractInterfaceComponent(AbstractInterfaceComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDeclaration(FunctionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventDeclaration(EventDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Type Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Type Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnTypeElement(ReturnTypeElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterElement(ParameterElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Doc Comment Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Doc Comment Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocCommentElement(DocCommentElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveType(PrimitiveType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //IdlSwitch
