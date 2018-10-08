/**
 */
package DOM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOM.ParameterizedType#getType <em>Type</em>}</li>
 *   <li>{@link DOM.ParameterizedType#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @see DOM.DOMPackage#getParameterizedType()
 * @model
 * @generated
 */
public interface ParameterizedType extends Type {
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
	 * @see DOM.DOMPackage#getParameterizedType_Type()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link DOM.ParameterizedType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link DOM.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' containment reference list.
	 * @see DOM.DOMPackage#getParameterizedType_TypeArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypeArguments();

} // ParameterizedType
