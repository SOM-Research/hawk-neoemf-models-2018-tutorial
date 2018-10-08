/**
 */
package Core.impl;

import Core.CorePackage;
import Core.IJavaElement;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IJava Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Core.impl.IJavaElementImpl#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IJavaElementImpl extends DefaultPersistentEObject implements IJavaElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IJavaElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IJAVA_ELEMENT;
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
	public String getElementName() {
		return (String)eGet(CorePackage.Literals.IJAVA_ELEMENT__ELEMENT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementName(String newElementName) {
		eSet(CorePackage.Literals.IJAVA_ELEMENT__ELEMENT_NAME, newElementName);
	}

} //IJavaElementImpl
