package Atm.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static Atm.PO.PaginaLogin.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Logueo implements Task {

    private static String usu;
    private static String contras;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(usuario, isVisible()).forNoMoreThan(60).seconds().then(SendKeys.of(usu).into(usuario)),
                WaitUntil.the(Contrasena, isVisible()).forNoMoreThan(60).seconds().then(SendKeys.of(contras).into(Contrasena)),
                Check.whether(WebElementQuestion.stateOf(BtonLogin), WebElementStateMatchers.isVisible()).andIfSo(Click.on(BtonLogin)).otherwise(Click.on(forgotPass))
        );
        System.out.println(" se realiza login ");

    }

    public static Logueo go(String Usuario, String Pass){
        usu=Usuario;
        contras=Pass;
        return instrumented(Logueo.class);
    }
}
