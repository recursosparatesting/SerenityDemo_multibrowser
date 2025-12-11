package stepdefinitions;

import Atm.task.Logueo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import static Atm.Question.ValidarDashboard.verificarCargaDashboard;
import static Atm.Utils.RutasYConstantes.urlOrange;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MyStepdefs {

    @Managed
    WebDriver driver;

    @Before
    public void Inicio(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Admin");
    }

    @Given("acceso a la pagina de orangeHRMDemo")
    public void acceso_a_la_pagina_de_orange_hrm_demo() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        theActorInTheSpotlight().attemptsTo(Open.url(urlOrange));
    }

    @When("ingreso nombre de {string} y {string} y doy click en ingresar")
    public void ingreso_nombre_de_usuario_contrasena_y_doy_click_en_ingresar(String usuario,String contrasena) {
        theActorInTheSpotlight().attemptsTo(Logueo.go(usuario, contrasena));
    }


    @Then("valido que haya ingresado")
    public void valido_que_haya_ingresado() {
        theActorInTheSpotlight().should(seeThat(verificarCargaDashboard()));
    }
}
