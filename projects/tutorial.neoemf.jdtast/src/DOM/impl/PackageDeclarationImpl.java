/**
 */
package DOM.impl;

import Core.IPackageFragment;

import DOM.Annotation;
import DOM.DOMPackage;
import DOM.Javadoc;
import DOM.Name;
import DOM.PackageDeclaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.PackageDeclarationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link DOM.impl.PackageDeclarationImpl#getJavadoc <em>Javadoc</em>}</li>
 *   <li>{@link DOM.impl.PackageDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link DOM.impl.PackageDeclarationImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageDeclarationImpl extends ASTNodeImpl implements PackageDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.PACKAGE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Annotation> getAnnotations() {
		return (EList<Annotation>)eGet(DOMPackage.Literals.PACKAGE_DECLARATION__ANNOTATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Javadoc getJavadoc() {
		return (Javadoc)eGet(DOMPackage.Literals.PACKAGE_DECLARATION__JAVADOC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavadoc(Javadoc newJavadoc) {
		eSet(DOMPackage.Literals.PACKAGE_DECLARATION__JAVADOC, newJavadoc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		return (Name)eGet(DOMPackage.Literals.PACKAGE_DECLARATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		eSet(DOMPackage.Literals.PACKAGE_DECLARATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPackageFragment getBinding() {
		return (IPackageFragment)eGet(DOMPackage.Literals.PACKAGE_DECLARATION__BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(IPackageFragment newBinding) {
		eSet(DOMPackage.Literals.PACKAGE_DECLARATION__BINDING, newBinding);
	}

} //PackageDeclarationImpl
