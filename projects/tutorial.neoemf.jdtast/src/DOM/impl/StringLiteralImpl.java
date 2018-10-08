/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.StringLiteral;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.StringLiteralImpl#getEscapedValue <em>Escaped Value</em>}</li>
 *   <li>{@link DOM.impl.StringLiteralImpl#getLiteralValue <em>Literal Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringLiteralImpl extends ExpressionImpl implements StringLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.STRING_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEscapedValue() {
		return (String)eGet(DOMPackage.Literals.STRING_LITERAL__ESCAPED_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscapedValue(String newEscapedValue) {
		eSet(DOMPackage.Literals.STRING_LITERAL__ESCAPED_VALUE, newEscapedValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteralValue() {
		return (String)eGet(DOMPackage.Literals.STRING_LITERAL__LITERAL_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteralValue(String newLiteralValue) {
		eSet(DOMPackage.Literals.STRING_LITERAL__LITERAL_VALUE, newLiteralValue);
	}

} //StringLiteralImpl
