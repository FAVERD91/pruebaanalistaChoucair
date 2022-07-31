package co.com.choucair.certification.pruebaanalista.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {
    public static final Target COMPUTER = Target.the("Your Computer").locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]");
    public static final Target WINDOWS = Target.the("Windows").locatedBy("(//span[@class=\"iu-select-choices-row-inner\"])[2]");

    public static final Target VERSION = Target.the("Version").locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
    public static final Target XP = Target.the("XP").locatedBy("(//span[@class=\"iu-select-choices-row-inner\"])[2]");

    public static final Target LANGUAGE = Target.the("Language").locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");
    public static final Target ENGLISH = Target.the("XP").locatedBy("(//span[@class=\"iu-select-choices-row-inner\"])[11]");

    public static final Target BUTTONFINAL = Target.the("Button Final Step").locatedBy("//a[@aria-label=\"Next - final step\"]");

}
