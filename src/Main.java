import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Card> myHand = new ArrayList<>();
        Deck myDeck = new Deck();
        Scanner sc =  new Scanner(System.in);
        boolean isPlaying = true;

        myDeck.fill();

        System.out.println("inserta el número correspondiente de la lista para usar el programa y su función" +
                "segun el número que se muestra en la lista.");
        System.out.println("Lista de opciones\n1 shuffle\n2 head\n3 pick\n4 hand\n5 exit");

        do{
            System.out.printf("Inserte un número del 1 al 4 para elegír la función u otro para salir del programa:");
            switch (sc.nextInt()){
                case 1:
                    myDeck.shuffle();
                    break;
                case 2:
                    myDeck.head();
                    break;
                case 3:
                    myDeck.pick();
                    break;
                case 4:
                    myDeck.hand(myHand);
                    break;
                default:
                    isPlaying = false;
                    break;

            }

        }while(isPlaying);
    }
}