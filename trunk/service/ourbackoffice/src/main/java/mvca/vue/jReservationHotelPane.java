/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jReservationHotelPane.java
 *
 * Created on 1 d�c. 2010, 10:21:03
 */

package mvca.vue;

import java.util.Date;
import javax.swing.JButton;
import javax.swing.JTextField;
import mvca.entity.ReservationHotel;

/**
 *
 * @author Manou
 */
public class jReservationHotelPane extends javax.swing.JPanel implements EntityPane<ReservationHotel>{

    /** Creates new form jReservationHotelPane */
    public jReservationHotelPane() {
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

        jLayeredPane4 = new javax.swing.JLayeredPane();
        saveButton3 = new javax.swing.JButton();
        fieldFkClient = new javax.swing.JTextField();
        fieldId1 = new javax.swing.JTextField();
        idLabel1 = new javax.swing.JLabel();
        prenomLabel5 = new javax.swing.JLabel();
        buttonFwIDClient = new javax.swing.JButton();
        fieldFkIdHotel = new javax.swing.JTextField();
        buttonFwIDHotel = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        editButton1 = new javax.swing.JButton();
        newButton1 = new javax.swing.JButton();

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        saveButton3.setText("Save");
        saveButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton3ActionPerformed(evt);
            }
        });
        saveButton3.setBounds(510, 150, 70, -1);
        jLayeredPane4.add(saveButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fieldFkClient.setEditable(false);
        fieldFkClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFkClientActionPerformed(evt);
            }
        });
        fieldFkClient.setBounds(290, 10, 100, -1);
        jLayeredPane4.add(fieldFkClient, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fieldId1.setEditable(false);
        fieldId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldId1ActionPerformed(evt);
            }
        });
        fieldId1.setBounds(60, 10, 50, -1);
        jLayeredPane4.add(fieldId1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        idLabel1.setText("Id: ");
        idLabel1.setBounds(10, 10, -1, -1);
        jLayeredPane4.add(idLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        prenomLabel5.setText("Date:");
        prenomLabel5.setBounds(10, 40, 60, -1);
        jLayeredPane4.add(prenomLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonFwIDClient.setText("Client:");
        buttonFwIDClient.setBounds(190, 10, -1, -1);
        jLayeredPane4.add(buttonFwIDClient, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fieldFkIdHotel.setEditable(false);
        fieldFkIdHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFkIdHotelActionPerformed(evt);
            }
        });
        fieldFkIdHotel.setBounds(290, 40, 100, -1);
        jLayeredPane4.add(fieldFkIdHotel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonFwIDHotel.setText("Hotel:");
        buttonFwIDHotel.setBounds(190, 40, -1, -1);
        jLayeredPane4.add(buttonFwIDHotel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDateChooser1.setBounds(60, 40, -1, -1);
        jLayeredPane4.add(jDateChooser1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        editButton1.setText("Edit");

        newButton1.setText("New");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(newButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton1)
                .addContainerGap(519, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton1)
                    .addComponent(editButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton3ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_saveButton3ActionPerformed

    private void fieldFkClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFkClientActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_fieldFkClientActionPerformed

    private void fieldId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldId1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_fieldId1ActionPerformed

    private void fieldFkIdHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFkIdHotelActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_fieldFkIdHotelActionPerformed

    @Override
    public ReservationHotel getEntity() {
        ReservationHotel result = new ReservationHotel();



        if (fieldFkClient.getText() == "" || fieldFkIdHotel.getText() == "" ) {
            return null;
        } else {
            result.setFkIdClient(Integer.parseInt(fieldFkClient.getText()));
            result.setFkHotelId(Integer.parseInt(fieldFkIdHotel.getText()));

        }


        if (this.fieldId1.getText() != "") {
            result.setReservationHotelId(Integer.parseInt(fieldId1.getText()));
        }

        result.setDate(jDateChooser1.getDate());

        return result;
    }

    @Override
    public void loadEntity(ReservationHotel entity) {
        this.fieldId1.setText(String.valueOf(entity.getReservationHotelId()));
        this.fieldFkClient.setText(String.valueOf(entity.getFkIdClient()));
        this.fieldFkIdHotel.setText(String.valueOf(entity.getFkHotelId()));
        this.jDateChooser1.setDate(entity.getDate());
    }

    @Override
    public void clearField() {
        this.fieldId1.setText("");
        this.fieldFkClient.setText("");
        this.fieldFkIdHotel.setText("");
        this.jDateChooser1.setDate(new Date());
    }





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFwIDClient;
    private javax.swing.JButton buttonFwIDHotel;
    private javax.swing.JButton editButton1;
    private javax.swing.JTextField fieldFkClient;
    private javax.swing.JTextField fieldFkIdHotel;
    private javax.swing.JTextField fieldId1;
    private javax.swing.JLabel idLabel1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JButton newButton1;
    private javax.swing.JLabel prenomLabel5;
    private javax.swing.JButton saveButton3;
    // End of variables declaration//GEN-END:variables

    public JButton getButtonFwIDClient() {
        return buttonFwIDClient;
    }

    public JButton getButtonFwIDHotel() {
        return buttonFwIDHotel;
    }

    public JButton getEditButton() {
        return editButton1;
    }

    public JButton getNewButton() {
        return newButton1;
    }

    public JButton getSaveButton() {
        return saveButton3;
    }

    public JTextField getFieldFkClient() {
        return fieldFkClient;
    }

    public JTextField getFieldFkIdHotel() {
        return fieldFkIdHotel;
    }


}
