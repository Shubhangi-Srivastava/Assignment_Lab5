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
public class PersonDirectory {
    
    
    private ArrayList<PersonDetails> history;
    
    public PersonDirectory(){
        
        history = new ArrayList<PersonDetails>();
    }
    
    public ArrayList<PersonDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<PersonDetails> history) {
        this.history = history;
    }
    
    
    public PersonDetails addNewPerson() {
        PersonDetails newPerson = new PersonDetails();
        history.add(newPerson);
        return newPerson;
    }
    
    
    public void deletePerson(PersonDetails cd) {
        
        history.remove(cd);
    }
     
//     public ArrayList<PersonDetails> filterByBloodPressure() {
//        ArrayList<PersonDetails> list = new ArrayList<>();
//      
//        for(PersonDetails c : history) {
//           // double dnum = Double.parseDouble(c.getBlood_pressure());
//            //if(String.valueOf(c.getBlood_pressure()).) {//.contains(serialNumber.toString())) {
//           // if(!(c.getBlood_pressure() > 90 && c.getBlood_pressure() < 120))
//            if(!(c.getBlood_pressure() > 90 && c.getBlood_pressure() < 120)){
//             JOptionPane.showMessageDialog(null, c.getBlood_pressure());
//            //JOptionPane.showMessageDialog(null, list.add(c));
//            list.add(c);
//            // JOptionPane.showMessageDialog(null, c);    
//        }else{
//            list.remove(c);
//             JOptionPane.showMessageDialog(null, c);    
//
//            }
//     }
//        return list; 
//    }
}
