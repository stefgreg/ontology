/*******************************************************************************
 * Copyright 2018 PHAM Van Cu, Tan laboratory, Japan Advanced Institute of Science and Technology (JAIST),
 *  Japan as a part of the CARESSES project (http://www.caressesrobot.org/).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.universAAL.ontology.echonetontology.values;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.echonetontology.EchonetOntology;

public class RadiationMethodValue extends ManagedIndividual{
public static final String MY_URI = EchonetOntology.NAMESPACE + "RadiationMethodValue";
	private int order;
	public static final int WITH_FAN = 0;
	public static final int WITHOUT_FAN = 1;
	private static final String[] names = {"withFan", "withoutFan"};
	public static final RadiationMethodValue WithFan = new RadiationMethodValue(WITH_FAN);
	public static final RadiationMethodValue WithoutFan = new RadiationMethodValue(WITHOUT_FAN);

	private RadiationMethodValue(int order) {
		super(EchonetOntology.NAMESPACE + names[order]);
		this.order = order;
	}

	public static RadiationMethodValue getRadiationMethodValueByOrder(int order) {
		switch (order) {
		case WITH_FAN:
			return WithFan;
		case WITHOUT_FAN:
			return WithoutFan;		
		default:
			return null;
		}
	}

	public static final RadiationMethodValue valueOf(String name) {
		if (name == null)
			return null;

		if (name.startsWith(EchonetOntology.NAMESPACE))
			name = name.substring(EchonetOntology.NAMESPACE.length());

		for (int i = WITH_FAN; i <= WITHOUT_FAN; i++)
			if (names[i].equals(name))
				return getRadiationMethodValueByOrder(i);
		return null;
	}

	public boolean isWellFormed() {
		return true;
	}
	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}
	public String name() {
		return names[order];
	}

	public int ord() {
		return order;
	}

	public String getClassURI() {
		return MY_URI;
	}

}
