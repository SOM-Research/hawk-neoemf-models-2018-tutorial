/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Name;
import DOM.ThisExpression;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>This Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.ThisExpressionImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThisExpressionImpl extends ExpressionImpl implements ThisExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThisExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.THIS_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getQualifier() {
		return (Name)eGet(DOMPackage.Literals.THIS_EXPRESSION__QUALIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(Name newQualifier) {
		eSet(DOMPackage.Literals.THIS_EXPRESSION__QUALIFIER, newQualifier);
	}

} //ThisExpressionImpl
