package gradle.cucumber;

public class Pacman {

    public Game game;

    public int point = 0;

    public Pacman(Game game) {
        this.game = game;
    }

    public void eat(Biscuit biscuit) {
        point+=biscuit.getPoint();
    }

    public int getPoints() {
        return point;
    }

    public void eat(Pallet pallet) {
        game.getPhantoms().forEach(f -> f.weak());
    }
}
