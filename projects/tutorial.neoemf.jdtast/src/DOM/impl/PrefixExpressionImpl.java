/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Expression;
import DOM.PrefixExpression;
import DOM.PrefixExpressionOperatorKind;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.PrefixExpressionImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link DOM.impl.PrefixExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrefixExpressionImpl extends ExpressionImpl implements PrefixExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrefixExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.PREFIX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOperand() {
		return (Expression)eGet(DOMPackage.Literals.PREFIX_EXPRESSION__OPERAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(Expression newOperand) {
		eSet(DOMPackage.Literals.PREFIX_EXPRESSION__OPERAND, newOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixExpressionOperatorKind getOperator() {
		return (PrefixExpressionOperatorKind)eGet(DOMPackage.Literals.PREFIX_EXPRESSION__OPERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(PrefixExpressionOperatorKind newOperator) {
		eSet(DOMPackage.Literals.PREFIX_EXPRESSION__OPERATOR, newOperator);
	}

} //PrefixExpressionImpl
