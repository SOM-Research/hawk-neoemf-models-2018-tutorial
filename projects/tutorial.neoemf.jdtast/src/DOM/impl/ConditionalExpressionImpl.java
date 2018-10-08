/**
 */
package DOM.impl;

import DOM.ConditionalExpression;
import DOM.DOMPackage;
import DOM.Expression;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.ConditionalExpressionImpl#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link DOM.impl.ConditionalExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link DOM.impl.ConditionalExpressionImpl#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalExpressionImpl extends ExpressionImpl implements ConditionalExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.CONDITIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getElseExpression() {
		return (Expression)eGet(DOMPackage.Literals.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseExpression(Expression newElseExpression) {
		eSet(DOMPackage.Literals.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION, newElseExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eGet(DOMPackage.Literals.CONDITIONAL_EXPRESSION__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eSet(DOMPackage.Literals.CONDITIONAL_EXPRESSION__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getThenExpression() {
		return (Expression)eGet(DOMPackage.Literals.CONDITIONAL_EXPRESSION__THEN_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenExpression(Expression newThenExpression) {
		eSet(DOMPackage.Literals.CONDITIONAL_EXPRESSION__THEN_EXPRESSION, newThenExpression);
	}

} //ConditionalExpressionImpl
