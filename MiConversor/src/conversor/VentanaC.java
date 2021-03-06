package conversor;


import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martinez
 */
public class VentanaC extends javax.swing.JFrame {

    /**
     * Creates new form VentanaC
     */
    public VentanaC() {
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

        cargarCent = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cargarPulg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        mensajeLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cargarCent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cargarCentFocusLost(evt);
            }
        });
        cargarCent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarCentActionPerformed(evt);
            }
        });
        cargarCent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cargarCentKeyPressed(evt);
            }
        });

        jLabel1.setText("Centímtros");

        cargarPulg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cargarPulgFocusLost(evt);
            }
        });
        cargarPulg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cargarPulgKeyPressed(evt);
            }
        });

        jLabel2.setText("Pulgadas");

        btnConvertir.setText("Convertir");
        btnConvertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConvertirMouseClicked(evt);
            }
        });
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });
        btnConvertir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConvertirKeyPressed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItemCerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCerrar.setText("Cerrar");
        jMenuItemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCerrar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cargarCent)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cargarPulg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mensajeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(btnConvertir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cargarCent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConvertir)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cargarPulg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(mensajeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        // TODO add your handling code here:
        //if (convertCent){
            convertir();
        //}
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void cargarCentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cargarCentFocusLost
        // TODO add your handling code here:
        convertCent = false;
    }//GEN-LAST:event_cargarCentFocusLost

    private void cargarPulgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cargarPulgFocusLost
        // TODO add your handling code here:
        convertCent = true;
    }//GEN-LAST:event_cargarPulgFocusLost

    private void cargarCentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargarCentKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            convertCent = false;
            convertir ();
        }
    }//GEN-LAST:event_cargarCentKeyPressed

    private void cargarPulgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargarPulgKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            convertCent = true;
            convertir();
        }
    }//GEN-LAST:event_cargarPulgKeyPressed

    private void btnConvertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertirMouseClicked
        // TODO add your handling code here:
        
        //if (!convertCent){
            convertir();
        //}
    }//GEN-LAST:event_btnConvertirMouseClicked

    private void jMenuItemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemCerrarActionPerformed

    private void btnConvertirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConvertirKeyPressed
        // TODO add your handling code here:
        convertir();
    }//GEN-LAST:event_btnConvertirKeyPressed

    private void cargarCentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarCentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargarCentActionPerformed

    private void convertir (){
    
        double i;           /**Si no inicializo, no compila**/
         if(!convertCent)
        {
            String c = cargarCent.getText();
            c = c.replace(",", ".");
            
            if (c.isEmpty()){
                JOptionPane.showMessageDialog(this, "Cadena Vacía", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }            
            //double i;
            try{
                
                 i = Double.valueOf(c);
            }   
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Formato erroneo: "+c,"ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            i /= pulgada;
            cargarPulg.setText(String.format("%.2f", i));        
        }
        else
        {
            String c = cargarPulg.getText();
            c = c.replace(",", ".");
            
            if (c.isEmpty()){
                JOptionPane.showMessageDialog(this, "Cadena vacía","ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }
            //double i; 
             try{       
                i= Double.valueOf(c);
             }
             catch(NumberFormatException e){
                 JOptionPane.showMessageDialog(this, "Formato Erroneo: "+c,"ERROR",JOptionPane.ERROR_MESSAGE);
                 return;
             }
             i=i*pulgada;
            cargarCent.setText(String.format("%.2f", i));
        }
    }
    private static final double pulgada = 2.54;
    
    
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
            java.util.logging.Logger.getLogger(VentanaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaC().setVisible(true);
            }
        });
    }

    //Bandera
    private boolean convertCent;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JTextField cargarCent;
    private javax.swing.JTextField cargarPulg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCerrar;
    private javax.swing.JLabel mensajeLabel;
    // End of variables declaration//GEN-END:variables
}
