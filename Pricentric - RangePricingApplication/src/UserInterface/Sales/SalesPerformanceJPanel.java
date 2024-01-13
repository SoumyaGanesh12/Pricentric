/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Sales;

import UserInterface.Main.WorkSpaceProfiles.OrderManagement.*;
import UserInterface.ProductManagement.*;
import TheBusiness.Business.Business;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.OrderManagement.MasterOrderList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.ProductManagement.ProductSummary;
import TheBusiness.SalesManagement.SalesPersonProfile;
import TheBusiness.SolutionOrders.SolutionOrder;
import TheBusiness.Supplier.Supplier;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kal bugrara
 */
public class SalesPerformanceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel CardSequencePanel;
    Business business;
    SalesPersonProfile salesperson;

    public SalesPerformanceJPanel(Business bz, JPanel jp, SalesPersonProfile spp) {

        CardSequencePanel = jp;
        this.business = bz;
         salesperson = spp;
        initComponents();

        populateSalesPerfTable();
       

    }

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalesperf = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBelowtar = new javax.swing.JTextField();
        txtOntar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAbovetar = new javax.swing.JTextField();
        Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(214, 173, 96));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSalesperf.setBackground(new java.awt.Color(0, 0, 0));
        tblSalesperf.setForeground(new java.awt.Color(255, 255, 255));
        tblSalesperf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer", "Products", "Target Price", "Actual Price", "Peformance status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSalesperf.getTableHeader().setReorderingAllowed(false);
        tblSalesperf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblSalesperfMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSalesperfMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblSalesperf);
        if (tblSalesperf.getColumnModel().getColumnCount() > 0) {
            tblSalesperf.getColumnModel().getColumn(0).setResizable(false);
            tblSalesperf.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblSalesperf.getColumnModel().getColumn(1).setResizable(false);
            tblSalesperf.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblSalesperf.getColumnModel().getColumn(2).setResizable(false);
            tblSalesperf.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblSalesperf.getColumnModel().getColumn(3).setResizable(false);
            tblSalesperf.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblSalesperf.getColumnModel().getColumn(4).setResizable(false);
            tblSalesperf.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        jScrollPane2.setViewportView(jScrollPane1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 560, 180));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sales Intelligence Report");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 900, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setText("Product");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, 20));

        jLabel1.setText("On Target");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        jLabel3.setText("Below Target");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        txtBelowtar.setEditable(false);
        add(txtBelowtar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 80, -1));

        txtOntar.setEditable(false);
        txtOntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOntarActionPerformed(evt);
            }
        });
        add(txtOntar, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 380, 80, -1));

        jLabel4.setText("Above Target");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, -1, -1));

        txtAbovetar.setEditable(false);
        txtAbovetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAbovetarActionPerformed(evt);
            }
        });
        add(txtAbovetar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 80, -1));

        Back.setBackground(new java.awt.Color(0, 0, 0));
        Back.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("<< Back");
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tblSalesperfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSalesperfMousePressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_tblSalesperfMousePressed

    private void tblSalesperfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSalesperfMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSalesperfMouseEntered

    private void txtOntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOntarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOntarActionPerformed

    private void txtAbovetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAbovetarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAbovetarActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSalesperf;
    private javax.swing.JTextField txtAbovetar;
    private javax.swing.JTextField txtBelowtar;
    private javax.swing.JTextField txtOntar;
    // End of variables declaration//GEN-END:variables

    private void populateSalesPerfTable() {
        
        int abovet=0;
        int belowt=0;
        int ont=0;
        
                
        DefaultTableModel dtm=(DefaultTableModel)tblSalesperf.getModel();
        dtm.setRowCount(0);
        
        for (SolutionOrder so : business.getMasterSolutionOrderList().getSolutionorderlist()) {
            
            if(so.getSalesperson().getPerson().getPersonId().equals(salesperson.getPerson().getPersonId()) && so.getActualPrice()!=0)
            {
                Object[] row = new Object[5];
                row[0]=so.getCustomer().getCustomerId();
                row[1] = so.getSelectedsolutionoffer().getProducts();
                row[2] = so.getSelectedsolutionoffer().getTp();
                row[3] = so.getActualPrice();
                
                if(so.getActualPrice() == so.getSelectedsolutionoffer().getTp())
                {
                    row[4] = "Sold on target";
                    ont++;
                }
                else if(so.getActualPrice() > so.getSelectedsolutionoffer().getTp())
                {
                    row[4] = "Sold above target";
                    abovet++;
                }
                else
                {
                    row[4] = "Sold below target";
                    belowt++;
                }
              
                dtm.addRow(row);

             
            }
        }
        
        txtBelowtar.setText(String.valueOf(belowt));
        txtAbovetar.setText(String.valueOf(abovet));
        txtOntar.setText(String.valueOf(ont));
    }

}
