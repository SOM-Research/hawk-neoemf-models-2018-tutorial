/**
 */
package DOM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOM.TypeDeclarationStatement#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see DOM.DOMPackage#getTypeDeclarationStatement()
 * @model
 * @generated
 */
public interface TypeDeclarationStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference.
	 * @see #setDeclaration(AbstractTypeDeclaration)
	 * @see DOM.DOMPackage#getTypeDeclarationStatement_Declaration()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	AbstractTypeDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link DOM.TypeDeclarationStatement#getDeclaration <em>Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' containment reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(AbstractTypeDeclaration value);

} // TypeDeclarationStatement
