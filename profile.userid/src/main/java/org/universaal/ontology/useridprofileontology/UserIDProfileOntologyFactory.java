
package org.universaal.ontology.useridprofileontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universaal.ontology.useridprofileontology.owl.UserIDProfile;

/**
 * @author eandgrg
 *
 */
public class UserIDProfileOntologyFactory extends ResourceFactoryImpl {


  public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

	switch (factoryIndex) {
     case 0:
	    return new UserIDProfile(instanceURI);

	}
	return null;
  }
}
