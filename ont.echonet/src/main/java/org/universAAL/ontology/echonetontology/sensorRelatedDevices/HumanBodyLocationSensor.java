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
public class HumanBodyLocationSensor extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "HumanBodyLocationSensor";
	public static final String PROPERTY_HAS_HUMAN_DETECTION_LOCATION_1 = EchonetOntology.NAMESPACE + "hasHumanBodyDetectionLocation1";
	public static final String PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID = EchonetOntology.NAMESPACE + "hasMaxNumberofHumanBodyID";
	public static final String PROPERTY_HAS_HUMAN_DETECTION_LOCATION_2 = EchonetOntology.NAMESPACE + "hasHumanBodyDetectionLocation2";
	public static final String PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION = EchonetOntology.NAMESPACE + "hasHumanBodyExistenceInfor";
	public HumanBodyLocationSensor() {
		super();
	}

	public HumanBodyLocationSensor(String uri) {
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
	
	public String getHumanBodyDetectionLocation1() {
		return  getProperty(PROPERTY_HAS_HUMAN_DETECTION_LOCATION_1).toString();	
	}
	public void setHumanBodyDetectionLocation1(String msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_HUMAN_DETECTION_LOCATION_1,msg);	
	}
	public String getHumanBodyDetectionLocation2() {
		return  getProperty(PROPERTY_HAS_HUMAN_DETECTION_LOCATION_2).toString();	
	}
	public void setHumanBodyDetectionLocation2(String msg) {
		if(msg !=null)
			changeProperty(PROPERTY_HAS_HUMAN_DETECTION_LOCATION_2,msg);	
	}
	public Integer getMaxNumberofHumanBodyID() {
		return (Integer) getProperty(PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID);
	}
	public void getMaxNumberofHumanBodyID(Integer msg) {
		if(msg!=null)
			changeProperty(PROPERTY_HAS_MAX_NUMBER_OF_HUMAN_BODY_ID, msg);	
	}
	public String getHumanBodyExistenceInfor() {
		return  getProperty(PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION).toString();
	}
	public void setHumanBodyExistenceInfor(String msg) {
		if(msg!=null)
			changeProperty(PROPERTY_HAS_HUMAN_BODY_EXISTENCE_INFORMATION, msg);	
	}
}
