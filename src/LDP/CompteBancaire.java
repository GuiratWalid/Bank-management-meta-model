/**
 */
package LDP;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compte Bancaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.CompteBancaire#getNumeroC <em>Numero C</em>}</li>
 *   <li>{@link LDP.CompteBancaire#getSolde <em>Solde</em>}</li>
 *   <li>{@link LDP.CompteBancaire#getDateOuverture <em>Date Ouverture</em>}</li>
 *   <li>{@link LDP.CompteBancaire#getAppartient <em>Appartient</em>}</li>
 *   <li>{@link LDP.CompteBancaire#getPropriétaire <em>Propriétaire</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getCompteBancaire()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='compteUnique'"
 * @generated
 */
public interface CompteBancaire extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero C</em>' attribute.
	 * @see #setNumeroC(String)
	 * @see LDP.LDPPackage#getCompteBancaire_NumeroC()
	 * @model
	 * @generated
	 */
	String getNumeroC();

	/**
	 * Sets the value of the '{@link LDP.CompteBancaire#getNumeroC <em>Numero C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero C</em>' attribute.
	 * @see #getNumeroC()
	 * @generated
	 */
	void setNumeroC(String value);

	/**
	 * Returns the value of the '<em><b>Solde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solde</em>' attribute.
	 * @see #setSolde(float)
	 * @see LDP.LDPPackage#getCompteBancaire_Solde()
	 * @model required="true"
	 * @generated
	 */
	float getSolde();

	/**
	 * Sets the value of the '{@link LDP.CompteBancaire#getSolde <em>Solde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solde</em>' attribute.
	 * @see #getSolde()
	 * @generated
	 */
	void setSolde(float value);

	/**
	 * Returns the value of the '<em><b>Date Ouverture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Ouverture</em>' attribute.
	 * @see #setDateOuverture(Date)
	 * @see LDP.LDPPackage#getCompteBancaire_DateOuverture()
	 * @model
	 * @generated
	 */
	Date getDateOuverture();

	/**
	 * Sets the value of the '{@link LDP.CompteBancaire#getDateOuverture <em>Date Ouverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Ouverture</em>' attribute.
	 * @see #getDateOuverture()
	 * @generated
	 */
	void setDateOuverture(Date value);

	/**
	 * Returns the value of the '<em><b>Appartient</b></em>' reference list.
	 * The list contents are of type {@link LDP.Agence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appartient</em>' reference list.
	 * @see LDP.LDPPackage#getCompteBancaire_Appartient()
	 * @model required="true"
	 * @generated
	 */
	EList<Agence> getAppartient();

	/**
	 * Returns the value of the '<em><b>Propriétaire</b></em>' reference list.
	 * The list contents are of type {@link LDP.Client}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propriétaire</em>' reference list.
	 * @see LDP.LDPPackage#getCompteBancaire_Propriétaire()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<Client> getPropriétaire();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='CompteBancaire.allInstances() -&gt; one(cb: CompteBancaire | cb.numeroC = self.numeroC)'"
	 * @generated
	 */
	boolean compteUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CompteBancaire
