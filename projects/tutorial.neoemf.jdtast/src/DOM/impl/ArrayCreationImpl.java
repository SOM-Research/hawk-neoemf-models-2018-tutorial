/**
 */
package DOM.impl;

import DOM.ArrayCreation;
import DOM.ArrayInitializer;
import DOM.ArrayType;
import DOM.DOMPackage;
import DOM.Expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Creation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.ArrayCreationImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link DOM.impl.ArrayCreationImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link DOM.impl.ArrayCreationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayCreationImpl extends ExpressionImpl implements ArrayCreation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayCreationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ARRAY_CREATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getDimensions() {
		return (EList<Expression>)eGet(DOMPackage.Literals.ARRAY_CREATION__DIMENSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInitializer getInitializer() {
		return (ArrayInitializer)eGet(DOMPackage.Literals.ARRAY_CREATION__INITIALIZER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(ArrayInitializer newInitializer) {
		eSet(DOMPackage.Literals.ARRAY_CREATION__INITIALIZER, newInitializer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType getType() {
		return (ArrayType)eGet(DOMPackage.Literals.ARRAY_CREATION__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ArrayType newType) {
		eSet(DOMPackage.Literals.ARRAY_CREATION__TYPE, newType);
	}

} //ArrayCreationImpl
