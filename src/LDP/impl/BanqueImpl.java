/**
 */
package LDP.impl;

import LDP.Banque;
import LDP.LDPPackage;
import LDP.LDPTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 * An implementation of the model object '<em><b>Banque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP.impl.BanqueImpl#getNumeroB <em>Numero B</em>}</li>
 *   <li>{@link LDP.impl.BanqueImpl#getCapital <em>Capital</em>}</li>
 *   <li>{@link LDP.impl.BanqueImpl#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BanqueImpl extends MinimalEObjectImpl.Container implements Banque {
	/**
	 * The default value of the '{@link #getNumeroB() <em>Numero B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroB()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroB() <em>Numero B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroB()
	 * @generated
	 * @ordered
	 */
	protected String numeroB = NUMERO_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapital() <em>Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapital()
	 * @generated
	 * @ordered
	 */
	protected static final long CAPITAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCapital() <em>Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapital()
	 * @generated
	 * @ordered
	 */
	protected long capital = CAPITAL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BanqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPPackage.Literals.BANQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroB() {
		return numeroB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroB(String newNumeroB) {
		String oldNumeroB = numeroB;
		numeroB = newNumeroB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.BANQUE__NUMERO_B, oldNumeroB, numeroB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCapital() {
		return capital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapital(long newCapital) {
		long oldCapital = capital;
		capital = newCapital;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.BANQUE__CAPITAL, oldCapital, capital));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.BANQUE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean banqueUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Banque::banqueUnique";
		try {
			/**
			 *
			 * inv banqueUnique:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Banque.allInstances()
			 *         ->one(b | b.numeroB = self.numeroB)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, LDPPackage.Literals.BANQUE___BANQUE_UNIQUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, LDPTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_LDP_c_c_Banque = idResolver.getClass(LDPTables.CLSSid_Banque, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, LDPTables.SET_CLSSid_Banque, TYP_LDP_c_c_Banque);
				/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_b = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_b.hasNext()) {
						result = accumulator;
						break;
					}
					/*@NonInvalid*/ Banque b = (Banque)ITERATOR_b.next();
					/**
					 * b.numeroB = self.numeroB
					 */
					final /*@NonInvalid*/ String numeroB = b.getNumeroB();
					final /*@NonInvalid*/ String numeroB_0 = this.getNumeroB();
					final /*@NonInvalid*/ boolean eq = (numeroB != null) ? numeroB.equals(numeroB_0) : (numeroB_0 == null);
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
			case LDPPackage.BANQUE__NUMERO_B:
				return getNumeroB();
			case LDPPackage.BANQUE__CAPITAL:
				return getCapital();
			case LDPPackage.BANQUE__NOM:
				return getNom();
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
			case LDPPackage.BANQUE__NUMERO_B:
				setNumeroB((String)newValue);
				return;
			case LDPPackage.BANQUE__CAPITAL:
				setCapital((Long)newValue);
				return;
			case LDPPackage.BANQUE__NOM:
				setNom((String)newValue);
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
			case LDPPackage.BANQUE__NUMERO_B:
				setNumeroB(NUMERO_B_EDEFAULT);
				return;
			case LDPPackage.BANQUE__CAPITAL:
				setCapital(CAPITAL_EDEFAULT);
				return;
			case LDPPackage.BANQUE__NOM:
				setNom(NOM_EDEFAULT);
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
			case LDPPackage.BANQUE__NUMERO_B:
				return NUMERO_B_EDEFAULT == null ? numeroB != null : !NUMERO_B_EDEFAULT.equals(numeroB);
			case LDPPackage.BANQUE__CAPITAL:
				return capital != CAPITAL_EDEFAULT;
			case LDPPackage.BANQUE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
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
			case LDPPackage.BANQUE___BANQUE_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return banqueUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (numeroB: ");
		result.append(numeroB);
		result.append(", capital: ");
		result.append(capital);
		result.append(", nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //BanqueImpl
