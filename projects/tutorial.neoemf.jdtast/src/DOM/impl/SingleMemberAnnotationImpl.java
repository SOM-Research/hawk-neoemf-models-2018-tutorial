/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.Expression;
import DOM.SingleMemberAnnotation;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Member Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.SingleMemberAnnotationImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleMemberAnnotationImpl extends AnnotationImpl implements SingleMemberAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleMemberAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.SINGLE_MEMBER_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		return (Expression)eGet(DOMPackage.Literals.SINGLE_MEMBER_ANNOTATION__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Expression newValue) {
		eSet(DOMPackage.Literals.SINGLE_MEMBER_ANNOTATION__VALUE, newValue);
	}

} //SingleMemberAnnotationImpl
