/**
 */
package DOM.impl;

import DOM.AbstractTypeDeclaration;
import DOM.DOMPackage;
import DOM.TypeDeclarationStatement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.TypeDeclarationStatementImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeDeclarationStatementImpl extends StatementImpl implements TypeDeclarationStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeclarationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.TYPE_DECLARATION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeDeclaration getDeclaration() {
		return (AbstractTypeDeclaration)eGet(DOMPackage.Literals.TYPE_DECLARATION_STATEMENT__DECLARATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(AbstractTypeDeclaration newDeclaration) {
		eSet(DOMPackage.Literals.TYPE_DECLARATION_STATEMENT__DECLARATION, newDeclaration);
	}

} //TypeDeclarationStatementImpl
