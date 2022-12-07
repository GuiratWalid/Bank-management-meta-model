/**
 */
package LDP.impl;

import LDP.Agence;
import LDP.Client;
import LDP.CompteBancaire;
import LDP.LDPPackage;
import LDP.LDPTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 * An implementation of the model object '<em><b>Compte Bancaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP.impl.CompteBancaireImpl#getNumeroC <em>Numero C</em>}</li>
 *   <li>{@link LDP.impl.CompteBancaireImpl#getSolde <em>Solde</em>}</li>
 *   <li>{@link LDP.impl.CompteBancaireImpl#getDateOuverture <em>Date Ouverture</em>}</li>
 *   <li>{@link LDP.impl.CompteBancaireImpl#getAppartient <em>Appartient</em>}</li>
 *   <li>{@link LDP.impl.CompteBancaireImpl#getPropriétaire <em>Propriétaire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompteBancaireImpl extends MinimalEObjectImpl.Container implements CompteBancaire {
	/**
	 * The default value of the '{@link #getNumeroC() <em>Numero C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroC()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroC() <em>Numero C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroC()
	 * @generated
	 * @ordered
	 */
	protected String numeroC = NUMERO_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolde() <em>Solde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolde()
	 * @generated
	 * @ordered
	 */
	protected static final float SOLDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSolde() <em>Solde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolde()
	 * @generated
	 * @ordered
	 */
	protected float solde = SOLDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOuverture() <em>Date Ouverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOuverture()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OUVERTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOuverture() <em>Date Ouverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOuverture()
	 * @generated
	 * @ordered
	 */
	protected Date dateOuverture = DATE_OUVERTURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppartient() <em>Appartient</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppartient()
	 * @generated
	 * @ordered
	 */
	protected EList<Agence> appartient;

	/**
	 * The cached value of the '{@link #getPropriétaire() <em>Propriétaire</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropriétaire()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> propriétaire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompteBancaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPPackage.Literals.COMPTE_BANCAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroC() {
		return numeroC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroC(String newNumeroC) {
		String oldNumeroC = numeroC;
		numeroC = newNumeroC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.COMPTE_BANCAIRE__NUMERO_C, oldNumeroC, numeroC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSolde() {
		return solde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolde(float newSolde) {
		float oldSolde = solde;
		solde = newSolde;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.COMPTE_BANCAIRE__SOLDE, oldSolde, solde));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOuverture() {
		return dateOuverture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOuverture(Date newDateOuverture) {
		Date oldDateOuverture = dateOuverture;
		dateOuverture = newDateOuverture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.COMPTE_BANCAIRE__DATE_OUVERTURE, oldDateOuverture, dateOuverture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agence> getAppartient() {
		if (appartient == null) {
			appartient = new EObjectResolvingEList<Agence>(Agence.class, this, LDPPackage.COMPTE_BANCAIRE__APPARTIENT);
		}
		return appartient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getPropriétaire() {
		if (propriétaire == null) {
			propriétaire = new EObjectResolvingEList<Client>(Client.class, this, LDPPackage.COMPTE_BANCAIRE__PROPRIÉTAIRE);
		}
		return propriétaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean compteUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "CompteBancaire::compteUnique";
		try {
			/**
			 *
			 * inv compteUnique:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = CompteBancaire.allInstances()
			 *         ->one(cb | cb.numeroC = self.numeroC)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, LDPPackage.Literals.COMPTE_BANCAIRE___COMPTE_UNIQUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, LDPTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_LDP_c_c_CompteBancaire = idResolver.getClass(LDPTables.CLSSid_CompteBancaire, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, LDPTables.SET_CLSSid_CompteBancaire, TYP_LDP_c_c_CompteBancaire);
				/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_cb = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_cb.hasNext()) {
						result = accumulator;
						break;
					}
					/*@NonInvalid*/ CompteBancaire cb = (CompteBancaire)ITERATOR_cb.next();
					/**
					 * cb.numeroC = self.numeroC
					 */
					final /*@NonInvalid*/ String numeroC = cb.getNumeroC();
					final /*@NonInvalid*/ String numeroC_0 = this.getNumeroC();
					final /*@NonInvalid*/ boolean eq = (numeroC != null) ? numeroC.equals(numeroC_0) : (numeroC_0 == null);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDPPackage.COMPTE_BANCAIRE__NUMERO_C:
				return getNumeroC();
			case LDPPackage.COMPTE_BANCAIRE__SOLDE:
				return getSolde();
			case LDPPackage.COMPTE_BANCAIRE__DATE_OUVERTURE:
				return getDateOuverture();
			case LDPPackage.COMPTE_BANCAIRE__APPARTIENT:
				return getAppartient();
			case LDPPackage.COMPTE_BANCAIRE__PROPRIÉTAIRE:
				return getPropriétaire();
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
			case LDPPackage.COMPTE_BANCAIRE__NUMERO_C:
				setNumeroC((String)newValue);
				return;
			case LDPPackage.COMPTE_BANCAIRE__SOLDE:
				setSolde((Float)newValue);
				return;
			case LDPPackage.COMPTE_BANCAIRE__DATE_OUVERTURE:
				setDateOuverture((Date)newValue);
				return;
			case LDPPackage.COMPTE_BANCAIRE__APPARTIENT:
				getAppartient().clear();
				getAppartient().addAll((Collection<? extends Agence>)newValue);
				return;
			case LDPPackage.COMPTE_BANCAIRE__PROPRIÉTAIRE:
				getPropriétaire().clear();
				getPropriétaire().addAll((Collection<? extends Client>)newValue);
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
			case LDPPackage.COMPTE_BANCAIRE__NUMERO_C:
				setNumeroC(NUMERO_C_EDEFAULT);
				return;
			case LDPPackage.COMPTE_BANCAIRE__SOLDE:
				setSolde(SOLDE_EDEFAULT);
				return;
			case LDPPackage.COMPTE_BANCAIRE__DATE_OUVERTURE:
				setDateOuverture(DATE_OUVERTURE_EDEFAULT);
				return;
			case LDPPackage.COMPTE_BANCAIRE__APPARTIENT:
				getAppartient().clear();
				return;
			case LDPPackage.COMPTE_BANCAIRE__PROPRIÉTAIRE:
				getPropriétaire().clear();
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
			case LDPPackage.COMPTE_BANCAIRE__NUMERO_C:
				return NUMERO_C_EDEFAULT == null ? numeroC != null : !NUMERO_C_EDEFAULT.equals(numeroC);
			case LDPPackage.COMPTE_BANCAIRE__SOLDE:
				return solde != SOLDE_EDEFAULT;
			case LDPPackage.COMPTE_BANCAIRE__DATE_OUVERTURE:
				return DATE_OUVERTURE_EDEFAULT == null ? dateOuverture != null : !DATE_OUVERTURE_EDEFAULT.equals(dateOuverture);
			case LDPPackage.COMPTE_BANCAIRE__APPARTIENT:
				return appartient != null && !appartient.isEmpty();
			case LDPPackage.COMPTE_BANCAIRE__PROPRIÉTAIRE:
				return propriétaire != null && !propriétaire.isEmpty();
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
			case LDPPackage.COMPTE_BANCAIRE___COMPTE_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return compteUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (numeroC: ");
		result.append(numeroC);
		result.append(", solde: ");
		result.append(solde);
		result.append(", dateOuverture: ");
		result.append(dateOuverture);
		result.append(')');
		return result.toString();
	}

} //CompteBancaireImpl
