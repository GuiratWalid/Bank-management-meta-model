/**
 */
package LDP.util;

import LDP.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see LDP.LDPPackage
 * @generated
 */
public class LDPValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LDPValidator INSTANCE = new LDPValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "LDP";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Compte Unique' of 'Compte Bancaire'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPTE_BANCAIRE__COMPTE_UNIQUE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Agence Unique' of 'Agence'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGENCE__AGENCE_UNIQUE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Banque Unique' of 'Banque'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BANQUE__BANQUE_UNIQUE = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDPValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return LDPPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case LDPPackage.PERSONNE:
				return validatePersonne((Personne)value, diagnostics, context);
			case LDPPackage.CLIENT:
				return validateClient((Client)value, diagnostics, context);
			case LDPPackage.EMPLOYE:
				return validateEmploye((Employe)value, diagnostics, context);
			case LDPPackage.COMPTE_BANCAIRE:
				return validateCompteBancaire((CompteBancaire)value, diagnostics, context);
			case LDPPackage.AGENCE:
				return validateAgence((Agence)value, diagnostics, context);
			case LDPPackage.BANQUE:
				return validateBanque((Banque)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonne(Personne personne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personne, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClient(Client client, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(client, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmploye(Employe employe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(employe, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompteBancaire(CompteBancaire compteBancaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compteBancaire, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compteBancaire, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compteBancaire, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compteBancaire, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compteBancaire, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compteBancaire, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compteBancaire, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compteBancaire, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compteBancaire, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompteBancaire_compteUnique(compteBancaire, diagnostics, context);
		return result;
	}

	/**
	 * Validates the compteUnique constraint of '<em>Compte Bancaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompteBancaire_compteUnique(CompteBancaire compteBancaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return compteBancaire.compteUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgence(Agence agence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(agence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(agence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(agence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(agence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(agence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(agence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(agence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(agence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(agence, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgence_agenceUnique(agence, diagnostics, context);
		return result;
	}

	/**
	 * Validates the agenceUnique constraint of '<em>Agence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgence_agenceUnique(Agence agence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return agence.agenceUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBanque(Banque banque, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(banque, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(banque, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(banque, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(banque, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(banque, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(banque, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(banque, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(banque, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(banque, diagnostics, context);
		if (result || diagnostics != null) result &= validateBanque_banqueUnique(banque, diagnostics, context);
		return result;
	}

	/**
	 * Validates the banqueUnique constraint of '<em>Banque</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBanque_banqueUnique(Banque banque, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return banque.banqueUnique(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //LDPValidator
