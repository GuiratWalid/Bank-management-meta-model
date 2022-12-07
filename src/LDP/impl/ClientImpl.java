/**
 */
package LDP.impl;

import LDP.Client;
import LDP.Employe;
import LDP.LDPPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP.impl.ClientImpl#getConseiller <em>Conseiller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends PersonneImpl implements Client {
	/**
	 * The cached value of the '{@link #getConseiller() <em>Conseiller</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConseiller()
	 * @generated
	 * @ordered
	 */
	protected EList<Employe> conseiller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPPackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employe> getConseiller() {
		if (conseiller == null) {
			conseiller = new EObjectResolvingEList<Employe>(Employe.class, this, LDPPackage.CLIENT__CONSEILLER);
		}
		return conseiller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDPPackage.CLIENT__CONSEILLER:
				return getConseiller();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LDPPackage.CLIENT__CONSEILLER:
				getConseiller().clear();
				getConseiller().addAll((Collection<? extends Employe>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LDPPackage.CLIENT__CONSEILLER:
				getConseiller().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LDPPackage.CLIENT__CONSEILLER:
				return conseiller != null && !conseiller.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClientImpl
