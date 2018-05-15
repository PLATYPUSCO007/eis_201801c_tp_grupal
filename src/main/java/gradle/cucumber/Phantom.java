package gradle.cucumber;

public class Phantom {
    private Boolean weak = false;

    public void weak() {
        weak = true;
    }

    public boolean isWeak() {
        return weak;
    }
}
