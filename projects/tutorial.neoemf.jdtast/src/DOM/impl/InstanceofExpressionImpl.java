/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Expression;
import DOM.InstanceofExpression;
import DOM.Type;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instanceof Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.InstanceofExpressionImpl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link DOM.impl.InstanceofExpressionImpl#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceofExpressionImpl extends ExpressionImpl implements InstanceofExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceofExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.INSTANCEOF_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftOperand() {
		return (Expression)eGet(DOMPackage.Literals.INSTANCEOF_EXPRESSION__LEFT_OPERAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftOperand(Expression newLeftOperand) {
		eSet(DOMPackage.Literals.INSTANCEOF_EXPRESSION__LEFT_OPERAND, newLeftOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getRightOperand() {
		return (Type)eGet(DOMPackage.Literals.INSTANCEOF_EXPRESSION__RIGHT_OPERAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightOperand(Type newRightOperand) {
		eSet(DOMPackage.Literals.INSTANCEOF_EXPRESSION__RIGHT_OPERAND, newRightOperand);
	}

} //InstanceofExpressionImpl
