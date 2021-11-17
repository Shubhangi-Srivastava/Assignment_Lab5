/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author shubhangisrivastava
 */
public class CarDetails {
    
    private String car_name;
    private String availability;
    private String brand;
    private String manufacture_year;
    private int min_max_seats;
    private long serial_number;
    private String model_num;
    private String city;
    private String maint_cert_expiration_dt;

    public String getMaint_cert_expiration_dt() {
        return maint_cert_expiration_dt;
    }

    public void setMaint_cert_expiration_dt(String maint_cert_expiration_dt) {
        
        
        this.maint_cert_expiration_dt = maint_cert_expiration_dt;
    }
    

    public String getManufacture_year() {
        return manufacture_year;
    }

    public void setManufacture_year(String manufacture_year) {
        
        if(Integer.parseInt(manufacture_year) > 1990 && Integer.parseInt(manufacture_year) < 2021) {
        this.manufacture_year = manufacture_year;
    } else {
            JOptionPane.showMessageDialog(null, "Please enter Manufacture Year only between 1990 to 2021.");
        }
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        
       // if(!availability.contains("") && !availability.isBlank()) {
        this.availability = availability;
       // }
    } 

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        
        if(car_name.matches("[A-Za-z]+")) {
            this.car_name = car_name;
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid car name.");
        }
    }       

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        
        if(brand.matches("[A-Za-z]+")) {
          this.brand = brand;  
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid brand name.");
        }    
    }

    

    public int getMin_max_seats() {
        return min_max_seats;
    }

    public void setMin_max_seats(int min_max_seats) { 
       
           if(min_max_seats != ' ' && min_max_seats >2 && min_max_seats < 10) {               
        this.min_max_seats = min_max_seats;
           } else {
                JOptionPane.showMessageDialog(null, "Please enter valid number of seats.");
           }
    }

    public long getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(long serial_number) {
        
        if(String.valueOf(serial_number).length() < 8) {
             this.serial_number = serial_number;
        } else {
            JOptionPane.showMessageDialog(null, "Please enter valid Serial Number");
        }
    }

    public String getModel_num() {
        return model_num;
    }

    public void setModel_num(String model_num) {
        
        if(model_num.matches("\\b((?=[A-Za-z/ -]{0,19}\\d)[A-Za-z0-9/ -]{4,20})\\b")) {
        this.model_num = model_num;
    } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid Model Number like M3094 or 02-700401.");
        }
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        
        if(city.matches("[A-Za-z]+")) {
             this.city = city;
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid city name.");
        }
    }
  
    @Override
    public String toString() {
        return car_name;
       
    }   

    public void setManufacture_year(int manufacture_year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
