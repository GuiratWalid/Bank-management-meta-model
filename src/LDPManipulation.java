import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import LDP.*;

public class LDPManipulation {

	public void sauverModele(String uri, EObject root) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      resource.getContents().add(root);
		      resource.save(null);
		   } catch (Exception e) {
		      System.err.println("ERREUR sauvegarde du mod�le : "+e);
		      e.printStackTrace();
		   }
		}

		public Resource chargerModele(String uri, EPackage pack) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      XMLResource.XMLMap xmlMap = new XMLMapImpl();
		      xmlMap.setNoNamespacePackage(pack);
		      java.util.Map options = new java.util.HashMap();
		      options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		      resource.load(options);
		   }
		   catch(Exception e) {
		      System.err.println("ERREUR chargement du mod�le : "+e);
		      e.printStackTrace();
		   }
		   return resource;
		}
		
		public Agence getProcessusInModel(String modelFile) {
			Resource resource = chargerModele(modelFile, LDPPackage.eINSTANCE);
			if (resource == null) {
				System.err.println(" Erreur de chargement du mod�le");
				return null;
			}

			TreeIterator it = resource.getAllContents();

			Agence proc = null;
			while(it.hasNext()) {
			   EObject obj = (EObject) it.next();
			   if (obj instanceof Agence) {
			      proc = (Agence) obj;
			      break;
			   }
			}
			return proc;
		}
	
		
		public void printAgence(Agence a) {
			System.out.println("=> Les informations de l'agence sont :");
			System.out.println("\t*Numéro de l'agence: "+a.getNumeroA());
			System.out.println("\t*Nom: "+a.getNom());
			System.out.println("\t*Adresse: "+a.getAdresse());
			System.out.println("\t*Ville: "+a.getVille());
			System.out.println("\t*Code Postal: "+a.getCodePostal());
			System.out.println("\t=> Les informations des employés sont :");
			for(Employe e : a.getContientEmploye()) {
				System.out.println("\t\t*CIN: "+e.getCin());
				System.out.println("\t\t*Nom: "+e.getNom());
				System.out.println("\t\t*Prénom: "+e.getPrenom());
				System.out.println("\t\t*Adresse: "+e.getAdresse());
				System.out.println("\t\t*Salaire: "+e.getSalaire()+"\n");
			}
			System.out.println("\t=> Les informations des banques sont :");
			for(Banque b : a.getContientBanque()) {
				System.out.println("\t\t*Numéro banque: "+b.getNumeroB());
				System.out.println("\t\t*Nom: "+b.getNom());
				System.out.println("\t\t*Capital: "+b.getCapital()+"\n");
			}
		}
		
		
		
		public static void main(String argv[]) {
			
			LDPManipulation manip = new LDPManipulation();
						
			Agence a = manip.getProcessusInModel("model/Agence.xmi");
			
			System.out.println("\t ******* modéle chargé ******* ");
			
			manip.printAgence(a);
			
		
			
			System.out.println("\t ******** terminé ******** ");
		}
}