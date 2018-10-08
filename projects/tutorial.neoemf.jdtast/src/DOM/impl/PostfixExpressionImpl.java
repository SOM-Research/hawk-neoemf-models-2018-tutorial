/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Expression;
import DOM.PostfixExpression;
import DOM.PostfixExpressionOperatorKind;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postfix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.PostfixExpressionImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link DOM.impl.PostfixExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostfixExpressionImpl extends ExpressionImpl implements PostfixExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostfixExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.POSTFIX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOperand() {
		return (Expression)eGet(DOMPackage.Literals.POSTFIX_EXPRESSION__OPERAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(Expression newOperand) {
		eSet(DOMPackage.Literals.POSTFIX_EXPRESSION__OPERAND, newOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostfixExpressionOperatorKind getOperator() {
		return (PostfixExpressionOperatorKind)eGet(DOMPackage.Literals.POSTFIX_EXPRESSION__OPERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(PostfixExpressionOperatorKind newOperator) {
		eSet(DOMPackage.Literals.POSTFIX_EXPRESSION__OPERATOR, newOperator);
	}

} //PostfixExpressionImpl
