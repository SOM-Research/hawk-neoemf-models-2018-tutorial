/**
 */
package DOM.impl;

import DOM.Assignment;
import DOM.AssignmentOperatorKind;
import DOM.DOMPackage;
import DOM.Expression;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.AssignmentImpl#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link DOM.impl.AssignmentImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link DOM.impl.AssignmentImpl#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends ExpressionImpl implements Assignment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftHandSide() {
		return (Expression)eGet(DOMPackage.Literals.ASSIGNMENT__LEFT_HAND_SIDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftHandSide(Expression newLeftHandSide) {
		eSet(DOMPackage.Literals.ASSIGNMENT__LEFT_HAND_SIDE, newLeftHandSide);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentOperatorKind getOperator() {
		return (AssignmentOperatorKind)eGet(DOMPackage.Literals.ASSIGNMENT__OPERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(AssignmentOperatorKind newOperator) {
		eSet(DOMPackage.Literals.ASSIGNMENT__OPERATOR, newOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightHandSide() {
		return (Expression)eGet(DOMPackage.Literals.ASSIGNMENT__RIGHT_HAND_SIDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightHandSide(Expression newRightHandSide) {
		eSet(DOMPackage.Literals.ASSIGNMENT__RIGHT_HAND_SIDE, newRightHandSide);
	}

} //AssignmentImpl
