package gradle.cucumber;

public class Phantom {
    private Boolean weak = false;
    private Boolean body = true;

    public void weak() {
        weak = true;
    }

    public boolean isWeak() {
        return weak;
    }
    
	public int kill() {
        return 1;
    }

    public boolean isntBody() {
        return !body;
    }

    public void removeBody() {
        body = false;
    }
}
