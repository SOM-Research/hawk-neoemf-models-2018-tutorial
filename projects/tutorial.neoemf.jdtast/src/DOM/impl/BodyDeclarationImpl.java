/**
 */
package DOM.impl;

import DOM.BodyDeclaration;
import DOM.DOMPackage;
import DOM.ExtendedModifier;
import DOM.Javadoc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.BodyDeclarationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link DOM.impl.BodyDeclarationImpl#getJavadoc <em>Javadoc</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BodyDeclarationImpl extends ASTNodeImpl implements BodyDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.BODY_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExtendedModifier> getModifiers() {
		return (EList<ExtendedModifier>)eGet(DOMPackage.Literals.BODY_DECLARATION__MODIFIERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Javadoc getJavadoc() {
		return (Javadoc)eGet(DOMPackage.Literals.BODY_DECLARATION__JAVADOC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavadoc(Javadoc newJavadoc) {
		eSet(DOMPackage.Literals.BODY_DECLARATION__JAVADOC, newJavadoc);
	}

} //BodyDeclarationImpl
