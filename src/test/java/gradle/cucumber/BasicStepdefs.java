package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;

import java.awt.*;

public class BasicStepdefs {

    private VideoGame videogame;

    @When("^I run a failing step")
    public void I_run_a_failing_step() throws Throwable {
        new Production().doWork();
    }

    @Given("^an initial state of pacman$")
    public void an_initial_state_of_pacman() {
        videogame = new VideoGame();
        videogame.SetScore(0);
    }

    @When("^pacman eat a biscuit$")
    public void pacman_eat_a_biscuit() {
        videogame.EatBiscuit(true);
    }

    @Then("^will become fatter$")
    public void will_become_fatter() {
        Assertions.assertThat(videogame.GetScore()).isGreaterThan(videogame.Getpoints());
    }
}

