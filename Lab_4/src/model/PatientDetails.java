/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.UUID;
import javax.swing.JOptionPane;

/**
 *
 * @author shubhangisrivastava
 */
public class PatientDetails {
    
     String name;
    String gender;
    float temperature;
    String blood_pressure;
    String community;
    int age;
    String city;
    String addr;
    int unique_id;
    String date_of_visit;
      String Report;

    public String getReport() {
        return Report;
    }

    public void setReport(String Report) {
        this.Report = Report;
    }
    
    public int getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(int unique_id) {
        JOptionPane.showMessageDialog(null, String.valueOf(unique_id));
        
           
        this.unique_id = unique_id;
        
//        else {
//            JOptionPane.showMessageDialog(null, "Please Enter a valid Unique ID");
//        }
    }

    public String getDate_of_visit() {
        return date_of_visit;
    }

    public void setDate_of_visit(String date_of_visit) {
        this.date_of_visit = date_of_visit;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    
    @Override
   public String toString() {
       return name; 
   } 
    
}
