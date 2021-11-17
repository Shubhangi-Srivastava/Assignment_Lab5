/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author shubhangisrivastava
 */
public class PersonDetails {
    int person_id;

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }
    String name;
    String gender;
    String community;
    int age;
    String city;
    String addr;
  
    

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        //if(city.matches("[A-Za-z]+")) {
            this.city = city;
//        } else {
//            JOptionPane.showMessageDialog(null, "Please enter a valid city name.");
//        }   
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
       // if(addr.matches("[A-Za-z]+")) {
            this.addr = addr;
//        } else {
//            JOptionPane.showMessageDialog(null, "Please enter a valid Address.");
//        }    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       // if(name.matches("[A-Za-z]+")) {
            this.name = name;
//        } else {
//            JOptionPane.showMessageDialog(null, "Please enter a valid Person Name.");
//        }     
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
//        if(!gender.contains(null) || !gender.contains("")) {
            this.gender = gender;
//        } else {
//            JOptionPane.showMessageDialog(null, "Please select a Gender to proceed");
//        }  
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        // if(community.matches("[A-Za-z]+")) {
           this.community = community;
//        } else {
//            JOptionPane.showMessageDialog(null, "Please enter a valid Community Name.");
//        }    
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//      if(String.valueOf(age).contains("[a-zA-Z]+")) {
//           JOptionPane.showMessageDialog(null, "Please enter a valid age");
//      } else {
////        if() {  
//        this.age = age;   
//        }
      //if(age > 0 && age <110) {
           this.age = age;   
//      } else {
//          JOptionPane.showMessageDialog(null, "Please enter a valid age");
//      }   
    }
    
    
    
     @Override
    public String toString() {
        return name;
       
    }  
    
    
}
