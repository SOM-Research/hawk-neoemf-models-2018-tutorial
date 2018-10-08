/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.MethodRefParameter;
import DOM.SimpleName;
import DOM.Type;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Ref Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.MethodRefParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link DOM.impl.MethodRefParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link DOM.impl.MethodRefParameterImpl#getVarargs <em>Varargs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodRefParameterImpl extends ASTNodeImpl implements MethodRefParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodRefParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.METHOD_REF_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eGet(DOMPackage.Literals.METHOD_REF_PARAMETER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eSet(DOMPackage.Literals.METHOD_REF_PARAMETER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eGet(DOMPackage.Literals.METHOD_REF_PARAMETER__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eSet(DOMPackage.Literals.METHOD_REF_PARAMETER__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVarargs() {
		return (Boolean)eGet(DOMPackage.Literals.METHOD_REF_PARAMETER__VARARGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarargs(Boolean newVarargs) {
		eSet(DOMPackage.Literals.METHOD_REF_PARAMETER__VARARGS, newVarargs);
	}

} //MethodRefParameterImpl
