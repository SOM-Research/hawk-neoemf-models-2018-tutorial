/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Expression;
import DOM.Name;
import DOM.SuperMethodInvocation;
import DOM.Type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.SuperMethodInvocationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link DOM.impl.SuperMethodInvocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link DOM.impl.SuperMethodInvocationImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link DOM.impl.SuperMethodInvocationImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperMethodInvocationImpl extends ExpressionImpl implements SuperMethodInvocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperMethodInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.SUPER_METHOD_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getArguments() {
		return (EList<Expression>)eGet(DOMPackage.Literals.SUPER_METHOD_INVOCATION__ARGUMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		return (Name)eGet(DOMPackage.Literals.SUPER_METHOD_INVOCATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		eSet(DOMPackage.Literals.SUPER_METHOD_INVOCATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getQualifier() {
		return (Name)eGet(DOMPackage.Literals.SUPER_METHOD_INVOCATION__QUALIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(Name newQualifier) {
		eSet(DOMPackage.Literals.SUPER_METHOD_INVOCATION__QUALIFIER, newQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getTypeArguments() {
		return (EList<Type>)eGet(DOMPackage.Literals.SUPER_METHOD_INVOCATION__TYPE_ARGUMENTS, true);
	}

} //SuperMethodInvocationImpl
