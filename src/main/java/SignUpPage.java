import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage (WebDriver driver){
        this.driver = driver;
    }

    By nameField = By.xpath("//*[@id=\"zakaz_compred\"]/input[6]");
    By telField = By.xpath("//*[@id=\"zakaz_compred\"]/input[8]");
    By emailField = By.xpath("//*[@id=\"zakaz_compred\"]/input[9]");
    By checkBox = By.id("261506110b51b1b313f02a2fe7df28dd");
    By submitButton = By.id("zakaz_compred_send");



}
