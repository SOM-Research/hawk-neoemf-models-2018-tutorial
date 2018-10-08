/**
 */
package DOM.impl;

import DOM.ArrayType;
import DOM.DOMPackage;
import DOM.Type;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.ArrayTypeImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link DOM.impl.ArrayTypeImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link DOM.impl.ArrayTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayTypeImpl extends TypeImpl implements ArrayType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ARRAY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getComponentType() {
		return (Type)eGet(DOMPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(Type newComponentType) {
		eSet(DOMPackage.Literals.ARRAY_TYPE__COMPONENT_TYPE, newComponentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDimensions() {
		return (Integer)eGet(DOMPackage.Literals.ARRAY_TYPE__DIMENSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(Integer newDimensions) {
		eSet(DOMPackage.Literals.ARRAY_TYPE__DIMENSIONS, newDimensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getElementType() {
		return (Type)eGet(DOMPackage.Literals.ARRAY_TYPE__ELEMENT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(Type newElementType) {
		eSet(DOMPackage.Literals.ARRAY_TYPE__ELEMENT_TYPE, newElementType);
	}

} //ArrayTypeImpl
