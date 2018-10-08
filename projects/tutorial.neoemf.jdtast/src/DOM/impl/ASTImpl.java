/**
 */
package DOM.impl;

import DOM.AST;
import DOM.ASTNode;
import DOM.DOMPackage;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AST</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.ASTImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ASTImpl extends DefaultPersistentEObject implements AST {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.AST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTNode getCompilationUnits() {
		return (ASTNode)eGet(DOMPackage.Literals.AST__COMPILATION_UNITS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompilationUnits(ASTNode newCompilationUnits) {
		eSet(DOMPackage.Literals.AST__COMPILATION_UNITS, newCompilationUnits);
	}

} //ASTImpl
