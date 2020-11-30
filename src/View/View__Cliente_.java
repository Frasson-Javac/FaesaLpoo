
package View;

import Controller.Cliente_Controller;
import Modelo.Endereco;
import java.io.IOException;
import javax.swing.JOptionPane;
import services.BuscarCep;


public class View__Cliente_ extends javax.swing.JInternalFrame {

    Cliente_Controller cliente_Controller = new Cliente_Controller();

    
    public View__Cliente_() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel25 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Fechar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        txt_Cpf = new javax.swing.JFormattedTextField();
        txt_telefone = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Municipio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Rua = new javax.swing.JTextField();
        txt_Bairro = new javax.swing.JTextField();
        txt_Complemento = new javax.swing.JTextField();
        txt_Estado = new javax.swing.JTextField();
        txt_cep = new javax.swing.JFormattedTextField();
        buscarCep = new javax.swing.JButton();
        txt_Nome = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_Cadastrar1 = new javax.swing.JButton();
        txt_numero = new javax.swing.JFormattedTextField();

        setTitle("Cadastro de Cliente");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel25.setText("Nome*");

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setText("Complemento");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("CPF*");

        btn_Fechar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-fechar-janela-36.png"))); // NOI18N
        btn_Fechar.setBorder(null);
        btn_Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FecharMouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel26.setText("Telefone*");

        jLabel27.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel27.setText("Email*");

        txt_Email.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_Email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        txt_Cpf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        try {
            txt_Cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txt_telefone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        try {
            txt_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_telefone.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("CEP*");

        txt_Municipio.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_Municipio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("Número*");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Rua");

        txt_Rua.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_Rua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        txt_Bairro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_Bairro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        txt_Complemento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_Complemento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        txt_Estado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_Estado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        txt_cep.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        try {
            txt_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cep.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        buscarCep.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        buscarCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-pesquisa-propriedade-36.png"))); // NOI18N
        buscarCep.setBorder(null);
        buscarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCepActionPerformed(evt);
            }
        });

        txt_Nome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_Nome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setText("Bairro");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setText("Município");

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setText("Estado");

        btn_Cadastrar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_Cadastrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-salvar-36.png"))); // NOI18N
        btn_Cadastrar1.setBorder(null);
        btn_Cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cadastrar1ActionPerformed(evt);
            }
        });

        txt_numero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        txt_numero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Fechar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Cadastrar1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(533, 533, 533)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txt_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(535, 535, 535)
                                .addComponent(jLabel26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(buscarCep))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(117, 117, 117)
                                .addComponent(jLabel14)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txt_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txt_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(360, 360, 360)
                                        .addComponent(jLabel9)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txt_Bairro))))
                        .addGap(74, 74, 74)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarCep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel12)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Fechar)
                    .addComponent(btn_Cadastrar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FecharMouseClicked
        // TODO add your handling code here:
        if (this.isVisible() == true) {
            this.dispose();
        }
    }//GEN-LAST:event_btn_FecharMouseClicked

    private void buscarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCepActionPerformed

        buscaEndereco();
    }//GEN-LAST:event_buscarCepActionPerformed

    private void btn_Cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cadastrar1ActionPerformed

        try {

            cliente_Controller.GravarCliente(txt_Nome.getText(), txt_Cpf.getText(),
                    txt_telefone.getText(), txt_Email.getText(), buscaEndereco());

            limparTela();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o fornecedor", "DEVELPERS SYSTEM", JOptionPane.ERROR_MESSAGE);
            limparTela();

        }

    }//GEN-LAST:event_btn_Cadastrar1ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        txt_Bairro.setEnabled(false);
        txt_Municipio.setEnabled(false);
        txt_Rua.setEnabled(false);
        txt_Estado.setEnabled(false);

    }//GEN-LAST:event_formInternalFrameOpened

    private Endereco buscaEndereco() {

        Endereco endereco = null;
        txt_cep.requestFocus();

        if (!txt_cep.getText().equals("")) {
            BuscarCep buscarCep = new BuscarCep();

            String[] vet = buscarCep.pesquisarCep(txt_cep.getText());

            txt_Rua.setText(vet[0].toUpperCase());
            txt_Bairro.setText(vet[1].toUpperCase());
            txt_Municipio.setText(vet[2].toUpperCase());
            txt_Estado.setText(vet[3].toUpperCase());

            endereco = new Endereco(txt_cep.getText(), txt_Rua.getText(), Integer.parseInt(txt_numero.getText()),
                    txt_Complemento.getText(), txt_Bairro.getText(),
                    txt_Municipio.getText(), txt_Estado.getText());

            return endereco;

        }

        return endereco;
    }

    public void limparTela() {

        txt_Nome.setText("");
        txt_Cpf.setText("");
        txt_Email.setText("");
        txt_telefone.setText("");
        txt_Bairro.setText("");
        txt_Rua.setText("");
        txt_cep.setText("");
        txt_Complemento.setText("");
        txt_numero.setText("");
        txt_Estado.setText("");
        txt_Municipio.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cadastrar1;
    private javax.swing.JButton btn_Fechar;
    private javax.swing.JButton buscarCep;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_Bairro;
    private javax.swing.JTextField txt_Complemento;
    private javax.swing.JFormattedTextField txt_Cpf;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Estado;
    private javax.swing.JTextField txt_Municipio;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Rua;
    private javax.swing.JFormattedTextField txt_cep;
    private javax.swing.JFormattedTextField txt_numero;
    private javax.swing.JFormattedTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}
