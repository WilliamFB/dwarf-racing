package dwarfracing;

public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button = new javax.swing.JButton();
        Gandalf = new javax.swing.JLabel();
        Gloin = new javax.swing.JLabel();
        Nori = new javax.swing.JLabel();
        Oin = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button.setText("Iniciar Corrida");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 150, 30));

        Gandalf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dwarfracing/Gandalf.png"))); // NOI18N
        getContentPane().add(Gandalf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 120, 130));

        Gloin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dwarfracing/Gloin.png"))); // NOI18N
        getContentPane().add(Gloin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 120, 150));

        Nori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dwarfracing/Nori.png"))); // NOI18N
        getContentPane().add(Nori, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 120, 150));

        Oin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dwarfracing/Oin.png"))); // NOI18N
        getContentPane().add(Oin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 160));
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        
        DwarfThread dt1 = new DwarfThread();
        dt1.nome = "Gandalf";
        dt1.label = Gandalf;
        dt1.pista = this;
        Thread t1 = new Thread(dt1);
        
        DwarfThread dt2 = new DwarfThread();
        dt2.nome = "Gloin";
        dt2.label = Gloin;
        dt2.pista = this;
        Thread t2 = new Thread(dt2);
        
        DwarfThread dt3 = new DwarfThread();
        dt3.nome = "Nori";
        dt3.label = Nori;
        dt3.pista = this;
        Thread t3 = new Thread(dt3);
        
        DwarfThread dt4 = new DwarfThread();
        dt4.nome = "Ori";
        dt4.label = Oin;
        dt4.pista = this;
        Thread t4 = new Thread(dt4);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }//GEN-LAST:event_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gandalf;
    private javax.swing.JLabel Gloin;
    private javax.swing.JLabel Nori;
    private javax.swing.JLabel Oin;
    private javax.swing.JButton button;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
