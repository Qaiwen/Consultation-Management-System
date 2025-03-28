/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Assignment;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashboard_label = new javax.swing.JLabel();
        Dashboard2_label = new javax.swing.JLabel();
        Combo_button = new javax.swing.JComboBox<>();
        Option_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Done_button = new javax.swing.JButton();
        Logout_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Dashboard_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Dashboard_label.setText("DASHBOARD");

        Dashboard2_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Dashboard2_label.setText("Please Select an Option at below");

        Combo_button.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Make Consultation", "View Appointments Made", "Make a Feedback", "Cancel or Reschedule a Consultation", "View available lecturer and slots" }));
        Combo_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_buttonActionPerformed(evt);
            }
        });

        Option_label.setText("Select one option :");

        Done_button.setText("Done");
        Done_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Done_buttonActionPerformed(evt);
            }
        });

        Logout_button.setText("Log Out");
        Logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Dashboard2_label)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logout_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Done_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(Dashboard_label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Option_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Combo_button, 0, 254, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Dashboard_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dashboard2_label)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Option_label)
                    .addComponent(Combo_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Done_button)
                    .addComponent(Logout_button))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Done_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Done_buttonActionPerformed
     String selectedValue = Combo_button.getSelectedItem().toString();

    // Check the value and redirect accordingly
    switch (selectedValue) {
        case "Make Consultation":
            // Redirect to Page1
            MakeConsultationUI MakeConsultationUIScreen = new MakeConsultationUI();
            MakeConsultationUIScreen.setVisible(true);
            break;

        case "View Appointments Made":
            // Redirect to Page2
            ViewAppointmentsMadeUI ViewAppointmentMadeUIScreen = new ViewAppointmentsMadeUI();
            ViewAppointmentMadeUIScreen.setVisible(true);
            break;

        case "Make a Feedback":
            // Redirect to Page3
            MakeFeedbackUI MakeFeedbackUIScreen = new MakeFeedbackUI();
            MakeFeedbackUIScreen.setVisible(true);
            break;
            
        case "Cancel or Reschedule a Consultation":
            // Redirect to Page3
            CanResConsultationUI CancelConsultationScreen = new CanResConsultationUI();
            CancelConsultationScreen.setVisible(true);
            break;
            
            
        case "View available lecturer and slots":
            ListofAvailableUI ListofAvailableScreen = new ListofAvailableUI();
            ListofAvailableScreen.setVisible(true);
            this.dispose();
            break;

        default:
            // Handle invalid or unrecognized values
            JOptionPane.showMessageDialog(this, "Please select a valid option.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
    }

    // Close the current Dashboard window
    this.dispose();
    }//GEN-LAST:event_Done_buttonActionPerformed

    private void Combo_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_buttonActionPerformed

    private void Logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_buttonActionPerformed
        LoginUI LoginUIScreen = new LoginUI();
        LoginUIScreen.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_Logout_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo_button;
    private javax.swing.JLabel Dashboard2_label;
    private javax.swing.JLabel Dashboard_label;
    private javax.swing.JButton Done_button;
    private javax.swing.JButton Logout_button;
    private javax.swing.JLabel Option_label;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
