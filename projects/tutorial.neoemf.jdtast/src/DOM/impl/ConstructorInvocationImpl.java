/**
 */
package DOM.impl;

import DOM.ConstructorInvocation;
import DOM.DOMPackage;
import DOM.Expression;
import DOM.Type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.ConstructorInvocationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link DOM.impl.ConstructorInvocationImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorInvocationImpl extends StatementImpl implements ConstructorInvocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.CONSTRUCTOR_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Expression> getArguments() {
		return (EList<Expression>)eGet(DOMPackage.Literals.CONSTRUCTOR_INVOCATION__ARGUMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getTypeArguments() {
		return (EList<Type>)eGet(DOMPackage.Literals.CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS, true);
	}

} //ConstructorInvocationImpl
