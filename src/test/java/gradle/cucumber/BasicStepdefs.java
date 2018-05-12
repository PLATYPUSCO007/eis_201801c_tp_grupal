package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.AssertDelegateTarget;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.matchers.JUnitMatchers;

import javax.swing.*;
import java.awt.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.not;
import static org.hamcrest.core.Is.is;

public class BasicStepdefs {

    Pacman pacman;
    Phantom phantom;
    Videogame biscuit;
    Videogame fruit;

    @When("^I run a failing step")
    public void I_run_a_failing_step() throws Throwable {
        new Production().doWork();
    }


    //Test #1

    @Given("^an initial state of pacman$")
    public void an_initial_state_of_pacman() {
        pacman = new Pacman();
    }


    @When("^pacman eat a biscuit$")
    public void pacman_eat_a_biscuit() {
        biscuit = new Videogame();
        pacman.SetEat(biscuit);
    }

    @Then("^will become fatter$")
    public void will_become_fatter() {
        assertThat(pacman.GetPoints()).isEqualTo(1);
    }



    //Test #2

    @When("^pacman eat a fruit$")
    public void pacman_eat_a_fruit() {
        fruit = new Videogame();
        pacman.SetEat2(fruit);
    }

    @Then("^will become most fatter$")
    public void will_become_most_fatter() {
        assertThat(pacman.GetPoints()).isEqualTo(2);
    }



    //Test #3

    @Given("^a life\\(s\\)$")
    public void a_life_s() {
       pacman = new Pacman();
    }

    @When("^pac man crash with a phantom$")
    public void pac_man_crash_with_a_phantom() {
        phantom = new Phantom();
        pacman.Crash(phantom);
    }

    @Then("^will be die$")
    public void will_be_die() {
        assertThat(phantom.kill()).isNull();
    }

}



