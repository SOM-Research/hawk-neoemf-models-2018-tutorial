/**
 */
package Core.impl;

import Core.CorePackage;
import Core.ICompilationUnit;
import Core.IImportDeclaration;
import Core.IType;

import DOM.CompilationUnit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ICompilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Core.impl.ICompilationUnitImpl#getAllType <em>All Type</em>}</li>
 *   <li>{@link Core.impl.ICompilationUnitImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link Core.impl.ICompilationUnitImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link Core.impl.ICompilationUnitImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link Core.impl.ICompilationUnitImpl#getAst <em>Ast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ICompilationUnitImpl extends ITypeRootImpl implements ICompilationUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ICompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ICOMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IType> getAllType() {
		return (EList<IType>)eGet(CorePackage.Literals.ICOMPILATION_UNIT__ALL_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IImportDeclaration> getImports() {
		return (EList<IImportDeclaration>)eGet(CorePackage.Literals.ICOMPILATION_UNIT__IMPORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IType> getTypes() {
		return (EList<IType>)eGet(CorePackage.Literals.ICOMPILATION_UNIT__TYPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICompilationUnit getPrimary() {
		return (ICompilationUnit)eGet(CorePackage.Literals.ICOMPILATION_UNIT__PRIMARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimary(ICompilationUnit newPrimary) {
		eSet(CorePackage.Literals.ICOMPILATION_UNIT__PRIMARY, newPrimary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit getAst() {
		return (CompilationUnit)eGet(CorePackage.Literals.ICOMPILATION_UNIT__AST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAst(CompilationUnit newAst) {
		eSet(CorePackage.Literals.ICOMPILATION_UNIT__AST, newAst);
	}

} //ICompilationUnitImpl
