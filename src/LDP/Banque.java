/**
 */
package LDP;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Banque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Banque#getNumeroB <em>Numero B</em>}</li>
 *   <li>{@link LDP.Banque#getCapital <em>Capital</em>}</li>
 *   <li>{@link LDP.Banque#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getBanque()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='banqueUnique'"
 * @generated
 */
public interface Banque extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero B</em>' attribute.
	 * @see #setNumeroB(String)
	 * @see LDP.LDPPackage#getBanque_NumeroB()
	 * @model
	 * @generated
	 */
	String getNumeroB();

	/**
	 * Sets the value of the '{@link LDP.Banque#getNumeroB <em>Numero B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero B</em>' attribute.
	 * @see #getNumeroB()
	 * @generated
	 */
	void setNumeroB(String value);

	/**
	 * Returns the value of the '<em><b>Capital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capital</em>' attribute.
	 * @see #setCapital(long)
	 * @see LDP.LDPPackage#getBanque_Capital()
	 * @model required="true"
	 * @generated
	 */
	long getCapital();

	/**
	 * Sets the value of the '{@link LDP.Banque#getCapital <em>Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capital</em>' attribute.
	 * @see #getCapital()
	 * @generated
	 */
	void setCapital(long value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see LDP.LDPPackage#getBanque_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link LDP.Banque#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Banque.allInstances() -&gt; one(b: Banque | b.numeroB = self.numeroB)'"
	 * @generated
	 */
	boolean banqueUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Banque
