/**
 */
package DOM.impl;

import Core.IType;

import DOM.DOMPackage;
import DOM.Expression;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.ExpressionImpl#getResolveBoxing <em>Resolve Boxing</em>}</li>
 *   <li>{@link DOM.impl.ExpressionImpl#getResolveUnboxing <em>Resolve Unboxing</em>}</li>
 *   <li>{@link DOM.impl.ExpressionImpl#getTypeBinding <em>Type Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExpressionImpl extends ASTNodeImpl implements Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getResolveBoxing() {
		return (Boolean)eGet(DOMPackage.Literals.EXPRESSION__RESOLVE_BOXING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolveBoxing(Boolean newResolveBoxing) {
		eSet(DOMPackage.Literals.EXPRESSION__RESOLVE_BOXING, newResolveBoxing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getResolveUnboxing() {
		return (Boolean)eGet(DOMPackage.Literals.EXPRESSION__RESOLVE_UNBOXING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolveUnboxing(Boolean newResolveUnboxing) {
		eSet(DOMPackage.Literals.EXPRESSION__RESOLVE_UNBOXING, newResolveUnboxing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IType getTypeBinding() {
		return (IType)eGet(DOMPackage.Literals.EXPRESSION__TYPE_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeBinding(IType newTypeBinding) {
		eSet(DOMPackage.Literals.EXPRESSION__TYPE_BINDING, newTypeBinding);
	}

} //ExpressionImpl
