/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Presentation;

import configurafacil.Business.Componente;
import configurafacil.Business.Cliente;
import configurafacil.Business.ConfiguraFacil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jessica
 */
public class Configuracao extends javax.swing.JDialog {
    private ConfiguraFacil configura;
    private EscolherCarro parent;
    private DadosCliente parent2;
    
    /**
     * Creates new form Configuracao
     */
    public Configuracao(javax.swing.JDialog parent, javax.swing.JDialog parent2, boolean modal, ConfiguraFacil c) {
       super(parent, modal);
       this.configura = c;
       initComponents();
       this.parent = (EscolherCarro) parent;
       this.parent2 = (DadosCliente) parent2;
       escrevePrecos();
    }
    
    public void setPacotes(){
            this.Sport.setEnabled(true);
            this.Comfort.setEnabled(true);
    }
    
    public void setVidro(){
            this.Vidro.setEnabled(true);
    }
    
    public void setParaChoques(){
            this.Parachoques.setEnabled(true);
    }
    
    public void setTeto(){
            this.Teto.setEnabled(true);
    }
    
    public void setLuz(){
            this.Luz.setEnabled(true);
    }
    
    public void escrevePrecos(){
        String c1 = Teto.getText(); 
        String c2 = Parachoques.getText(); 
        String c3 = Vidro.getText(); 
        String c4 = Luz.getText(); 
        
        Double p1 = configura.getComponente(c1).getPreco();
        Double p2 = configura.getComponente(c2).getPreco();
        Double p3 = configura.getComponente(c3).getPreco();
        Double p4 = configura.getComponente(c4).getPreco();
        tetoPreco.setText(Double.toString(p1));
        pchoquePreco.setText(Double.toString(p2));
        vidroPreco.setText(Double.toString(p3));
        luzesPreco.setText(Double.toString(p4));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Vidro = new javax.swing.JButton();
        Parachoques = new javax.swing.JButton();
        Teto = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Luz = new javax.swing.JButton();
        Comfort = new javax.swing.JButton();
        Sport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tetoPreco = new javax.swing.JTextField();
        pchoquePreco = new javax.swing.JTextField();
        vidroPreco = new javax.swing.JTextField();
        luzesPreco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Motor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pintura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Pneus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Jantes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Vidro.setText("Vidro Escurecido");
        Vidro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VidroActionPerformed(evt);
            }
        });

        Parachoques.setText("Pára-choques");
        Parachoques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParachoquesActionPerformed(evt);
            }
        });

        Teto.setText("Teto de abrir");
        Teto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TetoActionPerformed(evt);
            }
        });

        jButton8.setText("Estofos");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        Luz.setText("Pacotes de luz");
        Luz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuzActionPerformed(evt);
            }
        });

        Comfort.setText("Comfort");
        Comfort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComfortActionPerformed(evt);
            }
        });

        Sport.setText("Sport");
        Sport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SportActionPerformed(evt);
            }
        });

        jLabel1.setText("Obrigatórias");

        jLabel2.setText("Interior");

        jLabel3.setText("Exterior");

        jLabel4.setText("Pacotes");

        jButton12.setText("Consultar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Sugestão");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Guardar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/pneu.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/jantes.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/motor.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/pacoteLuz.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/tetoAbrir.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/estofos.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/paraChoques.png"))); // NOI18N

        tetoPreco.setEditable(false);

        pchoquePreco.setEditable(false);

        vidroPreco.setEditable(false);
        vidroPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vidroPrecoActionPerformed(evt);
            }
        });

        luzesPreco.setEditable(false);

        jLabel12.setText("Preço");

        jLabel13.setText("Preço");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/pintura.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/vidros.png"))); // NOI18N

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel10)))
                        .addContainerGap(584, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel15)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tetoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(231, 231, 231))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel14)
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel8)
                                        .addGap(105, 105, 105)
                                        .addComponent(jLabel5)
                                        .addGap(103, 103, 103)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Vidro, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(vidroPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(43, 43, 43))
                                                .addComponent(Comfort, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(176, 176, 176)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(11, 11, 11)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(Luz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(Parachoques, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(42, 42, 42)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(jLabel9)
                                                                    .addComponent(luzesPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Teto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(pchoquePreco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Sport, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(3, 3, 3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(71, 71, 71))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(36, 36, 36)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(vidroPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pchoquePreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tetoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Vidro)
                                    .addComponent(Parachoques)
                                    .addComponent(Teto))
                                .addGap(87, 87, 87))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luzesPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Luz)
                    .addComponent(jButton8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton14)
                            .addComponent(jButton5)
                            .addComponent(jButton12)
                            .addComponent(jButton13))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Comfort)
                            .addComponent(Sport))
                        .addGap(79, 79, 79))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Pintura(this,this.parent, true, configura).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new Estofos(this,this.parent, true, configura).setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void ComfortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComfortActionPerformed
        // TODO add your handling code here:
        new PacoteConfort(this,this.parent, true, configura).setVisible(true);
        if(this.parent.encomenda.getPacote()!=null) {
            this.Comfort.setEnabled(false);
            this.Sport.setEnabled(false);
        }
    }//GEN-LAST:event_ComfortActionPerformed

    private void SportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SportActionPerformed
        // TODO add your handling code here:
        new PacoteSport(this,this.parent, true, configura).setVisible(true);
        if(this.parent.encomenda.getPacote()!=null) {
            this.Comfort.setEnabled(false);
            this.Sport.setEnabled(false);
        }
    }//GEN-LAST:event_SportActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Motor(this,this.parent, true, configura).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Pneu(this,this.parent, true, configura).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Jantes(this,this.parent, true, configura).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void VidroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VidroActionPerformed
        // TODO add your handling code here:
        Componente comp = configura.getComponente("Vidro Escurecido");
        List<String> listInc =  this.parent.encomenda.verificaIncomp(comp,this.configura.getPacote(this.parent.encomenda.getPacote()));
        List<String> listObrig =  this.parent.encomenda.verificaObrig(comp);
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
            this.parent.encomenda.addToConfiguracao(comp.getNome());
            this.Vidro.setEnabled(false);
        }
    }//GEN-LAST:event_VidroActionPerformed

    private void ParachoquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParachoquesActionPerformed
        // TODO add your handling code here:
        Componente comp = configura.getComponente("Pára-choques");
        List<String> listInc =  this.parent.encomenda.verificaIncomp(comp,this.configura.getPacote(this.parent.encomenda.getPacote()));
        List<String> listObrig =  this.parent.encomenda.verificaObrig(comp);
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
            this.parent.encomenda.addToConfiguracao(comp.getNome());
            this.Parachoques.setEnabled(false);
        }
    }//GEN-LAST:event_ParachoquesActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        new SugestaoConfiguracao(this, parent, parent2, true, configura).setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        new ConfiguracaoFinal(this, parent, true, configura).setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void TetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TetoActionPerformed
        // TODO add your handling code here:
        Componente comp = configura.getComponente("Teto de abrir");
        List<String> listInc =  this.parent.encomenda.verificaIncomp(comp,this.configura.getPacote(this.parent.encomenda.getPacote()));
        List<String> listObrig =  this.parent.encomenda.verificaObrig(comp);
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
        else{
            this.parent.encomenda.addToConfiguracao(comp.getNome());
            this.Teto.setEnabled(false);
        }
    }//GEN-LAST:event_TetoActionPerformed

    private void LuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuzActionPerformed
        // TODO add your handling code here:
        Componente comp = configura.getComponente("Pacotes de luz");
        List<String> listInc =  this.parent.encomenda.verificaIncomp(comp,this.configura.getPacote(this.parent.encomenda.getPacote()));
        List<String> listObrig =  this.parent.encomenda.verificaObrig(comp);
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
        else{
            this.parent.encomenda.addToConfiguracao(comp.getNome());
            this.Luz.setEnabled(false);
        }
    }//GEN-LAST:event_LuzActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        if(this.configura.verificaComponentes(this.parent.encomenda)){
            Cliente c = configura.getStand().getClientes().get(this.parent2.getCliente());
            List<String> listObrig = new ArrayList<>();
            listObrig = this.configura.verificaObrigatoria(this.parent.encomenda);
            StringBuilder sb = new StringBuilder();
            for(String i : listObrig){
                sb.append(i);
                sb.append("; ");
            }
            if(listObrig.isEmpty()){
              //  configura.getStand().addEncomendaCliente(c,this.parent.encomenda);
                this.parent.encomenda.setCliente(c.getNif());
                this.configura.getGestaoE().addEncomenda(this.parent.encomenda);
                this.setVisible(false);
                new DadosCliente(this, true, configura).setVisible(true);
            }
            else javax.swing.JOptionPane.showMessageDialog(this, "Obrigatória: " + sb,"Componente obrigatória não selecionada", 0);
        }
        else javax.swing.JOptionPane.showMessageDialog(this, "Por favor escolha as componentes obrigatórias","Componente obrigatória não selecionada", 0);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void vidroPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vidroPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vidroPrecoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.parent.encomenda = null;
        this.setVisible(false);
        new DadosCliente(this, true, configura).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comfort;
    private javax.swing.JButton Luz;
    private javax.swing.JButton Parachoques;
    private javax.swing.JButton Sport;
    private javax.swing.JButton Teto;
    private javax.swing.JButton Vidro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField luzesPreco;
    private javax.swing.JTextField pchoquePreco;
    private javax.swing.JTextField tetoPreco;
    private javax.swing.JTextField vidroPreco;
    // End of variables declaration//GEN-END:variables
}
