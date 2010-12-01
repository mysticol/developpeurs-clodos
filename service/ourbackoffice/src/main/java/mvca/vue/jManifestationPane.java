/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jManifestationPane.java
 *
 * Created on 1 d�c. 2010, 09:58:10
 */

package mvca.vue;

import mvca.entity.Manifestation;

/**
 *
 * @author Manou
 */
public class jManifestationPane extends javax.swing.JPanel implements EntityPane<Manifestation>{

    /** Creates new form jManifestationPane */
    public jManifestationPane() {
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

        editButton1 = new javax.swing.JButton();
        newButton1 = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        saveButton1 = new javax.swing.JButton();
        prenomLabel1 = new javax.swing.JLabel();
        fieldFkLocalisation = new javax.swing.JTextField();
        fieldAdresse = new javax.swing.JTextField();
        fieldId1 = new javax.swing.JTextField();
        idLabel1 = new javax.swing.JLabel();
        nbcouvertLabel = new javax.swing.JLabel();
        fieldNbPlace = new javax.swing.JTextField();
        prenomLabel4 = new javax.swing.JLabel();
        fieldHotel = new javax.swing.JTextField();
        prenomLabel2 = new javax.swing.JLabel();
        fieldPrix = new javax.swing.JTextField();
        nbcouvertLabel1 = new javax.swing.JLabel();
        prenomLabel5 = new javax.swing.JLabel();
        fieldDate = new javax.swing.JTextField();
        buttonFwIDLocalisation = new javax.swing.JButton();
        fieldFkType = new javax.swing.JTextField();
        buttonFwIDType = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        editButton1.setText("Edit");

        newButton1.setText("New");

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        saveButton1.setText("Save");
        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });
        saveButton1.setBounds(500, 190, 70, 23);
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
        fieldAdresse.setBounds(90, 50, 100, 20);
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

        nbcouvertLabel.setText("Nb Place:");
        nbcouvertLabel.setBounds(10, 70, 70, 14);
        jLayeredPane2.add(nbcouvertLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fieldNbPlace.setBounds(90, 70, 100, 20);
        jLayeredPane2.add(fieldNbPlace, javax.swing.JLayeredPane.DEFAULT_LAYER);

        prenomLabel4.setText("Nom:");
        prenomLabel4.setBounds(10, 30, 60, 14);
        jLayeredPane2.add(prenomLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fieldHotel.setBounds(90, 30, 100, 20);
        jLayeredPane2.add(fieldHotel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        prenomLabel2.setText("Prix:");
        prenomLabel2.setBounds(200, 50, 60, 14);
        jLayeredPane2.add(prenomLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fieldPrix.setBounds(260, 50, 100, 20);
        jLayeredPane2.add(fieldPrix, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nbcouvertLabel1.setText("Desc:");
        nbcouvertLabel1.setBounds(10, 90, 60, 14);
        jLayeredPane2.add(nbcouvertLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        prenomLabel5.setText("Date:");
        prenomLabel5.setBounds(200, 30, 60, 14);
        jLayeredPane2.add(prenomLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fieldDate.setBounds(260, 30, 100, 20);
        jLayeredPane2.add(fieldDate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonFwIDLocalisation.setText("Localisation:");
        buttonFwIDLocalisation.setBounds(370, 30, 93, 23);
        jLayeredPane2.add(buttonFwIDLocalisation, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fieldFkType.setEditable(false);
        fieldFkType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFkTypeActionPerformed(evt);
            }
        });
        fieldFkType.setBounds(470, 60, 100, 20);
        jLayeredPane2.add(fieldFkType, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonFwIDType.setText("Type:");
        buttonFwIDType.setBounds(370, 60, 63, 23);
        jLayeredPane2.add(buttonFwIDType, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane1.setBounds(20, 110, 390, 60);
        jLayeredPane2.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton1)
                    .addComponent(editButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
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

    private void fieldFkTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFkTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldFkTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFwIDLocalisation;
    private javax.swing.JButton buttonFwIDType;
    private javax.swing.JButton editButton1;
    private javax.swing.JTextField fieldAdresse;
    private javax.swing.JTextField fieldDate;
    private javax.swing.JTextField fieldFkLocalisation;
    private javax.swing.JTextField fieldFkType;
    private javax.swing.JTextField fieldHotel;
    private javax.swing.JTextField fieldId1;
    private javax.swing.JTextField fieldNbPlace;
    private javax.swing.JTextField fieldPrix;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nbcouvertLabel;
    private javax.swing.JLabel nbcouvertLabel1;
    private javax.swing.JButton newButton1;
    private javax.swing.JLabel prenomLabel1;
    private javax.swing.JLabel prenomLabel2;
    private javax.swing.JLabel prenomLabel4;
    private javax.swing.JLabel prenomLabel5;
    private javax.swing.JButton saveButton1;
    // End of variables declaration//GEN-END:variables

    @Override
    public Manifestation getEntity() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void loadEntity(Manifestation entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clearField() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
