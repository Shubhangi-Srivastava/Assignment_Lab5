/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author shubhangisrivastava
 */
public class Encounter {
    
    private ArrayList<VitalSigns> history;
    
    public Encounter(){
        
        history = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns addNewEncounter() {
        VitalSigns vs = new VitalSigns();
      
       
        history.add(vs);
        return vs;
    }
    
    
    
    public ArrayList<VitalSigns> filterByCommunity(String community) {
            ArrayList<VitalSigns> list = new ArrayList<>();
        for(VitalSigns vs : history) { 
           if(vs.getCommunity().contains(community)) 
        {
            if(vs.getBpReport().contains("Abnormal")) {
               list.add(vs);
            }  
         }       
    }
        return list;
   }
    
    
    public ArrayList<VitalSigns> showCount(String community) {
         int count1 =0;
         ArrayList<VitalSigns> list = new ArrayList<>();
        for(VitalSigns c : history) {
         if(c.getCommunity().contains(community)) {
         if(c.getBpReport().contains("Abnormal")) {
             count1++;
             list.add(c);       
    }
        }
        }
        JOptionPane.showMessageDialog(null, "Total Abnormal BP Count :" + count1);
        return list;
    }
}
