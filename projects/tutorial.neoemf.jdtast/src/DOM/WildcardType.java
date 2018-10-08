/**
 */
package DOM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wildcard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOM.WildcardType#getBound <em>Bound</em>}</li>
 *   <li>{@link DOM.WildcardType#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see DOM.DOMPackage#getWildcardType()
 * @model
 * @generated
 */
public interface WildcardType extends Type {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference.
	 * @see #setBound(Type)
	 * @see DOM.DOMPackage#getWildcardType_Bound()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Type getBound();

	/**
	 * Sets the value of the '{@link DOM.WildcardType#getBound <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' containment reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(Type value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Boolean)
	 * @see DOM.DOMPackage#getWildcardType_UpperBound()
	 * @model unique="false" dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getUpperBound();

	/**
	 * Sets the value of the '{@link DOM.WildcardType#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Boolean value);

} // WildcardType
