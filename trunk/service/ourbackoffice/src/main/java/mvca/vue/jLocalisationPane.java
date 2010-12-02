/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jLocalisationPane.java
 *
 * Created on 1 d�c. 2010, 09:08:28
 */

package mvca.vue;

import javax.swing.JButton;
import mvca.entity.Localisation;

/**
 *
 * @author Manou
 */
public class jLocalisationPane extends javax.swing.JPanel implements EntityPane<Localisation> {

    /** Creates new form jLocalisationPane */
    public jLocalisationPane() {
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

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        saveButton = new javax.swing.JButton();
        villeLabel = new javax.swing.JLabel();
        paysLabel = new javax.swing.JLabel();
        fieldVille = new javax.swing.JTextField();
        fieldPays = new javax.swing.JTextField();
        fieldId = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        newButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        saveButton.setBounds(470, 110, 70, 23);
        jLayeredPane1.add(saveButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        villeLabel.setText("Ville:");
        villeLabel.setBounds(10, 30, 50, 20);
        jLayeredPane1.add(villeLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        paysLabel.setText("Pays:");
        paysLabel.setBounds(10, 70, 60, 14);
        jLayeredPane1.add(paysLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fieldVille.setBounds(60, 30, 100, 20);
        jLayeredPane1.add(fieldVille, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fieldPays.setBounds(60, 70, 100, 20);
        jLayeredPane1.add(fieldPays, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fieldId.setEditable(false);
        fieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIdActionPerformed(evt);
            }
        });
        fieldId.setBounds(60, 10, 50, 20);
        jLayeredPane1.add(fieldId, javax.swing.JLayeredPane.DEFAULT_LAYER);

        idLabel.setText("Id: ");
        idLabel.setBounds(10, 10, 17, 14);
        jLayeredPane1.add(idLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        newButton.setText("New");

        editButton.setText("Edit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(newButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton)
                    .addComponent(editButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 56, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 56, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_saveButtonActionPerformed

    private void fieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIdActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_fieldIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editButton;
    private javax.swing.JTextField fieldId;
    private javax.swing.JTextField fieldPays;
    private javax.swing.JTextField fieldVille;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newButton;
    private javax.swing.JLabel paysLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel villeLabel;
    // End of variables declaration//GEN-END:variables

     @Override
    public Localisation getEntity() {
        Localisation cl = new Localisation();
        cl.setPays(fieldPays.getText());
        cl.setVille(fieldVille.getText());

        if (!fieldId.getText().equals("")) {
            cl.setLocalisationId(Integer.parseInt(fieldId.getText()));
        }

        return cl;
    }

    @Override
    public void loadEntity(Localisation entity) {


        this.fieldId.setText(String.valueOf(entity.getLocalisationId()));
        this.fieldPays.setText(entity.getPays());
        this.fieldVille.setText(entity.getVille());
    }

    @Override
    public void clearField() {
        fieldId.setText("");
        fieldVille.setText("");
        fieldPays.setText("");
    }

    public JButton getEditButton() {
        return editButton;
    }

    public JButton getNewButton() {
        return newButton;
    }

    public JButton getSaveButton() {
        return saveButton;
    }




}
