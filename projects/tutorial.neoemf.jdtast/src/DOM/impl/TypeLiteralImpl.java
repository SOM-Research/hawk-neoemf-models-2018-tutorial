/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Type;
import DOM.TypeLiteral;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.TypeLiteralImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeLiteralImpl extends ExpressionImpl implements TypeLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.TYPE_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eGet(DOMPackage.Literals.TYPE_LITERAL__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eSet(DOMPackage.Literals.TYPE_LITERAL__TYPE, newType);
	}

} //TypeLiteralImpl
