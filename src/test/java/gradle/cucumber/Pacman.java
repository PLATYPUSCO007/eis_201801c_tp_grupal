package gradle.cucumber;

public class Pacman{

    private int points=0;
    private Videogame videogame;
    private Phantom phantom;

    public Pacman(){
    }

    public void SetEat(Videogame videogame) {
        Videogame videogames = new Videogame(videogame);
        points=videogames.FatterBiscuit();
    }

    public void SetEat2(Videogame videogame) {
        Videogame videogames = new Videogame(videogame);
        points=videogames.FatterFruit();
    }

    public int GetPoints(){
        return points;
    }

    public void Crash(Phantom phantom) {
        Phantom phantoms = new Phantom(phantom);
        phantoms.kill();
    }

    public void SetEat3(Phantom phantom) {
        phantom.SetWeak(true);
    }
}

