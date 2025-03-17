package classes;

import java.util.Scanner;

public class CardTest {
    public static void main(String[] args) {
        CardCreator cardCreator = new CardCreator();
////        System.out.println(cardCreator.createCard("Алина", " 89899851142"));
//
//        String i = cardCreator.createCard("Алина", " 89899851142");
//
//        System.out.println(i);
//        Integer r = 8;
//
//        int y = r;
//        cardCreator.createCard(26, 2200);

//1.
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        cardCreator.createCard(number);
        System.out.println(number);

        number = "Hello";
        number = in.nextLine();


    }
}
