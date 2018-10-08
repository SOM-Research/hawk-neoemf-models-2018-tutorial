/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Expression;
import DOM.SimpleName;
import DOM.VariableDeclaration;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.VariableDeclarationImpl#getExtraDimensions <em>Extra Dimensions</em>}</li>
 *   <li>{@link DOM.impl.VariableDeclarationImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link DOM.impl.VariableDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VariableDeclarationImpl extends ASTNodeImpl implements VariableDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getExtraDimensions() {
		return (Integer)eGet(DOMPackage.Literals.VARIABLE_DECLARATION__EXTRA_DIMENSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraDimensions(Integer newExtraDimensions) {
		eSet(DOMPackage.Literals.VARIABLE_DECLARATION__EXTRA_DIMENSIONS, newExtraDimensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitializer() {
		return (Expression)eGet(DOMPackage.Literals.VARIABLE_DECLARATION__INITIALIZER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(Expression newInitializer) {
		eSet(DOMPackage.Literals.VARIABLE_DECLARATION__INITIALIZER, newInitializer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eGet(DOMPackage.Literals.VARIABLE_DECLARATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eSet(DOMPackage.Literals.VARIABLE_DECLARATION__NAME, newName);
	}

} //VariableDeclarationImpl
