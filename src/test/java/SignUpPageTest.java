import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SignUpPageTest {

    private WebDriver driver;
    private SignUpPage signUpPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.artox-media.ru/");
        signUpPage = new SignUpPage(driver);
    }

    @Test
    public void TypeName(){
        SignUpPage newSignUpPage = signUpPage.typeName("test")
                .typeEmail("test@test.ru")
                .typeTel("111111111")
                .clickSubmitButton();
    }

    @After
    public void tearDown(){
//        driver.quit();
    }
}
