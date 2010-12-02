/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jReservationPane.java
 *
 * Created on 1 d�c. 2010, 10:37:42
 */

package mvca.vue;

import java.util.Date;
import javax.swing.JButton;
import javax.swing.JTextField;
import mvca.entity.Voyage;

/**
 *
 * @author Manou
 */
public class jVoyagePane extends javax.swing.JPanel implements EntityPane<Voyage> {

    /** Creates new form jReservationPane */
    public jVoyagePane() {
        initComponents();
        this.jDateChooser1.setDateFormatString("dd/mm/yy");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newButton1 = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        saveButton3 = new javax.swing.JButton();
        fieldFkClient = new javax.swing.JTextField();
        fieldId1 = new javax.swing.JTextField();
        idLabel1 = new javax.swing.JLabel();
        prenomLabel5 = new javax.swing.JLabel();
        buttonFwIDClient = new javax.swing.JButton();
        fieldFkIdDepart = new javax.swing.JTextField();
        buttonFwIDDepart = new javax.swing.JButton();
        fieldFkIdArrive = new javax.swing.JTextField();
        buttonFwIDArrive = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        editButton1 = new javax.swing.JButton();

        newButton1.setText("New");

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        saveButton3.setText("Save");
        saveButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton3ActionPerformed(evt);
            }
        });
        saveButton3.setBounds(510, 90, 70, -1);
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

        fieldFkIdDepart.setEditable(false);
        fieldFkIdDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFkIdDepartActionPerformed(evt);
            }
        });
        fieldFkIdDepart.setBounds(290, 40, 100, -1);
        jLayeredPane4.add(fieldFkIdDepart, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonFwIDDepart.setText("Depart:");
        buttonFwIDDepart.setBounds(190, 40, 80, -1);
        jLayeredPane4.add(buttonFwIDDepart, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fieldFkIdArrive.setEditable(false);
        fieldFkIdArrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFkIdArriveActionPerformed(evt);
            }
        });
        fieldFkIdArrive.setBounds(290, 70, 100, -1);
        jLayeredPane4.add(fieldFkIdArrive, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonFwIDArrive.setText("Arrive:");
        buttonFwIDArrive.setBounds(190, 70, 70, -1);
        jLayeredPane4.add(buttonFwIDArrive, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDateChooser1.setBounds(60, 40, -1, -1);
        jLayeredPane4.add(jDateChooser1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        editButton1.setText("Edit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(newButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton1)
                .addContainerGap(492, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
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
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void fieldFkIdDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFkIdDepartActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_fieldFkIdDepartActionPerformed

    private void fieldFkIdArriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFkIdArriveActionPerformed
        // TODO add your handling code here:
        
}//GEN-LAST:event_fieldFkIdArriveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFwIDArrive;
    private javax.swing.JButton buttonFwIDClient;
    private javax.swing.JButton buttonFwIDDepart;
    private javax.swing.JButton editButton1;
    private javax.swing.JTextField fieldFkClient;
    private javax.swing.JTextField fieldFkIdArrive;
    private javax.swing.JTextField fieldFkIdDepart;
    private javax.swing.JTextField fieldId1;
    private javax.swing.JLabel idLabel1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JButton newButton1;
    private javax.swing.JLabel prenomLabel5;
    private javax.swing.JButton saveButton3;
    // End of variables declaration//GEN-END:variables

    @Override
    public Voyage getEntity() {
        Voyage result= new Voyage();

        
 
        result.setDate(jDateChooser1.getDate());

        if (!fieldId1.getText().equals("")) {
            result.setVoyageId(Integer.parseInt(fieldId1.getText()));
        }

        if (fieldFkIdArrive.getText()==""|| fieldFkIdDepart.getText()=="" || fieldFkClient.getText()==""){
            return null;
        }else{
            result.setFkClientId(Integer.parseInt(fieldFkClient.getText()));
            result.setFkLocalisationArrive(Integer.parseInt(fieldFkIdArrive.getText()));
            result.setFkLocalisationDepart(Integer.parseInt(fieldFkIdDepart.getText()));

            
        }

           


        return result;
    }

    @Override
    public void loadEntity(Voyage entity) {
       this.fieldId1.setText(String.valueOf(entity.getVoyageId()));
       this.fieldFkClient.setText(String.valueOf(entity.getFkClientId()));
      this.jDateChooser1.setDate(entity.getDate());
       this.fieldFkIdArrive.setText(String.valueOf(entity.getFkLocalisationArrive()));
       this.fieldFkIdDepart.setText(String.valueOf(entity.getFkLocalisationDepart()));

    }

    @Override
    public void clearField() {
    this.jDateChooser1.setDate(new Date());
       this.fieldFkIdArrive.setText("");
       this.fieldFkIdDepart.setText("");
       this.fieldId1.setText("");
       this.fieldFkClient.setText("");
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

    public JButton getButtonFwIDArrive() {
        return buttonFwIDArrive;
    }

    public JButton getButtonFwIDClient() {
        return buttonFwIDClient;
    }

    public JButton getButtonFwIDDepart() {
        return buttonFwIDDepart;
    }


    public JTextField getFieldFkClient() {
        return fieldFkClient;
    }

    public JTextField getFieldFkIdArrive() {
        return fieldFkIdArrive;
    }

    public JTextField getFieldFkIdDepart() {
        return fieldFkIdDepart;
    }



}
