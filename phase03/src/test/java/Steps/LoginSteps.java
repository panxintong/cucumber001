package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSteps {
    WebDriver webDriver =null;

    @Given("^I open login page$")
    public void iOpenLoginPage() throws Throwable {
        System.setProperty("webdriver.chrome.driver","tools/chrome/chromedriver.exe");
        webDriver= new ChromeDriver();
        webDriver.navigate().to("https://nss.navercorp.com/loginRequest?serviceId=CONNECT&targetUrl=https%3A%2F%2Fconnect.navercorp.com%2F");
    }

    @When("^I enter correct userName as \"([^\"]*)\"$")
    public void iEnterCorrectUserName(String userName) throws Throwable {
        webDriver.findElement(By.xpath("//*[@id=\"user_id\"]")).sendKeys(userName);
    }

    @When("^I enter correct password as \"([^\"]*)\"$")
    public void iEnterCorrectPasswordAs(String password) throws Throwable {
        webDriver.findElement(By.xpath("//*[@id=\"user_pw\"]")).sendKeys(password);
    }

    @When("^I click login$")
    public void iClickLoginBtn() throws Throwable{
        webDriver.findElement(By.xpath("//*[@id=\"loginBtnAct\"]")).click();
    }

    @Then("^I go to home page$")
    public void iGoToHomePage()throws Throwable {
        String actualTxt = webDriver.findElement(By.xpath("//*[@id=\"id_mainMenu_646\"]/a")).getText();
        String expectedTxt = "I like service";
        Assert.assertEquals("check login succeed or not", actualTxt, expectedTxt);
        webDriver.quit();
    }

    @When("^I　enter invalid userName as\"([^\"]*)\"$")
    public void iEnterInvalidUserNameAs(String userName) throws Throwable {
        webDriver.findElement(By.xpath("//*[@id=\"user_id\"]")).sendKeys(userName);
    }

    @When("^I　enter invalid password as \"([^\"]*)\"$")
    public void iEnterInvalidPasswordAs(String password) throws Throwable {
        webDriver.findElement(By.xpath("//*[@id=\"user_pw\"]")).sendKeys(password);
    }

    @When("^I click loginButton$")
    public void iClickLoginButton() throws Throwable {
        webDriver.findElement(By.id("loginBtnAct")).click();
    }

    @Then("^I see \"([^\"]*)\"$")
    public void iSee(String errorMessage) throws Throwable {
        String actualTxt = webDriver.findElement(By.xpath("//*[@id=\"thisform\"]/div[2]/div/fieldset/p[1]")).getText();
        Assert.assertEquals("Check errorMessage",actualTxt,errorMessage);
        webDriver.quit();
    }


}
