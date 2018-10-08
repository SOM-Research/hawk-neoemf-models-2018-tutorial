/**
 */
package DOM.impl;

import DOM.AbstractTypeDeclaration;
import DOM.BodyDeclaration;
import DOM.DOMPackage;
import DOM.SimpleName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.AbstractTypeDeclarationImpl#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link DOM.impl.AbstractTypeDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link DOM.impl.AbstractTypeDeclarationImpl#getLocalTypeDeclaration <em>Local Type Declaration</em>}</li>
 *   <li>{@link DOM.impl.AbstractTypeDeclarationImpl#getMemberTypeDeclaration <em>Member Type Declaration</em>}</li>
 *   <li>{@link DOM.impl.AbstractTypeDeclarationImpl#getPackageMemberTypeDeclaration <em>Package Member Type Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTypeDeclarationImpl extends BodyDeclarationImpl implements AbstractTypeDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BodyDeclaration> getBodyDeclarations() {
		return (EList<BodyDeclaration>)eGet(DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eGet(DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eSet(DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLocalTypeDeclaration() {
		return (Boolean)eGet(DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__LOCAL_TYPE_DECLARATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalTypeDeclaration(Boolean newLocalTypeDeclaration) {
		eSet(DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__LOCAL_TYPE_DECLARATION, newLocalTypeDeclaration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMemberTypeDeclaration() {
		return (Boolean)eGet(DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__MEMBER_TYPE_DECLARATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberTypeDeclaration(Boolean newMemberTypeDeclaration) {
		eSet(DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__MEMBER_TYPE_DECLARATION, newMemberTypeDeclaration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPackageMemberTypeDeclaration() {
		return (Boolean)eGet(DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__PACKAGE_MEMBER_TYPE_DECLARATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageMemberTypeDeclaration(Boolean newPackageMemberTypeDeclaration) {
		eSet(DOMPackage.Literals.ABSTRACT_TYPE_DECLARATION__PACKAGE_MEMBER_TYPE_DECLARATION, newPackageMemberTypeDeclaration);
	}

} //AbstractTypeDeclarationImpl
