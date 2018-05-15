package gradle.cucumber;

public class Pacman {

    public int point=0;
    public int life=0;

    public void eat(Biscuit biscuit) {
        point+=biscuit.getPoint();
    }

    public void eat(Fruit fruit) {
        point+=fruit.getPoint();
    }

    public int getPoints() {
        return point;
    }

    public void life(int life) {
        this.life=life;
    }

    public void crash(Phantom phantom) {
        life-=phantom.kill();
    }

    public int getLife() {
        return life;
    }
}
