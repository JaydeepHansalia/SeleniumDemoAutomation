package Tests;

import Pages.LoginPage;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeTest
    public void setup() {
        /*System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.ibm.com/br-pt");
        driver.manage().window().maximize();*/
    }

    @Test
    public void verifyIncorrectLogin() throws InterruptedException, IOException {
        /*loginPage = new LoginPage(driver);
        loginPage.whenUsernameAndPasswordIncorrect("wilson@email.com", "wilson1234567890 ");*/
        FileInputStream fis = new FileInputStream("/Users/jhansalia/Downloads/Sample.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Sheet1");
        XSSFRow row = sheet.getRow(1);
        XSSFCell cell = row.getCell(1);
        String name = cell.getStringCellValue();
        System.out.println(name);
    }

    @AfterTest
    public void exitBrowser() {
        driver.quit();
    }


}
