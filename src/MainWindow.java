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
//        MainWindow mainWindow = new MainWindow();
        System.setProperty("webdriver.chrome.driver", "C:\\java_projects\\Pars1\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.kufar.by/l");


        WebElement button = webDriver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div[2]/button"));
        button.click();

        WebElement lable = webDriver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div/div[1]/div/div/input"));
        lable.sendKeys("Айфон 12");

//        lable.sendKeys(Keys.ENTER);


        Thread.sleep(2000);
        WebElement button1 = webDriver.findElement(By.className("styles_search_button__5p2AJ"));
        button1.click();
        Thread.sleep(11000);

        Document doc = Jsoup.connect(webDriver.getCurrentUrl()).get();
//        System.out.println(doc.select("h3"));
        Elements els1 = doc.getElementsByClass("styles_title__XS_QS");
        Elements els2 = doc.getElementsByClass("styles_price__tiO8k");


        for (Element el1: els1) {
            System.out.println(el1.text());
        }

        System.out.println();

        for (Element el2: els2) {
            System.out.println(el2.text());
        }







//        FileWriter fileWriter = new FileWriter("main.html");
//        fileWriter.write(String.valueOf(doc));
//        fileWriter.close();





//        System.setProperty("webdriver.chrome.driver", "C:\\java_projects\\Pars1\\Selenium\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        String baseUrl = "http://demo.guru99.com/test/newtours/";
//        String expectedTitle = "Welcome: Mercury Tours";
//        String actualTitle;
//
//        driver.get(baseUrl);
//
//        actualTitle = driver.getTitle();
//
//        if (actualTitle.equals(expectedTitle)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }


    }
}
