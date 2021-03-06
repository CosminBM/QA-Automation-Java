import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        //Chrome Path
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");

        //Firefox Path
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");

        //Edge Path
        //System.setProperty("webdriver.edge.driver", "./src/main/resources//MicrosoftWebDriver.exe");

        ChromeDriver driverChrome = new ChromeDriver();

        driverChrome.get("http://automationpractice.com/index.php");
        driverChrome.manage().window().maximize();

        WebElement signInButtonChrome = driverChrome.findElement(By.className("login"));
        signInButtonChrome.click();

        WebElement inputEmail = driverChrome.findElement(By.id("email"));
        inputEmail.sendKeys("cosmincoco88@gmail.com");

        WebElement inputPassword = driverChrome.findElement(By.id("passwd"));
        inputPassword.sendKeys("test123");

        WebElement submitLogin = driverChrome.findElement(By.id("SubmitLogin"));
        submitLogin.click();

        driverChrome.quit();

        FirefoxDriver driverFirefox = new FirefoxDriver();

        driverFirefox.get("http://automationpractice.com/index.php");
        driverFirefox.manage().window().maximize();

        driverFirefox.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();

        driverFirefox.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("cosmincoco88@gmail.com");

        driverFirefox.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("test123");

        driverFirefox.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();

        driverFirefox.close();

        FirefoxDriver driverFirefox2 = new FirefoxDriver();

        driverFirefox2.get("https://addons-dev.allizom.org/en-US/firefox/");
        driverFirefox2.manage().window().maximize();

        driverFirefox2.findElement(By.xpath("/html/body/div[1]/div/header/div[2]/a[2]")).click();

        driverFirefox2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driverFirefox2.findElement(By.className("email")).sendKeys("jjoko433@yahoo.ro");

        driverFirefox2.findElement(By.id("password")).sendKeys("test1234");

        driverFirefox2.findElement(By.id("submit-btn")).click();

//        WebDriver driverEdge = new EdgeDriver();
//
//        driverEdge.get("http://automationpractice.com/index.php");
//        driverEdge.manage().window().maximize();
//
//        WebElement SignInButton = driverEdge.findElement(By.tagName("//*[@class='header_user_info']//*[title()='Log in to your customer account']"));
//        SignInButton.click();
    }
}
