/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.ExtendedModifier;
import DOM.Type;
import DOM.VariableDeclarationExpression;
import DOM.VariableDeclarationFragment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.VariableDeclarationExpressionImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link DOM.impl.VariableDeclarationExpressionImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link DOM.impl.VariableDeclarationExpressionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationExpressionImpl extends ExpressionImpl implements VariableDeclarationExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.VARIABLE_DECLARATION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VariableDeclarationFragment> getFragments() {
		return (EList<VariableDeclarationFragment>)eGet(DOMPackage.Literals.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExtendedModifier> getModifiers() {
		return (EList<ExtendedModifier>)eGet(DOMPackage.Literals.VARIABLE_DECLARATION_EXPRESSION__MODIFIERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eGet(DOMPackage.Literals.VARIABLE_DECLARATION_EXPRESSION__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eSet(DOMPackage.Literals.VARIABLE_DECLARATION_EXPRESSION__TYPE, newType);
	}

} //VariableDeclarationExpressionImpl
