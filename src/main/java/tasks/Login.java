package tasks;

import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task
{
    private String email, password;

    public Login(String email, String password)
    {
        this.email = email;
        this.password = password;
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Enter.theValue(email, password).into()
        );
    }

    public static Login loginWithCredentials(String email, String password)
    {
        return instrumented(Login.class, email, password);
    }
}
