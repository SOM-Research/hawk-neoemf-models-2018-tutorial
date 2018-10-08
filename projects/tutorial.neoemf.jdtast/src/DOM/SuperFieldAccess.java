/**
 */
package DOM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Field Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOM.SuperFieldAccess#getName <em>Name</em>}</li>
 *   <li>{@link DOM.SuperFieldAccess#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see DOM.DOMPackage#getSuperFieldAccess()
 * @model
 * @generated
 */
public interface SuperFieldAccess extends Expression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(SimpleName)
	 * @see DOM.DOMPackage#getSuperFieldAccess_Name()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	SimpleName getName();

	/**
	 * Sets the value of the '{@link DOM.SuperFieldAccess#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(SimpleName value);

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
	 * @see DOM.DOMPackage#getSuperFieldAccess_Qualifier()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Name getQualifier();

	/**
	 * Sets the value of the '{@link DOM.SuperFieldAccess#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Name value);

} // SuperFieldAccess
