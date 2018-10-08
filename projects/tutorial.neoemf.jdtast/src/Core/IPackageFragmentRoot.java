/**
 */
package Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPackage Fragment Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Core.IPackageFragmentRoot#getPackageFragments <em>Package Fragments</em>}</li>
 * </ul>
 *
 * @see Core.CorePackage#getIPackageFragmentRoot()
 * @model abstract="true"
 * @generated
 */
public interface IPackageFragmentRoot extends IJavaElement, PhysicalElement {
	/**
	 * Returns the value of the '<em><b>Package Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link Core.IPackageFragment}.
	 * It is bidirectional and its opposite is '{@link Core.IPackageFragment#getPackageFragmentRoot <em>Package Fragment Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Fragments</em>' containment reference list.
	 * @see Core.CorePackage#getIPackageFragmentRoot_PackageFragments()
	 * @see Core.IPackageFragment#getPackageFragmentRoot
	 * @model opposite="packageFragmentRoot" containment="true" ordered="false"
	 * @generated
	 */
	EList<IPackageFragment> getPackageFragments();

} // IPackageFragmentRoot
