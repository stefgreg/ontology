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

import org.universAAL.middleware.rdf.Resource;

/**
 * Ontological representation of EncryptionService in the cryptographic
 * ontology. Methods included in this class are the mandatory ones for
 * representing an ontological concept in Java classes for the universAAL
 * platform. In addition getters and setters for properties are included.
 *
 * @author
 * @author Generated by the OntologyUML2Java transformation of universAAL Studio
 */
public class EncryptionService extends CryptographicService {
	public static final String MY_URI = CryptographicOntology.NAMESPACE + "EncryptionService";
	public static final String PROP_ENCRYPTED_RESOURCE = CryptographicOntology.NAMESPACE + "encryptedResource";
	public static final String PROP_ENCRYPTION = CryptographicOntology.NAMESPACE + "encryptionMethod";
	public static final String PROP_ENCRYPTS = CryptographicOntology.NAMESPACE + "encrypts";

	public EncryptionService() {
		super();
	}

	public EncryptionService(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		if (PROP_ENCRYPTED_RESOURCE.equals(propURI))
			return PROP_SERIALIZATION_FULL;
		if (PROP_ENCRYPTION.equals(propURI))
			return PROP_SERIALIZATION_FULL;
		if (PROP_ENCRYPTS.equals(propURI))
			return PROP_SERIALIZATION_FULL;
		return super.getPropSerializationType(propURI);
	}

	public boolean isWellFormed() {
		return super.isWellFormed() && hasProperty(PROP_ENCRYPTED_RESOURCE) && hasProperty(PROP_ENCRYPTION)
				&& hasProperty(PROP_ENCRYPTS);
	}

	public EncryptedResource getEncryptedResource() {
		return (EncryptedResource) getProperty(PROP_ENCRYPTED_RESOURCE);
	}

	public void setEncryptedResource(EncryptedResource newPropValue) {
		if (newPropValue != null)
			changeProperty(PROP_ENCRYPTED_RESOURCE, newPropValue);
	}

	public Encryption getEncryption() {
		return (Encryption) getProperty(PROP_ENCRYPTION);
	}

	public void setEncryption(Encryption newPropValue) {
		if (newPropValue != null)
			changeProperty(PROP_ENCRYPTION, newPropValue);
	}

	public Resource getEncrypts() {
		return (Resource) getProperty(PROP_ENCRYPTS);
	}

	public void setEncrypts(Resource newPropValue) {
		if (newPropValue != null)
			changeProperty(PROP_ENCRYPTS, newPropValue);
	}

}
