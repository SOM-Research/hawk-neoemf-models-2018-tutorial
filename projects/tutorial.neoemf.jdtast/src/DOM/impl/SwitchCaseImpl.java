/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Expression;
import DOM.SwitchCase;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.SwitchCaseImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link DOM.impl.SwitchCaseImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchCaseImpl extends StatementImpl implements SwitchCase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.SWITCH_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eGet(DOMPackage.Literals.SWITCH_CASE__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eSet(DOMPackage.Literals.SWITCH_CASE__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDefault() {
		return (Boolean)eGet(DOMPackage.Literals.SWITCH_CASE__DEFAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(Boolean newDefault) {
		eSet(DOMPackage.Literals.SWITCH_CASE__DEFAULT, newDefault);
	}

} //SwitchCaseImpl
