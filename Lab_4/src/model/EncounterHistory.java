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
public class EncounterHistory {
    
    private ArrayList<Encounter> history;
    
    public EncounterHistory(){
        
        history = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Encounter> history) {
        this.history = history;
    }  
    
     public Encounter addNewEncounterList() {
        Encounter enList = new Encounter();
        history.add(enList);
        return enList;
     } 
}
