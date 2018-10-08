/**
 */
package Core.impl;

import Core.CorePackage;
import Core.IMethod;
import Core.Parameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Core.impl.IMethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link Core.impl.IMethodImpl#getIsConstructor <em>Is Constructor</em>}</li>
 *   <li>{@link Core.impl.IMethodImpl#getIsMainMethod <em>Is Main Method</em>}</li>
 *   <li>{@link Core.impl.IMethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link Core.impl.IMethodImpl#getExceptionTypes <em>Exception Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IMethodImpl extends IMemberImpl implements IMethod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IMETHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnType() {
		return (String)eGet(CorePackage.Literals.IMETHOD__RETURN_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(String newReturnType) {
		eSet(CorePackage.Literals.IMETHOD__RETURN_TYPE, newReturnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConstructor() {
		return (Boolean)eGet(CorePackage.Literals.IMETHOD__IS_CONSTRUCTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConstructor(Boolean newIsConstructor) {
		eSet(CorePackage.Literals.IMETHOD__IS_CONSTRUCTOR, newIsConstructor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMainMethod() {
		return (Boolean)eGet(CorePackage.Literals.IMETHOD__IS_MAIN_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMainMethod(Boolean newIsMainMethod) {
		eSet(CorePackage.Literals.IMETHOD__IS_MAIN_METHOD, newIsMainMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eGet(CorePackage.Literals.IMETHOD__PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getExceptionTypes() {
		return (EList<String>)eGet(CorePackage.Literals.IMETHOD__EXCEPTION_TYPES, true);
	}

} //IMethodImpl
