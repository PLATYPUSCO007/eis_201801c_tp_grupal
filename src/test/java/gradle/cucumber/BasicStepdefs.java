package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;

import javax.swing.*;
import java.awt.*;

public class BasicStepdefs {

    Pacman pacman;
    Videogame biscuit;
    Videogame fruit;

    @When("^I run a failing step")
    public void I_run_a_failing_step() throws Throwable {
        new Production().doWork();
    }

    @Given("^an initial state of pacman$")
    public void an_initial_state_of_pacman() {
        pacman = new Pacman();
        pacman.SetPoints(5);
    }

    @When("^pacman eat a biscuit$")
    public void pacman_eat_a_biscuit() {
        biscuit = new Videogame();
       pacman.SetEatBonus("biscuit");
    }

    @When("^pacman eat a fruit$")
    public void pacman_eat_a_fruit() {
        fruit = new Videogame();
        pacman.SetEatBonus("fruit");
    }

    @Then("^will become fatter$")
    public void will_become_fatter() {
        Assertions.assertThat(pacman.GetScore()).isGreaterThan(pacman.GetPoints());
    }
}

