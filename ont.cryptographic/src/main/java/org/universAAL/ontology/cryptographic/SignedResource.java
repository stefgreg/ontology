/*******************************************************************************
 * Copyright 2016 Universidad Politécnica de Madrid UPM
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.cryptographic;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.rdf.Resource;


/**
 * Ontological representation of SignedResource in the cryptographic ontology. 
 * Methods included in this class are the mandatory ones for representing an
 * ontological concept in Java classes for the universAAL platform. In addition
 * getters and setters for properties are included.
 * 
 * @author 
 * @author Generated by the OntologyUML2Java transformation of AAL Studio
 */
public class SignedResource extends ManagedIndividual {
  public static final String MY_URI = CryptographicOntology.NAMESPACE
    + "SignedResource";
  public static final String PROP_SIGNATURE = CryptographicOntology.NAMESPACE
    + "signature";
  public static final String PROP_ASYMMETRIC = CryptographicOntology.NAMESPACE
    + "asymmetric";
  public static final String PROP_SIGNED_RESOURCE = CryptographicOntology.NAMESPACE
    + "signedResource";
  public static final String PROP_DIGEST = CryptographicOntology.NAMESPACE
    + "digest";


  public SignedResource () {
    super();
  }
  
  public SignedResource (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  
  public int getPropSerializationType(String propURI) {
    if (PROP_SIGNATURE.equals(propURI))
      return PROP_SERIALIZATION_FULL;
    if (PROP_ASYMMETRIC.equals(propURI))
      return PROP_SERIALIZATION_FULL;
    if (PROP_SIGNED_RESOURCE.equals(propURI))
      return PROP_SERIALIZATION_FULL;
    if (PROP_DIGEST.equals(propURI))
      return PROP_SERIALIZATION_FULL;
    return PROP_SERIALIZATION_FULL;
  } 

  public boolean isWellFormed() {
	return super.isWellFormed() 
      && hasProperty(PROP_SIGNATURE)
      && hasProperty(PROP_ASYMMETRIC)
      && hasProperty(PROP_SIGNED_RESOURCE)
      && hasProperty(PROP_DIGEST);
  }

  public String[] getSignature() {
    Object propList = getProperty(PROP_SIGNATURE);
    if (propList instanceof List)
      return (String[]) ((List) propList).toArray(new String[0]);
    else if (propList != null)
      return new String[] {(String)propList}; // Handle special case of a single item not contained in a list
    return new String[0];
  }

  public void addSignature(String newValue) {
    Object propList = getProperty(PROP_SIGNATURE);
    List newList;
    if (propList instanceof List)
      newList = (List)propList;
    else {
      newList = new ArrayList();
      if (propList != null)
        newList.add(propList); // Handle special case of a single previous item not contained in a list
    }
    newList.add(newValue);
    changeProperty(PROP_SIGNATURE, newList);
  }
  

  public void setSignature(String[] propertyValue) {
    List propList = new ArrayList(propertyValue.length);
    for (int i = 0; i < propertyValue.length; i++) {
      propList.add(propertyValue[i]);
    }
    changeProperty(PROP_SIGNATURE, propList);
  }

  public Resource getSignedResource() {
    return (Resource)getProperty(PROP_SIGNED_RESOURCE);
  }		

  public void setSignedResource(Resource newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_SIGNED_RESOURCE, newPropValue);
  }		

  public AsymmetricEncryption getAsymmetric() {
    return (AsymmetricEncryption)getProperty(PROP_ASYMMETRIC);
  }		

  public void setAsymmetric(AsymmetricEncryption newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_ASYMMETRIC, newPropValue);
  }		

  public Digest getDigest() {
    return (Digest)getProperty(PROP_DIGEST);
  }		

  public void setDigest(Digest newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_DIGEST, newPropValue);
  }		

}
