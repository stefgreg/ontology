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
package org.universAAL.ontology.echonet.housingFacilitiesRelatedDevices;



import org.universAAL.ontology.echonet.EchonetOntology;
import org.universAAL.ontology.echonet.EchonetSuperDevice;
import org.universAAL.ontology.echonet.values.DateTimeValue;
import org.universAAL.ontology.echonet.values.MeasurementMethodValue;
import org.universAAL.ontology.echonet.values.OperationFunctionSettingValue;
import org.universAAL.ontology.echonet.values.OperationModeSettingValue;
import org.universAAL.ontology.echonet.values.OperationStatusValue;
import org.universAAL.ontology.echonet.values.RatedPowerConsumptionInModeValue;
import org.universAAL.ontology.echonet.values.TemperatureInModeValue;
import org.universAAL.ontology.echonet.values.MeasuredValue;


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
	public RatedPowerConsumptionInModeValue getRatedPowerConsumption() {
		return (RatedPowerConsumptionInModeValue) getProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION);	
	}
	public void setRatedPowerConsumption(RatedPowerConsumptionInModeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_RATED_POWER_CONSUMPTION, msg);	
	}
	public DateTimeValue getOffTimerSettingRelativeTime() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME);	
	}
	public void setOffTimerSettingRelativeTime(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_OFF_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public DateTimeValue getOffTimerSettingTime() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_OFF_TIMER_SETTING_TIME);	
	}
	public void setOfTimerSettingTime(DateTimeValue msg) {
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
	
	public DateTimeValue getOnTimerSettingRelativeTime() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME);	
	}
	public void setOnTimerSettingRelativeTime(DateTimeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_ON_TIMER_SETTING_RELATIVE_TIME, msg);	
	}
	public DateTimeValue getOnTimerSettingTime() {
		return (DateTimeValue) getProperty(PROPERTY_HAS_ON_TIMER_SETTING_TIME);	
	}
	public void setOnTimerSettingTime(DateTimeValue msg) {
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
		return (String) getProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_2);	
	}
	public void setDailyTimerSetting2(String msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_2, msg);	
	}
	public String getDailyTimerSetting1() {
		return (String) getProperty(PROPERTY_HAS_DAILY_TIMER_SETTING_1);	
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
	public MeasuredValue getMeasuredOutwardWaterTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_OUTWARD_WATER_TEMPERATURE);	
	}
	public void setMeasuredOutwardWaterTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_OUTWARD_WATER_TEMPERATURE, msg);	
	}
	public MeasuredValue getMeasuredInwardWaterTemperature() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_MEASURED_INWARD_WATER_TEMPERATURE);	
	}
	public void setMeasuredInwardWaterTemperature(MeasuredValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_MEASURED_INWARD_WATER_TEMPERATURE, msg);	
	}
	public TemperatureInModeValue getWaterTemperatureSetting2() {
		return (TemperatureInModeValue) getProperty(PROPERTY_HAS_WATER_TEMPERATURE_SETTING_2);	
	}
	public void setWaterTemperatureSetting2(TemperatureInModeValue msg) {
		if(msg !=null) 
			changeProperty(PROPERTY_HAS_WATER_TEMPERATURE_SETTING_2, msg);	
	}
	public MeasuredValue getWaterTemperatureSetting1() {
		return (MeasuredValue) getProperty(PROPERTY_HAS_WATER_TEMPERATURE_SETTING_1);	
	}
	public void setWaterTemperatureSetting1(MeasuredValue msg) {
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
