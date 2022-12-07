/**
 */
package LDP;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Agence#getNumeroA <em>Numero A</em>}</li>
 *   <li>{@link LDP.Agence#getNom <em>Nom</em>}</li>
 *   <li>{@link LDP.Agence#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link LDP.Agence#getVille <em>Ville</em>}</li>
 *   <li>{@link LDP.Agence#getCodePostal <em>Code Postal</em>}</li>
 *   <li>{@link LDP.Agence#getContientEmploye <em>Contient Employe</em>}</li>
 *   <li>{@link LDP.Agence#getContientBanque <em>Contient Banque</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getAgence()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='agenceUnique'"
 * @generated
 */
public interface Agence extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero A</em>' attribute.
	 * @see #setNumeroA(String)
	 * @see LDP.LDPPackage#getAgence_NumeroA()
	 * @model
	 * @generated
	 */
	String getNumeroA();

	/**
	 * Sets the value of the '{@link LDP.Agence#getNumeroA <em>Numero A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero A</em>' attribute.
	 * @see #getNumeroA()
	 * @generated
	 */
	void setNumeroA(String value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see LDP.LDPPackage#getAgence_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link LDP.Agence#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' attribute.
	 * @see #setAdresse(String)
	 * @see LDP.LDPPackage#getAgence_Adresse()
	 * @model
	 * @generated
	 */
	String getAdresse();

	/**
	 * Sets the value of the '{@link LDP.Agence#getAdresse <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' attribute.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Ville</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ville</em>' attribute.
	 * @see #setVille(String)
	 * @see LDP.LDPPackage#getAgence_Ville()
	 * @model
	 * @generated
	 */
	String getVille();

	/**
	 * Sets the value of the '{@link LDP.Agence#getVille <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ville</em>' attribute.
	 * @see #getVille()
	 * @generated
	 */
	void setVille(String value);

	/**
	 * Returns the value of the '<em><b>Code Postal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Postal</em>' attribute.
	 * @see #setCodePostal(int)
	 * @see LDP.LDPPackage#getAgence_CodePostal()
	 * @model required="true"
	 * @generated
	 */
	int getCodePostal();

	/**
	 * Sets the value of the '{@link LDP.Agence#getCodePostal <em>Code Postal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Postal</em>' attribute.
	 * @see #getCodePostal()
	 * @generated
	 */
	void setCodePostal(int value);

	/**
	 * Returns the value of the '<em><b>Contient Employe</b></em>' containment reference list.
	 * The list contents are of type {@link LDP.Employe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contient Employe</em>' containment reference list.
	 * @see LDP.LDPPackage#getAgence_ContientEmploye()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Employe> getContientEmploye();

	/**
	 * Returns the value of the '<em><b>Contient Banque</b></em>' containment reference list.
	 * The list contents are of type {@link LDP.Banque}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contient Banque</em>' containment reference list.
	 * @see LDP.LDPPackage#getAgence_ContientBanque()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Banque> getContientBanque();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Agence.allInstances() -&gt; one(a: Agence | a.numeroA = self.numeroA)'"
	 * @generated
	 */
	boolean agenceUnique(DiagnosticChain diagnostics, Map<Object, Object> context);
	
	

} // Agence
