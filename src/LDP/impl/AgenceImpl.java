/**
 */
package LDP.impl;

import LDP.Agence;
import LDP.Banque;
import LDP.Employe;
import LDP.LDPPackage;
import LDP.LDPTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP.impl.AgenceImpl#getNumeroA <em>Numero A</em>}</li>
 *   <li>{@link LDP.impl.AgenceImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link LDP.impl.AgenceImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link LDP.impl.AgenceImpl#getVille <em>Ville</em>}</li>
 *   <li>{@link LDP.impl.AgenceImpl#getCodePostal <em>Code Postal</em>}</li>
 *   <li>{@link LDP.impl.AgenceImpl#getContientEmploye <em>Contient Employe</em>}</li>
 *   <li>{@link LDP.impl.AgenceImpl#getContientBanque <em>Contient Banque</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgenceImpl extends MinimalEObjectImpl.Container implements Agence {
	/**
	 * The default value of the '{@link #getNumeroA() <em>Numero A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroA()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroA() <em>Numero A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroA()
	 * @generated
	 * @ordered
	 */
	protected String numeroA = NUMERO_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected String adresse = ADRESSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVille() <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVille()
	 * @generated
	 * @ordered
	 */
	protected static final String VILLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVille() <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVille()
	 * @generated
	 * @ordered
	 */
	protected String ville = VILLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodePostal() <em>Code Postal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePostal()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_POSTAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodePostal() <em>Code Postal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePostal()
	 * @generated
	 * @ordered
	 */
	protected int codePostal = CODE_POSTAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContientEmploye() <em>Contient Employe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContientEmploye()
	 * @generated
	 * @ordered
	 */
	protected EList<Employe> contientEmploye;

	/**
	 * The cached value of the '{@link #getContientBanque() <em>Contient Banque</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContientBanque()
	 * @generated
	 * @ordered
	 */
	protected EList<Banque> contientBanque;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPPackage.Literals.AGENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroA() {
		return numeroA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroA(String newNumeroA) {
		String oldNumeroA = numeroA;
		numeroA = newNumeroA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.AGENCE__NUMERO_A, oldNumeroA, numeroA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.AGENCE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresse(String newAdresse) {
		String oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.AGENCE__ADRESSE, oldAdresse, adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVille(String newVille) {
		String oldVille = ville;
		ville = newVille;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.AGENCE__VILLE, oldVille, ville));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodePostal(int newCodePostal) {
		int oldCodePostal = codePostal;
		codePostal = newCodePostal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.AGENCE__CODE_POSTAL, oldCodePostal, codePostal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employe> getContientEmploye() {
		if (contientEmploye == null) {
			contientEmploye = new EObjectContainmentEList<Employe>(Employe.class, this, LDPPackage.AGENCE__CONTIENT_EMPLOYE);
		}
		return contientEmploye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Banque> getContientBanque() {
		if (contientBanque == null) {
			contientBanque = new EObjectContainmentEList<Banque>(Banque.class, this, LDPPackage.AGENCE__CONTIENT_BANQUE);
		}
		return contientBanque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean agenceUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Agence::agenceUnique";
		try {
			/**
			 *
			 * inv agenceUnique:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Agence.allInstances()
			 *         ->one(a | a.numeroA = self.numeroA)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, LDPPackage.Literals.AGENCE___AGENCE_UNIQUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, LDPTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_LDP_c_c_Agence = idResolver.getClass(LDPTables.CLSSid_Agence, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, LDPTables.SET_CLSSid_Agence, TYP_LDP_c_c_Agence);
				/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_a = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_a.hasNext()) {
						result = accumulator;
						break;
					}
					/*@NonInvalid*/ Agence a = (Agence)ITERATOR_a.next();
					/**
					 * a.numeroA = self.numeroA
					 */
					final /*@NonInvalid*/ String numeroA = a.getNumeroA();
					final /*@NonInvalid*/ String numeroA_0 = this.getNumeroA();
					final /*@NonInvalid*/ boolean eq = (numeroA != null) ? numeroA.equals(numeroA_0) : (numeroA_0 == null);
					//
					if (eq) {			// Carry on till something found
						if (accumulator) {
							result = false;
							break;
						}
						else {
							accumulator = true;
						}
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, LDPTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDPPackage.AGENCE__CONTIENT_EMPLOYE:
				return ((InternalEList<?>)getContientEmploye()).basicRemove(otherEnd, msgs);
			case LDPPackage.AGENCE__CONTIENT_BANQUE:
				return ((InternalEList<?>)getContientBanque()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDPPackage.AGENCE__NUMERO_A:
				return getNumeroA();
			case LDPPackage.AGENCE__NOM:
				return getNom();
			case LDPPackage.AGENCE__ADRESSE:
				return getAdresse();
			case LDPPackage.AGENCE__VILLE:
				return getVille();
			case LDPPackage.AGENCE__CODE_POSTAL:
				return getCodePostal();
			case LDPPackage.AGENCE__CONTIENT_EMPLOYE:
				return getContientEmploye();
			case LDPPackage.AGENCE__CONTIENT_BANQUE:
				return getContientBanque();
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
			case LDPPackage.AGENCE__NUMERO_A:
				setNumeroA((String)newValue);
				return;
			case LDPPackage.AGENCE__NOM:
				setNom((String)newValue);
				return;
			case LDPPackage.AGENCE__ADRESSE:
				setAdresse((String)newValue);
				return;
			case LDPPackage.AGENCE__VILLE:
				setVille((String)newValue);
				return;
			case LDPPackage.AGENCE__CODE_POSTAL:
				setCodePostal((Integer)newValue);
				return;
			case LDPPackage.AGENCE__CONTIENT_EMPLOYE:
				getContientEmploye().clear();
				getContientEmploye().addAll((Collection<? extends Employe>)newValue);
				return;
			case LDPPackage.AGENCE__CONTIENT_BANQUE:
				getContientBanque().clear();
				getContientBanque().addAll((Collection<? extends Banque>)newValue);
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
			case LDPPackage.AGENCE__NUMERO_A:
				setNumeroA(NUMERO_A_EDEFAULT);
				return;
			case LDPPackage.AGENCE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case LDPPackage.AGENCE__ADRESSE:
				setAdresse(ADRESSE_EDEFAULT);
				return;
			case LDPPackage.AGENCE__VILLE:
				setVille(VILLE_EDEFAULT);
				return;
			case LDPPackage.AGENCE__CODE_POSTAL:
				setCodePostal(CODE_POSTAL_EDEFAULT);
				return;
			case LDPPackage.AGENCE__CONTIENT_EMPLOYE:
				getContientEmploye().clear();
				return;
			case LDPPackage.AGENCE__CONTIENT_BANQUE:
				getContientBanque().clear();
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
			case LDPPackage.AGENCE__NUMERO_A:
				return NUMERO_A_EDEFAULT == null ? numeroA != null : !NUMERO_A_EDEFAULT.equals(numeroA);
			case LDPPackage.AGENCE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case LDPPackage.AGENCE__ADRESSE:
				return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
			case LDPPackage.AGENCE__VILLE:
				return VILLE_EDEFAULT == null ? ville != null : !VILLE_EDEFAULT.equals(ville);
			case LDPPackage.AGENCE__CODE_POSTAL:
				return codePostal != CODE_POSTAL_EDEFAULT;
			case LDPPackage.AGENCE__CONTIENT_EMPLOYE:
				return contientEmploye != null && !contientEmploye.isEmpty();
			case LDPPackage.AGENCE__CONTIENT_BANQUE:
				return contientBanque != null && !contientBanque.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LDPPackage.AGENCE___AGENCE_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return agenceUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (numeroA: ");
		result.append(numeroA);
		result.append(", nom: ");
		result.append(nom);
		result.append(", adresse: ");
		result.append(adresse);
		result.append(", ville: ");
		result.append(ville);
		result.append(", codePostal: ");
		result.append(codePostal);
		result.append(')');
		return result.toString();
	}

} //AgenceImpl
