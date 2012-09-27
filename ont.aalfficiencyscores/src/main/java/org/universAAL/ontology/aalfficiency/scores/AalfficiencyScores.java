package org.universAAL.ontology.aalfficiency.scores;

import org.universAAL.middleware.service.owl.Service;


public class AalfficiencyScores extends Service {
  public static final String MY_URI = AalfficiencyScoresOntology.NAMESPACE
    + "AalfficiencyScores";
  public static final String PROP_AALFFICIENCY_ADVICES = AalfficiencyScoresOntology.NAMESPACE
    + "aalfficiencyAdvices";
  public static final String PROP_ELECTRICITY_SCORE = AalfficiencyScoresOntology.NAMESPACE
    + "electricityScore";
  public static final String PROP_ACTIVITY_SCORE = AalfficiencyScoresOntology.NAMESPACE
    + "activityScore";


  public AalfficiencyScores () {
    super();
  }
  
  public AalfficiencyScores (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }

    public int getPropSerializationType(String propURI) {
	return PROP_AALFFICIENCY_ADVICES.equals(propURI)
		|| PROP_ELECTRICITY_SCORE.equals(propURI)
		|| PROP_ACTIVITY_SCORE.equals(propURI) ? PROP_SERIALIZATION_FULL
		: super.getPropSerializationType(propURI);
    }

  public boolean isWellFormed() {
	return true 
      && hasProperty(PROP_AALFFICIENCY_ADVICES)
      && hasProperty(PROP_ELECTRICITY_SCORE)
      && hasProperty(PROP_ACTIVITY_SCORE);
  }

  public AalfficiencyAdvices getAalfficiencyAdvices() {
    return (AalfficiencyAdvices)getProperty(PROP_AALFFICIENCY_ADVICES);
  }		

  public void setAalfficiencyAdvices(AalfficiencyAdvices newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_AALFFICIENCY_ADVICES, newPropValue);
  }		

  public ElectricityScore getElectricityScore() {
    return (ElectricityScore)getProperty(PROP_ELECTRICITY_SCORE);
  }		

  public void setElectricityScore(ElectricityScore newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_ELECTRICITY_SCORE, newPropValue);
  }		

  public ActivityScore getActivityScore() {
    return (ActivityScore)getProperty(PROP_ACTIVITY_SCORE);
  }		

  public void setActivityScore(ActivityScore newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_ACTIVITY_SCORE, newPropValue);
  }		
}