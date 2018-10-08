/**
 */
package Core.impl;

import Core.CorePackage;
import Core.IField;
import Core.IInitializer;
import Core.IMethod;
import Core.IType;
import Core.ITypeParameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Core.impl.ITypeImpl#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 *   <li>{@link Core.impl.ITypeImpl#getFullyQualifiedParametrizedName <em>Fully Qualified Parametrized Name</em>}</li>
 *   <li>{@link Core.impl.ITypeImpl#getInitializers <em>Initializers</em>}</li>
 *   <li>{@link Core.impl.ITypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link Core.impl.ITypeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link Core.impl.ITypeImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link Core.impl.ITypeImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ITypeImpl extends IMemberImpl implements IType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ITypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ITYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullyQualifiedName() {
		return (String)eGet(CorePackage.Literals.ITYPE__FULLY_QUALIFIED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullyQualifiedName(String newFullyQualifiedName) {
		eSet(CorePackage.Literals.ITYPE__FULLY_QUALIFIED_NAME, newFullyQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullyQualifiedParametrizedName() {
		return (String)eGet(CorePackage.Literals.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullyQualifiedParametrizedName(String newFullyQualifiedParametrizedName) {
		eSet(CorePackage.Literals.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME, newFullyQualifiedParametrizedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IInitializer> getInitializers() {
		return (EList<IInitializer>)eGet(CorePackage.Literals.ITYPE__INITIALIZERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IField> getFields() {
		return (EList<IField>)eGet(CorePackage.Literals.ITYPE__FIELDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IMethod> getMethods() {
		return (EList<IMethod>)eGet(CorePackage.Literals.ITYPE__METHODS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IType> getTypes() {
		return (EList<IType>)eGet(CorePackage.Literals.ITYPE__TYPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ITypeParameter> getTypeParameters() {
		return (EList<ITypeParameter>)eGet(CorePackage.Literals.ITYPE__TYPE_PARAMETERS, true);
	}

} //ITypeImpl
