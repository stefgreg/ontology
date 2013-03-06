/*******************************************************************************
 * Copyright 2012 UPM, http://www.upm.es - Universidad Politécnica de Madrid
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

package org.universaal.ontology.healthmeasurement;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.impl.ResourceFactoryImpl;
import org.universaal.ontology.healthmeasurement.owl.*;

public class HealthMeasurementFactory extends ResourceFactoryImpl {


  public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

	switch (factoryIndex) {
     case 0:
       return new HealthMeasurement(instanceURI);
     case 1:
       return new Unit(instanceURI);
     case 2:
       return new MultiValueMeasurement(instanceURI);
     case 3:
       return new PersonWeight(instanceURI);
     case 4:
       return new SingleValueMeasurement(instanceURI);
     case 5:
       return new Measurement(instanceURI);
     case 6:
       return new BloodPressure(instanceURI);
     case 7:
       return new HeartRate(instanceURI);
     case 8:
       return new HeartRateSignal(instanceURI);
     case 9:
       return new Signal(instanceURI);

	}
	return null;
  }
}
