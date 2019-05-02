import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    By NameField = By.xpath("//*[@id=\"comp_7e933bd22693dbdd47b10c3780b14858\"]/section/div/div/form/div/div[1]/div[1]/input");
    By TelField = By.xpath("//*[@id=\"comp_7e933bd22693dbdd47b10c3780b14858\"]/section/div/div/form/div/div[1]/div[2]/input");
    By EmailField = By.xpath("//*[@id=\"comp_7e933bd22693dbdd47b10c3780b14858\"]/section/div/div/form/div/div[1]/div[3]/input");
    By SubmitButton = By.className("butt");

    public MainPage open(){
        Selenide.open("/digital-contacts.html");
        return this;
    }

    public MainPage rightForm (String name, String tel, String email){
        $(NameField).setValue(name);
        $(TelField).setValue(tel);
        $(EmailField).setValue(email);
        $(SubmitButton).click();
        return this;
    }
}
