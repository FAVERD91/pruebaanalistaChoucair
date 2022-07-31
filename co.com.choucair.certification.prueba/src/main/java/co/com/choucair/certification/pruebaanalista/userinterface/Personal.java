package co.com.choucair.certification.pruebaanalista.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Personal {
    public static final Target FIRSTNAME = Target.the("First Name").locatedBy("//[input@id=\"firstName\"]");
    public static final Target LASTNAME = Target.the("Last Name").locatedBy("//[input@id=\"lastName\"]");
    public static final Target EMAIL = Target.the("Email").locatedBy("//[input@id=\"email\"]");

    public static final Target MONTH = Target.the("Month Birthday").locatedBy("//select[@id=\"birthMonth\"]");
    public static final Target DAY = Target.the("Day Birthday").locatedBy("//select[@id=\"birthDay\"]");
    public static final Target YEAR = Target.the("Year Birthday").locatedBy("//select[@id=\"birthYear\"]");

    public static final Target NEXTLOCATION = Target.the("Button Next Step").locatedBy("//a[@class=\"btn btn-blue\"]");
}
