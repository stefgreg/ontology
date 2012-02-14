
package org.universaal.ontology.useridprofileontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universaal.ontology.useridprofileontology.owl.*;

/**
 * @author eandgrg
 *
 */
public class Activator implements BundleActivator {

  static BundleContext context = null;
  UserIDProfileOntology ontology = new UserIDProfileOntology();

  public void start(BundleContext context) throws Exception {
    Activator.context = context;
    OntologyManagement.getInstance().register(ontology);
  }

public void stop(BundleContext arg0) throws Exception {
    OntologyManagement.getInstance().unregister(ontology);
  }
}	
