/**
 */
package Core.impl;

import Core.CorePackage;
import Core.ISourceRange;
import Core.ISourceReference;
import Core.ITypeRoot;
import Core.PhysicalElement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IType Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Core.impl.ITypeRootImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Core.impl.ITypeRootImpl#getSourceRange <em>Source Range</em>}</li>
 *   <li>{@link Core.impl.ITypeRootImpl#getPath <em>Path</em>}</li>
 *   <li>{@link Core.impl.ITypeRootImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ITypeRootImpl extends IJavaElementImpl implements ITypeRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ITypeRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ITYPE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return (String)eGet(CorePackage.Literals.ISOURCE_REFERENCE__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		eSet(CorePackage.Literals.ISOURCE_REFERENCE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISourceRange getSourceRange() {
		return (ISourceRange)eGet(CorePackage.Literals.ISOURCE_REFERENCE__SOURCE_RANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRange(ISourceRange newSourceRange) {
		eSet(CorePackage.Literals.ISOURCE_REFERENCE__SOURCE_RANGE, newSourceRange);
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
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ISourceReference.class) {
			switch (derivedFeatureID) {
				case CorePackage.ITYPE_ROOT__SOURCE: return CorePackage.ISOURCE_REFERENCE__SOURCE;
				case CorePackage.ITYPE_ROOT__SOURCE_RANGE: return CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE;
				default: return -1;
			}
		}
		if (baseClass == PhysicalElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.ITYPE_ROOT__PATH: return CorePackage.PHYSICAL_ELEMENT__PATH;
				case CorePackage.ITYPE_ROOT__IS_READ_ONLY: return CorePackage.PHYSICAL_ELEMENT__IS_READ_ONLY;
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
		if (baseClass == ISourceReference.class) {
			switch (baseFeatureID) {
				case CorePackage.ISOURCE_REFERENCE__SOURCE: return CorePackage.ITYPE_ROOT__SOURCE;
				case CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE: return CorePackage.ITYPE_ROOT__SOURCE_RANGE;
				default: return -1;
			}
		}
		if (baseClass == PhysicalElement.class) {
			switch (baseFeatureID) {
				case CorePackage.PHYSICAL_ELEMENT__PATH: return CorePackage.ITYPE_ROOT__PATH;
				case CorePackage.PHYSICAL_ELEMENT__IS_READ_ONLY: return CorePackage.ITYPE_ROOT__IS_READ_ONLY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ITypeRootImpl
