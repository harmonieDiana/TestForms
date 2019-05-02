import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;

public class FormsTest {
    MainPage mainPage;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        Configuration.timeout = 10000;
        Configuration.startMaximized = true;
        baseUrl = "https://www.artox-media.ru";
        browser = "chrome";
    }

    @Test
    public void EmptyRightForm(){
        mainPage = new MainPage();
        mainPage.open();
        mainPage.rightForm("", "", "");
        $(By.className("red")).shouldHave(Condition.text("Поле Контактный телефон не заполнено"));
    }

    @Test
    public void fillInRightForm(){

    }
}
