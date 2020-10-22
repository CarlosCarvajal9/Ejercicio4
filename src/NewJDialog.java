
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class NewJDialog extends javax.swing.JDialog {
    int pos=0;
    boolean enojado=false;
    boolean rueda=false;
    boolean arrastre=false;
    
    /**
     * Creates new form NewJDialog
     */
    public NewJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/06normal.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jLabel1MouseWheelMoved(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hola mueve el cursor dobre mi...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
       switch(pos){
           case 0:
               jLabel1.setIcon(new ImageIcon(getClass().getResource("/02contento.png")));
               jLabel2.setText("jejeje, Gracias, ahora dame click");
               pos++;
               break;
            
       }
       if(rueda==true){
           jLabel1.setIcon(new ImageIcon(getClass().getResource("/06normal.png")));
           jLabel2.setText("Ya no hagas scroll sobre mi!!");
           rueda=false;
       }
       if(arrastre==true){
           jLabel1.setIcon(new ImageIcon(getClass().getResource("/06normal.png")));
           jLabel2.setText("No vuelvas a intentar arrastrarme");
           rueda=false;
       }
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        switch(pos){
            case 1:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/03enamorado.png")));
                jLabel2.setText("Aaaah que riko siento que me rascas... da 2 clicks mas");
                pos++;
                break;
            case 2:
                jLabel2.setText("Gracias, Falta otro click mas....");
                pos++;
                break;
            case 3:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/07ojito.png")));
                jLabel2.setText("Wow!! Gracias ya no tengo comezon, saca el cursos de mi cara....");
                pos++;
                break;
            case 4:
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/04enojado.png")));
                jLabel2.setText("Te pedi SACAR EL CURSOR DE MI CARA!, sacalo, yo te aviso");
                enojado=true;
                break;
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        switch(pos){
            case 4:
                if(enojado){
                    jLabel1.setIcon(new ImageIcon(getClass().getResource("/06normal.png")));
                    jLabel2.setText("Vez? ya vas entendiendo");
                    pos=0;
                    enojado=false;
                }else{
                    jLabel1.setIcon(new ImageIcon(getClass().getResource("/08sonrie.png")));
                    pos=0;
                    jLabel2.setText("Gracias por rascarme");
                }
        }
        if(rueda==true){
           jLabel1.setIcon(new ImageIcon(getClass().getResource("/06normal.png")));
           jLabel2.setText("Ya no hagas scroll sobre mi!!");
           rueda=false;
       }
       if(arrastre==true){
           jLabel1.setIcon(new ImageIcon(getClass().getResource("/06normal.png")));
           jLabel2.setText("No vuelvas a intentar arrastrarme");
           rueda=false;
       }
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        jLabel2.setText("Cuando me intentan arrastrar me mareo");
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/05muerto.png")));
        arrastre=true;
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jLabel1MouseWheelMoved
        jLabel2.setText("OLLE!!!!, NO hagas eso, me duele!");
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/09triste.png")));
        rueda=true;
    }//GEN-LAST:event_jLabel1MouseWheelMoved

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
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJDialog dialog = new NewJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
