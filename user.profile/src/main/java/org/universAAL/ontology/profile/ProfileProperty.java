/*
	Copyright 2008-2010 SPIRIT, http://www.spirit-intl.com/
	SPIRIT S.A. E-BUSINESS AND COMMUNICATIONS ENGINEERING 
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
package org.universAAL.ontology.profile;

/**
 * helper class for properties of enumerations (to be removed)
 * 
 */
public class ProfileProperty {
    public final Object propertyType;
    public final String propertyURI;
    public final String propertyLabel;
    public final boolean propertyStatic;

    public ProfileProperty(Object obj, String URI, String label,
	    boolean isStatic) {
	propertyURI = URI;
	propertyType = obj;
	propertyLabel = label;
	propertyStatic = isStatic;
    }
}