package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;
import org.junit.Assert;

public class pacmanCrashWithaPhantomAndDie {
    Game game;
    Pacman pacman;
    Phantom phantom;

    @Given("^a Pac man with life\\(s\\)$")
    public void a_Pac_man_with_life_s() {
        game = new Game();
        pacman = new Pacman(game);
        pacman.life(2);
    }

    @When("^pac man crash with a phantom$")
    public void pac_man_crash_with_a_phantom() {
        phantom = new Phantom();
        pacman.crash(phantom);
    }

    @Then("^lost a life$")
    public void lost_a_life() {
        Assert.assertEquals(1, pacman.getLife());
    }
}
