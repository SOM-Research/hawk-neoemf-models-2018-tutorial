/**
 */
package DOM.impl;

import DOM.CharacterLiteral;
import DOM.DOMPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.CharacterLiteralImpl#getCharValue <em>Char Value</em>}</li>
 *   <li>{@link DOM.impl.CharacterLiteralImpl#getEscapedValue <em>Escaped Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterLiteralImpl extends ExpressionImpl implements CharacterLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.CHARACTER_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharValue() {
		return (String)eGet(DOMPackage.Literals.CHARACTER_LITERAL__CHAR_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharValue(String newCharValue) {
		eSet(DOMPackage.Literals.CHARACTER_LITERAL__CHAR_VALUE, newCharValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEscapedValue() {
		return (String)eGet(DOMPackage.Literals.CHARACTER_LITERAL__ESCAPED_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscapedValue(String newEscapedValue) {
		eSet(DOMPackage.Literals.CHARACTER_LITERAL__ESCAPED_VALUE, newEscapedValue);
	}

} //CharacterLiteralImpl
