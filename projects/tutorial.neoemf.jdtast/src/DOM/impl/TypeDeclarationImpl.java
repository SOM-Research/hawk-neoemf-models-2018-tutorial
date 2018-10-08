/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Type;
import DOM.TypeDeclaration;
import DOM.TypeParameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.TypeDeclarationImpl#getSuperclassType <em>Superclass Type</em>}</li>
 *   <li>{@link DOM.impl.TypeDeclarationImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link DOM.impl.TypeDeclarationImpl#getSuperInterfaceTypes <em>Super Interface Types</em>}</li>
 *   <li>{@link DOM.impl.TypeDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeDeclarationImpl extends AbstractTypeDeclarationImpl implements TypeDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.TYPE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSuperclassType() {
		return (Type)eGet(DOMPackage.Literals.TYPE_DECLARATION__SUPERCLASS_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperclassType(Type newSuperclassType) {
		eSet(DOMPackage.Literals.TYPE_DECLARATION__SUPERCLASS_TYPE, newSuperclassType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInterface() {
		return (Boolean)eGet(DOMPackage.Literals.TYPE_DECLARATION__INTERFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Boolean newInterface) {
		eSet(DOMPackage.Literals.TYPE_DECLARATION__INTERFACE, newInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getSuperInterfaceTypes() {
		return (EList<Type>)eGet(DOMPackage.Literals.TYPE_DECLARATION__SUPER_INTERFACE_TYPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeParameter> getTypeParameters() {
		return (EList<TypeParameter>)eGet(DOMPackage.Literals.TYPE_DECLARATION__TYPE_PARAMETERS, true);
	}

} //TypeDeclarationImpl
