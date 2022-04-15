package steps_definition;

import config.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.Login;
import ui.HomePage;

public class ExampleSteps extends Config
{
    private Actor actor = Actor.named("Lando");
    private HomePage homePage = new HomePage();

    @Given("the user opened Facebook")
    public void openWebPage()
    {
        System.out.println("Web page opened");
        actor.can(BrowseTheWeb.with(setUp()));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @Then("user login {string}, {string}")
    public void login(String email, String password)
    {
        System.out.println("Email: " + email + ", " + "Password: " + password);

        actor.wasAbleTo(
                Login.loginWithCredentials(email, password)
        );
    }

    @Then("Validate page title is {string}")
    public void validatePageTitleIs(String string) {
        System.out.println("Running");
    }
}
