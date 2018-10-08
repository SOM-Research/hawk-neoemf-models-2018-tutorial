/**
 */
package Core.impl;

import Core.CorePackage;
import Core.IJavaModel;
import Core.IJavaProject;
import Core.IPackageFragmentRoot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IJava Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Core.impl.IJavaModelImpl#getJavaProjects <em>Java Projects</em>}</li>
 *   <li>{@link Core.impl.IJavaModelImpl#getExternalPackageFragmentRoots <em>External Package Fragment Roots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IJavaModelImpl extends PhysicalElementImpl implements IJavaModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IJavaModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IJAVA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IJavaProject> getJavaProjects() {
		return (EList<IJavaProject>)eGet(CorePackage.Literals.IJAVA_MODEL__JAVA_PROJECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IPackageFragmentRoot> getExternalPackageFragmentRoots() {
		return (EList<IPackageFragmentRoot>)eGet(CorePackage.Literals.IJAVA_MODEL__EXTERNAL_PACKAGE_FRAGMENT_ROOTS, true);
	}

} //IJavaModelImpl
