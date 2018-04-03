/**
 * generated by Xtext 2.13.0
 */
package com.btc.serviceidl.idl.impl;

import com.btc.serviceidl.idl.AbstractException;
import com.btc.serviceidl.idl.DocCommentElement;
import com.btc.serviceidl.idl.FunctionDeclaration;
import com.btc.serviceidl.idl.IdlPackage;
import com.btc.serviceidl.idl.ParameterElement;
import com.btc.serviceidl.idl.ReturnTypeElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.btc.serviceidl.idl.impl.FunctionDeclarationImpl#getDocComments <em>Doc Comments</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.impl.FunctionDeclarationImpl#isSync <em>Sync</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.impl.FunctionDeclarationImpl#isQuery <em>Query</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.impl.FunctionDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.impl.FunctionDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.impl.FunctionDeclarationImpl#isInjected <em>Injected</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.impl.FunctionDeclarationImpl#getReturnedType <em>Returned Type</em>}</li>
 *   <li>{@link com.btc.serviceidl.idl.impl.FunctionDeclarationImpl#getRaisedExceptions <em>Raised Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDeclarationImpl extends AbstractInterfaceComponentImpl implements FunctionDeclaration
{
  /**
   * The cached value of the '{@link #getDocComments() <em>Doc Comments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocComments()
   * @generated
   * @ordered
   */
  protected EList<DocCommentElement> docComments;

  /**
   * The default value of the '{@link #isSync() <em>Sync</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSync()
   * @generated
   * @ordered
   */
  protected static final boolean SYNC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSync() <em>Sync</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSync()
   * @generated
   * @ordered
   */
  protected boolean sync = SYNC_EDEFAULT;

  /**
   * The default value of the '{@link #isQuery() <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQuery()
   * @generated
   * @ordered
   */
  protected static final boolean QUERY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isQuery() <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQuery()
   * @generated
   * @ordered
   */
  protected boolean query = QUERY_EDEFAULT;

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
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<ParameterElement> parameters;

  /**
   * The default value of the '{@link #isInjected() <em>Injected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInjected()
   * @generated
   * @ordered
   */
  protected static final boolean INJECTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInjected() <em>Injected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInjected()
   * @generated
   * @ordered
   */
  protected boolean injected = INJECTED_EDEFAULT;

  /**
   * The cached value of the '{@link #getReturnedType() <em>Returned Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnedType()
   * @generated
   * @ordered
   */
  protected ReturnTypeElement returnedType;

  /**
   * The cached value of the '{@link #getRaisedExceptions() <em>Raised Exceptions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRaisedExceptions()
   * @generated
   * @ordered
   */
  protected EList<AbstractException> raisedExceptions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionDeclarationImpl()
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
    return IdlPackage.Literals.FUNCTION_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DocCommentElement> getDocComments()
  {
    if (docComments == null)
    {
      docComments = new EObjectContainmentEList<DocCommentElement>(DocCommentElement.class, this, IdlPackage.FUNCTION_DECLARATION__DOC_COMMENTS);
    }
    return docComments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSync()
  {
    return sync;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSync(boolean newSync)
  {
    boolean oldSync = sync;
    sync = newSync;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.FUNCTION_DECLARATION__SYNC, oldSync, sync));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(boolean newQuery)
  {
    boolean oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.FUNCTION_DECLARATION__QUERY, oldQuery, query));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.FUNCTION_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterElement> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<ParameterElement>(ParameterElement.class, this, IdlPackage.FUNCTION_DECLARATION__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInjected()
  {
    return injected;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInjected(boolean newInjected)
  {
    boolean oldInjected = injected;
    injected = newInjected;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.FUNCTION_DECLARATION__INJECTED, oldInjected, injected));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnTypeElement getReturnedType()
  {
    return returnedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnedType(ReturnTypeElement newReturnedType, NotificationChain msgs)
  {
    ReturnTypeElement oldReturnedType = returnedType;
    returnedType = newReturnedType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdlPackage.FUNCTION_DECLARATION__RETURNED_TYPE, oldReturnedType, newReturnedType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnedType(ReturnTypeElement newReturnedType)
  {
    if (newReturnedType != returnedType)
    {
      NotificationChain msgs = null;
      if (returnedType != null)
        msgs = ((InternalEObject)returnedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdlPackage.FUNCTION_DECLARATION__RETURNED_TYPE, null, msgs);
      if (newReturnedType != null)
        msgs = ((InternalEObject)newReturnedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdlPackage.FUNCTION_DECLARATION__RETURNED_TYPE, null, msgs);
      msgs = basicSetReturnedType(newReturnedType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdlPackage.FUNCTION_DECLARATION__RETURNED_TYPE, newReturnedType, newReturnedType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractException> getRaisedExceptions()
  {
    if (raisedExceptions == null)
    {
      raisedExceptions = new EObjectResolvingEList<AbstractException>(AbstractException.class, this, IdlPackage.FUNCTION_DECLARATION__RAISED_EXCEPTIONS);
    }
    return raisedExceptions;
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
      case IdlPackage.FUNCTION_DECLARATION__DOC_COMMENTS:
        return ((InternalEList<?>)getDocComments()).basicRemove(otherEnd, msgs);
      case IdlPackage.FUNCTION_DECLARATION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case IdlPackage.FUNCTION_DECLARATION__RETURNED_TYPE:
        return basicSetReturnedType(null, msgs);
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
      case IdlPackage.FUNCTION_DECLARATION__DOC_COMMENTS:
        return getDocComments();
      case IdlPackage.FUNCTION_DECLARATION__SYNC:
        return isSync();
      case IdlPackage.FUNCTION_DECLARATION__QUERY:
        return isQuery();
      case IdlPackage.FUNCTION_DECLARATION__NAME:
        return getName();
      case IdlPackage.FUNCTION_DECLARATION__PARAMETERS:
        return getParameters();
      case IdlPackage.FUNCTION_DECLARATION__INJECTED:
        return isInjected();
      case IdlPackage.FUNCTION_DECLARATION__RETURNED_TYPE:
        return getReturnedType();
      case IdlPackage.FUNCTION_DECLARATION__RAISED_EXCEPTIONS:
        return getRaisedExceptions();
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
      case IdlPackage.FUNCTION_DECLARATION__DOC_COMMENTS:
        getDocComments().clear();
        getDocComments().addAll((Collection<? extends DocCommentElement>)newValue);
        return;
      case IdlPackage.FUNCTION_DECLARATION__SYNC:
        setSync((Boolean)newValue);
        return;
      case IdlPackage.FUNCTION_DECLARATION__QUERY:
        setQuery((Boolean)newValue);
        return;
      case IdlPackage.FUNCTION_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case IdlPackage.FUNCTION_DECLARATION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends ParameterElement>)newValue);
        return;
      case IdlPackage.FUNCTION_DECLARATION__INJECTED:
        setInjected((Boolean)newValue);
        return;
      case IdlPackage.FUNCTION_DECLARATION__RETURNED_TYPE:
        setReturnedType((ReturnTypeElement)newValue);
        return;
      case IdlPackage.FUNCTION_DECLARATION__RAISED_EXCEPTIONS:
        getRaisedExceptions().clear();
        getRaisedExceptions().addAll((Collection<? extends AbstractException>)newValue);
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
      case IdlPackage.FUNCTION_DECLARATION__DOC_COMMENTS:
        getDocComments().clear();
        return;
      case IdlPackage.FUNCTION_DECLARATION__SYNC:
        setSync(SYNC_EDEFAULT);
        return;
      case IdlPackage.FUNCTION_DECLARATION__QUERY:
        setQuery(QUERY_EDEFAULT);
        return;
      case IdlPackage.FUNCTION_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IdlPackage.FUNCTION_DECLARATION__PARAMETERS:
        getParameters().clear();
        return;
      case IdlPackage.FUNCTION_DECLARATION__INJECTED:
        setInjected(INJECTED_EDEFAULT);
        return;
      case IdlPackage.FUNCTION_DECLARATION__RETURNED_TYPE:
        setReturnedType((ReturnTypeElement)null);
        return;
      case IdlPackage.FUNCTION_DECLARATION__RAISED_EXCEPTIONS:
        getRaisedExceptions().clear();
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
      case IdlPackage.FUNCTION_DECLARATION__DOC_COMMENTS:
        return docComments != null && !docComments.isEmpty();
      case IdlPackage.FUNCTION_DECLARATION__SYNC:
        return sync != SYNC_EDEFAULT;
      case IdlPackage.FUNCTION_DECLARATION__QUERY:
        return query != QUERY_EDEFAULT;
      case IdlPackage.FUNCTION_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IdlPackage.FUNCTION_DECLARATION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case IdlPackage.FUNCTION_DECLARATION__INJECTED:
        return injected != INJECTED_EDEFAULT;
      case IdlPackage.FUNCTION_DECLARATION__RETURNED_TYPE:
        return returnedType != null;
      case IdlPackage.FUNCTION_DECLARATION__RAISED_EXCEPTIONS:
        return raisedExceptions != null && !raisedExceptions.isEmpty();
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
    result.append(" (sync: ");
    result.append(sync);
    result.append(", query: ");
    result.append(query);
    result.append(", name: ");
    result.append(name);
    result.append(", injected: ");
    result.append(injected);
    result.append(')');
    return result.toString();
  }

} //FunctionDeclarationImpl
