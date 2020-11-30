package View;

import Controller.FornecedorController;
import Modelo.Fornecedor;
import Persistencia.FornecedorDao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipalFornecedor extends javax.swing.JInternalFrame {

    public DefaultTableModel dtn;
    FornecedorController fornecedor = new FornecedorController();
    ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    FornecedorDao daoFornecedor = new FornecedorDao();
    GerenteView gerenteView = new GerenteView();

    public TelaPrincipalFornecedor() {

        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Cadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_EscolaTela = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        btn_fechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Fornecedor");
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

        btn_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cadastrar.png"))); // NOI18N
        btn_Cadastrar.setBorder(null);
        btn_Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CadastrarMouseClicked(evt);
            }
        });

        tb_EscolaTela.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tb_EscolaTela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNPJ", "Nome da Escola", "Endereço", "Telefone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_EscolaTela);

        txtPesquisa.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        btn_fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-fechar-janela-36.png"))); // NOI18N
        btn_fechar.setBorder(null);
        btn_fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fecharMouseClicked(evt);
            }
        });
        btn_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Pesquisa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Cadastrar)
                        .addGap(69, 69, 69)
                        .addComponent(btn_fechar)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(btn_fechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CadastrarMouseClicked
        view_Fornecedor telaFornecedor = new view_Fornecedor();
        telaFornecedor.AtualizaTabelaFrame(this);
        gerenteView.abrirTela(telaFornecedor);


    }//GEN-LAST:event_btn_CadastrarMouseClicked

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed

        try {

            // TODO add your handling code here:
            String nomePesquisa = txtPesquisa.getText();
            int quat = nomePesquisa.length();

            dtn = (DefaultTableModel) tb_EscolaTela.getModel();
            dtn.setRowCount(0);
            

            for (int i = 0; i < fornecedores.size(); i++) {

                if (fornecedores.get(i).getRazaoSocial().length() >= nomePesquisa.length()) {
                    String list = fornecedores.get(i).getRazaoSocial().substring(0, quat);

                    if (nomePesquisa.equalsIgnoreCase(list)) {

                        String dados[] = {
                            fornecedores.get(i).getCnpj(),
                            fornecedores.get(i).getRazaoSocial(),
                            fornecedores.get(i).getEndereco().getLogradouro() + " "
                            + fornecedores.get(i).getEndereco().getNumero() + " "
                            + fornecedores.get(i).getEndereco().getBairro() + " "
                            + fornecedores.get(i).getEndereco().getMunicipio() + "- "
                            + fornecedores.get(i).getEndereco().getUf() + " "
                            + fornecedores.get(i).getEndereco().getCep(),
                            fornecedores.get(i).getTelefone(),
                            fornecedores.get(i).getEmail()};

                        dtn.addRow(dados);

                    }
                   

                }

            }
        } catch (ArrayIndexOutOfBoundsException ex) {

        }
    }//GEN-LAST:event_txtPesquisaKeyPressed

    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharActionPerformed
        if (this.isVisible() == true) {
            this.dispose();
        }
    }//GEN-LAST:event_btn_fecharActionPerformed

    private void btn_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fecharMouseClicked
        // TODO add your handling code here:

        if (this.isVisible() == true) {
            this.dispose();
        }
    }//GEN-LAST:event_btn_fecharMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        cadastrarTabela();
    }//GEN-LAST:event_formInternalFrameOpened
    public void cadastrarTabela() {

        this.dtn = (DefaultTableModel) tb_EscolaTela.getModel();
        fornecedores = daoFornecedor.LerFornecedor();
        for (Fornecedor fornecedor : fornecedores) {
            String dados[] = {
                fornecedor.getCnpj(),
                fornecedor.getRazaoSocial(),
                fornecedor.getEndereco().getLogradouro() + " "
                + fornecedor.getEndereco().getNumero() + " "
                + fornecedor.getEndereco().getBairro() + " "
                + fornecedor.getEndereco().getMunicipio() + "- "
                + fornecedor.getEndereco().getUf() + " "
                + fornecedor.getEndereco().getCep(),
                fornecedor.getTelefone(),
                fornecedor.getEmail()};

            dtn.addRow(dados);

        }
    }
    
     public void AtualizaEmOutraFrame(){
          cadastrarTabela();
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cadastrar;
    private javax.swing.JButton btn_fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_EscolaTela;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
