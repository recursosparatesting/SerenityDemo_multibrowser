package Atm.PO;


import net.serenitybdd.screenplay.targets.Target;

public class PaginaLogin {
    public static final Target usuario = Target.the("usuario").locatedBy("//input[@name='username']");
    public static final Target Contrasena = Target.the("Contrasena").locatedBy("//input[@name='password']");
    public static final Target BtonLogin = Target.the("Boton Login").locatedBy("//button[@type='submit']");
    public static final Target forgotPass = Target.the("password olvidado").locatedBy("//p[contains(@class,'orangehrm-login-forgot')]");
}
