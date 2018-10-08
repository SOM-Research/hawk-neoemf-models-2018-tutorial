/**
 */
package DOM.impl;

import DOM.ASTNode;
import DOM.Comment;
import DOM.DOMPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.CommentImpl#getAlternateRoot <em>Alternate Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommentImpl extends ASTNodeImpl implements Comment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTNode getAlternateRoot() {
		return (ASTNode)eGet(DOMPackage.Literals.COMMENT__ALTERNATE_ROOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternateRoot(ASTNode newAlternateRoot) {
		eSet(DOMPackage.Literals.COMMENT__ALTERNATE_ROOT, newAlternateRoot);
	}

} //CommentImpl
