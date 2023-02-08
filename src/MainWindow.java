import javax.swing.*;

public class MainWindow extends JFrame {

    MainWindow(){

        setTitle("Parsing");
        setSize(900,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        add(new JPanel());
        setVisible(true);

    }

    public static void main(String[] args) {

        MainWindow mainWindow = new MainWindow();
    }
}
