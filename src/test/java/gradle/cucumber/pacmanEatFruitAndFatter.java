package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class pacmanEatFruitAndFatter {

    Pacman pacman;
    Fruit fruit;
    Game game;

    @Given("^an pac man and a fruit$")
    public void an_pac_man_and_a_fruit() {
        game = new Game();
        pacman = new Pacman(game);
        fruit = new Fruit();
    }

    @When("^pacman eat a fruit$")
    public void pacman_eat_a_fruit() {
        pacman.eat(fruit);
    }

    @Then("^become fatter$")
    public void become_fatter() {
        Assert.assertEquals(20, pacman.getPoints());
    }

}
