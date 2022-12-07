/**
 */
package LDP;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Employe#getSalaire <em>Salaire</em>}</li>
 *   <li>{@link LDP.Employe#getDateEmbauche <em>Date Embauche</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getEmploye()
 * @model
 * @generated
 */
public interface Employe extends Personne {
	/**
	 * Returns the value of the '<em><b>Salaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salaire</em>' attribute.
	 * @see #setSalaire(float)
	 * @see LDP.LDPPackage#getEmploye_Salaire()
	 * @model required="true"
	 * @generated
	 */
	float getSalaire();

	/**
	 * Sets the value of the '{@link LDP.Employe#getSalaire <em>Salaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salaire</em>' attribute.
	 * @see #getSalaire()
	 * @generated
	 */
	void setSalaire(float value);

	/**
	 * Returns the value of the '<em><b>Date Embauche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Embauche</em>' attribute.
	 * @see #setDateEmbauche(Date)
	 * @see LDP.LDPPackage#getEmploye_DateEmbauche()
	 * @model
	 * @generated
	 */
	Date getDateEmbauche();

	/**
	 * Sets the value of the '{@link LDP.Employe#getDateEmbauche <em>Date Embauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Embauche</em>' attribute.
	 * @see #getDateEmbauche()
	 * @generated
	 */
	void setDateEmbauche(Date value);

} // Employe
