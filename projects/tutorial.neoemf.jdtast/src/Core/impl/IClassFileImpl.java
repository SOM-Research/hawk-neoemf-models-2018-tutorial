/**
 */
package Core.impl;

import Core.CorePackage;
import Core.IClassFile;
import Core.IType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IClass File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Core.impl.IClassFileImpl#getIsClass <em>Is Class</em>}</li>
 *   <li>{@link Core.impl.IClassFileImpl#getIsInterface <em>Is Interface</em>}</li>
 *   <li>{@link Core.impl.IClassFileImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IClassFileImpl extends ITypeRootImpl implements IClassFile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IClassFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ICLASS_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsClass() {
		return (Boolean)eGet(CorePackage.Literals.ICLASS_FILE__IS_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsClass(Boolean newIsClass) {
		eSet(CorePackage.Literals.ICLASS_FILE__IS_CLASS, newIsClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsInterface() {
		return (Boolean)eGet(CorePackage.Literals.ICLASS_FILE__IS_INTERFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInterface(Boolean newIsInterface) {
		eSet(CorePackage.Literals.ICLASS_FILE__IS_INTERFACE, newIsInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IType getType() {
		return (IType)eGet(CorePackage.Literals.ICLASS_FILE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IType newType) {
		eSet(CorePackage.Literals.ICLASS_FILE__TYPE, newType);
	}

} //IClassFileImpl
