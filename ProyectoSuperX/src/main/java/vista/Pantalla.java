/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import modelo.Heroe;
import modelo.Malvado;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
import com.mycompany.proyectosuperx.ProyectoX;

/**
 *
 * @author Administrador
 */
public class Pantalla extends javax.swing.JFrame {
    Malvado malvado = new Malvado(8,"Doctor Trauma", "USA","GOLPE");
    Heroe heroe = new Heroe(9,"El Elementalista", "PERU","PIÑA");

    /**
     * Creates new form pantalla
     */
    public Pantalla() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        miPanel = new javax.swing.JPanel();
        batalla_bt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto_resultado = new javax.swing.JTextArea();
        victoriasMalvado_txt = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        victoriasHeroe_txt = new javax.swing.JTextField();
        empates_txt = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        miPanel.setBackground(new java.awt.Color(51, 98, 46));

        batalla_bt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        batalla_bt.setText("Batalla!");
        batalla_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalla_btActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel1.setText("Proyecto Super X");

        texto_resultado.setBackground(new java.awt.Color(51, 98, 46));
        texto_resultado.setColumns(20);
        texto_resultado.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        texto_resultado.setRows(5);
        jScrollPane2.setViewportView(texto_resultado);

        victoriasMalvado_txt.setBackground(new java.awt.Color(51, 98, 46));
        victoriasMalvado_txt.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        victoriasMalvado_txt.setText("VICTORIAS MALVADO");

        jTextField1.setText("jTextField1");

        victoriasHeroe_txt.setBackground(new java.awt.Color(51, 98, 46));
        victoriasHeroe_txt.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        victoriasHeroe_txt.setText("VICTORIAS HEROE");

        empates_txt.setBackground(new java.awt.Color(51, 98, 46));
        empates_txt.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        empates_txt.setText("EMPATES");
        empates_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empates_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout miPanelLayout = new javax.swing.GroupLayout(miPanel);
        miPanel.setLayout(miPanelLayout);
        miPanelLayout.setHorizontalGroup(
            miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miPanelLayout.createSequentialGroup()
                .addGap(504, 504, 504)
                .addComponent(batalla_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(504, Short.MAX_VALUE))
            .addGroup(miPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(victoriasMalvado_txt)
                    .addComponent(victoriasHeroe_txt)
                    .addComponent(empates_txt))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(337, 337, 337))
            .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(miPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        miPanelLayout.setVerticalGroup(
            miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(miPanelLayout.createSequentialGroup()
                        .addComponent(victoriasMalvado_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(victoriasHeroe_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(empates_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(batalla_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(miPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(miPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(miPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batalla_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalla_btActionPerformed
        // TODO add your handling code here:
        malvado.setEnergia(100);
        heroe.setEnergia(100);
        System.out.println("Batalla: " + malvado.getNombre()+" ("+malvado.getEnergia()+" energia) " + " vs. " + heroe.getNombre()+" ("+heroe.getEnergia()+" energia) ");
        texto_resultado.setText("Batalla: " + malvado.getNombre()+" ("+malvado.getEnergia()+" energia) " + " vs. " + heroe.getNombre()+" ("+heroe.getEnergia()+" energia) \n\n");
        
        //System.out.println("A PELEARR!!");
        int poder_malvado;
        int poder_heroe;
        while (malvado.getEnergia() > 0 && heroe.getEnergia() > 0){
                poder_malvado = (int) Math.floor(Math.random() * (4 - 1 + 1)+(1));
                switch (poder_malvado){
                    case  1 :
                        heroe.debilitar(malvado.ataqueMalvado1 ());
                        break;
                    case 2 :
                        heroe.debilitar(malvado.ataqueMalvado2 ());
                        break;
                    case  3 :
                        heroe.debilitar(malvado.ataqueMalvado3 ());
                        break;
                    case  4 :
                        heroe.debilitar(malvado.ataqueMalvado4 ());
                        break;
                }
                poder_heroe=( int ) Math.floor(Math.random() * ( 4  - 1  + 1 ) + ( 1 ));
                 switch (poder_heroe) {
                    case  1 :
                        malvado.debilitar(heroe.ataqueHeroe1 ());
                        break;
                    case 2 :
                        malvado.debilitar(heroe.ataqueHeroe2 ());
                        break;
                    case  3 :
                        malvado.debilitar(heroe.ataqueHeroe3 ());
                        break;
                    case  4 :
                       malvado.debilitar(heroe.ataqueHeroe4 ());
                        break;
                 }
             System.out.println(malvado.toString());
             texto_resultado.append(malvado.toString()+ "\n");
             System.out.println(heroe.toString());
             texto_resultado.append(heroe.toString()+ "\n");
        }
        
        if ((malvado.getEnergia() < heroe.getEnergia()) && heroe.getEnergia() >= 0) {
            System.out.println("Doctor Trauma ha vencido a El Elementalista");
            texto_resultado.append("\n\nDoctor Trauma ha vencido a El Elementalista");
            victoriasHeroe_txt.setText(victoriasHeroe_txt.getText()+"*");
        } else if ((malvado.getEnergia() > heroe.getEnergia()) && malvado.getEnergia() >= 0){
            System.out.println("El Elementalista ha vencido a Doctor Trauma");
            texto_resultado.append("\n\nEl Elementalista ha vencido a Doctor Trauma");
            victoriasMalvado_txt.setText(victoriasMalvado_txt.getText()+"*");
        } else {
            System.out.println("Los dos han muerto...");
            texto_resultado.append("\n\nLos dos han muerto...");
            empates_txt.setText(empates_txt.getText()+"*");
        }
        
        
       
        try{
            FileInputStream archivo;
            archivo=new FileInputStream("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\ProyectoSuperX\\src\\main\\resources\\zapsplat_fantasy_superhero_fly_by_fast_whoosh_cape_010_48227.mp3");
            Player p=new Player(archivo);
            p.play();  
        }catch(Exception  e){
            System.out.println("ERROR");
        }
        
        
        
    }//GEN-LAST:event_batalla_btActionPerformed

    private void empates_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empates_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empates_txtActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalla_bt;
    private javax.swing.JTextField empates_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel miPanel;
    private javax.swing.JTextArea texto_resultado;
    private javax.swing.JTextField victoriasHeroe_txt;
    private javax.swing.JTextField victoriasMalvado_txt;
    // End of variables declaration//GEN-END:variables
}
