package gradle.cucumber;

public class Pacman {

    public int point=0;

    public void eat(Biscuit biscuit) {
        point+=biscuit.getPoint();
    }

    public int getPoints() {
        return point;
    }
}
