package Atm.Question;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static Atm.PO.PaginaInicio.Dashboard;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ValidarDashboard implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return the(Dashboard).answeredBy(actor).isVisible();
    }

    public static Question<Boolean> verificarCargaDashboard(){
        return new ValidarDashboard();
    }

}
