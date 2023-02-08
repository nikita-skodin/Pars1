import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanel extends javax.swing.JPanel {

    public String text;
    JPanel(){
        setBackground(Color.BLACK);
        setSize(900, 600);
        setLayout(new FlowLayout());

        JButton button1 = new JButton("Искать");
        add(button1);
        button1.addActionListener(new Button1ActionListener());

        JTextField textField1 = new JTextField(40);
        add(textField1);
        textField1.addActionListener(new textField1ActionListener());
    }

    public void x (){
        this.textField1.getText();
    }



    class Button1ActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(text);
        }
    }

    class textField1ActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
