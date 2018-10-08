/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.MemberRef;
import DOM.Name;
import DOM.SimpleName;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.MemberRefImpl#getName <em>Name</em>}</li>
 *   <li>{@link DOM.impl.MemberRefImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberRefImpl extends ASTNodeImpl implements MemberRef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.MEMBER_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eGet(DOMPackage.Literals.MEMBER_REF__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eSet(DOMPackage.Literals.MEMBER_REF__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getQualifier() {
		return (Name)eGet(DOMPackage.Literals.MEMBER_REF__QUALIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(Name newQualifier) {
		eSet(DOMPackage.Literals.MEMBER_REF__QUALIFIER, newQualifier);
	}

} //MemberRefImpl
