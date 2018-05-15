package gradle.cucumber;

public class Pacman {
	public Game game;
    public int point=0;
    public int life=0;
    
	public Pacman(Game game) {
        this.game = game;
    }

    public void eat(Biscuit biscuit) {
        point+=biscuit.getPoint();
    }

    public void eat(Fruit fruit) {
        point+=fruit.getPoint();
    }

    public int getPoints() {
        return point;
    }

    public void eat(Pallet pallet) {
        game.getPhantoms().forEach(f -> f.weak());
    }

    public void life(int life) {
        this.life=life;
    }

    public void crash(Phantom phantom){
       if (phantom.isWeak())
         phantom.removeBody();
       else
         life-=phantom.kill();
    }

    public int getLife() {
        return life;

    }
}
