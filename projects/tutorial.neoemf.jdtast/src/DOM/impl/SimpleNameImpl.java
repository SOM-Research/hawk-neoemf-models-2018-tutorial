/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.SimpleName;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.SimpleNameImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link DOM.impl.SimpleNameImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleNameImpl extends NameImpl implements SimpleName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.SIMPLE_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return (String)eGet(DOMPackage.Literals.SIMPLE_NAME__IDENTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		eSet(DOMPackage.Literals.SIMPLE_NAME__IDENTIFIER, newIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDeclaration() {
		return (Boolean)eGet(DOMPackage.Literals.SIMPLE_NAME__DECLARATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(Boolean newDeclaration) {
		eSet(DOMPackage.Literals.SIMPLE_NAME__DECLARATION, newDeclaration);
	}

} //SimpleNameImpl
