/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Expression;
import DOM.MemberValuePair;
import DOM.SimpleName;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Value Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.MemberValuePairImpl#getName <em>Name</em>}</li>
 *   <li>{@link DOM.impl.MemberValuePairImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberValuePairImpl extends ASTNodeImpl implements MemberValuePair {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberValuePairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.MEMBER_VALUE_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eGet(DOMPackage.Literals.MEMBER_VALUE_PAIR__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eSet(DOMPackage.Literals.MEMBER_VALUE_PAIR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		return (Expression)eGet(DOMPackage.Literals.MEMBER_VALUE_PAIR__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Expression newValue) {
		eSet(DOMPackage.Literals.MEMBER_VALUE_PAIR__VALUE, newValue);
	}

} //MemberValuePairImpl
