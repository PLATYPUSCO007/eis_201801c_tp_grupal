package gradle.cucumber;

public class VideoGame {

    private int points;
    private final int biscuit=50;
    private int score;
    private boolean eat;

    public void SetScore(int points) {
        this.points=points;
    }

    public void EatBiscuit(boolean eat) {
        this.eat=eat;
        if (eat!=true){
            score=points;
        }else{
            score=points+biscuit;
        }
    }

    public int Getpoints(){
        return points;
    }

    public int GetScore() {
        return score;
    }

}

