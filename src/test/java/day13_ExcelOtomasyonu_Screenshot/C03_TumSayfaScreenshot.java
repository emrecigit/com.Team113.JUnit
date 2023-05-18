package day13_ExcelOtomasyonu_Screenshot;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.ReusableMethods;
import utilities.TestBase;


public class C03_TumSayfaScreenshot extends TestBase {
    @Test
    public void test01_FS()  {

        // amazon anasayfaya gidelim
        driver.get("https://www.amazon.com");
        // Nutella aratalim
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // Sonuclarin Nutella icerdigini test edelim
        WebElement websonucElementi = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        String actualSonucYazisi= websonucElementi.getText();
        String expectedIcerik = "Nutella";
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
        // rapora eklenmek uzere, tum sayfanin ekran goruntusunu alalim
        ReusableMethods.tumSayfaFotografCek(driver,ReusableMethods.methodNameGetir());

        // Method ismini getiren kodlar method olusturarak cozuldu
        // StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace(); // Method ismini getirir 2-1
        // String currentMethodName = stackTrace[1].getMethodName();                // Method ismini getirir 2-2

        // Method oncesi olusturuldu method ile gerek kalmadi
        //TakesScreenshot tss = (TakesScreenshot) driver;
        //File tumSayfaResim = new File("target/ekranResimleri/tumSayfaResim.png");
        //File geciciResim = tss.getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(geciciResim,tumSayfaResim);


    }


}