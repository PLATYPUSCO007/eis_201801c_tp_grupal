package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;

public class pacmanCrashPhantomWeak {

    Game game;
    Pacman pacman;
    Phantom phantom;

    @Given("^a Pac and Phantom weak$")
    public void a_Pac_and_Phantom_weak() {
        game = new Game();
        pacman = new Pacman(game);
        phantom = new Phantom();
        phantom.weak();
    }

    @When("^pac man crash with a phantom weak$")
    public void pac_man_crash_with_a_phantom_weak() {
        pacman.crash(phantom);
    }

    @Then("^not die and eat the Phantom isn't body$")
    public void not_die_and_eat_the_Phantom_isn_t_body() {
        assertThat(phantom.isWeak()).isEqualTo(true);

        assertThat(phantom.isntBody()).isEqualTo(true);
    }
}
