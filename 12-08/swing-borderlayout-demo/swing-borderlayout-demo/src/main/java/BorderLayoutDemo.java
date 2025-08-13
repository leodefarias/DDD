import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {

    public BorderLayoutDemo() {
        super("BorderLayout Demo");
        initialize();
    }

    public void initialize() {
        AddComponents addComponents = new AddComponents();
        configureLookAndFeel();
        configureFrame();
        addComponents.addComponents();
    }

    public void configureLookAndFeel() {
        // Tenta ativar o tema Nimbus para um visual mais moderno (opcional)
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ignored) { /* Fallback para o L&F padrão */ }
    }

    public void configureFrame() {
        LoadIcon loadIcon = new LoadIcon();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(8, 8));
        setSize(420, 300);
        setLocationRelativeTo(null); // centraliza

        // Ícone da janela (opcional, se existir)
        ImageIcon appIcon = loadIcon.loadIcon("/icons/app.png", 32);
        if (appIcon != null) {
            setIconImage(appIcon.getImage());
        }
    }



}
