package classes;

public class GamePlayer {
    String name;
    String choice;

    GamePlayer(String name){
        this.name = name;
    }

    void makeChoice(String ch){
        this.choice = ch;
        System.out.println("Игрок" + name +  " выбрал " + this.choice);
    }

}
