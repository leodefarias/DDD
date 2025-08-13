import javax.swing.*;
import java.awt.*;

public class AddComponents extends JFrame {
    public void addComponents() {
        Button button = new Button();
        JButton btnNorte  = button.createButton(
                "NORTE", "/icons/north.png",
                "<html><b>Ir para o Norte</b><br/>Atalho: Alt+N</html>", 'N');

        JButton btnSul    = button.createButton(
                "SUL", "/icons/south.png",
                "<html><b>Ir para o Sul</b><br/>Atalho: Alt+S</html>", 'S');

        JButton btnOeste  = button.createButton(
                "OESTE", "/icons/west.png",
                "<html><b>Ir para o Oeste</b><br/>Atalho: Alt+O</html>", 'O');

        JButton btnLeste  = button.createButton(
                "LESTE", "/icons/east.png",
                "<html><b>Ir para o Leste</b><br/>Atalho: Alt+L</html>", 'L');

        JButton btnCentro = button.createButton(
                "CENTRO", "/icons/center.png",
                "<html><b>Ação do Centro</b><br/>Atalho: Alt+C</html>", 'C');

        btnNorte.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Clique em NORTE!", "Ação", JOptionPane.INFORMATION_MESSAGE));
        btnSul.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Clique em SUL!", "Ação", JOptionPane.INFORMATION_MESSAGE));
        btnOeste.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Clique em OESTE!", "Ação", JOptionPane.INFORMATION_MESSAGE));
        btnLeste.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Clique em LESTE!", "Ação", JOptionPane.INFORMATION_MESSAGE));
        btnCentro.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Clique em CENTRO!", "Ação", JOptionPane.INFORMATION_MESSAGE));

        add(btnNorte,  BorderLayout.NORTH);
        add(btnSul,    BorderLayout.SOUTH);
        add(btnOeste,  BorderLayout.WEST);
        add(btnLeste,  BorderLayout.EAST);
        add(btnCentro, BorderLayout.CENTER);
    }
}
