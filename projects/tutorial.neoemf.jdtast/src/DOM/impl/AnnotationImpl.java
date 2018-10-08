/**
 */
package DOM.impl;

import DOM.Annotation;
import DOM.DOMPackage;
import DOM.Name;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.AnnotationImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnnotationImpl extends ExpressionImpl implements Annotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getTypeName() {
		return (Name)eGet(DOMPackage.Literals.ANNOTATION__TYPE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(Name newTypeName) {
		eSet(DOMPackage.Literals.ANNOTATION__TYPE_NAME, newTypeName);
	}

} //AnnotationImpl
