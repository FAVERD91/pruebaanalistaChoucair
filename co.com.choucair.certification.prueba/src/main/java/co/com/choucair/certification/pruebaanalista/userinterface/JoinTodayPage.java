package co.com.choucair.certification.pruebaanalista.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class JoinTodayPage extends PageObject {
    public static final Target JOINTODAY_BUTTON = Target.the("Buttons to enter to register new users").locatedBy("//a[@class=\"unauthenticated-nav-bar__sign-up\"]");
}
