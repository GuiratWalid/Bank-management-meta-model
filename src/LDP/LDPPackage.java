/**
 */
package LDP;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see LDP.LDPFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface LDPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LDP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = " platform:/resource/projet/metamodels/LDP.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LDP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LDPPackage eINSTANCE = LDP.impl.LDPPackageImpl.init();

	/**
	 * The meta object id for the '{@link LDP.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.PersonneImpl
	 * @see LDP.impl.LDPPackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__PRENOM = 1;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__ADRESSE = 2;

	/**
	 * The feature id for the '<em><b>Cin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__CIN = 3;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ClientImpl
	 * @see LDP.impl.LDPPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NOM = PERSONNE__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PRENOM = PERSONNE__PRENOM;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ADRESSE = PERSONNE__ADRESSE;

	/**
	 * The feature id for the '<em><b>Cin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CIN = PERSONNE__CIN;

	/**
	 * The feature id for the '<em><b>Conseiller</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CONSEILLER = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.EmployeImpl <em>Employe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.EmployeImpl
	 * @see LDP.impl.LDPPackageImpl#getEmploye()
	 * @generated
	 */
	int EMPLOYE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__NOM = PERSONNE__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__PRENOM = PERSONNE__PRENOM;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__ADRESSE = PERSONNE__ADRESSE;

	/**
	 * The feature id for the '<em><b>Cin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__CIN = PERSONNE__CIN;

	/**
	 * The feature id for the '<em><b>Salaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__SALAIRE = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Embauche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__DATE_EMBAUCHE = PERSONNE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.CompteBancaireImpl <em>Compte Bancaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.CompteBancaireImpl
	 * @see LDP.impl.LDPPackageImpl#getCompteBancaire()
	 * @generated
	 */
	int COMPTE_BANCAIRE = 3;

	/**
	 * The feature id for the '<em><b>Numero C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_BANCAIRE__NUMERO_C = 0;

	/**
	 * The feature id for the '<em><b>Solde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_BANCAIRE__SOLDE = 1;

	/**
	 * The feature id for the '<em><b>Date Ouverture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_BANCAIRE__DATE_OUVERTURE = 2;

	/**
	 * The feature id for the '<em><b>Appartient</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_BANCAIRE__APPARTIENT = 3;

	/**
	 * The feature id for the '<em><b>Propriétaire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_BANCAIRE__PROPRIÉTAIRE = 4;

	/**
	 * The number of structural features of the '<em>Compte Bancaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_BANCAIRE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Compte Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_BANCAIRE___COMPTE_UNIQUE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Compte Bancaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_BANCAIRE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link LDP.impl.AgenceImpl <em>Agence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.AgenceImpl
	 * @see LDP.impl.LDPPackageImpl#getAgence()
	 * @generated
	 */
	int AGENCE = 4;

	/**
	 * The feature id for the '<em><b>Numero A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__NUMERO_A = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__ADRESSE = 2;

	/**
	 * The feature id for the '<em><b>Ville</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__VILLE = 3;

	/**
	 * The feature id for the '<em><b>Code Postal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__CODE_POSTAL = 4;

	/**
	 * The feature id for the '<em><b>Contient Employe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__CONTIENT_EMPLOYE = 5;

	/**
	 * The feature id for the '<em><b>Contient Banque</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE__CONTIENT_BANQUE = 6;

	/**
	 * The number of structural features of the '<em>Agence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Agence Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE___AGENCE_UNIQUE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Agence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link LDP.impl.BanqueImpl <em>Banque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.BanqueImpl
	 * @see LDP.impl.LDPPackageImpl#getBanque()
	 * @generated
	 */
	int BANQUE = 5;

	/**
	 * The feature id for the '<em><b>Numero B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANQUE__NUMERO_B = 0;

	/**
	 * The feature id for the '<em><b>Capital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANQUE__CAPITAL = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANQUE__NOM = 2;

	/**
	 * The number of structural features of the '<em>Banque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANQUE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Banque Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANQUE___BANQUE_UNIQUE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Banque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANQUE_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link LDP.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see LDP.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Personne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LDP.Personne#getNom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Nom();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Personne#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see LDP.Personne#getPrenom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Personne#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see LDP.Personne#getAdresse()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Personne#getCin <em>Cin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cin</em>'.
	 * @see LDP.Personne#getCin()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Cin();

	/**
	 * Returns the meta object for class '{@link LDP.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see LDP.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the reference list '{@link LDP.Client#getConseiller <em>Conseiller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conseiller</em>'.
	 * @see LDP.Client#getConseiller()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Conseiller();

	/**
	 * Returns the meta object for class '{@link LDP.Employe <em>Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employe</em>'.
	 * @see LDP.Employe
	 * @generated
	 */
	EClass getEmploye();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Employe#getSalaire <em>Salaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salaire</em>'.
	 * @see LDP.Employe#getSalaire()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Salaire();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Employe#getDateEmbauche <em>Date Embauche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Embauche</em>'.
	 * @see LDP.Employe#getDateEmbauche()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_DateEmbauche();

	/**
	 * Returns the meta object for class '{@link LDP.CompteBancaire <em>Compte Bancaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compte Bancaire</em>'.
	 * @see LDP.CompteBancaire
	 * @generated
	 */
	EClass getCompteBancaire();

	/**
	 * Returns the meta object for the attribute '{@link LDP.CompteBancaire#getNumeroC <em>Numero C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero C</em>'.
	 * @see LDP.CompteBancaire#getNumeroC()
	 * @see #getCompteBancaire()
	 * @generated
	 */
	EAttribute getCompteBancaire_NumeroC();

	/**
	 * Returns the meta object for the attribute '{@link LDP.CompteBancaire#getSolde <em>Solde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solde</em>'.
	 * @see LDP.CompteBancaire#getSolde()
	 * @see #getCompteBancaire()
	 * @generated
	 */
	EAttribute getCompteBancaire_Solde();

	/**
	 * Returns the meta object for the attribute '{@link LDP.CompteBancaire#getDateOuverture <em>Date Ouverture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Ouverture</em>'.
	 * @see LDP.CompteBancaire#getDateOuverture()
	 * @see #getCompteBancaire()
	 * @generated
	 */
	EAttribute getCompteBancaire_DateOuverture();

	/**
	 * Returns the meta object for the reference list '{@link LDP.CompteBancaire#getAppartient <em>Appartient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appartient</em>'.
	 * @see LDP.CompteBancaire#getAppartient()
	 * @see #getCompteBancaire()
	 * @generated
	 */
	EReference getCompteBancaire_Appartient();

	/**
	 * Returns the meta object for the reference list '{@link LDP.CompteBancaire#getPropriétaire <em>Propriétaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Propriétaire</em>'.
	 * @see LDP.CompteBancaire#getPropriétaire()
	 * @see #getCompteBancaire()
	 * @generated
	 */
	EReference getCompteBancaire_Propriétaire();

	/**
	 * Returns the meta object for the '{@link LDP.CompteBancaire#compteUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Compte Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compte Unique</em>' operation.
	 * @see LDP.CompteBancaire#compteUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCompteBancaire__CompteUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link LDP.Agence <em>Agence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agence</em>'.
	 * @see LDP.Agence
	 * @generated
	 */
	EClass getAgence();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Agence#getNumeroA <em>Numero A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero A</em>'.
	 * @see LDP.Agence#getNumeroA()
	 * @see #getAgence()
	 * @generated
	 */
	EAttribute getAgence_NumeroA();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Agence#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LDP.Agence#getNom()
	 * @see #getAgence()
	 * @generated
	 */
	EAttribute getAgence_Nom();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Agence#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see LDP.Agence#getAdresse()
	 * @see #getAgence()
	 * @generated
	 */
	EAttribute getAgence_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Agence#getVille <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ville</em>'.
	 * @see LDP.Agence#getVille()
	 * @see #getAgence()
	 * @generated
	 */
	EAttribute getAgence_Ville();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Agence#getCodePostal <em>Code Postal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Postal</em>'.
	 * @see LDP.Agence#getCodePostal()
	 * @see #getAgence()
	 * @generated
	 */
	EAttribute getAgence_CodePostal();

	/**
	 * Returns the meta object for the containment reference list '{@link LDP.Agence#getContientEmploye <em>Contient Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contient Employe</em>'.
	 * @see LDP.Agence#getContientEmploye()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_ContientEmploye();

	/**
	 * Returns the meta object for the containment reference list '{@link LDP.Agence#getContientBanque <em>Contient Banque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contient Banque</em>'.
	 * @see LDP.Agence#getContientBanque()
	 * @see #getAgence()
	 * @generated
	 */
	EReference getAgence_ContientBanque();

	/**
	 * Returns the meta object for the '{@link LDP.Agence#agenceUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Agence Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Agence Unique</em>' operation.
	 * @see LDP.Agence#agenceUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAgence__AgenceUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link LDP.Banque <em>Banque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Banque</em>'.
	 * @see LDP.Banque
	 * @generated
	 */
	EClass getBanque();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Banque#getNumeroB <em>Numero B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero B</em>'.
	 * @see LDP.Banque#getNumeroB()
	 * @see #getBanque()
	 * @generated
	 */
	EAttribute getBanque_NumeroB();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Banque#getCapital <em>Capital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capital</em>'.
	 * @see LDP.Banque#getCapital()
	 * @see #getBanque()
	 * @generated
	 */
	EAttribute getBanque_Capital();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Banque#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LDP.Banque#getNom()
	 * @see #getBanque()
	 * @generated
	 */
	EAttribute getBanque_Nom();

	/**
	 * Returns the meta object for the '{@link LDP.Banque#banqueUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Banque Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Banque Unique</em>' operation.
	 * @see LDP.Banque#banqueUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBanque__BanqueUnique__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LDPFactory getLDPFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link LDP.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.PersonneImpl
		 * @see LDP.impl.LDPPackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NOM = eINSTANCE.getPersonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__PRENOM = eINSTANCE.getPersonne_Prenom();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__ADRESSE = eINSTANCE.getPersonne_Adresse();

		/**
		 * The meta object literal for the '<em><b>Cin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__CIN = eINSTANCE.getPersonne_Cin();

		/**
		 * The meta object literal for the '{@link LDP.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ClientImpl
		 * @see LDP.impl.LDPPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Conseiller</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__CONSEILLER = eINSTANCE.getClient_Conseiller();

		/**
		 * The meta object literal for the '{@link LDP.impl.EmployeImpl <em>Employe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.EmployeImpl
		 * @see LDP.impl.LDPPackageImpl#getEmploye()
		 * @generated
		 */
		EClass EMPLOYE = eINSTANCE.getEmploye();

		/**
		 * The meta object literal for the '<em><b>Salaire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__SALAIRE = eINSTANCE.getEmploye_Salaire();

		/**
		 * The meta object literal for the '<em><b>Date Embauche</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__DATE_EMBAUCHE = eINSTANCE.getEmploye_DateEmbauche();

		/**
		 * The meta object literal for the '{@link LDP.impl.CompteBancaireImpl <em>Compte Bancaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.CompteBancaireImpl
		 * @see LDP.impl.LDPPackageImpl#getCompteBancaire()
		 * @generated
		 */
		EClass COMPTE_BANCAIRE = eINSTANCE.getCompteBancaire();

		/**
		 * The meta object literal for the '<em><b>Numero C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPTE_BANCAIRE__NUMERO_C = eINSTANCE.getCompteBancaire_NumeroC();

		/**
		 * The meta object literal for the '<em><b>Solde</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPTE_BANCAIRE__SOLDE = eINSTANCE.getCompteBancaire_Solde();

		/**
		 * The meta object literal for the '<em><b>Date Ouverture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPTE_BANCAIRE__DATE_OUVERTURE = eINSTANCE.getCompteBancaire_DateOuverture();

		/**
		 * The meta object literal for the '<em><b>Appartient</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPTE_BANCAIRE__APPARTIENT = eINSTANCE.getCompteBancaire_Appartient();

		/**
		 * The meta object literal for the '<em><b>Propriétaire</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPTE_BANCAIRE__PROPRIÉTAIRE = eINSTANCE.getCompteBancaire_Propriétaire();

		/**
		 * The meta object literal for the '<em><b>Compte Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPTE_BANCAIRE___COMPTE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCompteBancaire__CompteUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link LDP.impl.AgenceImpl <em>Agence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.AgenceImpl
		 * @see LDP.impl.LDPPackageImpl#getAgence()
		 * @generated
		 */
		EClass AGENCE = eINSTANCE.getAgence();

		/**
		 * The meta object literal for the '<em><b>Numero A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCE__NUMERO_A = eINSTANCE.getAgence_NumeroA();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCE__NOM = eINSTANCE.getAgence_Nom();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCE__ADRESSE = eINSTANCE.getAgence_Adresse();

		/**
		 * The meta object literal for the '<em><b>Ville</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCE__VILLE = eINSTANCE.getAgence_Ville();

		/**
		 * The meta object literal for the '<em><b>Code Postal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCE__CODE_POSTAL = eINSTANCE.getAgence_CodePostal();

		/**
		 * The meta object literal for the '<em><b>Contient Employe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__CONTIENT_EMPLOYE = eINSTANCE.getAgence_ContientEmploye();

		/**
		 * The meta object literal for the '<em><b>Contient Banque</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCE__CONTIENT_BANQUE = eINSTANCE.getAgence_ContientBanque();

		/**
		 * The meta object literal for the '<em><b>Agence Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGENCE___AGENCE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAgence__AgenceUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link LDP.impl.BanqueImpl <em>Banque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.BanqueImpl
		 * @see LDP.impl.LDPPackageImpl#getBanque()
		 * @generated
		 */
		EClass BANQUE = eINSTANCE.getBanque();

		/**
		 * The meta object literal for the '<em><b>Numero B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANQUE__NUMERO_B = eINSTANCE.getBanque_NumeroB();

		/**
		 * The meta object literal for the '<em><b>Capital</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANQUE__CAPITAL = eINSTANCE.getBanque_Capital();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANQUE__NOM = eINSTANCE.getBanque_Nom();

		/**
		 * The meta object literal for the '<em><b>Banque Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BANQUE___BANQUE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBanque__BanqueUnique__DiagnosticChain_Map();

	}

} //LDPPackage
