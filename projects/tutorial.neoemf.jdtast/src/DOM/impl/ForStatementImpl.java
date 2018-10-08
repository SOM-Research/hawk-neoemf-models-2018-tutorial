/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Expression;
import DOM.ForStatement;
import DOM.Statement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.ForStatementImpl#getBody <em>Body</em>}</li>
 *   <li>{@link DOM.impl.ForStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link DOM.impl.ForStatementImpl#getInitializers <em>Initializers</em>}</li>
 *   <li>{@link DOM.impl.ForStatementImpl#getUpdaters <em>Updaters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStatementImpl extends StatementImpl implements ForStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.FOR_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getBody() {
		return (Statement)eGet(DOMPackage.Literals.FOR_STATEMENT__BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Statement newBody) {
		eSet(DOMPackage.Literals.FOR_STATEMENT__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eGet(DOMPackage.Literals.FOR_STATEMENT__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eSet(DOMPackage.Literals.FOR_STATEMENT__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getInitializers() {
		return (EList<Expression>)eGet(DOMPackage.Literals.FOR_STATEMENT__INITIALIZERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getUpdaters() {
		return (EList<Expression>)eGet(DOMPackage.Literals.FOR_STATEMENT__UPDATERS, true);
	}

} //ForStatementImpl
