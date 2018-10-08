/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Type;
import DOM.WildcardType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wildcard Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.WildcardTypeImpl#getBound <em>Bound</em>}</li>
 *   <li>{@link DOM.impl.WildcardTypeImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WildcardTypeImpl extends TypeImpl implements WildcardType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WildcardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.WILDCARD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getBound() {
		return (Type)eGet(DOMPackage.Literals.WILDCARD_TYPE__BOUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(Type newBound) {
		eSet(DOMPackage.Literals.WILDCARD_TYPE__BOUND, newBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUpperBound() {
		return (Boolean)eGet(DOMPackage.Literals.WILDCARD_TYPE__UPPER_BOUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(Boolean newUpperBound) {
		eSet(DOMPackage.Literals.WILDCARD_TYPE__UPPER_BOUND, newUpperBound);
	}

} //WildcardTypeImpl
