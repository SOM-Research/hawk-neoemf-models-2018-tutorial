/**
 */
package DOM.impl;

import Core.IMethod;

import DOM.Block;
import DOM.DOMPackage;
import DOM.MethodDeclaration;
import DOM.Name;
import DOM.SimpleName;
import DOM.SingleVariableDeclaration;
import DOM.Type;
import DOM.TypeParameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOM.impl.MethodDeclarationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link DOM.impl.MethodDeclarationImpl#getExtraDimensions <em>Extra Dimensions</em>}</li>
 *   <li>{@link DOM.impl.MethodDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link DOM.impl.MethodDeclarationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link DOM.impl.MethodDeclarationImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link DOM.impl.MethodDeclarationImpl#getVarargs <em>Varargs</em>}</li>
 *   <li>{@link DOM.impl.MethodDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link DOM.impl.MethodDeclarationImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link DOM.impl.MethodDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link DOM.impl.MethodDeclarationImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeclarationImpl extends BodyDeclarationImpl implements MethodDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOMPackage.Literals.METHOD_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return (Block)eGet(DOMPackage.Literals.METHOD_DECLARATION__BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Block newBody) {
		eSet(DOMPackage.Literals.METHOD_DECLARATION__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getExtraDimensions() {
		return (Integer)eGet(DOMPackage.Literals.METHOD_DECLARATION__EXTRA_DIMENSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraDimensions(Integer newExtraDimensions) {
		eSet(DOMPackage.Literals.METHOD_DECLARATION__EXTRA_DIMENSIONS, newExtraDimensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return (SimpleName)eGet(DOMPackage.Literals.METHOD_DECLARATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		eSet(DOMPackage.Literals.METHOD_DECLARATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnType() {
		return (Type)eGet(DOMPackage.Literals.METHOD_DECLARATION__RETURN_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Type newReturnType) {
		eSet(DOMPackage.Literals.METHOD_DECLARATION__RETURN_TYPE, newReturnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getConstructor() {
		return (Boolean)eGet(DOMPackage.Literals.METHOD_DECLARATION__CONSTRUCTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructor(Boolean newConstructor) {
		eSet(DOMPackage.Literals.METHOD_DECLARATION__CONSTRUCTOR, newConstructor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVarargs() {
		return (Boolean)eGet(DOMPackage.Literals.METHOD_DECLARATION__VARARGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarargs(Boolean newVarargs) {
		eSet(DOMPackage.Literals.METHOD_DECLARATION__VARARGS, newVarargs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SingleVariableDeclaration> getParameters() {
		return (EList<SingleVariableDeclaration>)eGet(DOMPackage.Literals.METHOD_DECLARATION__PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Name> getThrownExceptions() {
		return (EList<Name>)eGet(DOMPackage.Literals.METHOD_DECLARATION__THROWN_EXCEPTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeParameter> getTypeParameters() {
		return (EList<TypeParameter>)eGet(DOMPackage.Literals.METHOD_DECLARATION__TYPE_PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMethod getBinding() {
		return (IMethod)eGet(DOMPackage.Literals.METHOD_DECLARATION__BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(IMethod newBinding) {
		eSet(DOMPackage.Literals.METHOD_DECLARATION__BINDING, newBinding);
	}

} //MethodDeclarationImpl
