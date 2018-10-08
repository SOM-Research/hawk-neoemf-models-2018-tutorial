/**
 */
package Core.impl;

import Core.CorePackage;
import Core.ISourceRange;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISource Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Core.impl.ISourceRangeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Core.impl.ISourceRangeImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISourceRangeImpl extends DefaultPersistentEObject implements ISourceRange {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISourceRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ISOURCE_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLength() {
		return (Integer)eGet(CorePackage.Literals.ISOURCE_RANGE__LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(Integer newLength) {
		eSet(CorePackage.Literals.ISOURCE_RANGE__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOffset() {
		return (Integer)eGet(CorePackage.Literals.ISOURCE_RANGE__OFFSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(Integer newOffset) {
		eSet(CorePackage.Literals.ISOURCE_RANGE__OFFSET, newOffset);
	}

} //ISourceRangeImpl
