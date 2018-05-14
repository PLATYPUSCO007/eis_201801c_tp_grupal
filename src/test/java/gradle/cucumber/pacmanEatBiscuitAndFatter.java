package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class pacmanEatBiscuitAndFatter {

    Pacman pacman;
    Biscuit biscuit;

    @Given("^an pac man and a biscuit$")
    public void an_pac_man_and_a_biscuit() {
        pacman = new Pacman();
        biscuit = new Biscuit();
    }

    @When("^pacman eat a biscuit$")
    public void pacman_eat_a_biscuit() {
        pacman.eat(biscuit);
    }

    @Then("^will become fatter$")
    public void will_become_fatter() {
        assertThat(pacman.getPoints()).isEqualTo(10);
    }
}
