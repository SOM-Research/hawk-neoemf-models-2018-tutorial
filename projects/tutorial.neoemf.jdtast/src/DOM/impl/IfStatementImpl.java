/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Expression;
import DOM.IfStatement;
import DOM.Statement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.IfStatementImpl#getElseStatement <em>Else Statement</em>}</li>
 *   <li>{@link DOM.impl.IfStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link DOM.impl.IfStatementImpl#getThenStatement <em>Then Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends StatementImpl implements IfStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.IF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getElseStatement() {
		return (Statement)eGet(DOMPackage.Literals.IF_STATEMENT__ELSE_STATEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseStatement(Statement newElseStatement) {
		eSet(DOMPackage.Literals.IF_STATEMENT__ELSE_STATEMENT, newElseStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eGet(DOMPackage.Literals.IF_STATEMENT__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eSet(DOMPackage.Literals.IF_STATEMENT__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getThenStatement() {
		return (Statement)eGet(DOMPackage.Literals.IF_STATEMENT__THEN_STATEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenStatement(Statement newThenStatement) {
		eSet(DOMPackage.Literals.IF_STATEMENT__THEN_STATEMENT, newThenStatement);
	}

} //IfStatementImpl
