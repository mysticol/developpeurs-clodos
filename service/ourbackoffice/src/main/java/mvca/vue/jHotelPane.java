/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jHotelPane.java
 *
 * Created on 1 d�c. 2010, 09:32:50
 */

package mvca.vue;

import mvca.entity.Hotel;

/**
 *
 * @author Manou
 */
public class jHotelPane extends javax.swing.JPanel implements EntityPane<Hotel>{

    /** Creates new form jHotelPane */
    public jHotelPane() {
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

        newButton1 = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        saveButton1 = new javax.swing.JButton();
        prenomLabel1 = new javax.swing.JLabel();
        fieldFkLocalisation = new javax.swing.JTextField();
        fieldAdresse = new javax.swing.JTextField();
        fieldId1 = new javax.swing.JTextField();
        idLabel1 = new javax.swing.JLabel();
        nbcouvertLabel = new javax.swing.JLabel();
        fieldNbCouvert = new javax.swing.JTextField();
        prenomLabel4 = new javax.swing.JLabel();
        fieldRestaurant = new javax.swing.JTextField();
        prenomLabel2 = new javax.swing.JLabel();
        fieldPrix = new javax.swing.JTextField();
        nbcouvertLabel1 = new javax.swing.JLabel();
        fieldPrixMoyen = new javax.swing.JTextField();
        prenomLabel5 = new javax.swing.JLabel();
        fieldNote = new javax.swing.JTextField();
        buttonFwIDLocalisation = new javax.swing.JButton();
        editButton1 = new javax.swing.JButton();

        newButton1.setText("New");

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        saveButton1.setText("Save");
        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });
        saveButton1.setBounds(470, 110, 70, 23);
        jLayeredPane2.add(saveButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        prenomLabel1.setText("Adresse:");
        prenomLabel1.setBounds(10, 50, 60, 14);
        jLayeredPane2.add(prenomLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fieldFkLocalisation.setEditable(false);
        fieldFkLocalisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFkLocalisationActionPerformed(evt);
            }
        });
        fieldFkLocalisation.setBounds(470, 30, 100, 20);
        jLayeredPane2.add(fieldFkLocalisation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fieldAdresse.setBounds(70, 50, 100, 20);
        jLayeredPane2.add(fieldAdresse, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fieldId1.setEditable(false);
        fieldId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldId1ActionPerformed(evt);
            }
        });
        fieldId1.setBounds(60, 10, 50, 20);
        jLayeredPane2.add(fieldId1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        idLabel1.setText("Id: ");
        idLabel1.setBounds(10, 10, 17, 14);
        jLayeredPane2.add(idLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nbcouvertLabel.setText("Nb couvert:");
        nbcouvertLabel.setBounds(10, 70, 60, 14);
        jLayeredPane2.add(nbcouvertLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fieldNbCouvert.setBounds(70, 70, 100, 20);
        jLayeredPane2.add(fieldNbCouvert, javax.swing.JLayeredPane.DEFAULT_LAYER);

        prenomLabel4.setText("Nom:");
        prenomLabel4.setBounds(10, 30, 60, 14);
        jLayeredPane2.add(prenomLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fieldRestaurant.setBounds(70, 30, 100, 20);
        jLayeredPane2.add(fieldRestaurant, javax.swing.JLayeredPane.DEFAULT_LAYER);

        prenomLabel2.setText("Prix:");
        prenomLabel2.setBounds(180, 50, 60, 14);
        jLayeredPane2.add(prenomLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fieldPrix.setBounds(240, 50, 100, 20);
        jLayeredPane2.add(fieldPrix, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nbcouvertLabel1.setText("Prix moyen:");
        nbcouvertLabel1.setBounds(180, 70, 60, 14);
        jLayeredPane2.add(nbcouvertLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fieldPrixMoyen.setBounds(240, 70, 100, 20);
        jLayeredPane2.add(fieldPrixMoyen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        prenomLabel5.setText("Note:");
        prenomLabel5.setBounds(180, 30, 60, 14);
        jLayeredPane2.add(prenomLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fieldNote.setBounds(240, 30, 100, 20);
        jLayeredPane2.add(fieldNote, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonFwIDLocalisation.setText("Localisation:");
        buttonFwIDLocalisation.setBounds(370, 30, 93, 23);
        jLayeredPane2.add(buttonFwIDLocalisation, javax.swing.JLayeredPane.DEFAULT_LAYER);

        editButton1.setText("Edit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton1))
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton1)
                    .addComponent(editButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_saveButton1ActionPerformed

    private void fieldFkLocalisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFkLocalisationActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_fieldFkLocalisationActionPerformed

    private void fieldId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldId1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_fieldId1ActionPerformed

    @Override
    public Hotel getEntity() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void loadEntity(Hotel entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clearField() {
        throw new UnsupportedOperationException("Not supported yet.");
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFwIDLocalisation;
    private javax.swing.JButton editButton1;
    private javax.swing.JTextField fieldAdresse;
    private javax.swing.JTextField fieldFkLocalisation;
    private javax.swing.JTextField fieldId1;
    private javax.swing.JTextField fieldNbCouvert;
    private javax.swing.JTextField fieldNote;
    private javax.swing.JTextField fieldPrix;
    private javax.swing.JTextField fieldPrixMoyen;
    private javax.swing.JTextField fieldRestaurant;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLabel nbcouvertLabel;
    private javax.swing.JLabel nbcouvertLabel1;
    private javax.swing.JButton newButton1;
    private javax.swing.JLabel prenomLabel1;
    private javax.swing.JLabel prenomLabel2;
    private javax.swing.JLabel prenomLabel4;
    private javax.swing.JLabel prenomLabel5;
    private javax.swing.JButton saveButton1;
    // End of variables declaration//GEN-END:variables

}
