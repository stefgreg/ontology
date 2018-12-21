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
package org.universAAL.ontology.echonetontology.cookingHouseholdRelatedDevices;



import org.universAAL.ontology.echonetontology.EchonetOntology;
import org.universAAL.ontology.echonetontology.EchonetSuperDevice;
import org.universAAL.ontology.echonetontology.values.AutomaticHeatingMenu;
import org.universAAL.ontology.echonetontology.values.OperationModeSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStateSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;
import org.universAAL.ontology.echonetontology.values.ThresholdLevelValue;

public class CombinationMicrowaveOven extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "CombinationMicrowaveOven";
	public static final String PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS= EchonetOntology.NAMESPACE + "hasDoorOpenCloseStatus";
	public static final String PROPERTY_HAS_HEATING_STATUS= EchonetOntology.NAMESPACE + "hasHeatingStatus";
	public static final String PROPERTY_HAS_HEATING_SETTING= EchonetOntology.NAMESPACE + "hasHeatingSetting";
	public static final String PROPERTY_HAS_HEATING_MODE_SETTING= EchonetOntology.NAMESPACE + "hasHeatingModeSetting";
	public static final String PROPERTY_HAS_AUTOMATIC_HEATING_SETTING= EchonetOntology.NAMESPACE + "hasAutomaticHeatingSetting";
	public static final String PROPERTY_HAS_AUTOMATIC_HEATING_LEVEL_SETTING= EchonetOntology.NAMESPACE + "hasAutomaticHeatingLevelSetting";
	public static final String PROPERTY_HAS_AUTOMATIC_HEATING_MENU_SETTING= EchonetOntology.NAMESPACE + "hasAutomaticHeatingMenuSetting";
	public static final String PROPERTY_HAS_OVEN_MODE_SETTING= EchonetOntology.NAMESPACE + "hasOvenModeSetting";
	public static final String PROPERTY_HAS_OVEN_PREHEATING_SETTING= EchonetOntology.NAMESPACE + "hasOvenPreheatingSetting";
	public static final String PROPERTY_HAS_FERMENTING_MODE_SETTING= EchonetOntology.NAMESPACE + "hasFermentingModeSetting";
	public static final String PROPERTY_HAS_CHAMPER_TEMPERATURE_SETTING= EchonetOntology.NAMESPACE + "hasChamperTemperatureSetting";
	public static final String PROPERTY_HAS_FOOD_TEMPERATURE_SETTING= EchonetOntology.NAMESPACE + "hasFoodTemperatureSetting";
	public static final String PROPERTY_HAS_HEATING_SETTING_TIME= EchonetOntology.NAMESPACE + "hasHeatingSettingTime";
	public static final String PROPERTY_HAS_REMAINING_HEATING_TIME= EchonetOntology.NAMESPACE + "hasRemainingHeatingTime";
	public static final String PROPERTY_HAS_MICROWAVE_HEATING_POWER_SETTING= EchonetOntology.NAMESPACE + "hasMicrowaveHeatingPowerSetting";
	public static final String PROPERTY_HAS_PROMPT_MESSAGE_SETTING= EchonetOntology.NAMESPACE + "hasPromptMessageSettingSetting";
	public static final String PROPERTY_HAS_ACCESSORIES_TO_COMBINATION_MICROWAVE_OVEN_SETTING= EchonetOntology.NAMESPACE + "hasAccessoriestoCombinationMicrowaveOvenSetting";
	public static final String PROPERTY_HAS_DISPLAY_CHARACTER_STRING_SETTING= EchonetOntology.NAMESPACE + "hasDisplayCharacterStringSetting";
	public static final String PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_DURATION= EchonetOntology.NAMESPACE + "hasTwoStageMicrowaveHeatingDuration";
	public static final String PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_POWER= EchonetOntology.NAMESPACE + "hasTwoStageMicrowaveHeatingPower";
	
	public OperationModeSettingValue getHeatingModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_HEATING_MODE_SETTING);	
	}
	public void setHeatingModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_MODE_SETTING, msg);	
	}
	public ThresholdLevelValue getAutomaticHeatingLevelSetting() {
		return (ThresholdLevelValue) getProperty(PROPERTY_HAS_AUTOMATIC_HEATING_LEVEL_SETTING);	
	}
	public void setAutomaticHeatingLevelSetting(ThresholdLevelValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_HEATING_LEVEL_SETTING, msg);	
	}
	public String getTwoStageMicrowaveHeatingPower() {
		return  getProperty(PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_POWER).toString();	
	}
	public void setTwoStageMicrowaveHeatingPower(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_POWER, msg);	
	}
	public String setTwoStageMicrowaveHeatingDuration() {
		return  getProperty(PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_DURATION).toString();	
	}
	public void setTwoStageMicrowaveHeatingDuration(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_TWO_STAGE_MICROWAVE_HEATING_DURATION, msg);	
	}
	public String getDisplayCharacterStringSetting() {
		return  getProperty(PROPERTY_HAS_DISPLAY_CHARACTER_STRING_SETTING).toString();	
	}
	public void setDisplayCharacterStringSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DISPLAY_CHARACTER_STRING_SETTING, msg);	
	}
	public String getAccessoriestoCombinationMicrowaveOvenSetting() {
		return  getProperty(PROPERTY_HAS_ACCESSORIES_TO_COMBINATION_MICROWAVE_OVEN_SETTING).toString();	
	}
	public void setAccessoriestoCombinationMicrowaveOvenSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ACCESSORIES_TO_COMBINATION_MICROWAVE_OVEN_SETTING, msg);	
	}
	public String getPromptMessageSettingSetting() {
		return  getProperty(PROPERTY_HAS_PROMPT_MESSAGE_SETTING).toString();	
	}
	public void setPromptMessageSettingSetting(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_PROMPT_MESSAGE_SETTING, msg);	
	}
	public Float getMicrowaveHeatingPowerSetting() {
		return (Float) getProperty(PROPERTY_HAS_MICROWAVE_HEATING_POWER_SETTING);	
	}
	public void setMicrowaveHeatingPowerSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MICROWAVE_HEATING_POWER_SETTING, msg);	
	}
	public String getRemainingHeatingTime() {
		return  getProperty(PROPERTY_HAS_REMAINING_HEATING_TIME).toString();	
	}
	public void setRemainingHeatingTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_REMAINING_HEATING_TIME, msg);	
	}
	public String getHeatingSettingTime() {
		return getProperty(PROPERTY_HAS_HEATING_SETTING_TIME).toString();	
	}
	public void setHeatingSettingTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_SETTING_TIME, msg);	
	}
	public Float getFoodTemperatureSetting() {
		return (Float) getProperty(PROPERTY_HAS_FOOD_TEMPERATURE_SETTING);	
	}
	public void setFoodTemperatureSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FOOD_TEMPERATURE_SETTING, msg);	
	}
	public Float getChamperTemperatureSetting() {
		return (Float) getProperty(PROPERTY_HAS_CHAMPER_TEMPERATURE_SETTING);	
	}
	public void setChamperTemperatureSetting(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_CHAMPER_TEMPERATURE_SETTING, msg);	
	}
	public OperationModeSettingValue getFermentingModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_FERMENTING_MODE_SETTING);	
	}
	public void setFermentingModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_FERMENTING_MODE_SETTING, msg);	
	}
	public OperationStatusValue getOvenPreheatingSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_OVEN_PREHEATING_SETTING);	
	}
	public void setOvenPreheatingSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OVEN_PREHEATING_SETTING, msg);	
	}
	public OperationModeSettingValue getOvenModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OVEN_MODE_SETTING);	
	}
	public void setOvenModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OVEN_MODE_SETTING, msg);	
	}
	public AutomaticHeatingMenu getAutomaticHeatingMenuSetting() {
		return (AutomaticHeatingMenu) getProperty(PROPERTY_HAS_AUTOMATIC_HEATING_MENU_SETTING);	
	}
	public void setAutomaticHeatingMenuSetting(AutomaticHeatingMenu msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_HEATING_MENU_SETTING, msg);	
	}
	public OperationStateSettingValue getAutomaticHeatingSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_AUTOMATIC_HEATING_SETTING);	
	}
	public void setAutomaticHeatingSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_AUTOMATIC_HEATING_SETTING, msg);	
	}
	public OperationStateSettingValue getHeatingSetting() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_HEATING_SETTING);	
	}
	public void setHeatingSetting(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_SETTING, msg);	
	}
	public OperationStatusValue getHeatingStatus() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_HEATING_STATUS);	
	}
	public void setHeatingStatus(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_HEATING_STATUS, msg);	
	}
	public OperationStateSettingValue getDoorOpenCloseStatus() {
		return (OperationStateSettingValue) getProperty(PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS);	
	}
	public void setDoorOpenCloseStatus(OperationStateSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DOOR_OPEN_CLOSE_STATUS, msg);	
	}

	
	
	public CombinationMicrowaveOven() {
		super();
	}
	public CombinationMicrowaveOven(String uri) {
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
	

}
