package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalTime;

public class TestBase  {
    /*
           TestBase class'ini
           bu class'i parent edinecek class'larda
           driver olusturmamak ve ayarlari yeniden yapmamak icin kullaniyoruz
        */
    protected WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void teardown(){

        driver.close();
    }

    public void Sayac(){
        // x saniyelik bir sayac yapalim
        int x=5;
        LocalTime baslangic = LocalTime.now();
        int basSaniye = baslangic.getSecond();
        int saniyeKontrol = 123;
        int bitisSaniyesi = basSaniye+3>60 ? basSaniye+x-60 : basSaniye+x;
        while (bitisSaniyesi!= saniyeKontrol){
            saniyeKontrol = LocalTime.now().getSecond();
        }
        System.out.println("baslangic saniyesi : "+basSaniye);
        System.out.println("saniyeKontrol : "+saniyeKontrol);
    }
}