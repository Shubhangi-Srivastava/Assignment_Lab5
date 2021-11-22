/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Dishes;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Shubhangi
 */
public class ManageMenu extends javax.swing.JPanel {

    /**
     * Creates new form ManageMenu
     */
     EcoSystem system;
     Dishes menu;
    JPanel userProcessContainer;
    UserAccount account;
    public ManageMenu(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
        this.account=account;
        this.system=system;
        this.userProcessContainer=userProcessContainer;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        amtTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MenuTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        dishNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        descTxt = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        addDishBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Description");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        amtTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        amtTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtTxtActionPerformed(evt);
            }
        });
        add(amtTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 150, -1));

        MenuTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish Name", "Description", "Prize"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MenuTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 830, 100));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Dish Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 110, 20));

        dishNameTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dishNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishNameTxtActionPerformed(evt);
            }
        });
        add(dishNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 150, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Amount");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 90, 20));

        descTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        descTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descTxtActionPerformed(evt);
            }
        });
        add(descTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 150, -1));

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 120, -1));

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backBtn.setText("Previous");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        addDishBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addDishBtn.setText("Add Dish");
        addDishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDishBtnActionPerformed(evt);
            }
        });
        add(addDishBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/shubhangisrivastava/Downloads/foodRestaurant.jpeg")); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void amtTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amtTxtActionPerformed

    private void dishNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dishNameTxtActionPerformed

    private void descTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descTxtActionPerformed

    private void addDishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDishBtnActionPerformed
        // TODO add your handling code here:
        String name=dishNameTxt.getText();
        String desc=descTxt.getText();
        String amount=amtTxt.getText();
       
        
         try {
             if(name==null || name.isEmpty()){
                throw new NullPointerException(" Name field is Empty");
                
                
            }else if(name.length()<5 ){
                throw new Exception("Please enter valid  Name");
                
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");
           
            return;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Name is invalid");
       
            return;
        }
        
        try {
             if(desc==null || desc.isEmpty()){
                throw new NullPointerException("Description  field is Empty");
                
                
            }else if(desc.length()<5){
                throw new Exception("Please enter valid Description ");
                
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Description is Empty");
           
            return;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " Description is invalid");
       
            return;
        }
        
         try {
             
            if(amount==null || amount.isEmpty()){
                throw new NullPointerException("amount field is Empty");
            }else if(Pattern.matches("^[0-9]{0,3}$", amount)==false){
                throw new Exception("Invalid amount (Enter 0-3 Digits)");
            }
            
            
        }  catch(NullPointerException e){
             JOptionPane.showMessageDialog(null, "amount is Empty");
            
             
             return;
        }catch (Exception e) {
             JOptionPane.showMessageDialog(null, "amount is of invalid pattern");
             
             
             return;
        }
        
        
        
        for(Restaurant restro:system.getRestaurantDirectory().getRestaurantList()){
           if(restro.getAdminUName().equals(account.getUsername())){
                menu=system.getRestaurantDirectory().AddMenuDishes(restro,name, desc, amount);
            }   
        }
        
        dishNameTxt.setText("");
        descTxt.setText("");
        amtTxt.setText("");
        populateTable();
        
    }//GEN-LAST:event_addDishBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = MenuTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                
                for(Restaurant restro:system.getRestaurantDirectory().getRestaurantList()){
                    if(restro.getAdminUName().equals(account.getUsername())){
                        system.getRestaurantDirectory().DeleteDishes(restro, menu);
                    }   
                }
                populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this); 
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
        
        model.setRowCount(0);
        
       
        for (Restaurant restro:system.getRestaurantDirectory().getRestaurantList()) {
           
            if (restro.getAdminUName().equals(account.getUsername())) {
                
               for(Dishes menu:restro.getMenu()){
                Object[] row = new Object[3];
                row[0] = menu.getName();
                row[1] = menu.getDescription();
                row[2] = menu.getPrice();
                model.addRow(row);
               }
                
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MenuTable;
    private javax.swing.JButton addDishBtn;
    private javax.swing.JTextField amtTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField descTxt;
    private javax.swing.JTextField dishNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
