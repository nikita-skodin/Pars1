import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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

    public static void main(String[] args) throws InterruptedException, IOException {
        Parsing parsing = new Parsing();
        parsing.pars();
        MainWindow mainWindow = new MainWindow();

    }
}
