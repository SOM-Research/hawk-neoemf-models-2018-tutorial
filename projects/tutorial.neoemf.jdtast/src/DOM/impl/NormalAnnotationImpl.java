/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.MemberValuePair;
import DOM.NormalAnnotation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.NormalAnnotationImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalAnnotationImpl extends AnnotationImpl implements NormalAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.NORMAL_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MemberValuePair> getValues() {
		return (EList<MemberValuePair>)eGet(DOMPackage.Literals.NORMAL_ANNOTATION__VALUES, true);
	}

} //NormalAnnotationImpl
