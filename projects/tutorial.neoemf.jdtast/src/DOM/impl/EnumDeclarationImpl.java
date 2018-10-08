/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.EnumConstantDeclaration;
import DOM.EnumDeclaration;
import DOM.Type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.EnumDeclarationImpl#getSuperInterfaceTypes <em>Super Interface Types</em>}</li>
 *   <li>{@link DOM.impl.EnumDeclarationImpl#getEnumConstants <em>Enum Constants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumDeclarationImpl extends AbstractTypeDeclarationImpl implements EnumDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ENUM_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getSuperInterfaceTypes() {
		return (EList<Type>)eGet(DOMPackage.Literals.ENUM_DECLARATION__SUPER_INTERFACE_TYPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EnumConstantDeclaration> getEnumConstants() {
		return (EList<EnumConstantDeclaration>)eGet(DOMPackage.Literals.ENUM_DECLARATION__ENUM_CONSTANTS, true);
	}

} //EnumDeclarationImpl
