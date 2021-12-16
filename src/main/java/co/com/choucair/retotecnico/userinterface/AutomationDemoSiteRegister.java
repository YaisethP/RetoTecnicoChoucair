package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationDemoSiteRegister extends PageObject {
    public static final Target SKIP_BUTTON = Target.the("button skip login section")
            .located(By.cssSelector("button#btn2"));
    public static final Target INPUT_NAME = Target.the("Insert Name")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
    public static final Target INPUT_LASTNAME = Target.the("Insert LastName")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
    public static final Target INPUT_ADDRESS = Target.the("Insert your Address")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
    public static final Target INPUT_EMAIL = Target.the("write email")
            .located(By.xpath("//*[@id=\"eid\"]/input"));
    public static final Target INPUT_PHONE = Target.the("Insert the phone number")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
    public static final Target SELECT_GENDER = Target.the("Select gender")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
    public static final Target DROP_LANGUAGE = Target.the("Click to language drop")
            .located(By.xpath("//*[@id=\"msdd\"]"));
    public static final Target LANGUAGE = Target.the("Select language")
            .located(By.xpath("//*[@id=\"msdd\"]/div"));
    public static final Target DROP_SKIIL = Target.the("Click to skill drop")
            .located(By.xpath("//*[@id=\"Skills\"]"));
    public static final Target SKILL = Target.the("Select Skill")
            .located(By.xpath("//*[@id=\"Skills\"]/option[61]"));
    public static final Target DROP_COUNTRY = Target.the("Click to Country drop")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
    public static final Target COUNTRY = Target.the("Select Country")
            .located(By.xpath("/html/body/span/span/span[1]/input"));
    public static final Target SELECTION = Target.the("Select")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
    public static final Target DROP_YEAR = Target.the("Select his year of birth")
            .located(By.xpath("//*[@id=\"yearbox\"]"));
    public static final Target DROP_MONTH = Target.the("Select drop Month")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[8]"));
    public static final Target DROP_DAY = Target.the("Select his birthday day")
            .located(By.xpath("//*[@id=\"daybox\"]/option[32]"));
    public static final Target INPUT_PASSWORD = Target.the("Write his password")
            .located(By.xpath("//*[@id=\"firstpassword\"]"));
    public static final Target CONFIRM_PASSWORD = Target.the("Write his password again")
            .located(By.id("secondpassword"));
    public static final String VERIFY_STEP = String.valueOf(Target.the("Verify step")
            .located(By.xpath("//*[@id=\"submitbtn\"]")));
    public static final Target SUBMIT_BUTTON = Target.the("button submit register")
            .located(By.cssSelector("button#submitbtn.btn.btn-primary"));

}
