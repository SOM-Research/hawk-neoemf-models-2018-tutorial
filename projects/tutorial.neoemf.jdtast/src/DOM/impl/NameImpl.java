/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Name;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.NameImpl#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NameImpl extends ExpressionImpl implements Name {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullyQualifiedName() {
		return (String)eGet(DOMPackage.Literals.NAME__FULLY_QUALIFIED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullyQualifiedName(String newFullyQualifiedName) {
		eSet(DOMPackage.Literals.NAME__FULLY_QUALIFIED_NAME, newFullyQualifiedName);
	}

} //NameImpl
