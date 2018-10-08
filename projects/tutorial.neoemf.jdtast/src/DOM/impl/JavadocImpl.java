/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Javadoc;
import DOM.TagElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Javadoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.JavadocImpl#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavadocImpl extends CommentImpl implements Javadoc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavadocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.JAVADOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TagElement> getTags() {
		return (EList<TagElement>)eGet(DOMPackage.Literals.JAVADOC__TAGS, true);
	}

} //JavadocImpl
