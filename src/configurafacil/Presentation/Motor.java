/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Presentation;

import configurafacil.Business.Componente;
import configurafacil.Business.ConfiguraFacil;
import java.util.List;

/**
 *
 * @author utilizador
 */
public class Motor extends javax.swing.JDialog {
    private ConfiguraFacil configura;
    private String motor = "";
    private Configuracao parent;
    private EscolherCarro parent2;
    
    /**
     * Creates new form Motor
     */
    public Motor(javax.swing.JDialog parent, javax.swing.JDialog parent2, boolean modal, ConfiguraFacil c) {
       super(parent, modal);
       initComponents();
       this.configura = c;
       this.parent = (Configuracao) parent;
       this.parent2 = (EscolherCarro) parent2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Motor1 = new javax.swing.JRadioButton();
        Motor2 = new javax.swing.JRadioButton();
        Motor3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(Motor1);
        Motor1.setText("D4 190cv Man. 6 Vel.");
        Motor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Motor1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Motor2);
        Motor2.setText("D4 190cv Geatronic 8 Vel.");
        Motor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Motor2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Motor3);
        Motor3.setText("D5 235cv Geatronic 8 Vel.");
        Motor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Motor3ActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Motor");

        jTextField1.setEditable(false);
        jTextField1.setText("3500.00");

        jTextField2.setEditable(false);
        jTextField2.setText("3700.00");

        jTextField3.setEditable(false);
        jTextField3.setText("4200.00");

        jLabel2.setText("Preço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Motor3)
                    .addComponent(Motor2)
                    .addComponent(Motor1))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Motor1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Motor2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Motor3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Motor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Motor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Motor1ActionPerformed

    private void Motor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Motor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Motor2ActionPerformed

    private void Motor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Motor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Motor3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(Motor1.isSelected()) this.motor = "D4 190cv Man. 6 Vel.";
        if(Motor2.isSelected()) this.motor = "D4 190cv Geatronic 8 Vel.";
        if(Motor3.isSelected()) this.motor = "D5 235cv Geatronic 8 Vel.";
        if(this.motor.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor escolha um motor","Motor não selecionado", 0);
        }
        else {
            Componente comp = configura.getStand().getComponente(this.motor);
            Componente c = this.parent.verificaTipo(this.parent2.encomenda, "Motor");
            List<String> listInc = this.parent.verificaIncomp(comp, this.parent2.encomenda);
            List<String> listObrig = this.parent.verificaObrig(comp, this.parent2.encomenda);
            StringBuilder sbInc = new StringBuilder();
            StringBuilder sbObrig = new StringBuilder();
            for (String i : listObrig){
                sbObrig.append(i);
                sbObrig.append("; ");
            }
            if(!listObrig.isEmpty()){
                javax.swing.JOptionPane.showMessageDialog(this, "Obrigatórias: " + sbObrig , "Componentes obrigatórias",0);
            }
            for (String i : listInc){
                sbInc.append(i);
                sbInc.append("; ");
            }
            if(!listInc.isEmpty()){
                javax.swing.JOptionPane.showMessageDialog(this, "Incompatível com: " + sbInc , "Componentes incompatíveis",0);
            }
            else {
                if(c != null){
                    this.parent2.encomenda.removeDaConfiguracao(c);
                }
                this.parent2.encomenda.addToConfiguracao(comp);
            }
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Motor1;
    private javax.swing.JRadioButton Motor2;
    private javax.swing.JRadioButton Motor3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
