/**
 * generated by Xtext 2.13.0
 */
package com.btc.serviceidl.idl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.btc.serviceidl.idl.EnumDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.EnumDeclaration#getContainedIdentifiers <em>Contained Identifiers</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.EnumDeclaration#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 *
 * @see com.btc.serviceidl.idl.IdlPackage#getEnumDeclaration()
 * @model
 * @generated
 */
public interface EnumDeclaration extends AbstractModuleComponent, AbstractTypeDeclaration, AbstractCrossReference
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.btc.serviceidl.idl.IdlPackage#getEnumDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.btc.serviceidl.idl.EnumDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Contained Identifiers</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contained Identifiers</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contained Identifiers</em>' attribute list.
   * @see com.btc.serviceidl.idl.IdlPackage#getEnumDeclaration_ContainedIdentifiers()
   * @model unique="false"
   * @generated
   */
  EList<String> getContainedIdentifiers();

  /**
   * Returns the value of the '<em><b>Declarator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarator</em>' attribute.
   * @see #setDeclarator(String)
   * @see com.btc.serviceidl.idl.IdlPackage#getEnumDeclaration_Declarator()
   * @model
   * @generated
   */
  String getDeclarator();

  /**
   * Sets the value of the '{@link com.btc.serviceidl.idl.EnumDeclaration#getDeclarator <em>Declarator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declarator</em>' attribute.
   * @see #getDeclarator()
   * @generated
   */
  void setDeclarator(String value);

} // EnumDeclaration
