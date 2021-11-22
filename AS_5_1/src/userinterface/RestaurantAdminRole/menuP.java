/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Item;
import java.awt.CardLayout;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cjz
 */
public class menuP extends javax.swing.JPanel {

    /**
     * Creates new form menuP
     */
    private JPanel userProcessContainer;
    private UserAccount ua;
    private EcoSystem system;
    private DefaultTableModel model;
    private Restaurant res;
    private Manager m;
    private Map<Integer,Item> menu;
    public menuP(JPanel userProcessContainer, UserAccount ua,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua = ua;
        this.system = system;
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        m = (Manager) ua.getPerson();
        res = m.getRes();
        menu = res.getMenu();
        refresh();

        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        mbtn = new javax.swing.JButton();
        dbtn = new javax.swing.JButton();
        cbtn = new javax.swing.JButton();
        itemIn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        priceIn = new javax.swing.JTextField();
        bbtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "item", "price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        mbtn.setText("Modify");
        mbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbtnActionPerformed(evt);
            }
        });

        dbtn.setText("Delete");
        dbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbtnActionPerformed(evt);
            }
        });

        cbtn.setText("Create");
        cbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Item");

        jLabel2.setText("price");

        bbtn.setText("Back");
        bbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(mbtn)
                        .addGap(18, 18, 18)
                        .addComponent(dbtn)
                        .addGap(18, 18, 18)
                        .addComponent(cbtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addComponent(itemIn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(priceIn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(269, 269, 269)))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(bbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mbtn)
                    .addComponent(dbtn)
                    .addComponent(cbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(priceIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(bbtn)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
    }//GEN-LAST:event_bbtnActionPerformed

    private void cbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtnActionPerformed
        // TODO add your handling code here:
        String name = itemIn.getText().toString();
        int price = Integer.valueOf(priceIn.getText().toString());
        res.createItem(name, price);
        Object row[] = new Object[3];
            row[0] = res.getMenuid();
            row[1] = name;
            row[2] = price;
            model.addRow(row);
        
        JOptionPane.showMessageDialog(this, "Created.");
    }//GEN-LAST:event_cbtnActionPerformed

    private void dbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbtnActionPerformed
        // TODO add your handling code here:
        int selected = jTable1.getSelectedRow();
        int id = (int) model.getValueAt(selected, 0);
        res.getMenu().remove(id);
        model.removeRow(selected);
        JOptionPane.showMessageDialog(this, "Deleted.");
    }//GEN-LAST:event_dbtnActionPerformed

    private void mbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtnActionPerformed
        // TODO add your handling code here:
        int selected = jTable1.getSelectedRow();
        int id = (int) model.getValueAt(selected, 0);
        res.getMenu().get(id).setName((String) model.getValueAt(selected, 1));
        res.getMenu().get(id).setPrice((int) model.getValueAt(selected, 2));
        JOptionPane.showMessageDialog(this, "Mpdified.");
    }//GEN-LAST:event_mbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbtn;
    private javax.swing.JButton cbtn;
    private javax.swing.JButton dbtn;
    private javax.swing.JTextField itemIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mbtn;
    private javax.swing.JTextField priceIn;
    // End of variables declaration//GEN-END:variables
}