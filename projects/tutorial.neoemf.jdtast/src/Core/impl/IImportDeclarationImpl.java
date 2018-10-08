/**
 */
package Core.impl;

import Core.CorePackage;
import Core.IImportDeclaration;
import Core.ISourceRange;
import Core.ISourceReference;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IImport Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Core.impl.IImportDeclarationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Core.impl.IImportDeclarationImpl#getSourceRange <em>Source Range</em>}</li>
 *   <li>{@link Core.impl.IImportDeclarationImpl#getIsOnDemand <em>Is On Demand</em>}</li>
 *   <li>{@link Core.impl.IImportDeclarationImpl#getIsStatic <em>Is Static</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IImportDeclarationImpl extends IJavaElementImpl implements IImportDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IImportDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IIMPORT_DECLARATION;
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
	public Boolean getIsOnDemand() {
		return (Boolean)eGet(CorePackage.Literals.IIMPORT_DECLARATION__IS_ON_DEMAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOnDemand(Boolean newIsOnDemand) {
		eSet(CorePackage.Literals.IIMPORT_DECLARATION__IS_ON_DEMAND, newIsOnDemand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsStatic() {
		return (Boolean)eGet(CorePackage.Literals.IIMPORT_DECLARATION__IS_STATIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(Boolean newIsStatic) {
		eSet(CorePackage.Literals.IIMPORT_DECLARATION__IS_STATIC, newIsStatic);
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
				case CorePackage.IIMPORT_DECLARATION__SOURCE: return CorePackage.ISOURCE_REFERENCE__SOURCE;
				case CorePackage.IIMPORT_DECLARATION__SOURCE_RANGE: return CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE;
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
				case CorePackage.ISOURCE_REFERENCE__SOURCE: return CorePackage.IIMPORT_DECLARATION__SOURCE;
				case CorePackage.ISOURCE_REFERENCE__SOURCE_RANGE: return CorePackage.IIMPORT_DECLARATION__SOURCE_RANGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IImportDeclarationImpl
