/**
 */
package DOM.impl;

import DOM.AssertStatement;
import DOM.DOMPackage;
import DOM.Expression;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.AssertStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link DOM.impl.AssertStatementImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertStatementImpl extends StatementImpl implements AssertStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ASSERT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eGet(DOMPackage.Literals.ASSERT_STATEMENT__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eSet(DOMPackage.Literals.ASSERT_STATEMENT__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getMessage() {
		return (Expression)eGet(DOMPackage.Literals.ASSERT_STATEMENT__MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Expression newMessage) {
		eSet(DOMPackage.Literals.ASSERT_STATEMENT__MESSAGE, newMessage);
	}

} //AssertStatementImpl
