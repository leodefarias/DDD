import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.event.*; // Importe reduzido

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulário de Contato");
        frame.setSize(600, 200); // Resolução alterada para encaixar melhor
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.WHITE); // Mudança da cor de fundo

        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField(20);

        JLabel comentarioLabel = new JLabel("Comentário:");
        JTextArea comentarioArea = new JTextArea(5, 20);
        // Borda do comentario
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        comentarioArea.setBorder(border);

        JLabel interesseAWS = new JLabel("Tem interesse em AWS?");
        JRadioButton radioSim = new JRadioButton("Sim");
        JRadioButton radioNao = new JRadioButton("Não");
        radioSim.setBackground(Color.WHITE);
        radioNao.setBackground(Color.WHITE);
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioSim);
        grupo.add(radioNao);

        JButton enviarButton = new JButton("Enviar");

        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(comentarioLabel);
        panel.add(comentarioArea);
        panel.add(interesseAWS);
        panel.add(radioSim);
        panel.add(radioNao);
        panel.add(enviarButton);

        enviarButton.addActionListener(e -> {
            String nome = nomeField.getText();
            String comentario = comentarioArea.getText();
            System.out.println("Nome: " + nome + ", Comentário: " + comentario);
        });
    // Por motivos estéticos removi a alteração do botão
//        enviarButton.addMouseListener(new MouseAdapter() {
//            public void mouseEntered(MouseEvent e) {
//                enviarButton.setText("Clique para Enviar");
//            }
//            public void mouseExited(MouseEvent e) {
//                enviarButton.setText("Enviar");
//            }
//        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
