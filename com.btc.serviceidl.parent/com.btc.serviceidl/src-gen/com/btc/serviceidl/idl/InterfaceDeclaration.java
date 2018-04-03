/**
 * generated by Xtext 2.13.0
 */
package com.btc.serviceidl.idl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.btc.serviceidl.idl.InterfaceDeclaration#getDocComments <em>Doc Comments</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.InterfaceDeclaration#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.InterfaceDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.InterfaceDeclaration#getVersion <em>Version</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.InterfaceDeclaration#getGuid <em>Guid</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.InterfaceDeclaration#getDerivesFrom <em>Derives From</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.InterfaceDeclaration#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see com.btc.serviceidl.idl.IdlPackage#getInterfaceDeclaration()
 * @model
 * @generated
 */
public interface InterfaceDeclaration extends AbstractModuleComponent
{
  /**
   * Returns the value of the '<em><b>Doc Comments</b></em>' containment reference list.
   * The list contents are of type {@link com.btc.serviceidl.idl.DocCommentElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc Comments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc Comments</em>' containment reference list.
   * @see com.btc.serviceidl.idl.IdlPackage#getInterfaceDeclaration_DocComments()
   * @model containment="true"
   * @generated
   */
  EList<DocCommentElement> getDocComments();

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see com.btc.serviceidl.idl.IdlPackage#getInterfaceDeclaration_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link com.btc.serviceidl.idl.InterfaceDeclaration#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

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
   * @see com.btc.serviceidl.idl.IdlPackage#getInterfaceDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.btc.serviceidl.idl.InterfaceDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see com.btc.serviceidl.idl.IdlPackage#getInterfaceDeclaration_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link com.btc.serviceidl.idl.InterfaceDeclaration#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Guid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guid</em>' attribute.
   * @see #setGuid(String)
   * @see com.btc.serviceidl.idl.IdlPackage#getInterfaceDeclaration_Guid()
   * @model
   * @generated
   */
  String getGuid();

  /**
   * Sets the value of the '{@link com.btc.serviceidl.idl.InterfaceDeclaration#getGuid <em>Guid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guid</em>' attribute.
   * @see #getGuid()
   * @generated
   */
  void setGuid(String value);

  /**
   * Returns the value of the '<em><b>Derives From</b></em>' reference list.
   * The list contents are of type {@link com.btc.serviceidl.idl.InterfaceDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Derives From</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Derives From</em>' reference list.
   * @see com.btc.serviceidl.idl.IdlPackage#getInterfaceDeclaration_DerivesFrom()
   * @model
   * @generated
   */
  EList<InterfaceDeclaration> getDerivesFrom();

  /**
   * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
   * The list contents are of type {@link com.btc.serviceidl.idl.AbstractInterfaceComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contains</em>' containment reference list.
   * @see com.btc.serviceidl.idl.IdlPackage#getInterfaceDeclaration_Contains()
   * @model containment="true"
   * @generated
   */
  EList<AbstractInterfaceComponent> getContains();

} // InterfaceDeclaration
