/**
 */
package DOM.impl;

import DOM.Block;
import DOM.CatchClause;
import DOM.DOMPackage;
import DOM.TryStatement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.TryStatementImpl#getCatchClauses <em>Catch Clauses</em>}</li>
 *   <li>{@link DOM.impl.TryStatementImpl#getBody <em>Body</em>}</li>
 *   <li>{@link DOM.impl.TryStatementImpl#getFinally <em>Finally</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryStatementImpl extends StatementImpl implements TryStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.TRY_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CatchClause> getCatchClauses() {
		return (EList<CatchClause>)eGet(DOMPackage.Literals.TRY_STATEMENT__CATCH_CLAUSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return (Block)eGet(DOMPackage.Literals.TRY_STATEMENT__BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Block newBody) {
		eSet(DOMPackage.Literals.TRY_STATEMENT__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getFinally() {
		return (Block)eGet(DOMPackage.Literals.TRY_STATEMENT__FINALLY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinally(Block newFinally) {
		eSet(DOMPackage.Literals.TRY_STATEMENT__FINALLY, newFinally);
	}

} //TryStatementImpl
