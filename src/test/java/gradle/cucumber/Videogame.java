package gradle.cucumber;

public class Videogame {


    public final int biscuit=1;
    public final int fruit=2;
    Videogame videogame;


    public Videogame(){
    }

    public Videogame(Videogame videogame){
        videogame=null;
        this.videogame=videogame;
    }


    public Videogame kill(){
        return videogame;
    }


    public int FatterBiscuit() {
        return biscuit;
    }

    public int FatterFruit(){
        return fruit;
    }


}


