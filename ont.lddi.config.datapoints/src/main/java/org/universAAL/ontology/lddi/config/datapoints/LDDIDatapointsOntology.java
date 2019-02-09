
package org.universAAL.ontology.lddi.config.datapoints;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.DatatypePropertySetup;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.ObjectPropertySetup;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.xsd.NonNegativeInteger;
import org.universAAL.ontology.phThing.PhThingOntology;

import org.universAAL.middleware.rdf.Resource;


//import the factory for this ontology
import org.universAAL.ontology.lddi.config.DatapointConfigFactory;


/**
 * This class provides the main representation of the data ontology 
 * for the universAAL platform.
 *
 * @author Generated by the OntologyUML2Java transformation of universAAL Studio
 */
public final class LDDIDatapointsOntology extends Ontology {

  private static DatapointConfigFactory factory = new DatapointConfigFactory();
  public static final String NAMESPACE ="http://ontology.universAAL.org/LDDIDataConfigOntology.owl#";
	
  public LDDIDatapointsOntology() {
    super(NAMESPACE);
  }

  public void create() {
		// info about this ontology
		Resource r = getInfo();
		r.setResourceComment("The ontology for the configuration data related to the external datapoints to which a concrete communication gateway has access.");
		r.setResourceLabel("CGw Data Config Ontology");
		
		// imported ontologies
		addImport(DataRepOntology.NAMESPACE);
		addImport(PhThingOntology.NAMESPACE);

		// Getting prepared for the ont spec
		OntClassInfoSetup oci;
		DatatypePropertySetup dps;
		ObjectPropertySetup ops;

		// adding class for external type systems
		oci = createNewOntClassInfo(ExternalTypeSystem.MY_URI, factory, 0);
		oci.setResourceComment("This class only helps to identify certain named resources as an external type system; the name (URI) of the resource refers to a concrete external system whose data is going to be used in a uSpace and hence needs to be converted to the ontological data usable within the uSpace.");
		oci.setResourceLabel("External Type System");
		oci.addSuperClass(ManagedIndividual.MY_URI);

		// adding class "component"
		oci = createNewOntClassInfo(Component.MY_URI, factory, 1);
		oci.setResourceComment("Using this class, the set of logical / physical components connected via a CommunicationGateway can be specified in the configuration file of that CommunicationGateway. Datapoints have to be linked to components by referring to the sequence number defined in this class. Each component must have a type defined in an ontology. If the component corresponds to some physical object, also its location can be specified.");
		oci.setResourceLabel("Component");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		// adding prop "id"
		dps = oci.addDatatypeProperty(Component.PROP_CONFIG_SEQ_NO);
		dps.setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Component.PROP_CONFIG_SEQ_NO,
				TypeMapper.getDatatypeURI(NonNegativeInteger.class), 1, 1));
		// adding prop "ontological description"
		ops = oci.addObjectProperty(Component.PROP_DESCRIPTION);
		ops.setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Component.PROP_DESCRIPTION,
				MergedRestriction.getCardinalityRestriction(Resource.PROP_RDF_TYPE, 1, 1), 1, 1));
		// adding prop "external type system"
		ops = oci.addObjectProperty(Component.PROP_EXTERNAL_TYPE_SYSTEM);
		ops.setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Component.PROP_EXTERNAL_TYPE_SYSTEM,
				ExternalTypeSystem.MY_URI, 1, 1));

		// adding class "data-point"
		oci = createNewOntClassInfo(Datapoint.MY_URI, factory, 2);
		oci.setResourceComment("This class helps in the configuration file of a CommunicationGateway to specify each external data-point that is made accessible through the corresponding gateway.");
		oci.setResourceLabel("Data Point");
		oci.addSuperClass(ManagedIndividual.MY_URI);
		// adding prop "component id"
		dps = oci.addDatatypeProperty(Datapoint.PROP_BELONGS_TO);
		dps.setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Datapoint.PROP_BELONGS_TO,
				TypeMapper.getDatatypeURI(NonNegativeInteger.class), 1, 1));
		// adding prop "related ont property"
		dps = oci.addDatatypeProperty(Datapoint.PROP_RELATED_ONT_PROPERTY);
		dps.setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(Datapoint.PROP_RELATED_ONT_PROPERTY,
				TypeMapper.getDatatypeURI(Resource.class), 1, 1));
		// adding prop "pull address"
		dps = oci.addDatatypeProperty(Datapoint.PROP_PULL_ADDRESS);
		dps.setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(Datapoint.PROP_PULL_ADDRESS,
				TypeMapper.getDatatypeURI(String.class)));
		// adding prop "push address"
		dps = oci.addDatatypeProperty(Datapoint.PROP_PUSH_ADDRESS);
		dps.setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(Datapoint.PROP_PUSH_ADDRESS,
				TypeMapper.getDatatypeURI(String.class)));
		// adding prop "set address"
		dps = oci.addDatatypeProperty(Datapoint.PROP_SET_ADDRESS);
		dps.setFunctional();
		oci.addRestriction(MergedRestriction.getAllValuesRestriction(Datapoint.PROP_SET_ADDRESS,
				TypeMapper.getDatatypeURI(String.class)));

  }
}
