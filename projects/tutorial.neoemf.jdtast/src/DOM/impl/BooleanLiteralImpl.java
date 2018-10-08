/**
 */
package DOM.impl;

import DOM.BooleanLiteral;
import DOM.DOMPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.BooleanLiteralImpl#getBooleanValue <em>Boolean Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanLiteralImpl extends ExpressionImpl implements BooleanLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.BOOLEAN_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBooleanValue() {
		return (Boolean)eGet(DOMPackage.Literals.BOOLEAN_LITERAL__BOOLEAN_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanValue(Boolean newBooleanValue) {
		eSet(DOMPackage.Literals.BOOLEAN_LITERAL__BOOLEAN_VALUE, newBooleanValue);
	}

} //BooleanLiteralImpl
