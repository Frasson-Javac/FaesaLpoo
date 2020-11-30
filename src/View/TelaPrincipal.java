
package View;

public class TelaPrincipal extends javax.swing.JFrame {

    GerenteView gerenteView = new GerenteView();

   
    public TelaPrincipal() {

        initComponents();
        this.setLocationRelativeTo(null);

        this.setExtendedState(MAXIMIZED_BOTH);
        gerenteView.setIcon(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_Usuario = new javax.swing.JMenu();
        Menu_Fornecedor = new javax.swing.JMenu();
        Menu_Escola = new javax.swing.JMenu();
        Menu_PedidoCompra = new javax.swing.JMenu();
        Menu_Produto = new javax.swing.JMenu();
        Menu_Cliente = new javax.swing.JMenu();
        Menu_Vendas = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("T-DRESS LTDA");
        setResizable(false);

        Desktop.setBackground(new java.awt.Color(124, 179, 227));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1072, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        Menu_Usuario.setText("Usuário");
        jMenuBar1.add(Menu_Usuario);

        Menu_Fornecedor.setText("Fornecedor");
        Menu_Fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_FornecedorMouseClicked(evt);
            }
        });
        jMenuBar1.add(Menu_Fornecedor);

        Menu_Escola.setText("Escola");
        Menu_Escola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_EscolaMouseClicked(evt);
            }
        });
        jMenuBar1.add(Menu_Escola);

        Menu_PedidoCompra.setText("Pedido de Compra");
        Menu_PedidoCompra.setBorderPainted(true);
        Menu_PedidoCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu_PedidoCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_PedidoCompraMouseClicked(evt);
            }
        });
        jMenuBar1.add(Menu_PedidoCompra);

        Menu_Produto.setText("Produto");
        jMenuBar1.add(Menu_Produto);

        Menu_Cliente.setText("Cliente");
        Menu_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_ClienteMouseClicked(evt);
            }
        });
        jMenuBar1.add(Menu_Cliente);

        Menu_Vendas.setText("Vendas");
        jMenuBar1.add(Menu_Vendas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void Menu_PedidoCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_PedidoCompraMouseClicked
        // TODO add your handling code here:
         View_PedidoCompra pedicompraTela=new View_PedidoCompra();
         pedicompraTela.updateUI();
        gerenteView.abrirTela(pedicompraTela);


    }//GEN-LAST:event_Menu_PedidoCompraMouseClicked


    private void Menu_FornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_FornecedorMouseClicked
        // TODO add your handling code here:

        TelaPrincipalFornecedor telaFornecedor = new TelaPrincipalFornecedor();
        telaFornecedor.updateUI();
        gerenteView.abrirTela(telaFornecedor);

    }//GEN-LAST:event_Menu_FornecedorMouseClicked

    private void Menu_EscolaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_EscolaMouseClicked
        // TODO add your handling code here:
        TelaPrincipalEscola telaescolaPrincipal=new TelaPrincipalEscola();
        telaescolaPrincipal.updateUI();
        gerenteView.abrirTela(telaescolaPrincipal);


    }//GEN-LAST:event_Menu_EscolaMouseClicked

    private void Menu_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_ClienteMouseClicked
       View_Cliente clientetela=new View_Cliente();
       clientetela.updateUI();
        gerenteView.abrirTela(clientetela);
    }//GEN-LAST:event_Menu_ClienteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenu Menu_Cliente;
    private javax.swing.JMenu Menu_Escola;
    private javax.swing.JMenu Menu_Fornecedor;
    private javax.swing.JMenu Menu_PedidoCompra;
    private javax.swing.JMenu Menu_Produto;
    private javax.swing.JMenu Menu_Usuario;
    private javax.swing.JMenu Menu_Vendas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables

}
