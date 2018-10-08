/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Expression;
import DOM.InfixExpression;
import DOM.InfixExpressionOperatorKind;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.InfixExpressionImpl#getExtendedOperands <em>Extended Operands</em>}</li>
 *   <li>{@link DOM.impl.InfixExpressionImpl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link DOM.impl.InfixExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link DOM.impl.InfixExpressionImpl#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfixExpressionImpl extends ExpressionImpl implements InfixExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfixExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.INFIX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getExtendedOperands() {
		return (EList<Expression>)eGet(DOMPackage.Literals.INFIX_EXPRESSION__EXTENDED_OPERANDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftOperand() {
		return (Expression)eGet(DOMPackage.Literals.INFIX_EXPRESSION__LEFT_OPERAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftOperand(Expression newLeftOperand) {
		eSet(DOMPackage.Literals.INFIX_EXPRESSION__LEFT_OPERAND, newLeftOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfixExpressionOperatorKind getOperator() {
		return (InfixExpressionOperatorKind)eGet(DOMPackage.Literals.INFIX_EXPRESSION__OPERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(InfixExpressionOperatorKind newOperator) {
		eSet(DOMPackage.Literals.INFIX_EXPRESSION__OPERATOR, newOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightOperand() {
		return (Expression)eGet(DOMPackage.Literals.INFIX_EXPRESSION__RIGHT_OPERAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightOperand(Expression newRightOperand) {
		eSet(DOMPackage.Literals.INFIX_EXPRESSION__RIGHT_OPERAND, newRightOperand);
	}

} //InfixExpressionImpl
