/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacemath;

import java.awt.Color;
import java.util.regex.Pattern;
import java.util.ArrayList;
import simulation.Sauvegarder;

/**
 *
 * @author romain.faure
 */
public class frm_loiUniformeDiscrete extends javax.swing.JFrame {

    ArrayList tbresultat = new ArrayList();
    /**
     * Creates new form Menu
     */
    public frm_loiUniformeDiscrete() {
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
        btn_sauvegarder = new javax.swing.JButton();
        btn_retour = new javax.swing.JButton();
        btn_calculer = new javax.swing.JButton();
        tf_argumentEnsemble = new javax.swing.JTextField();
        tf_argumentSimulation = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_nomLoi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_resultat = new javax.swing.JTextArea();
        Background_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(620, 540));

        jPanel1.setLayout(null);

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
        tf_argumentEnsemble.setText("ex:4/5/6/7/8/2/3");
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
        tf_argumentEnsemble.setBounds(100, 180, 420, 30);

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
        tf_argumentSimulation.setBounds(100, 240, 160, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("nombre de simulation");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 220, 280, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("ensemble séparer par un /");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 160, 280, 17);

        lb_nomLoi.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lb_nomLoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nomLoi.setText("Loi Uniforme Discrète");
        jPanel1.add(lb_nomLoi);
        lb_nomLoi.setBounds(0, -10, 620, 140);

        ta_resultat.setEditable(false);
        ta_resultat.setColumns(20);
        ta_resultat.setRows(5);
        jScrollPane2.setViewportView(ta_resultat);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 330, 580, 96);
        jPanel1.add(Background_image);
        Background_image.setBounds(-2, -6, 630, 520);

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

        int taille ; //taille du tableau
        int boucle = 0; // nombre de simulation 
        double [] tbdoub; //var ou l'on va recup les int de tbString dans le tableau
        String [] tbstring; //var ou l'on va split le resultat de l'ensemble dans le tableau
        Pattern separateur = Pattern.compile("/"); //pattern qui va separer l'ensemble par rapport à '/'
        
        
        tbstring = separateur.split(tf_argumentEnsemble.getText());
        taille = tbstring.length;
        tbdoub= new double[taille];
        
        /*verification ensemble valide*/
        try{
            for(int i =0; i<taille;i++){
                tbdoub[i] = Double.parseDouble(tbstring[i].trim());
            } 
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
            resultat = simulation.Simulation.loiUniformeDiscrete(tbdoub);
            tbresultat.add(resultat);
            ta_resultat.append(Double.toString(resultat)+"\n");
            
        }
        
                
        
        
    }//GEN-LAST:event_btn_calculerActionPerformed

    private void tf_argumentEnsembleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_argumentEnsembleActionPerformed

    }//GEN-LAST:event_tf_argumentEnsembleActionPerformed

    private void tf_argumentEnsembleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_argumentEnsembleFocusGained
        if(tf_argumentEnsemble.getText().trim().toLowerCase().equals("ex:4/5/6/7/8/2/3")){
            tf_argumentEnsemble.setText("");
            tf_argumentEnsemble.setForeground(Color.black);
        }
    }//GEN-LAST:event_tf_argumentEnsembleFocusGained

    private void tf_argumentEnsembleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_argumentEnsembleFocusLost
         if(tf_argumentEnsemble.getText().trim().equals("")|| tf_argumentEnsemble.getText().trim().toLowerCase().equals("ex:4/5/6/7/8/2/3")){
            tf_argumentEnsemble.setText("ex:4/5/6/7/8/2/3");
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
        Sauvegarder.sauvegarder(tbresultat, "hello.csv");
    }//GEN-LAST:event_btn_sauvegarderActionPerformed
    
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
            java.util.logging.Logger.getLogger(frm_loiUniformeDiscrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_loiUniformeDiscrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_loiUniformeDiscrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_loiUniformeDiscrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_loiUniformeDiscrete().setVisible(true);              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background_image;
    private javax.swing.JButton btn_calculer;
    private javax.swing.JButton btn_retour;
    private javax.swing.JButton btn_sauvegarder;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_nomLoi;
    private javax.swing.JTextArea ta_resultat;
    private javax.swing.JTextField tf_argumentEnsemble;
    private javax.swing.JTextField tf_argumentSimulation;
    // End of variables declaration//GEN-END:variables
}