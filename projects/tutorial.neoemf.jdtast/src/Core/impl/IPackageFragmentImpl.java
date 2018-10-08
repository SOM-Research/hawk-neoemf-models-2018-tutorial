/**
 */
package Core.impl;

import Core.CorePackage;
import Core.IClassFile;
import Core.ICompilationUnit;
import Core.IPackageFragment;
import Core.IPackageFragmentRoot;
import Core.PhysicalElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IPackage Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Core.impl.IPackageFragmentImpl#getPath <em>Path</em>}</li>
 *   <li>{@link Core.impl.IPackageFragmentImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link Core.impl.IPackageFragmentImpl#getIsDefaultPackage <em>Is Default Package</em>}</li>
 *   <li>{@link Core.impl.IPackageFragmentImpl#getPackageFragmentRoot <em>Package Fragment Root</em>}</li>
 *   <li>{@link Core.impl.IPackageFragmentImpl#getClassFiles <em>Class Files</em>}</li>
 *   <li>{@link Core.impl.IPackageFragmentImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IPackageFragmentImpl extends IJavaElementImpl implements IPackageFragment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPackageFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IPACKAGE_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return (String)eGet(CorePackage.Literals.PHYSICAL_ELEMENT__PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		eSet(CorePackage.Literals.PHYSICAL_ELEMENT__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReadOnly() {
		return (Boolean)eGet(CorePackage.Literals.PHYSICAL_ELEMENT__IS_READ_ONLY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(Boolean newIsReadOnly) {
		eSet(CorePackage.Literals.PHYSICAL_ELEMENT__IS_READ_ONLY, newIsReadOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDefaultPackage() {
		return (Boolean)eGet(CorePackage.Literals.IPACKAGE_FRAGMENT__IS_DEFAULT_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefaultPackage(Boolean newIsDefaultPackage) {
		eSet(CorePackage.Literals.IPACKAGE_FRAGMENT__IS_DEFAULT_PACKAGE, newIsDefaultPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPackageFragmentRoot getPackageFragmentRoot() {
		return (IPackageFragmentRoot)eGet(CorePackage.Literals.IPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageFragmentRoot(IPackageFragmentRoot newPackageFragmentRoot) {
		eSet(CorePackage.Literals.IPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT, newPackageFragmentRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IClassFile> getClassFiles() {
		return (EList<IClassFile>)eGet(CorePackage.Literals.IPACKAGE_FRAGMENT__CLASS_FILES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ICompilationUnit> getCompilationUnits() {
		return (EList<ICompilationUnit>)eGet(CorePackage.Literals.IPACKAGE_FRAGMENT__COMPILATION_UNITS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PhysicalElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.IPACKAGE_FRAGMENT__PATH: return CorePackage.PHYSICAL_ELEMENT__PATH;
				case CorePackage.IPACKAGE_FRAGMENT__IS_READ_ONLY: return CorePackage.PHYSICAL_ELEMENT__IS_READ_ONLY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PhysicalElement.class) {
			switch (baseFeatureID) {
				case CorePackage.PHYSICAL_ELEMENT__PATH: return CorePackage.IPACKAGE_FRAGMENT__PATH;
				case CorePackage.PHYSICAL_ELEMENT__IS_READ_ONLY: return CorePackage.IPACKAGE_FRAGMENT__IS_READ_ONLY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IPackageFragmentImpl
