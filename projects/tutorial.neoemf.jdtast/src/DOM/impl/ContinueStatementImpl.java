/**
 */
package DOM.impl;

import DOM.ContinueStatement;
import DOM.DOMPackage;
import DOM.SimpleName;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continue Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.ContinueStatementImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContinueStatementImpl extends StatementImpl implements ContinueStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinueStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.CONTINUE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getLabel() {
		return (SimpleName)eGet(DOMPackage.Literals.CONTINUE_STATEMENT__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(SimpleName newLabel) {
		eSet(DOMPackage.Literals.CONTINUE_STATEMENT__LABEL, newLabel);
	}

} //ContinueStatementImpl
