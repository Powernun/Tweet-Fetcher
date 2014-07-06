/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import javax.swing.JPanel;
import utilities.generalutils.PropertiesUtils;

/**
 *
 * @author Dimitrios
 */
public class SettingsWindow extends JPanel {

    /**
     * Creates new form UserSettings
     */
    public SettingsWindow() {
        initComponents();
        
        if (PropertiesUtils.propertiesErrorFound()) {
            PropertiesUtils.setDefaultPropertyFile();
        }
        
        jUsernameField.setText(PropertiesUtils.getPropertyValue("username"));
        jPasswordField.setText(PropertiesUtils.getPropertyValue("password"));
        jHostnameField.setText(PropertiesUtils.getPropertyValue("hostname"));
        jPortField.setText(PropertiesUtils.getPropertyValue("port"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanel = new javax.swing.JPanel();
        jSQLCredentialsPanel = new javax.swing.JPanel();
        jHostnameLabel = new javax.swing.JLabel();
        jPortLabel = new javax.swing.JLabel();
        jHostnameField = new javax.swing.JTextField();
        jPortField = new javax.swing.JTextField();
        jUserCredentialsPanel = new javax.swing.JPanel();
        jUsernameLabel = new javax.swing.JLabel();
        jPasswordLabel = new javax.swing.JLabel();
        jUsernameField = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();

        jMainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Credentials", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jSQLCredentialsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SQL Credentials", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jHostnameLabel.setText("Hostname:");

        jPortLabel.setText("Port:");

        jHostnameField.setText("localhost");

        jPortField.setText("3306");

        javax.swing.GroupLayout jSQLCredentialsPanelLayout = new javax.swing.GroupLayout(jSQLCredentialsPanel);
        jSQLCredentialsPanel.setLayout(jSQLCredentialsPanelLayout);
        jSQLCredentialsPanelLayout.setHorizontalGroup(
            jSQLCredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSQLCredentialsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSQLCredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jSQLCredentialsPanelLayout.createSequentialGroup()
                        .addComponent(jHostnameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jHostnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jSQLCredentialsPanelLayout.createSequentialGroup()
                        .addComponent(jPortLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jPortField)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSQLCredentialsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jHostnameLabel, jPortLabel});

        jSQLCredentialsPanelLayout.setVerticalGroup(
            jSQLCredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSQLCredentialsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSQLCredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jHostnameLabel)
                    .addComponent(jHostnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jSQLCredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPortLabel)
                    .addComponent(jPortField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jUserCredentialsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Credentials", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jUsernameLabel.setText("Username:");

        jPasswordLabel.setText("Password:");

        jUsernameField.setText("root");
        jUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsernameFieldActionPerformed(evt);
            }
        });

        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jUserCredentialsPanelLayout = new javax.swing.GroupLayout(jUserCredentialsPanel);
        jUserCredentialsPanel.setLayout(jUserCredentialsPanelLayout);
        jUserCredentialsPanelLayout.setHorizontalGroup(
            jUserCredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jUserCredentialsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jUserCredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jUserCredentialsPanelLayout.createSequentialGroup()
                        .addComponent(jUsernameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jUserCredentialsPanelLayout.createSequentialGroup()
                        .addComponent(jPasswordLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jUserCredentialsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordLabel, jUsernameLabel});

        jUserCredentialsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordField, jUsernameField});

        jUserCredentialsPanelLayout.setVerticalGroup(
            jUserCredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jUserCredentialsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jUserCredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsernameLabel)
                    .addComponent(jUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jUserCredentialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordLabel)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jUserCredentialsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSQLCredentialsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSQLCredentialsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUserCredentialsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public String getUsername(){
        return jUsernameField.getText().trim();
    }
    
    public String getPassword(){
        return jPasswordField.getText().trim();
    }
    
    public String getHostname(){
        return jHostnameField.getText().trim();
    }
    
    public String getPort(){
        return jPortField.getText().trim();
    }
    
    private void jUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUsernameFieldActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jHostnameField;
    private javax.swing.JLabel jHostnameLabel;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel jPasswordLabel;
    private javax.swing.JTextField jPortField;
    private javax.swing.JLabel jPortLabel;
    private javax.swing.JPanel jSQLCredentialsPanel;
    private javax.swing.JPanel jUserCredentialsPanel;
    private javax.swing.JTextField jUsernameField;
    private javax.swing.JLabel jUsernameLabel;
    // End of variables declaration//GEN-END:variables
}