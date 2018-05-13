package gradle.cucumber;

public class Phantom extends Videogame{



    public boolean weak;

    public Phantom(Phantom phantom){
        super(phantom);
    }

    public Phantom(){
    }

    public void SetWeak(boolean weak) {
        this.weak=weak;
    }

    public boolean GetWeak() {
        return weak;
    }
}
