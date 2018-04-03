/**
 * generated by Xtext 2.13.0
 */
package com.btc.serviceidl.idl.impl;

import com.btc.serviceidl.idl.AbstractTypeDeclaration;
import com.btc.serviceidl.idl.IdlPackage;
import com.btc.serviceidl.idl.MemberElement;
import com.btc.serviceidl.idl.StructDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.btc.serviceidl.idl.impl.StructDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.impl.StructDeclarationImpl#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.impl.StructDeclarationImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.impl.StructDeclarationImpl#getTypeDecls <em>Type Decls</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.impl.StructDeclarationImpl#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructDeclarationImpl extends AbstractModuleComponentImpl implements StructDeclaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupertype()
   * @generated
   * @ordered
   */
  protected StructDeclaration supertype;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<MemberElement> members;

  /**
   * The cached value of the '{@link #getTypeDecls() <em>Type Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDecls()
   * @generated
   * @ordered
   */
  protected EList<AbstractTypeDeclaration> typeDecls;

  /**
   * The default value of the '{@link #getDeclarator() <em>Declarator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarator()
   * @generated
   * @ordered
   */
  protected static final String DECLARATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeclarator() <em>Declarator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarator()
   * @generated
   * @ordered
   */
  protected String declarator = DECLARATOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IdlPackage.Literals.STRUCT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.STRUCT_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructDeclaration getSupertype()
  {
    if (supertype != null && supertype.eIsProxy())
    {
      InternalEObject oldSupertype = (InternalEObject)supertype;
      supertype = (StructDeclaration)eResolveProxy(oldSupertype);
      if (supertype != oldSupertype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdlPackage.STRUCT_DECLARATION__SUPERTYPE, oldSupertype, supertype));
      }
    }
    return supertype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructDeclaration basicGetSupertype()
  {
    return supertype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupertype(StructDeclaration newSupertype)
  {
    StructDeclaration oldSupertype = supertype;
    supertype = newSupertype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.STRUCT_DECLARATION__SUPERTYPE, oldSupertype, supertype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MemberElement> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<MemberElement>(MemberElement.class, this, IdlPackage.STRUCT_DECLARATION__MEMBERS);
    }
    return members;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractTypeDeclaration> getTypeDecls()
  {
    if (typeDecls == null)
    {
      typeDecls = new EObjectContainmentEList<AbstractTypeDeclaration>(AbstractTypeDeclaration.class, this, IdlPackage.STRUCT_DECLARATION__TYPE_DECLS);
    }
    return typeDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeclarator()
  {
    return declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclarator(String newDeclarator)
  {
    String oldDeclarator = declarator;
    declarator = newDeclarator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.STRUCT_DECLARATION__DECLARATOR, oldDeclarator, declarator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IdlPackage.STRUCT_DECLARATION__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
      case IdlPackage.STRUCT_DECLARATION__TYPE_DECLS:
        return ((InternalEList<?>)getTypeDecls()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IdlPackage.STRUCT_DECLARATION__NAME:
        return getName();
      case IdlPackage.STRUCT_DECLARATION__SUPERTYPE:
        if (resolve) return getSupertype();
        return basicGetSupertype();
      case IdlPackage.STRUCT_DECLARATION__MEMBERS:
        return getMembers();
      case IdlPackage.STRUCT_DECLARATION__TYPE_DECLS:
        return getTypeDecls();
      case IdlPackage.STRUCT_DECLARATION__DECLARATOR:
        return getDeclarator();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IdlPackage.STRUCT_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case IdlPackage.STRUCT_DECLARATION__SUPERTYPE:
        setSupertype((StructDeclaration)newValue);
        return;
      case IdlPackage.STRUCT_DECLARATION__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends MemberElement>)newValue);
        return;
      case IdlPackage.STRUCT_DECLARATION__TYPE_DECLS:
        getTypeDecls().clear();
        getTypeDecls().addAll((Collection<? extends AbstractTypeDeclaration>)newValue);
        return;
      case IdlPackage.STRUCT_DECLARATION__DECLARATOR:
        setDeclarator((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IdlPackage.STRUCT_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IdlPackage.STRUCT_DECLARATION__SUPERTYPE:
        setSupertype((StructDeclaration)null);
        return;
      case IdlPackage.STRUCT_DECLARATION__MEMBERS:
        getMembers().clear();
        return;
      case IdlPackage.STRUCT_DECLARATION__TYPE_DECLS:
        getTypeDecls().clear();
        return;
      case IdlPackage.STRUCT_DECLARATION__DECLARATOR:
        setDeclarator(DECLARATOR_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IdlPackage.STRUCT_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IdlPackage.STRUCT_DECLARATION__SUPERTYPE:
        return supertype != null;
      case IdlPackage.STRUCT_DECLARATION__MEMBERS:
        return members != null && !members.isEmpty();
      case IdlPackage.STRUCT_DECLARATION__TYPE_DECLS:
        return typeDecls != null && !typeDecls.isEmpty();
      case IdlPackage.STRUCT_DECLARATION__DECLARATOR:
        return DECLARATOR_EDEFAULT == null ? declarator != null : !DECLARATOR_EDEFAULT.equals(declarator);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", declarator: ");
    result.append(declarator);
    result.append(')');
    return result.toString();
  }

} //StructDeclarationImpl
