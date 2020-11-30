package View;


import java.awt.Toolkit;

import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class GerenteView extends JFrame {

    Toolkit kit = Toolkit.getDefaultToolkit();

    public void abrirTela(JInternalFrame componente) {

        componente.updateUI();
        int larguraDesk = TelaPrincipal.Desktop.getWidth();
        int alturaDesk = TelaPrincipal.Desktop.getHeight();
        int larguraComp = componente.getWidth();
        int alturaComp = componente.getHeight();

        if (componente.isVisible()) {

            componente.toFront();
            componente.requestFocus();

        } else {
            componente.setLocation(larguraDesk / 2 - larguraComp / 2, alturaDesk / 2 - alturaComp / 2);
            TelaPrincipal.Desktop.add(componente);
            componente.setVisible(true);
        }

    }

    public void setIcon(JFrame comp) {

        ImageIcon icone = new ImageIcon("src\\Img\\logo.jpeg");
        comp.setIconImage(icone.getImage());
    }

    public void aparencia() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException ex) {

        }
    }

}
