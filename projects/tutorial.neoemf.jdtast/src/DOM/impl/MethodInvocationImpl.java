/**
 */
package DOM.impl;

import Core.IMethod;

import DOM.DOMPackage;
import DOM.Expression;
import DOM.MethodInvocation;
import DOM.SimpleName;
import DOM.Type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.MethodInvocationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link DOM.impl.MethodInvocationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link DOM.impl.MethodInvocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link DOM.impl.MethodInvocationImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link DOM.impl.MethodInvocationImpl#getMethodBinding <em>Method Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodInvocationImpl extends ExpressionImpl implements MethodInvocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.METHOD_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getArguments() {
		return (EList<Expression>)eGet(DOMPackage.Literals.METHOD_INVOCATION__ARGUMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eGet(DOMPackage.Literals.METHOD_INVOCATION__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eSet(DOMPackage.Literals.METHOD_INVOCATION__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eGet(DOMPackage.Literals.METHOD_INVOCATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eSet(DOMPackage.Literals.METHOD_INVOCATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getTypeArguments() {
		return (EList<Type>)eGet(DOMPackage.Literals.METHOD_INVOCATION__TYPE_ARGUMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMethod getMethodBinding() {
		return (IMethod)eGet(DOMPackage.Literals.METHOD_INVOCATION__METHOD_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodBinding(IMethod newMethodBinding) {
		eSet(DOMPackage.Literals.METHOD_INVOCATION__METHOD_BINDING, newMethodBinding);
	}

} //MethodInvocationImpl
