/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.PedidoCompraController;
import Modelo.Escola;
import Modelo.Fornecedor;
import Modelo.Produto;
import Persistencia.EscolaDao;
import Persistencia.FornecedorDao;
import Persistencia.PedidoCompraDAO;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class View_PedidoCompra extends javax.swing.JInternalFrame {

    PedidoCompraController pedidoCompraController = new PedidoCompraController();
    DefaultTableModel dtm = new DefaultTableModel();
    Produto produto = new Produto();
    Fornecedor fornecedor = new Fornecedor();
    ArrayList<Fornecedor> fornecedores=new ArrayList<>();
    Escola escola = new Escola();

    private static View_PedidoCompra pedidocompra;

    public View_PedidoCompra() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        txt_Cod_Compra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_DataProduto = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_HoraProduto = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        box_Fornecedor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        spn_qtd = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        box_Tamanho = new javax.swing.JComboBox<>();
        txt_TipoUniforme = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tb_PedidoCompra = new javax.swing.JTable();
        btn_Salvar = new javax.swing.JButton();
        Radio_btn_Masculino = new javax.swing.JRadioButton();
        Radio_Btn_Feminino = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txt_ValorProduto = new javax.swing.JFormattedTextField();
        btn_Cancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        boxEscola = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txt_cod_prod = new javax.swing.JTextField();
        txt_ValorTotal = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setTitle("Pedido de Compra");
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

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Código da Compra");

        txt_Cod_Compra.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txt_Cod_Compra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cod_Compra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Data");

        txt_DataProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        txt_DataProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txt_DataProduto.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Hora");

        txt_HoraProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        txt_HoraProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txt_HoraProduto.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Fornecedor");

        box_Fornecedor.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        box_Fornecedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Quantidade");

        spn_qtd.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        spn_qtd.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9999, 1));
        spn_qtd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Tipo Uniforme");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Genero");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Tamanho");

        box_Tamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PP", "P", "M", "G", "GG", "EXG" }));

        txt_TipoUniforme.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txt_TipoUniforme.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        Tb_PedidoCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Tb_PedidoCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Uniforme", "Tamanho", "Modelo", "Quantidade", "valor", "Fornecedor"
            }
        ));
        jScrollPane1.setViewportView(Tb_PedidoCompra);

        btn_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-salvar-36.png"))); // NOI18N
        btn_Salvar.setBorder(null);
        btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvarActionPerformed(evt);
            }
        });

        Radio_btn_Masculino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Radio_btn_Masculino);
        Radio_btn_Masculino.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        Radio_btn_Masculino.setText("Masculino");

        Radio_Btn_Feminino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Radio_Btn_Feminino);
        Radio_Btn_Feminino.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        Radio_Btn_Feminino.setText("Feminino");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("Valor Unitário");

        txt_ValorProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-fechar-janela-36.png"))); // NOI18N
        btn_Cancelar.setBorder(null);
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Escola");

        boxEscola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        boxEscola.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("Código do Produto");

        txt_cod_prod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txt_cod_prod.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        txt_ValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("Valor Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_DataProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(txt_HoraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(txt_Cod_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1163, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_Cancelar)
                                .addGap(31, 31, 31)
                                .addComponent(btn_Salvar)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(484, 484, 484)
                                        .addComponent(jLabel7)
                                        .addGap(302, 302, 302)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(spn_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Radio_Btn_Feminino)
                                            .addComponent(jLabel8)
                                            .addComponent(Radio_btn_Masculino)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(boxEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addGap(248, 248, 248)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(box_Tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel9))
                                                        .addGap(35, 35, 35)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel10)
                                                            .addComponent(txt_ValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel13)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel12)
                                                    .addComponent(txt_cod_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(box_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel5))
                                                .addGap(28, 28, 28)
                                                .addComponent(txt_TipoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Cod_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_DataProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_HoraProduto))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(spn_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_TipoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Radio_btn_Masculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Radio_Btn_Feminino)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_cod_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_Tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salvar)
                    .addComponent(btn_Cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvarActionPerformed

        pedidoCompraController.casdastrarPedidoCompra(Integer.parseInt(txt_Cod_Compra.getText()),
                Integer.parseInt(txt_cod_prod.getText()), (int) spn_qtd.getValue(), txt_TipoUniforme.getText(), genero(),
                (String) box_Tamanho.getSelectedItem(), Double.parseDouble(txt_ValorProduto.getText().replace(",", ".")),
                txt_HoraProduto.getText(), txt_DataProduto.getText(),
                Float.parseFloat(txt_ValorTotal.getText().replace(",", ".")),
                (String) box_Fornecedor.getSelectedItem(),
                (String) boxEscola.getSelectedItem());

        setTabela();
        limparCampos();

    }//GEN-LAST:event_btn_SalvarActionPerformed
    private void limparCampos() {
        txt_Cod_Compra.setText("");

        txt_TipoUniforme.setText("");
        txt_ValorProduto.setText("");
        box_Fornecedor.setSelectedIndex(0);
        boxEscola.setSelectedIndex(0);
        box_Tamanho.setSelectedIndex(0);
        txt_cod_prod.setText("");

    }

    public void setTabela() {

        dtm = (DefaultTableModel) Tb_PedidoCompra.getModel();

        String dados[] = {txt_Cod_Compra.getText(), txt_TipoUniforme.getText(),
            box_Tamanho.getSelectedItem().toString(), spn_qtd.getValue().toString(),
            txt_ValorProduto.getText(), (String) box_Fornecedor.getSelectedItem()};
        dtm.addRow(dados);
    }


    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        // TODO add your handling code here:

        if (this.isVisible()) {
            dtm.setRowCount(0);
            txt_DataProduto.setText("");
            txt_HoraProduto.setText("");
            this.dispose();

        }

    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataformatada = sdf.format(new Date(System.currentTimeMillis()));
        txt_DataProduto.setText(dataformatada);
        txt_DataProduto.setEnabled(false);
        sdf.applyPattern("HH:mm:ss");
        String hora = sdf.format(new Date(System.currentTimeMillis()));
        txt_HoraProduto.setText(hora);
        txt_HoraProduto.setEnabled(false);
        txt_Cod_Compra.setEnabled(false);
     

        preecherListaComboBox();

        preencherListaEscolas();


    }//GEN-LAST:event_formInternalFrameOpened

    public void preecherListaComboBox() {

        FornecedorDao fornecedordao = new FornecedorDao();
        fornecedores = fornecedordao.LerFornecedor();

        for (Fornecedor fornecedor : fornecedores) {

            box_Fornecedor.addItem(fornecedor.getRazaoSocial());

        }

    }

    public void preencherListaEscolas() {

        try {
            EscolaDao esco = new EscolaDao();

            ArrayList<Escola> escolas = esco.LerEscola();

            escolas.forEach(escola -> {
                boxEscola.addItem(escola.getRazaoSocial());
            });
        } catch (IOException ex) {

        }

    }

    public String genero() {
        if (!Radio_Btn_Feminino.getText().equals("")) {
            return Radio_Btn_Feminino.getText();
        } else {
            return Radio_btn_Masculino.getText();
        }

    }
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Radio_Btn_Feminino;
    private javax.swing.JRadioButton Radio_btn_Masculino;
    private javax.swing.JTable Tb_PedidoCompra;
    private javax.swing.JComboBox<String> boxEscola;
    private javax.swing.JComboBox<String> box_Fornecedor;
    private javax.swing.JComboBox<String> box_Tamanho;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Salvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spn_qtd;
    private javax.swing.JTextField txt_Cod_Compra;
    private javax.swing.JFormattedTextField txt_DataProduto;
    private javax.swing.JFormattedTextField txt_HoraProduto;
    private javax.swing.JTextField txt_TipoUniforme;
    private javax.swing.JFormattedTextField txt_ValorProduto;
    private javax.swing.JFormattedTextField txt_ValorTotal;
    private javax.swing.JTextField txt_cod_prod;
    // End of variables declaration//GEN-END:variables
}
