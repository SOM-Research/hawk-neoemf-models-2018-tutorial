/**
 */
package Core.impl;

import Core.CorePackage;
import Core.IMember;
import Core.ISourceRange;
import Core.ISourceReference;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMember</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Core.impl.IMemberImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Core.impl.IMemberImpl#getSourceRange <em>Source Range</em>}</li>
 *   <li>{@link Core.impl.IMemberImpl#getJavadocRange <em>Javadoc Range</em>}</li>
 *   <li>{@link Core.impl.IMemberImpl#getNameRange <em>Name Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IMemberImpl extends IJavaElementImpl implements IMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IMEMBER;
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
	public ISourceRange getJavadocRange() {
		return (ISourceRange)eGet(CorePackage.Literals.IMEMBER__JAVADOC_RANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavadocRange(ISourceRange newJavadocRange) {
		eSet(CorePackage.Literals.IMEMBER__JAVADOC_RANGE, newJavadocRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISourceRange getNameRange() {
		return (ISourceRange)eGet(CorePackage.Literals.IMEMBER__NAME_RANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameRange(ISourceRange newNameRange) {
		eSet(CorePackage.Literals.IMEMBER__NAME_RANGE, newNameRange);
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
				case CorePackage.IMEMBER__SOURCE: return CorePackage.ISOURCE_REFERENCE__SOURCE;
				case CorePackage.IMEMBER__SOURCE_RANGE: return CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE;
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
				case CorePackage.ISOURCE_REFERENCE__SOURCE: return CorePackage.IMEMBER__SOURCE;
				case CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE: return CorePackage.IMEMBER__SOURCE_RANGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IMemberImpl
