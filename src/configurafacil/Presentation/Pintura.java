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
 * @author jessica
 */
public class Pintura extends javax.swing.JDialog {
    private ConfiguraFacil configura;
    private Configuracao parent;
    private EscolherCarro parent2;
    private String pintura = "";
    /**
     * Creates new form Pintura
     */
    public Pintura(javax.swing.JDialog parent, javax.swing.JDialog parent2, boolean modal, ConfiguraFacil c) {
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
        Cor3 = new javax.swing.JRadioButton();
        Cor1 = new javax.swing.JRadioButton();
        Cor2 = new javax.swing.JRadioButton();
        Cor4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(Cor3);
        Cor3.setText("Branco");
        Cor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cor3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Cor1);
        Cor1.setText("Cinzento");
        Cor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cor1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Cor2);
        Cor2.setText("Preto");
        Cor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cor2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Cor4);
        Cor4.setText("Azul");
        Cor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cor4ActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pintura");

        jLabel2.setText("Preço");

        jTextField1.setEditable(false);
        jTextField1.setText("200.00");

        jTextField2.setEditable(false);
        jTextField2.setText("200.00");

        jTextField3.setEditable(false);
        jTextField3.setText("200.00");

        jTextField4.setEditable(false);
        jTextField4.setText("200.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1)
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cor1)
                            .addComponent(Cor2)
                            .addComponent(Cor3)
                            .addComponent(Cor4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cor1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cor2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cor3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cor4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cor1ActionPerformed

    private void Cor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cor2ActionPerformed

    private void Cor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cor3ActionPerformed

    private void Cor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cor4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(Cor1.isSelected()) this.pintura = "Cinzento";
        if(Cor2.isSelected()) this.pintura = "Preto";
        if(Cor3.isSelected()) this.pintura = "Branco";
        if(Cor4.isSelected()) this.pintura = "Azul";
        if(this.pintura.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor escolha a pintura","Pintura não selecionada", 0);
        }
        else {
            Componente comp = configura.getStand().getComponente(this.pintura);
            Componente c = this.parent.verificaTipo(this.parent2.encomenda, "Pintura");
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
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Cor1;
    private javax.swing.JRadioButton Cor2;
    private javax.swing.JRadioButton Cor3;
    private javax.swing.JRadioButton Cor4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
