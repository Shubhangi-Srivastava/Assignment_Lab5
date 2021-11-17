/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author shubhangisrivastava
 */
public class VitalSigns {
    
    float temperature;
    String blood_pressure;
    int unique_id;
    String date_of_visit;
   String community;
   String bpReport;

    public String getBpReport() {
        return bpReport;
    }

    public void setBpReport(String bpReport) {
        this.bpReport = bpReport;
    }
   
   

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    
    public int getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(int unique_id) {
        this.unique_id = unique_id;
    }

    
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(String blood_pressure) {
        this.blood_pressure = blood_pressure;
    }


    public String getDate_of_visit() {
        return date_of_visit;
    }

    public void setDate_of_visit(String date_of_visit) {
        this.date_of_visit = date_of_visit;
    }
    
    
//    public PatientDetails getPatientDetails(String community) {
//        
//        PatientDetails pd = new PatientDetails();
//        pd.getCommunity();
//        pd.setCommunity(community);
//        JOptionPane.showMessageDialog(null, community);
//        return pd;
//    }
    
    
    
    @Override
    public String toString() {
        return date_of_visit;
       
    } 
    
    
   
}
