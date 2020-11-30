
package View;

import Controller.EscolaController;
import Modelo.Escola;
import Persistencia.EscolaDao;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class EscolaTela extends javax.swing.JInternalFrame {

    public DefaultTableModel dtn;
    EscolaController escolaController = new EscolaController();
     ArrayList<Escola> lista = new ArrayList<>();
     view_Escola cadastro=new view_Escola();

   
    GerenteView gerenteView = new GerenteView();

   

    public EscolaTela() {
        

        initComponents();
        gerenteView.abrirTela(cadastro);
        
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_EscolaTela = new javax.swing.JTable();
        btn_Cadastrar = new javax.swing.JButton();
        btn_fechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_Pesquisar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Escola");
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

        btn_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cadastrar.png"))); // NOI18N
        btn_Cadastrar.setBorder(null);
        btn_Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CadastrarMouseClicked(evt);
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

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Pesquisa");

        txt_Pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_PesquisarKeyPressed(evt);
            }
        });

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
                        .addComponent(txt_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(btn_Cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(btn_fechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Pesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CadastrarMouseClicked
        view_Escola escola = new view_Escola();
     //   escola.AtualizaTabelaFrame(this);
        
        


    }//GEN-LAST:event_btn_CadastrarMouseClicked

    private void btn_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fecharMouseClicked
        // TODO add your handling code here:

        if (this.isVisible() == true) {
            this.dispose();
        }
    }//GEN-LAST:event_btn_fecharMouseClicked

    private void txt_PesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PesquisarKeyPressed
        // TODO add your handling code here:
         try {
            

            String nomePesquisa = txt_Pesquisar.getText();
            int quat = nomePesquisa.length();

            dtn = (DefaultTableModel) tb_EscolaTela.getModel();
            dtn.setRowCount(0);

            for (int i = 0; i < lista.size(); i++) {

                if (lista.get(i).getRazaoSocial().length() >= nomePesquisa.length()) {
                    String list = lista.get(i).getRazaoSocial().substring(0, quat);

                    if ( nomePesquisa.equalsIgnoreCase(list)) {

                        String dados[] = {
                            lista.get(i).getCnpj(),
                            lista.get(i).getRazaoSocial(),
                            lista.get(i).getEndereco().getLogradouro() + " "
                            + lista.get(i).getEndereco().getNumero() + " "
                            + lista.get(i).getEndereco().getBairro() + " "
                            + lista.get(i).getEndereco().getMunicipio() + "- "
                            + lista.get(i).getEndereco().getUf() + " "
                            + lista.get(i).getEndereco().getCep(),
                            lista.get(i).getTelefone(),
                            lista.get(i).getEmail()};

                        dtn.addRow(dados);

                    }

                }

            }
        } catch (ArrayIndexOutOfBoundsException ex) {

        }
    }//GEN-LAST:event_txt_PesquisarKeyPressed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       //atualizaDados();
    }//GEN-LAST:event_formInternalFrameOpened
    public void atualizaDados() {

        try {
            this.dtn = (DefaultTableModel) tb_EscolaTela.getModel();
            EscolaDao esco = new EscolaDao();
            lista = esco.LerEscola();

            for (Escola escolas : lista) {
                String dados[] = {
                    escolas.getCnpj(),
                    escolas.getRazaoSocial(),
                    escolas.getEndereco().getLogradouro() + " "
                    + escolas.getEndereco().getNumero() + " "
                    + escolas.getEndereco().getBairro() + " "
                    + escolas.getEndereco().getMunicipio() + "- "
                    + escolas.getEndereco().getUf() + " "
                    + escolas.getEndereco().getCep(),
                    escolas.getTelefone(),
                    escolas.getEmail()};

                dtn.addRow(dados);

            }

        } catch (IOException ex) {

        }
        
        
        
    }
    
    public void AtualizaEmOutraFrame(){
          atualizaDados();
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cadastrar;
    private javax.swing.JButton btn_fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_EscolaTela;
    private javax.swing.JTextField txt_Pesquisar;
    // End of variables declaration//GEN-END:variables
}
