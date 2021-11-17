/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author shubhangisrivastava
 */
public class CarDetailsHistory {
    
    private ArrayList<CarDetails> history;
    
    public CarDetailsHistory(){
        
        history = new ArrayList<CarDetails>();
    }

    public ArrayList<CarDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CarDetails> history) {
        this.history = history;
    }
    
    public CarDetails addNewCar() {
        CarDetails newCar = new CarDetails();
        history.add(newCar);
        return newCar;
    }
    
    
    public void deleteCars(CarDetails cd) {
        
        history.remove(cd);
    }
    
    public ArrayList<CarDetails> filterByBrand(String brands) {
        
        ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails c : history) {
            if(c.getBrand().contains(brands)) {
            list.add(c);
        }  
     }
        return list;
        
    }
    
    public ArrayList<CarDetails> filterByYear(String year) {
        
        ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails c : history) {
            if(c.getManufacture_year().contains(year)) {
                list.add(c);
            }
        }
        return list; 
    }
    
    
    public ArrayList<CarDetails> filterByModelNum(String modelNum) {
         ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails c : history) {
            if(c.getModel_num().contains(modelNum)) {
                list.add(c);
            }
        }
        return list; 
    }
    
    public ArrayList<CarDetails> filterByCity(String city) {
        
        ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails c : history) {
           
            if(c.getCity().contains(city) ) {
                
                list.add(c);
            }
//            } else {
//                JOptionPane.showMessageDialog(null, "Does not exist. Please enter another city name.");
//            }
        }
        return list; 
    }
    
    
    public ArrayList<CarDetails> filterBySerialNum(String serialNumber) {
        
        ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails c : history) {
            if(String.valueOf(c.getSerial_number()).contains(serialNumber.toString())) {
                list.add(c);
            }
        }
        return list; 
    }
    
    
    public ArrayList<CarDetails> filterByAvailability() {
         int count1 =0, count2=0;
          ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails c : history) {
         
         if(c.getAvailability().equalsIgnoreCase("yes")) {
             count1++;
             list.add(c);
         } else if(c.getAvailability().equalsIgnoreCase("no")) {
             count2++;
         }
        }
        JOptionPane.showMessageDialog(null, "Card Available :" + count1);
        JOptionPane.showMessageDialog(null, "\nCars unavailable :" +count2);
        return list;
    }
    
    public ArrayList<CarDetails> filterByManufacturer() {
        
        ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails c : history) {
            if(!c.getCar_name().isEmpty()) {
            list.add(c);
    }
        }
          return list;
    }
    
    public ArrayList<CarDetails> filterByFirstCar() {
        
            ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails c : history) { 
           if(c.getAvailability().equalsIgnoreCase("yes")) 
        {
               list.add(c);
                break;
         }     
    }    
        return list;
   }
    
    
    public ArrayList<CarDetails> filterBySeatCount(String minSeatCount, String maxSeatCount) {
        ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails c : history) {
            int mainCount = Integer.parseInt(String.valueOf(c.getMin_max_seats()));
            int count1 = Integer.parseInt(String.valueOf(minSeatCount));       
            int count2 = Integer.parseInt(String.valueOf(maxSeatCount)); 
            if(mainCount>=count1 && mainCount<=count2) {  
                list.add(c);
            }
        }
        return list;
    }
   
    
    public ArrayList<CarDetails> filterByExpiry() {
          ArrayList<CarDetails> list = new ArrayList<>();
        for(CarDetails c : history) {
         
         if(c.getMaint_cert_expiration_dt().equalsIgnoreCase("yes")) {
             list.add(c);
         }
        }
        JOptionPane.showMessageDialog(null, "Displaying list of Cars that have expired maintenance certification.");
        return list;
    }  
}
