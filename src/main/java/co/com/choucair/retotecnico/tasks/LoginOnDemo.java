package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.AutomationDemoSiteRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.retotecnico.userinterface.AutomationDemoSiteRegister.*;

public class LoginOnDemo implements Task {
    public static OpenUp useDemoPage;

    public static LoginOnDemo useDemoPage(){
        return Tasks.instrumented(LoginOnDemo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SKIP_BUTTON),
                Enter.theValue("Yaiseth").into(AutomationDemoSiteRegister.INPUT_NAME),
                Enter.theValue("Palacio").into(AutomationDemoSiteRegister.INPUT_LASTNAME),
                Enter.theValue("Panama Oeste").into(AutomationDemoSiteRegister.INPUT_ADDRESS),
                Enter.theValue("yaisethpalacio@gmail.com").into(AutomationDemoSiteRegister.INPUT_EMAIL),
                Enter.theValue("7739600726").into(AutomationDemoSiteRegister.INPUT_PHONE),
                Click.on(SELECT_GENDER),
                Click.on(DROP_SKIIL),
                Click.on(SKILL),
                Click.on(DROP_COUNTRY),
                Enter.theValue("United States of America").into(AutomationDemoSiteRegister.COUNTRY),
                Click.on(SELECTION),
                SelectFromOptions.byValue("1994").from(AutomationDemoSiteRegister.DROP_YEAR),
                Click.on(DROP_MONTH),
                Click.on(DROP_DAY),
                Click.on(INPUT_PASSWORD),
                Enter.theValue("Abcd1234").into(AutomationDemoSiteRegister.INPUT_PASSWORD),
                Enter.theValue("Abcd1234").into(AutomationDemoSiteRegister.CONFIRM_PASSWORD),
                Click.on(SUBMIT_BUTTON));
    }
}
