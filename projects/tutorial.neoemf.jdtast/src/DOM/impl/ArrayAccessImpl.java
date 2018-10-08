/**
 */
package DOM.impl;

import DOM.ArrayAccess;
import DOM.DOMPackage;
import DOM.Expression;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.ArrayAccessImpl#getArray <em>Array</em>}</li>
 *   <li>{@link DOM.impl.ArrayAccessImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayAccessImpl extends ExpressionImpl implements ArrayAccess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ARRAY_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getArray() {
		return (Expression)eGet(DOMPackage.Literals.ARRAY_ACCESS__ARRAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(Expression newArray) {
		eSet(DOMPackage.Literals.ARRAY_ACCESS__ARRAY, newArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIndex() {
		return (Expression)eGet(DOMPackage.Literals.ARRAY_ACCESS__INDEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(Expression newIndex) {
		eSet(DOMPackage.Literals.ARRAY_ACCESS__INDEX, newIndex);
	}

} //ArrayAccessImpl
