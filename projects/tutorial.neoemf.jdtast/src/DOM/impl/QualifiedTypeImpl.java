/**
 */
package DOM.impl;

import DOM.DOMPackage;
import DOM.QualifiedType;
import DOM.SimpleName;
import DOM.Type;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.QualifiedTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link DOM.impl.QualifiedTypeImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualifiedTypeImpl extends TypeImpl implements QualifiedType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifiedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.QUALIFIED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eGet(DOMPackage.Literals.QUALIFIED_TYPE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eSet(DOMPackage.Literals.QUALIFIED_TYPE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getQualifier() {
		return (Type)eGet(DOMPackage.Literals.QUALIFIED_TYPE__QUALIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(Type newQualifier) {
		eSet(DOMPackage.Literals.QUALIFIED_TYPE__QUALIFIER, newQualifier);
	}

} //QualifiedTypeImpl
