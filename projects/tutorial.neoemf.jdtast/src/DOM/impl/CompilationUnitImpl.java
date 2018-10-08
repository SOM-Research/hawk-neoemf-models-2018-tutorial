/**
 */
package DOM.impl;

import DOM.AbstractTypeDeclaration;
import DOM.Comment;
import DOM.CompilationUnit;
import DOM.DOMPackage;
import DOM.ImportDeclaration;
import DOM.PackageDeclaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.CompilationUnitImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link DOM.impl.CompilationUnitImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link DOM.impl.CompilationUnitImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link DOM.impl.CompilationUnitImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends ASTNodeImpl implements CompilationUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.COMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Comment> getComments() {
		return (EList<Comment>)eGet(DOMPackage.Literals.COMPILATION_UNIT__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDeclaration getPackage() {
		return (PackageDeclaration)eGet(DOMPackage.Literals.COMPILATION_UNIT__PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(PackageDeclaration newPackage) {
		eSet(DOMPackage.Literals.COMPILATION_UNIT__PACKAGE, newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ImportDeclaration> getImports() {
		return (EList<ImportDeclaration>)eGet(DOMPackage.Literals.COMPILATION_UNIT__IMPORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractTypeDeclaration> getTypes() {
		return (EList<AbstractTypeDeclaration>)eGet(DOMPackage.Literals.COMPILATION_UNIT__TYPES, true);
	}

} //CompilationUnitImpl
