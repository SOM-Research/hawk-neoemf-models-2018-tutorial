/**
 */
package DOM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>This Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOM.ThisExpression#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see DOM.DOMPackage#getThisExpression()
 * @model
 * @generated
 */
public interface ThisExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(Name)
	 * @see DOM.DOMPackage#getThisExpression_Qualifier()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Name getQualifier();

	/**
	 * Sets the value of the '{@link DOM.ThisExpression#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Name value);

} // ThisExpression
