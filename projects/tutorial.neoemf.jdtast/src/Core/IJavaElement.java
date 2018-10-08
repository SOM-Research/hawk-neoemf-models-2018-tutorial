/**
 */
package Core;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IJava Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Core.IJavaElement#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @see Core.CorePackage#getIJavaElement()
 * @model abstract="true"
 * @extends PersistentEObject
 * @generated
 */
public interface IJavaElement extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see Core.CorePackage#getIJavaElement_ElementName()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link Core.IJavaElement#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

} // IJavaElement
