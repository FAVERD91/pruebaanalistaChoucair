package co.com.choucair.certification.pruebaanalista.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Complete {

    public static final Target PASSWORD = Target.the("Input you Password").locatedBy("//input[@id=\"password\"]");
    public static final Target CONFIRMPASSWORD = Target.the("Confirm You Password").locatedBy("//input[@id=\"confirmPassword\"]");

    public static final Target CHECK01 = Target.the("Check One").locatedBy("//span[@class=\"checkmark signup-consent__checkbox error\"]");
    public static final Target CHECK02 = Target.the("Check Two").locatedBy("//span[@ng-class=\"{error: userForm.privacySetting.&error.required}\"]");

    public static final Target BUTTONCOMPLETE = Target.the("Button Final").locatedBy("//a[@class=\"btn btn-blue\"]");

}
