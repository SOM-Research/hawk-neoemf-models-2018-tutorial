/**
 */
package DOM.impl;

import DOM.Block;
import DOM.CatchClause;
import DOM.DOMPackage;
import DOM.SingleVariableDeclaration;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.CatchClauseImpl#getBody <em>Body</em>}</li>
 *   <li>{@link DOM.impl.CatchClauseImpl#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatchClauseImpl extends ASTNodeImpl implements CatchClause {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.CATCH_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return (Block)eGet(DOMPackage.Literals.CATCH_CLAUSE__BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Block newBody) {
		eSet(DOMPackage.Literals.CATCH_CLAUSE__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVariableDeclaration getException() {
		return (SingleVariableDeclaration)eGet(DOMPackage.Literals.CATCH_CLAUSE__EXCEPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setException(SingleVariableDeclaration newException) {
		eSet(DOMPackage.Literals.CATCH_CLAUSE__EXCEPTION, newException);
	}

} //CatchClauseImpl
