/**
 */
package DOM.impl;

import DOM.Block;
import DOM.DOMPackage;
import DOM.Initializer;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.InitializerImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitializerImpl extends BodyDeclarationImpl implements Initializer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.INITIALIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return (Block)eGet(DOMPackage.Literals.INITIALIZER__BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Block newBody) {
		eSet(DOMPackage.Literals.INITIALIZER__BODY, newBody);
	}

} //InitializerImpl
