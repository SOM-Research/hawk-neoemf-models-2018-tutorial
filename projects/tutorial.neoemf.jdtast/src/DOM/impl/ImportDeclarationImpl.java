/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.ImportDeclaration;
import DOM.Name;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.ImportDeclarationImpl#getOnDemand <em>On Demand</em>}</li>
 *   <li>{@link DOM.impl.ImportDeclarationImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link DOM.impl.ImportDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportDeclarationImpl extends ASTNodeImpl implements ImportDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.IMPORT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOnDemand() {
		return (Boolean)eGet(DOMPackage.Literals.IMPORT_DECLARATION__ON_DEMAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDemand(Boolean newOnDemand) {
		eSet(DOMPackage.Literals.IMPORT_DECLARATION__ON_DEMAND, newOnDemand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStatic() {
		return (Boolean)eGet(DOMPackage.Literals.IMPORT_DECLARATION__STATIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(Boolean newStatic) {
		eSet(DOMPackage.Literals.IMPORT_DECLARATION__STATIC, newStatic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		return (Name)eGet(DOMPackage.Literals.IMPORT_DECLARATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		eSet(DOMPackage.Literals.IMPORT_DECLARATION__NAME, newName);
	}

} //ImportDeclarationImpl
