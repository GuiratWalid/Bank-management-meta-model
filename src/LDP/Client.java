/**
 */
package LDP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Client#getConseiller <em>Conseiller</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends Personne {
	/**
	 * Returns the value of the '<em><b>Conseiller</b></em>' reference list.
	 * The list contents are of type {@link LDP.Employe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conseiller</em>' reference list.
	 * @see LDP.LDPPackage#getClient_Conseiller()
	 * @model
	 * @generated
	 */
	EList<Employe> getConseiller();

} // Client
