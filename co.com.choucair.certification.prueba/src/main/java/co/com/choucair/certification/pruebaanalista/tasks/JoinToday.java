package co.com.choucair.certification.pruebaanalista.tasks;

import co.com.choucair.certification.pruebaanalista.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.SendKeys;

public class JoinToday implements Task {
    public static Performable onthePage() {
        return (Performable) Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JoinTodayPage.JOINTODAY_BUTTON),
                SendKeys.of("Faver").into(Personal.FIRSTNAME),
                SendKeys.of("Delgado").into(Personal.LASTNAME),
                SendKeys.of("faverdelgado91@gmail.com").into(Personal.EMAIL),
                SendKeys.of("February").into(Personal.MONTH),
                SendKeys.of("10").into(Personal.DAY),
                SendKeys.of("1991").into(Personal.YEAR),
                Click.on(Personal.NEXTLOCATION),
                Click.on(Location.BUTTONLOCATION),
                Click.on(Devices.COMPUTER),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSION),
                Click.on(Devices.XP),
                Click.on(Devices.LANGUAGE),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.BUTTONFINAL),
                SendKeys.of("Qwerty123*").into(Complete.PASSWORD),
                SendKeys.of("Qwerty123*").into(Complete.CONFIRMPASSWORD),
                Click.on(Complete.CHECK01),
                Click.on(Complete.CHECK02),
                Click.on(Complete.BUTTONCOMPLETE));

    }
}
