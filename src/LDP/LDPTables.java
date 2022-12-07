/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /Projet/metamodels/LDP.ecore
 * using:
 *   /Projet/metamodels/LDP.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package LDP;

// import LDP.LDPPackage;
// import LDP.LDPTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * LDPTables provides the dispatch tables for the LDP for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class LDPTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(LDPPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid__32_platform_c_s_resource_s_projet_s_metamodels_s_LDP_ecore = IdManager.getNsURIPackageId(" platform:/resource/projet/metamodels/LDP.ecore", null, LDPPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Agence = LDPTables.PACKid__32_platform_c_s_resource_s_projet_s_metamodels_s_LDP_ecore.getClassId("Agence", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Banque = LDPTables.PACKid__32_platform_c_s_resource_s_projet_s_metamodels_s_LDP_ecore.getClassId("Banque", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = LDPTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Client = LDPTables.PACKid__32_platform_c_s_resource_s_projet_s_metamodels_s_LDP_ecore.getClassId("Client", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CompteBancaire = LDPTables.PACKid__32_platform_c_s_resource_s_projet_s_metamodels_s_LDP_ecore.getClassId("CompteBancaire", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Employe = LDPTables.PACKid__32_platform_c_s_resource_s_projet_s_metamodels_s_LDP_ecore.getClassId("Employe", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = LDPTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = LDPTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = LDPTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_ELong = LDPTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("ELong", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Client = TypeId.BAG.getSpecializedId(LDPTables.CLSSid_Client);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_CompteBancaire = TypeId.BAG.getSpecializedId(LDPTables.CLSSid_CompteBancaire);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Agence = TypeId.ORDERED_SET.getSpecializedId(LDPTables.CLSSid_Agence);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Banque = TypeId.ORDERED_SET.getSpecializedId(LDPTables.CLSSid_Banque);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Client = TypeId.ORDERED_SET.getSpecializedId(LDPTables.CLSSid_Client);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Employe = TypeId.ORDERED_SET.getSpecializedId(LDPTables.CLSSid_Employe);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Agence = TypeId.SET.getSpecializedId(LDPTables.CLSSid_Agence);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Banque = TypeId.SET.getSpecializedId(LDPTables.CLSSid_Banque);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_CompteBancaire = TypeId.SET.getSpecializedId(LDPTables.CLSSid_CompteBancaire);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			LDPTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LDPTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Agence = new EcoreExecutorType(LDPPackage.Literals.AGENCE, PACKAGE, 0);
		public static final EcoreExecutorType _Banque = new EcoreExecutorType(LDPPackage.Literals.BANQUE, PACKAGE, 0);
		public static final EcoreExecutorType _Client = new EcoreExecutorType(LDPPackage.Literals.CLIENT, PACKAGE, 0);
		public static final EcoreExecutorType _CompteBancaire = new EcoreExecutorType(LDPPackage.Literals.COMPTE_BANCAIRE, PACKAGE, 0);
		public static final EcoreExecutorType _Employe = new EcoreExecutorType(LDPPackage.Literals.EMPLOYE, PACKAGE, 0);
		public static final EcoreExecutorType _Personne = new EcoreExecutorType(LDPPackage.Literals.PERSONNE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Agence,
			_Banque,
			_Client,
			_CompteBancaire,
			_Employe,
			_Personne
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LDPTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Agence__Agence = new ExecutorFragment(Types._Agence, LDPTables.Types._Agence);
		private static final ExecutorFragment _Agence__OclAny = new ExecutorFragment(Types._Agence, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Agence__OclElement = new ExecutorFragment(Types._Agence, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Banque__Banque = new ExecutorFragment(Types._Banque, LDPTables.Types._Banque);
		private static final ExecutorFragment _Banque__OclAny = new ExecutorFragment(Types._Banque, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Banque__OclElement = new ExecutorFragment(Types._Banque, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Client__Client = new ExecutorFragment(Types._Client, LDPTables.Types._Client);
		private static final ExecutorFragment _Client__OclAny = new ExecutorFragment(Types._Client, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Client__OclElement = new ExecutorFragment(Types._Client, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Client__Personne = new ExecutorFragment(Types._Client, LDPTables.Types._Personne);

		private static final ExecutorFragment _CompteBancaire__CompteBancaire = new ExecutorFragment(Types._CompteBancaire, LDPTables.Types._CompteBancaire);
		private static final ExecutorFragment _CompteBancaire__OclAny = new ExecutorFragment(Types._CompteBancaire, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CompteBancaire__OclElement = new ExecutorFragment(Types._CompteBancaire, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Employe__Employe = new ExecutorFragment(Types._Employe, LDPTables.Types._Employe);
		private static final ExecutorFragment _Employe__OclAny = new ExecutorFragment(Types._Employe, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Employe__OclElement = new ExecutorFragment(Types._Employe, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Employe__Personne = new ExecutorFragment(Types._Employe, LDPTables.Types._Personne);

		private static final ExecutorFragment _Personne__OclAny = new ExecutorFragment(Types._Personne, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Personne__OclElement = new ExecutorFragment(Types._Personne, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Personne__Personne = new ExecutorFragment(Types._Personne, LDPTables.Types._Personne);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LDPTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LDPTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LDPTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Agence__adresse = new EcoreExecutorProperty(LDPPackage.Literals.AGENCE__ADRESSE, Types._Agence, 0);
		public static final ExecutorProperty _Agence__codePostal = new EcoreExecutorProperty(LDPPackage.Literals.AGENCE__CODE_POSTAL, Types._Agence, 1);
		public static final ExecutorProperty _Agence__contientBanque = new EcoreExecutorProperty(LDPPackage.Literals.AGENCE__CONTIENT_BANQUE, Types._Agence, 2);
		public static final ExecutorProperty _Agence__contientEmploye = new EcoreExecutorProperty(LDPPackage.Literals.AGENCE__CONTIENT_EMPLOYE, Types._Agence, 3);
		public static final ExecutorProperty _Agence__nom = new EcoreExecutorProperty(LDPPackage.Literals.AGENCE__NOM, Types._Agence, 4);
		public static final ExecutorProperty _Agence__numeroA = new EcoreExecutorProperty(LDPPackage.Literals.AGENCE__NUMERO_A, Types._Agence, 5);
		public static final ExecutorProperty _Agence__ville = new EcoreExecutorProperty(LDPPackage.Literals.AGENCE__VILLE, Types._Agence, 6);
		public static final ExecutorProperty _Agence__CompteBancaire__appartient = new ExecutorPropertyWithImplementation("CompteBancaire", Types._Agence, 7, new EcoreLibraryOppositeProperty(LDPPackage.Literals.COMPTE_BANCAIRE__APPARTIENT));

		public static final ExecutorProperty _Banque__capital = new EcoreExecutorProperty(LDPPackage.Literals.BANQUE__CAPITAL, Types._Banque, 0);
		public static final ExecutorProperty _Banque__nom = new EcoreExecutorProperty(LDPPackage.Literals.BANQUE__NOM, Types._Banque, 1);
		public static final ExecutorProperty _Banque__numeroB = new EcoreExecutorProperty(LDPPackage.Literals.BANQUE__NUMERO_B, Types._Banque, 2);
		public static final ExecutorProperty _Banque__Agence__contientBanque = new ExecutorPropertyWithImplementation("Agence", Types._Banque, 3, new EcoreLibraryOppositeProperty(LDPPackage.Literals.AGENCE__CONTIENT_BANQUE));

		public static final ExecutorProperty _Client__conseiller = new EcoreExecutorProperty(LDPPackage.Literals.CLIENT__CONSEILLER, Types._Client, 0);
		public static final ExecutorProperty _Client__CompteBancaire__proprietaire = new ExecutorPropertyWithImplementation("CompteBancaire", Types._Client, 1, new EcoreLibraryOppositeProperty(LDPPackage.Literals.COMPTE_BANCAIRE__PROPRIÉTAIRE));

		public static final ExecutorProperty _CompteBancaire__appartient = new EcoreExecutorProperty(LDPPackage.Literals.COMPTE_BANCAIRE__APPARTIENT, Types._CompteBancaire, 0);
		public static final ExecutorProperty _CompteBancaire__dateOuverture = new EcoreExecutorProperty(LDPPackage.Literals.COMPTE_BANCAIRE__DATE_OUVERTURE, Types._CompteBancaire, 1);
		public static final ExecutorProperty _CompteBancaire__numeroC = new EcoreExecutorProperty(LDPPackage.Literals.COMPTE_BANCAIRE__NUMERO_C, Types._CompteBancaire, 2);
		public static final ExecutorProperty _CompteBancaire__proprietaire = new EcoreExecutorProperty(LDPPackage.Literals.COMPTE_BANCAIRE__PROPRIÉTAIRE, Types._CompteBancaire, 3);
		public static final ExecutorProperty _CompteBancaire__solde = new EcoreExecutorProperty(LDPPackage.Literals.COMPTE_BANCAIRE__SOLDE, Types._CompteBancaire, 4);

		public static final ExecutorProperty _Employe__dateEmbauche = new EcoreExecutorProperty(LDPPackage.Literals.EMPLOYE__DATE_EMBAUCHE, Types._Employe, 0);
		public static final ExecutorProperty _Employe__salaire = new EcoreExecutorProperty(LDPPackage.Literals.EMPLOYE__SALAIRE, Types._Employe, 1);
		public static final ExecutorProperty _Employe__Agence__contientEmploye = new ExecutorPropertyWithImplementation("Agence", Types._Employe, 2, new EcoreLibraryOppositeProperty(LDPPackage.Literals.AGENCE__CONTIENT_EMPLOYE));
		public static final ExecutorProperty _Employe__Client__conseiller = new ExecutorPropertyWithImplementation("Client", Types._Employe, 3, new EcoreLibraryOppositeProperty(LDPPackage.Literals.CLIENT__CONSEILLER));

		public static final ExecutorProperty _Personne__adresse = new EcoreExecutorProperty(LDPPackage.Literals.PERSONNE__ADRESSE, Types._Personne, 0);
		public static final ExecutorProperty _Personne__cin = new EcoreExecutorProperty(LDPPackage.Literals.PERSONNE__CIN, Types._Personne, 1);
		public static final ExecutorProperty _Personne__nom = new EcoreExecutorProperty(LDPPackage.Literals.PERSONNE__NOM, Types._Personne, 2);
		public static final ExecutorProperty _Personne__prenom = new EcoreExecutorProperty(LDPPackage.Literals.PERSONNE__PRENOM, Types._Personne, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LDPTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Agence =
			{
				Fragments._Agence__OclAny /* 0 */,
				Fragments._Agence__OclElement /* 1 */,
				Fragments._Agence__Agence /* 2 */
			};
		private static final int /*@NonNull*/ [] __Agence = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Banque =
			{
				Fragments._Banque__OclAny /* 0 */,
				Fragments._Banque__OclElement /* 1 */,
				Fragments._Banque__Banque /* 2 */
			};
		private static final int /*@NonNull*/ [] __Banque = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Client =
			{
				Fragments._Client__OclAny /* 0 */,
				Fragments._Client__OclElement /* 1 */,
				Fragments._Client__Personne /* 2 */,
				Fragments._Client__Client /* 3 */
			};
		private static final int /*@NonNull*/ [] __Client = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CompteBancaire =
			{
				Fragments._CompteBancaire__OclAny /* 0 */,
				Fragments._CompteBancaire__OclElement /* 1 */,
				Fragments._CompteBancaire__CompteBancaire /* 2 */
			};
		private static final int /*@NonNull*/ [] __CompteBancaire = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Employe =
			{
				Fragments._Employe__OclAny /* 0 */,
				Fragments._Employe__OclElement /* 1 */,
				Fragments._Employe__Personne /* 2 */,
				Fragments._Employe__Employe /* 3 */
			};
		private static final int /*@NonNull*/ [] __Employe = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Personne =
			{
				Fragments._Personne__OclAny /* 0 */,
				Fragments._Personne__OclElement /* 1 */,
				Fragments._Personne__Personne /* 2 */
			};
		private static final int /*@NonNull*/ [] __Personne = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Agence.initFragments(_Agence, __Agence);
			Types._Banque.initFragments(_Banque, __Banque);
			Types._Client.initFragments(_Client, __Client);
			Types._CompteBancaire.initFragments(_CompteBancaire, __CompteBancaire);
			Types._Employe.initFragments(_Employe, __Employe);
			Types._Personne.initFragments(_Personne, __Personne);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LDPTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Agence__Agence = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Agence__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Agence__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Banque__Banque = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Banque__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Banque__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Client__Client = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Client__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Client__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Client__Personne = {};

		private static final ExecutorOperation /*@NonNull*/ [] _CompteBancaire__CompteBancaire = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CompteBancaire__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CompteBancaire__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Employe__Employe = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Employe__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Employe__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Employe__Personne = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Personne__Personne = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Personne__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Personne__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Agence__Agence.initOperations(_Agence__Agence);
			Fragments._Agence__OclAny.initOperations(_Agence__OclAny);
			Fragments._Agence__OclElement.initOperations(_Agence__OclElement);

			Fragments._Banque__Banque.initOperations(_Banque__Banque);
			Fragments._Banque__OclAny.initOperations(_Banque__OclAny);
			Fragments._Banque__OclElement.initOperations(_Banque__OclElement);

			Fragments._Client__Client.initOperations(_Client__Client);
			Fragments._Client__OclAny.initOperations(_Client__OclAny);
			Fragments._Client__OclElement.initOperations(_Client__OclElement);
			Fragments._Client__Personne.initOperations(_Client__Personne);

			Fragments._CompteBancaire__CompteBancaire.initOperations(_CompteBancaire__CompteBancaire);
			Fragments._CompteBancaire__OclAny.initOperations(_CompteBancaire__OclAny);
			Fragments._CompteBancaire__OclElement.initOperations(_CompteBancaire__OclElement);

			Fragments._Employe__Employe.initOperations(_Employe__Employe);
			Fragments._Employe__OclAny.initOperations(_Employe__OclAny);
			Fragments._Employe__OclElement.initOperations(_Employe__OclElement);
			Fragments._Employe__Personne.initOperations(_Employe__Personne);

			Fragments._Personne__OclAny.initOperations(_Personne__OclAny);
			Fragments._Personne__OclElement.initOperations(_Personne__OclElement);
			Fragments._Personne__Personne.initOperations(_Personne__Personne);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LDPTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Agence = {
			LDPTables.Properties._Agence__adresse,
			LDPTables.Properties._Agence__codePostal,
			LDPTables.Properties._Agence__contientBanque,
			LDPTables.Properties._Agence__contientEmploye,
			LDPTables.Properties._Agence__nom,
			LDPTables.Properties._Agence__numeroA,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LDPTables.Properties._Agence__ville
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Banque = {
			LDPTables.Properties._Banque__capital,
			LDPTables.Properties._Banque__nom,
			LDPTables.Properties._Banque__numeroB,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Client = {
			LDPTables.Properties._Personne__adresse,
			LDPTables.Properties._Personne__cin,
			LDPTables.Properties._Client__conseiller,
			LDPTables.Properties._Personne__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LDPTables.Properties._Personne__prenom
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CompteBancaire = {
			LDPTables.Properties._CompteBancaire__appartient,
			LDPTables.Properties._CompteBancaire__dateOuverture,
			LDPTables.Properties._CompteBancaire__numeroC,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LDPTables.Properties._CompteBancaire__proprietaire,
			LDPTables.Properties._CompteBancaire__solde
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Employe = {
			LDPTables.Properties._Personne__adresse,
			LDPTables.Properties._Personne__cin,
			LDPTables.Properties._Employe__dateEmbauche,
			LDPTables.Properties._Personne__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LDPTables.Properties._Personne__prenom,
			LDPTables.Properties._Employe__salaire
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Personne = {
			LDPTables.Properties._Personne__adresse,
			LDPTables.Properties._Personne__cin,
			LDPTables.Properties._Personne__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LDPTables.Properties._Personne__prenom
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Agence__Agence.initProperties(_Agence);
			Fragments._Banque__Banque.initProperties(_Banque);
			Fragments._Client__Client.initProperties(_Client);
			Fragments._CompteBancaire__CompteBancaire.initProperties(_CompteBancaire);
			Fragments._Employe__Employe.initProperties(_Employe);
			Fragments._Personne__Personne.initProperties(_Personne);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LDPTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LDPTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new LDPTables();
	}

	private LDPTables() {
		super(LDPPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		LDPPackage.Literals.AGENCE,
		LDPPackage.Literals.BANQUE,
		LDPPackage.Literals.COMPTE_BANCAIRE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
