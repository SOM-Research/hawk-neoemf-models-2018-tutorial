/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Expression;
import DOM.Statement;
import DOM.SwitchStatement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.SwitchStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link DOM.impl.SwitchStatementImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchStatementImpl extends StatementImpl implements SwitchStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.SWITCH_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eGet(DOMPackage.Literals.SWITCH_STATEMENT__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eSet(DOMPackage.Literals.SWITCH_STATEMENT__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Statement> getStatements() {
		return (EList<Statement>)eGet(DOMPackage.Literals.SWITCH_STATEMENT__STATEMENTS, true);
	}

} //SwitchStatementImpl
