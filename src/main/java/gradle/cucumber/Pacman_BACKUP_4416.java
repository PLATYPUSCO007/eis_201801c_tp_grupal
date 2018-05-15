package gradle.cucumber;

public class Pacman {

<<<<<<< HEAD
    public Game game;

    public int point = 0;

    public Pacman(Game game) {
        this.game = game;
    }
=======
    public int point=0;
    public int life=0;
>>>>>>> refs/remotes/origin/master

    public void eat(Biscuit biscuit) {
        point+=biscuit.getPoint();
    }

    public void eat(Fruit fruit) {
        point+=fruit.getPoint();
    }

    public int getPoints() {
        return point;
    }

<<<<<<< HEAD
    public void eat(Pallet pallet) {
        game.getPhantoms().forEach(f -> f.weak());
=======
    public void life(int life) {
        this.life=life;
    }

    public void crash(Phantom phantom) {
        life-=phantom.kill();
    }

    public int getLife() {
        return life;
>>>>>>> refs/remotes/origin/master
    }
}
