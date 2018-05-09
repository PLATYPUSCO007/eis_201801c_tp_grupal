package gradle.cucumber;

public class Pacman {


    private int points;
    private int score;
    Videogame videogame = new Videogame();

    public void SetPoints(int points) {
        this.points=points;
    }

    public void SetEatBonus(String bonus) {
        if (bonus.equalsIgnoreCase("biscuit")){
            score=points+videogame.biscuit;
        } else if (bonus.equalsIgnoreCase("fruit")){
            score=points+videogame.fruit;
        }else{
            score=points;
        }
    }

    public int GetPoints(){
        return points;
    }

    public int GetScore(){
        return score;
    }

}

