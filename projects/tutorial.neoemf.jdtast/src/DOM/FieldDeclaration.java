/**
 */
package DOM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOM.FieldDeclaration#getFragments <em>Fragments</em>}</li>
 *   <li>{@link DOM.FieldDeclaration#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see DOM.DOMPackage#getFieldDeclaration()
 * @model
 * @generated
 */
public interface FieldDeclaration extends BodyDeclaration {
	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link DOM.VariableDeclarationFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see DOM.DOMPackage#getFieldDeclaration_Fragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclarationFragment> getFragments();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see DOM.DOMPackage#getFieldDeclaration_Type()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link DOM.FieldDeclaration#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // FieldDeclaration
