
package View;


import Modelo.Cliente;
import Persistencia.Cliente_Dao;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class View_Cliente extends javax.swing.JInternalFrame {

    public DefaultTableModel dtn;
    ArrayList<Cliente> lista = new ArrayList<>();
    Cliente_Dao cliente_dao = new Cliente_Dao();
 

    GerenteView gerenteView = new GerenteView();

    public View_Cliente() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Cadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Clientes = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        btn_fechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Clientes");
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

        tb_Clientes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tb_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome ", "Endereço", "Telefone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_Clientes);

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
        View__Cliente_ clienteTela=new View__Cliente_();
        clienteTela.updateUI();
        gerenteView.abrirTela(new View__Cliente_());


    }//GEN-LAST:event_btn_CadastrarMouseClicked

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        try {

            String nomePesquisa = txtPesquisa.getText().trim();
            int quat = nomePesquisa.length();

            dtn = (DefaultTableModel) tb_Clientes.getModel();
            dtn.setRowCount(0);

            for (int i = 0; i < lista.size(); i++) {

                if (lista.get(i).getNome().length() >= nomePesquisa.length()) {
                    String list = lista.get(i).getNome().substring(0, quat);

                    if (nomePesquisa.equalsIgnoreCase(list)) {

                        String dados[] = {
                            lista.get(i).getCpf(),
                            lista.get(i).getNome(),
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

        try {
            this.dtn = (DefaultTableModel) tb_Clientes.getModel();
            lista = cliente_dao.lerClientes();
         

            for (int i = 0; i < lista.size(); i++) {
                String dados[] = {
                            lista.get(i).getCpf(),
                            lista.get(i).getNome(),
                            lista.get(i).getEndereco().getLogradouro() + " "
                            + lista.get(i).getEndereco().getNumero() + " "
                            + lista.get(i).getEndereco().getBairro() + " "
                            + lista.get(i).getEndereco().getMunicipio() + "- "
                            + lista.get(i).getEndereco().getUf() + " "
                            + lista.get(i).getEndereco().getCep(),
                            lista.get(i).getTelefone(),
                            lista.get(i).getEmail()
                };

                dtn.addRow(dados);
            

            }
       

        } catch (IOException ex) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cadastrar;
    private javax.swing.JButton btn_fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_Clientes;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
