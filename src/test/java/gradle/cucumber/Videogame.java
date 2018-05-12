package gradle.cucumber;

public class Videogame {

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

    //AGREGAR FUNCION ENGORDAR PARA PACMAN

    public final int biscuit=1;
    public final int fruit=2;
    Videogame videogame;


}


