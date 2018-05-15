package gradle.cucumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {

    public Pacman pacman;
    public List<Phantom> phantoms;

    public Game(){
        pacman = new Pacman(this);
        phantoms = new ArrayList<Phantom>();
        for (int i = 0; i < 4; i++) {
           phantoms.add(new Phantom());
        }

    }

    public Pacman getPacman() {
        return pacman;
    }
    public List<Phantom> getPhantoms(){
        return phantoms;
    }
}
