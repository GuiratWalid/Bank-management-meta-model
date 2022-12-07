/**
 */
package LDP.impl;

import LDP.Employe;
import LDP.LDPPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP.impl.EmployeImpl#getSalaire <em>Salaire</em>}</li>
 *   <li>{@link LDP.impl.EmployeImpl#getDateEmbauche <em>Date Embauche</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeImpl extends PersonneImpl implements Employe {
	/**
	 * The default value of the '{@link #getSalaire() <em>Salaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalaire()
	 * @generated
	 * @ordered
	 */
	protected static final float SALAIRE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSalaire() <em>Salaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalaire()
	 * @generated
	 * @ordered
	 */
	protected float salaire = SALAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateEmbauche() <em>Date Embauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEmbauche()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EMBAUCHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateEmbauche() <em>Date Embauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEmbauche()
	 * @generated
	 * @ordered
	 */
	protected Date dateEmbauche = DATE_EMBAUCHE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPPackage.Literals.EMPLOYE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSalaire() {
		return salaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalaire(float newSalaire) {
		float oldSalaire = salaire;
		salaire = newSalaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.EMPLOYE__SALAIRE, oldSalaire, salaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEmbauche(Date newDateEmbauche) {
		Date oldDateEmbauche = dateEmbauche;
		dateEmbauche = newDateEmbauche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.EMPLOYE__DATE_EMBAUCHE, oldDateEmbauche, dateEmbauche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDPPackage.EMPLOYE__SALAIRE:
				return getSalaire();
			case LDPPackage.EMPLOYE__DATE_EMBAUCHE:
				return getDateEmbauche();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LDPPackage.EMPLOYE__SALAIRE:
				setSalaire((Float)newValue);
				return;
			case LDPPackage.EMPLOYE__DATE_EMBAUCHE:
				setDateEmbauche((Date)newValue);
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
			case LDPPackage.EMPLOYE__SALAIRE:
				setSalaire(SALAIRE_EDEFAULT);
				return;
			case LDPPackage.EMPLOYE__DATE_EMBAUCHE:
				setDateEmbauche(DATE_EMBAUCHE_EDEFAULT);
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
			case LDPPackage.EMPLOYE__SALAIRE:
				return salaire != SALAIRE_EDEFAULT;
			case LDPPackage.EMPLOYE__DATE_EMBAUCHE:
				return DATE_EMBAUCHE_EDEFAULT == null ? dateEmbauche != null : !DATE_EMBAUCHE_EDEFAULT.equals(dateEmbauche);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (salaire: ");
		result.append(salaire);
		result.append(", dateEmbauche: ");
		result.append(dateEmbauche);
		result.append(')');
		return result.toString();
	}

} //EmployeImpl
