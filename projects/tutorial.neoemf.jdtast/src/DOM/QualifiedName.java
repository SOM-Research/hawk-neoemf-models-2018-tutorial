/**
 */
package DOM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOM.QualifiedName#getName <em>Name</em>}</li>
 *   <li>{@link DOM.QualifiedName#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see DOM.DOMPackage#getQualifiedName()
 * @model
 * @generated
 */
public interface QualifiedName extends Name {
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
	 * @see DOM.DOMPackage#getQualifiedName_Name()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	SimpleName getName();

	/**
	 * Sets the value of the '{@link DOM.QualifiedName#getName <em>Name</em>}' containment reference.
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
	 * @see DOM.DOMPackage#getQualifiedName_Qualifier()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Name getQualifier();

	/**
	 * Sets the value of the '{@link DOM.QualifiedName#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Name value);

} // QualifiedName
