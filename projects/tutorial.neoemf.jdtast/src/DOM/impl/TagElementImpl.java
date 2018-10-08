/**
 */
package DOM.impl;

import DOM.ASTNode;
import DOM.DOMPackage;
import DOM.TagElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.TagElementImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link DOM.impl.TagElementImpl#getTagName <em>Tag Name</em>}</li>
 *   <li>{@link DOM.impl.TagElementImpl#getNested <em>Nested</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagElementImpl extends ASTNodeImpl implements TagElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.TAG_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ASTNode> getFragments() {
		return (EList<ASTNode>)eGet(DOMPackage.Literals.TAG_ELEMENT__FRAGMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTagName() {
		return (String)eGet(DOMPackage.Literals.TAG_ELEMENT__TAG_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagName(String newTagName) {
		eSet(DOMPackage.Literals.TAG_ELEMENT__TAG_NAME, newTagName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNested() {
		return (Boolean)eGet(DOMPackage.Literals.TAG_ELEMENT__NESTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNested(Boolean newNested) {
		eSet(DOMPackage.Literals.TAG_ELEMENT__NESTED, newNested);
	}

} //TagElementImpl
