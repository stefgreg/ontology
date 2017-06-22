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

import org.universAAL.middleware.xsd.Base64Binary;

/**
 * Ontological representation of SimpleKey in the cryptographic ontology.
 * Methods included in this class are the mandatory ones for representing an
 * ontological concept in Java classes for the universAAL platform. In addition
 * getters and setters for properties are included.
 * 
 * @author
 * @author Generated by the OntologyUML2Java transformation of AAL Studio
 */
public class SimpleKey extends EncryptionKey {
	public static final String MY_URI = CryptographicOntology.NAMESPACE + "SimpleKey";
	public static final String PROP_KEY_TEXT = CryptographicOntology.NAMESPACE + "keyText";

	public SimpleKey() {
		super();
	}

	public SimpleKey(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		if (PROP_KEY_TEXT.equals(propURI))
			return PROP_SERIALIZATION_FULL;
		return super.getPropSerializationType(propURI);
	}

	public boolean isWellFormed() {
		return super.isWellFormed() && hasProperty(PROP_KEY_TEXT);
	}

	public Base64Binary getKeyText() {
		return (Base64Binary) getProperty(PROP_KEY_TEXT);
	}

	public void setKeyText(Base64Binary newPropValue) {
		if (newPropValue != null)
			changeProperty(PROP_KEY_TEXT, newPropValue);
	}

}