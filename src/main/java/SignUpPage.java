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
    By submitButton = By.xpath("//*[@id=\"zakaz_compred_send\"]");
    By error = By.xpath("//*[@id=\"zakaz_compred\"]/p[2]");
    By callbackButton = By.className("popup-with-zoom-anim");
    By nameFieldHeader = By.xpath("//*[@id=\"header_zakaz_zvonka\"]/input[6]");
    By telFieldHeader = By.xpath("//*[@id=\"header_zakaz_zvonka\"]/input[8]");
    By checkBoxHeader = By.id("c17c851ef98311f3fb2856742cf54011");
    By submitButtonHeader = By.id("header_zakaz_zvonka_send");
    By nameFieldKonsult = By.xpath("//*[@id=\"poluchit_konsult\"]/input[6]");
    By telFieldKonsult = By.xpath("//*[@id=\"poluchit_konsult\"]/input[8]");
    By emailFieldKonsult = By.xpath("//*[@id=\"poluchit_konsult\"]/input[9]");
    By checkBoxKonsult = By.id("212970185");
    By submitButtonKonsult = By.id("poluchit_konsult_send");
    By nameFieldBottom = By.xpath("//*[@id=\"otpravka_zayavki\"]/div/div[1]/div[1]/input");
    By telFieldBottom = By.xpath("//*[@id=\"otpravka_zayavki\"]/div/div[1]/div[2]/input");
    By emailFieldBottom = By.xpath("//*[@id=\"otpravka_zayavki\"]/div/div[1]/div[3]/input");
    By checkBoxBottom = By.id("25be56aa945d2dbd2341a662b0d25f00");
    By submitButtonBottom = By.id("otpravka_zayavki_send");



    public SignUpPage fllInForm (String name, String tel, String email){
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(telField).sendKeys(tel);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(submitButton).click();
        return this;
    }

    public String getErrorText(){

        return driver.findElement(error).getText();
    }

}
