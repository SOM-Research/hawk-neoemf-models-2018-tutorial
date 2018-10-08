/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.EnhancedForStatement;
import DOM.Expression;
import DOM.SingleVariableDeclaration;
import DOM.Statement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enhanced For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.EnhancedForStatementImpl#getBody <em>Body</em>}</li>
 *   <li>{@link DOM.impl.EnhancedForStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link DOM.impl.EnhancedForStatementImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnhancedForStatementImpl extends StatementImpl implements EnhancedForStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnhancedForStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ENHANCED_FOR_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getBody() {
		return (Statement)eGet(DOMPackage.Literals.ENHANCED_FOR_STATEMENT__BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Statement newBody) {
		eSet(DOMPackage.Literals.ENHANCED_FOR_STATEMENT__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eGet(DOMPackage.Literals.ENHANCED_FOR_STATEMENT__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eSet(DOMPackage.Literals.ENHANCED_FOR_STATEMENT__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVariableDeclaration getParameter() {
		return (SingleVariableDeclaration)eGet(DOMPackage.Literals.ENHANCED_FOR_STATEMENT__PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(SingleVariableDeclaration newParameter) {
		eSet(DOMPackage.Literals.ENHANCED_FOR_STATEMENT__PARAMETER, newParameter);
	}

} //EnhancedForStatementImpl
