/**
 */
package Core.impl;

import Core.CorePackage;
import Core.IField;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IField</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Core.impl.IFieldImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link Core.impl.IFieldImpl#getIsEnumConstant <em>Is Enum Constant</em>}</li>
 *   <li>{@link Core.impl.IFieldImpl#getTypeSignature <em>Type Signature</em>}</li>
 *   <li>{@link Core.impl.IFieldImpl#getIsVolatile <em>Is Volatile</em>}</li>
 *   <li>{@link Core.impl.IFieldImpl#getIsTransient <em>Is Transient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IFieldImpl extends IMemberImpl implements IField {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IFIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant() {
		return (String)eGet(CorePackage.Literals.IFIELD__CONSTANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(String newConstant) {
		eSet(CorePackage.Literals.IFIELD__CONSTANT, newConstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsEnumConstant() {
		return (Boolean)eGet(CorePackage.Literals.IFIELD__IS_ENUM_CONSTANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnumConstant(Boolean newIsEnumConstant) {
		eSet(CorePackage.Literals.IFIELD__IS_ENUM_CONSTANT, newIsEnumConstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeSignature() {
		return (String)eGet(CorePackage.Literals.IFIELD__TYPE_SIGNATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSignature(String newTypeSignature) {
		eSet(CorePackage.Literals.IFIELD__TYPE_SIGNATURE, newTypeSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsVolatile() {
		return (Boolean)eGet(CorePackage.Literals.IFIELD__IS_VOLATILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVolatile(Boolean newIsVolatile) {
		eSet(CorePackage.Literals.IFIELD__IS_VOLATILE, newIsVolatile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsTransient() {
		return (Boolean)eGet(CorePackage.Literals.IFIELD__IS_TRANSIENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTransient(Boolean newIsTransient) {
		eSet(CorePackage.Literals.IFIELD__IS_TRANSIENT, newIsTransient);
	}

} //IFieldImpl
