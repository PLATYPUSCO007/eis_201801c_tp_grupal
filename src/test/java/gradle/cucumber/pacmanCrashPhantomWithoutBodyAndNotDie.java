package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class pacmanCrashPhantomWithoutBodyAndNotDie {
    Game game;
    Pacman pacman;
    Phantom phantom;

    @Given("^a Pacman and a Phanton$")
    public void a_Pacman_and_a_Phanton() {
        game = new Game();
        phantom = new Phantom();
        phantom.removeBody();
        pacman = new Pacman(game);
        pacman.life(2);
    }


    @When("^pac man crash with a phantom without Body$")
    public void pac_man_crash_with_a_phantom_without_Body() {
        pacman.crash(phantom);
    }

    @Then("^pacman not die$")
    public void pacman_not_die() {

        Assert.assertEquals(2, pacman.getLife());
    }

}
