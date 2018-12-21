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
package org.universAAL.ontology.echonetontology.sensorRelatedDevices;

import org.universAAL.ontology.echonetontology.EchonetOntology;
import org.universAAL.ontology.echonetontology.EchonetSuperDevice;
import org.universAAL.ontology.echonetontology.values.OccurenceStatusValue;
import org.universAAL.ontology.echonetontology.values.ThresholdLevelValue;

public class WeightSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "WeightSensor";
	public static final String PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL = EchonetOntology.NAMESPACE + "hasDectectionThresholdLevel";
	public static final String PROPERTY_HAS_WEIGHT_DETECTION_STATUS = EchonetOntology.NAMESPACE + "hasWeightDetectionStatus";
	public WeightSensor() {
		super();
	}

	public WeightSensor(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String arg0) {
		return PROP_SERIALIZATION_OPTIONAL;
	}

	public boolean isWellFormed() {
		return true;
	}
	
	public ThresholdLevelValue getDetectionThresholdLevel() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL);	
	}
	public void setDetectionThresholdLevel(ThresholdLevelValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_DETECTION_THRESHOLD_LEVEL,msg);	
	}
	public OccurenceStatusValue getWeightDetectionStatus() {
		return (OccurenceStatusValue) getProperty(PROPERTY_HAS_WEIGHT_DETECTION_STATUS);	
	}
	public void setWeightDetectionStatus(OccurenceStatusValue msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_WEIGHT_DETECTION_STATUS,msg);	
	}
	

}
