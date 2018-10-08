/**
 */
package DOM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOM.TextElement#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see DOM.DOMPackage#getTextElement()
 * @model
 * @generated
 */
public interface TextElement extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see DOM.DOMPackage#getTextElement_Text()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link DOM.TextElement#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // TextElement
