import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    MainWindow(){

        setTitle("Parsing");
        setSize(900,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.BLACK);
        setResizable(false);
        setLocationRelativeTo(null);
        JPanel JPanel;
        add(JPanel  =  new JPanel());
        JPanel.init();
        setVisible(true);

    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
    }
}
