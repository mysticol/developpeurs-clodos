/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jReservationRestaurantPane.java
 *
 * Created on 1 d�c. 2010, 10:25:14
 */

package vue;

import java.util.Date;
import javax.swing.JButton;
import javax.swing.JTextField;
import pojos.ReservationRestau;

/**
 *
 * @author Manou
 */
public class jReservationRestaurantPane extends javax.swing.JPanel implements EntityPane<ReservationRestau> {

    /** Creates new form jReservationRestaurantPane */
    public jReservationRestaurantPane() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveButton3 = new javax.swing.JButton();
        fieldFkclient = new javax.swing.JTextField();
        fieldId1 = new javax.swing.JTextField();
        idLabel1 = new javax.swing.JLabel();
        prenomLabel5 = new javax.swing.JLabel();
        buttonFwIDClient = new javax.swing.JButton();
        fieldFkIdRestaurant = new javax.swing.JTextField();
        buttonFwIDResturant = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        newButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        saveButton3.setText("Save");
        saveButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton3ActionPerformed(evt);
            }
        });

        fieldFkclient.setEditable(false);
        fieldFkclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFkclientActionPerformed(evt);
            }
        });

        fieldId1.setEditable(false);
        fieldId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldId1ActionPerformed(evt);
            }
        });

        idLabel1.setText("Id: ");

        prenomLabel5.setText("Date:");

        buttonFwIDClient.setText("Choix");

        fieldFkIdRestaurant.setEditable(false);
        fieldFkIdRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFkIdRestaurantActionPerformed(evt);
            }
        });

        buttonFwIDResturant.setText("Choix");

        newButton1.setText("Clear");

        jLabel1.setText("Client");

        jLabel2.setText("Restau");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idLabel1)
                                .addGap(33, 33, 33)
                                .addComponent(fieldId1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(prenomLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldFkclient, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(fieldFkIdRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonFwIDResturant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonFwIDClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(newButton1)
                        .addGap(38, 38, 38)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonFwIDClient)
                            .addComponent(fieldFkclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(buttonFwIDResturant))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel1)
                            .addComponent(fieldId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(newButton1)
                                .addComponent(jLabel1)))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prenomLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fieldFkIdRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(30, 30, 30)
                        .addComponent(saveButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton3ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_saveButton3ActionPerformed

    private void fieldFkclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFkclientActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_fieldFkclientActionPerformed

    private void fieldId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldId1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_fieldId1ActionPerformed

    private void fieldFkIdRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFkIdRestaurantActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_fieldFkIdRestaurantActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFwIDClient;
    private javax.swing.JButton buttonFwIDResturant;
    private javax.swing.JTextField fieldFkIdRestaurant;
    private javax.swing.JTextField fieldFkclient;
    private javax.swing.JTextField fieldId1;
    private javax.swing.JLabel idLabel1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton newButton1;
    private javax.swing.JLabel prenomLabel5;
    private javax.swing.JButton saveButton3;
    // End of variables declaration//GEN-END:variables

   @Override
    public ReservationRestau getEntity() {
        ReservationRestau result = new ReservationRestau();



        if (fieldFkclient.getText() == "" || fieldFkIdRestaurant.getText() == "" ) {
            return null;
        } else {
            result.setFkIdClient(Integer.parseInt(fieldFkclient.getText()));
            result.setReservationRestauId(Integer.parseInt(fieldFkIdRestaurant.getText()));
           
        }


        if (!this.fieldId1.getText().equals("")) {
            result.setReservationRestauId(Integer.parseInt(fieldId1.getText()));
        }

        result.setDate(jDateChooser1.getDate());

        return result;
    }

    @Override
    public void loadEntity(ReservationRestau entity) {
        this.fieldId1.setText(String.valueOf(entity.getReservationRestauId()));
        this.fieldFkclient.setText(String.valueOf(entity.getFkIdClient()));
        this.fieldFkIdRestaurant.setText(String.valueOf(entity.getReservationRestauId()));
        this.jDateChooser1.setDate(entity.getDate());
    }

    @Override
    public void clearField() {
        this.fieldId1.setText("");
        this.fieldFkclient.setText("");
        this.fieldFkIdRestaurant.setText("");
        this.jDateChooser1.setDate(new Date());
    }

    public JButton getButtonFwIDClient() {
        return buttonFwIDClient;
    }

    public JButton getButtonFwIDRestaurant() {
        return buttonFwIDResturant;
    }



    public JButton getNewButton() {
        return newButton1;
    }

    public JButton getSaveButton() {
        return saveButton3;
    }

    public JTextField getFieldFkIdRestaurant() {
        return fieldFkIdRestaurant;
    }

    public JTextField getFieldFkclient() {
        return fieldFkclient;
    }

  

}
