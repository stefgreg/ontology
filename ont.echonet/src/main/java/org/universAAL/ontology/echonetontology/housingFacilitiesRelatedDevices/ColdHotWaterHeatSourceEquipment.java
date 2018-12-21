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
package org.universAAL.ontology.echonetontology.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonetontology.EchonetOntology;
import org.universAAL.ontology.echonetontology.EchonetSuperDevice;
import org.universAAL.ontology.echonetontology.values.MeasurementMethodValue;
import org.universAAL.ontology.echonetontology.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationModeSettingValue;
import org.universAAL.ontology.echonetontology.values.OperationStatusValue;


public class ColdHotWaterHeatSourceEquipment extends EchonetSuperDevice{
	public static final String MY_URI = EchonetOntology.NAMESPACE + "ColdHotWaterHeatSourceEquipment";
	public static final String PROPERTY_HAS_OPERATION_MODE_SETTING = EchonetOntology.NAMESPACE + "hasOperationModeSetting";
	public static final String PROPERTY_HAS_WATER_TEMPERATURE_SETTING_1 = EchonetOntology.NAMESPACE + "hasWaterTemperatureSetting1";
	public static final String PROPERTY_HAS_WATER_TEMPERATURE_SETTING_2 = EchonetOntology.NAMESPACE + "hasWaterTemperatureSetting2";
	public static final String PROPERTY_HAS_MEASURED_INWARD_WATER_TEMPERATURE = EchonetOntology.NAMESPACE + "hasMeasuredInwardWaterTemperature";
	public static final String PROPERTY_HAS_MEASURED_OUTWARD_WATER_TEMPERATURE = EchonetOntology.NAMESPACE + "hasMeasuredOutwardWaterTemperature";
	public static final String PROPERTY_HAS_SPECIAL_OPERATION_SETTING = EchonetOntology.NAMESPACE + "hasSpecialOperationSetting";
	public static final String PROPERTY_HAS_DAILY_TIMER_SETTING_STATUS = EchonetOntology.NAMESPACE + "hasDailyTimerSettingStatus";
	public static final String PROPERTY_HAS_DAILY_TIMER_SETTING_1 = EchonetOntology.NAMESPACE + "hasDailyTimerSetting1";
	public static final String PROPERTY_HAS_DAILY_TIMER_SETTING_2 = EchonetOntology.NAMESPACE + "hasDailyTimerSetting2";
	public static final String PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "hasOnTimerReservationSetting";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_TIME = EchonetOntology.NAMESPACE + "hasOnTimerSettingTime";
	public static final String PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME = EchonetOntology.NAMESPACE + "hasOnTimerSettingRelativeTime";
	public static final String PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING = EchonetOntology.NAMESPACE + "hasOffTimerReservationSetting";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_TIME = EchonetOntology.NAMESPACE + "hasOffTimerSettingTime";
	public static final String PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME = EchonetOntology.NAMESPACE + "hasOffTimerSettingRelativeTime";
	public static final String PROPERTY_HAS_RATED_POWER_CONSUMPTION = EchonetOntology.NAMESPACE + "hasRatedPowerConsumption";
	public static final String PROPERTY_HAS_POWER_CONSUMPTION_MEASUREMENT_METHOD = EchonetOntology.NAMESPACE + "hasPowerConsumptionMeasurementMethod";

	public MeasurementMethodValue getPowerConsumptionMeasurementMethod() {
		return (MeasurementMethodValue) getProperty(PROPERTY_HAS_POWER_CONSUMPTION_MEASUREMENT_METHOD);	
	}
	public void setPowerConsumptionMeasurementMethod(MeasurementMethodValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_POWER_CONSUMPTION_MEASUREMENT_METHOD, msg);	
	}
	public String getRatedPowerConsumption() {
		return getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION).toString();	
	}
	public void setRatedPowerConsumption(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION, msg);	
	}
	public String getOffTimerSettingRelativeTime() {
		return  getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME).toString();	
	}
	public void setOffTimerSettingRelativeTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public String getOffTimerSettingTime() {
		return  getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME).toString();	
	}
	public void setOfTimerSettingTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME, msg);	
	}
	public OperationStatusValue getOffTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING);	
	}
	public void setOfffTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_RESERVATION_SETTING, msg);	
	}
	
	public String getOnTimerSettingRelativeTime() {
		return  getProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME).toString();	
	}
	public void setOnTimerSettingRelativeTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public String getOnTimerSettingTime() {
		return  getProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME).toString();	
	}
	public void setOnTimerSettingTime(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME, msg);	
	}
	public OperationStatusValue getOnTimerReservationSetting() {
		return (OperationStatusValue) getProperty(PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING);	
	}
	public void setOnTimerReservationSetting(OperationStatusValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_RESERVATION_SETTING, msg);	
	}
	public String getDailyTimerSetting2() {
		return  getProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_2).toString();	
	}
	public void setDailyTimerSetting2(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_2, msg);	
	}
	public String getDailyTimerSetting1() {
		return  getProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_1).toString();	
	}
	public void setDailyTimerSetting1(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_1, msg);	
	}
	public OperationFunctionSettingValue getDailyTimerSettingStatus() {
		return (OperationFunctionSettingValue) getProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_STATUS);	
	}
	public void setDailyTimerSettingStatus(OperationFunctionSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_STATUS, msg);	
	}
	public OperationModeSettingValue getSpecialOperationSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_SPECIAL_OPERATION_SETTING);	
	}
	public void setSpecialOperationSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_SPECIAL_OPERATION_SETTING, msg);	
	}
	public Float getMeasuredOutwardWaterTemperature() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_OUTWARD_WATER_TEMPERATURE);	
	}
	public void setMeasuredOutwardWaterTemperature(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_OUTWARD_WATER_TEMPERATURE, msg);	
	}
	public Float getMeasuredInwardWaterTemperature() {
		return (Float) getProperty(PROPERTY_HAS_MEASURED_INWARD_WATER_TEMPERATURE);	
	}
	public void setMeasuredInwardWaterTemperature(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INWARD_WATER_TEMPERATURE, msg);	
	}
	public String getWaterTemperatureSetting2() {
		return  getProperty(PROPERTY_HAS_WATER_TEMPERATURE_SETTING_2).toString();	
	}
	public void setWaterTemperatureSetting2(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_TEMPERATURE_SETTING_2, msg);	
	}
	public Float getWaterTemperatureSetting1() {
		return (Float) getProperty(PROPERTY_HAS_WATER_TEMPERATURE_SETTING_1);	
	}
	public void setWaterTemperatureSetting1(Float msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_TEMPERATURE_SETTING_1, msg);	
	}

	public OperationModeSettingValue getOperationModeSetting() {
		return (OperationModeSettingValue) getProperty(PROPERTY_HAS_OPERATION_MODE_SETTING);	
	}
	public void setOperationModeSetting(OperationModeSettingValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OPERATION_MODE_SETTING, msg);	
	}
	
	public ColdHotWaterHeatSourceEquipment() {
		super();
	}
	public ColdHotWaterHeatSourceEquipment(String uri) {
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
