/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shubhangisrivastava
 */
public class PatientDirectory {
    
    private ArrayList<PatientDetails> history;
    
    public PatientDirectory(){
        
        history = new ArrayList<PatientDetails>();
        
    }

    public ArrayList<PatientDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<PatientDetails> history) {
        this.history = history;
    }
    
     public PatientDetails addNewPatient() {
        PatientDetails newPatient = new PatientDetails();
        history.add(newPatient);
        return newPatient;
    }
     
     public void deletePatients(PatientDetails pd) {
        
        history.remove(pd);
    }
}
