/**
 */
package DOM.impl;

import DOM.AnonymousClassDeclaration;
import DOM.BodyDeclaration;
import DOM.DOMPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.AnonymousClassDeclarationImpl#getBodyDeclarations <em>Body Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymousClassDeclarationImpl extends ASTNodeImpl implements AnonymousClassDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousClassDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ANONYMOUS_CLASS_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BodyDeclaration> getBodyDeclarations() {
		return (EList<BodyDeclaration>)eGet(DOMPackage.Literals.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS, true);
	}

} //AnonymousClassDeclarationImpl
