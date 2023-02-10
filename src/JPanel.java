import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanel extends javax.swing.JPanel {

    public JTextField textField1;
    public String JText;
    public BookTableModel bookTableModel;

    public void init(){

        setBackground(Color.BLACK);
        setSize(900, 600);
        setLayout(new FlowLayout());

        JButton button1 = new JButton("Искать");
        add(button1);
        button1.addActionListener(new Button1ActionListener());

        textField1 = new JTextField(40);
        add(textField1);

        bookTableModel = new BookTableModel();
        JTable table1 = new JTable(bookTableModel);
        JScrollPane jScrollPaneTable1 = new JScrollPane(table1);
        jScrollPaneTable1.setPreferredSize(new Dimension(850, 400));

        tableAdd();

        add(jScrollPaneTable1);
    }

    public class Button1ActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JText = textField1.getText();
        }
    }

    public void tableAdd(){
        for (int i = 0; i < 10; i++) {
            bookTableModel.addDate(new String[]{"1", "2", "3", "4", "5", "6"});
        }
    }
}
