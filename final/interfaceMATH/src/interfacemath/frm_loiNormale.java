/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacemath;

import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author romain.faure
 */
public class frm_loiNormale extends javax.swing.JFrame {

    ArrayList<Double> tbresultat = new ArrayList<Double>();
     
    /**
     * Creates new form Menu
     */
    public frm_loiNormale() {
        initComponents();
        jPanel1.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_argumentVariance = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_argumentSimulation = new javax.swing.JTextField();
        btn_sauvegarder = new javax.swing.JButton();
        btn_retour = new javax.swing.JButton();
        btn_calculer = new javax.swing.JButton();
        tf_argumentEnsemble = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lb_nomLoi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_resultat = new javax.swing.JTextArea();
        Background_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("nombre de simulation");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 230, 280, 17);

        tf_argumentVariance.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tf_argumentVariance.setForeground(new java.awt.Color(153, 153, 153));
        tf_argumentVariance.setText("ex:0.51");
        tf_argumentVariance.setToolTipText("");
        tf_argumentVariance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_argumentVarianceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_argumentVarianceFocusLost(evt);
            }
        });
        tf_argumentVariance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_argumentVarianceActionPerformed(evt);
            }
        });
        jPanel1.add(tf_argumentVariance);
        tf_argumentVariance.setBounds(320, 170, 160, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("entrez la variance");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 150, 280, 17);

        tf_argumentSimulation.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tf_argumentSimulation.setText("1");
        tf_argumentSimulation.setToolTipText("");
        tf_argumentSimulation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_argumentSimulationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_argumentSimulationFocusLost(evt);
            }
        });
        tf_argumentSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_argumentSimulationActionPerformed(evt);
            }
        });
        jPanel1.add(tf_argumentSimulation);
        tf_argumentSimulation.setBounds(130, 250, 160, 30);

        btn_sauvegarder.setBackground(new java.awt.Color(0, 153, 0));
        btn_sauvegarder.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_sauvegarder.setText("Sauvegarder");
        btn_sauvegarder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sauvegarderActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sauvegarder);
        btn_sauvegarder.setBounds(480, 300, 110, 25);

        btn_retour.setBackground(new java.awt.Color(0, 153, 0));
        btn_retour.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_retour.setText("Retour");
        btn_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retourActionPerformed(evt);
            }
        });
        jPanel1.add(btn_retour);
        btn_retour.setBounds(30, 440, 220, 50);

        btn_calculer.setBackground(new java.awt.Color(0, 153, 0));
        btn_calculer.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_calculer.setText("Calculer");
        btn_calculer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_calculer);
        btn_calculer.setBounds(370, 440, 220, 50);

        tf_argumentEnsemble.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tf_argumentEnsemble.setForeground(new java.awt.Color(153, 153, 153));
        tf_argumentEnsemble.setText("ex:4.28");
        tf_argumentEnsemble.setToolTipText("");
        tf_argumentEnsemble.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_argumentEnsembleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_argumentEnsembleFocusLost(evt);
            }
        });
        tf_argumentEnsemble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_argumentEnsembleActionPerformed(evt);
            }
        });
        jPanel1.add(tf_argumentEnsemble);
        tf_argumentEnsemble.setBounds(130, 170, 160, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("entrez l'esperance");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 150, 280, 17);

        lb_nomLoi.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lb_nomLoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nomLoi.setText("Loi Normale");
        jPanel1.add(lb_nomLoi);
        lb_nomLoi.setBounds(0, -10, 620, 140);

        ta_resultat.setEditable(false);
        ta_resultat.setColumns(20);
        ta_resultat.setRows(5);
        jScrollPane2.setViewportView(ta_resultat);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 330, 580, 96);
        jPanel1.add(Background_image);
        Background_image.setBounds(0, 0, 630, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retourActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_retourActionPerformed

    private void btn_calculerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculerActionPerformed
        int boucle = 0; // nombre de simulation 
        double resultesperance = 0;
        double resultvariance = 0;
        
        try{
            resultesperance = Double.parseDouble(tf_argumentEnsemble.getText().trim());
            resultvariance = Double.parseDouble(tf_argumentVariance.getText().trim());
            simulation.Simulation.verifLoiNormale(resultesperance, resultvariance);
 
        } catch (NumberFormatException e) { 
               ta_resultat.append("erreur format\n");
               return;
        }catch(Exception e){
                ta_resultat.append(e.getMessage()+"\n");
                return;
        }
        
        /*verification nb simulation*/
        try{
            boucle = Integer.parseInt(tf_argumentSimulation.getText());
        } catch (NumberFormatException e) {
            ta_resultat.append("nombre de simulation invalide\n");
            return;
        }catch(Exception e){
            ta_resultat.append(e.getMessage()+"\n");
            return;
        }
        
        for(int i=0; i<boucle;i++){
            double resultat = 0;
            resultat=simulation.Simulation.loiNormale(resultesperance, resultvariance);
            tbresultat.add(resultat);
            ta_resultat.append(Double.toString(resultat)+"\n");
            
        }
                
        
        
    }//GEN-LAST:event_btn_calculerActionPerformed

    private void tf_argumentEnsembleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_argumentEnsembleActionPerformed

    }//GEN-LAST:event_tf_argumentEnsembleActionPerformed

    private void tf_argumentEnsembleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_argumentEnsembleFocusGained
        if(tf_argumentEnsemble.getText().trim().toLowerCase().equals("ex:4.28")){
            tf_argumentEnsemble.setText("");
            tf_argumentEnsemble.setForeground(Color.black);
        }
    }//GEN-LAST:event_tf_argumentEnsembleFocusGained

    private void tf_argumentEnsembleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_argumentEnsembleFocusLost
         if(tf_argumentEnsemble.getText().trim().equals("")|| tf_argumentEnsemble.getText().trim().toLowerCase().equals("ex:4.28")){
            tf_argumentEnsemble.setText("ex:4.28");
            tf_argumentEnsemble.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tf_argumentEnsembleFocusLost

    private void tf_argumentSimulationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_argumentSimulationFocusGained

    }//GEN-LAST:event_tf_argumentSimulationFocusGained

    private void tf_argumentSimulationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_argumentSimulationFocusLost

    }//GEN-LAST:event_tf_argumentSimulationFocusLost

    private void tf_argumentSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_argumentSimulationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_argumentSimulationActionPerformed

    private void btn_sauvegarderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sauvegarderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sauvegarderActionPerformed

    private void tf_argumentVarianceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_argumentVarianceFocusGained
        if(tf_argumentVariance.getText().trim().toLowerCase().equals("ex:0.51")){
            tf_argumentVariance.setText("");
            tf_argumentVariance.setForeground(Color.black);
        }
    }//GEN-LAST:event_tf_argumentVarianceFocusGained

    private void tf_argumentVarianceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_argumentVarianceFocusLost
        if(tf_argumentVariance.getText().trim().equals("")|| tf_argumentVariance.getText().trim().toLowerCase().equals("ex:0.51")){
            tf_argumentVariance.setText("ex:0.51");
            tf_argumentVariance.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tf_argumentVarianceFocusLost

    private void tf_argumentVarianceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_argumentVarianceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_argumentVarianceActionPerformed
    
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
            java.util.logging.Logger.getLogger(frm_loiNormale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_loiNormale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_loiNormale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_loiNormale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_loiNormale().setVisible(true);              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background_image;
    private javax.swing.JButton btn_calculer;
    private javax.swing.JButton btn_retour;
    private javax.swing.JButton btn_sauvegarder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_nomLoi;
    private javax.swing.JTextArea ta_resultat;
    private javax.swing.JTextField tf_argumentEnsemble;
    private javax.swing.JTextField tf_argumentSimulation;
    private javax.swing.JTextField tf_argumentVariance;
    // End of variables declaration//GEN-END:variables
}