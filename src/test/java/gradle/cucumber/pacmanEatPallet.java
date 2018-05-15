package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;

public class pacmanEatPallet {
    private Game game;
    private Pallet pallet;
    private Pacman pacman;

    @Given("^an pacman and a pallet$")
    public void an_pacman_and_a_pallet() {
        game = new Game();
        pallet = new Pallet();
        pacman = game.getPacman();
    }

    @When("^pacman eat a pallet$")
    public void pacman_eat_a_pallet() {
        pacman.eat(pallet);
    }

    @Then("^phantom weak$")
    public void phantom_weak() {
        assertThat(game.getPhantoms().stream().allMatch(f -> f.isWeak())).isEqualTo(true);
    }


}
