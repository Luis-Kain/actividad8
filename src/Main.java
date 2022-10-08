import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void showMenu(){
        System.out.println("inserta el número correspondiente de la lista para usar el programa y su función " +
                "segun el número que se muestra en la lista.");
        System.out.println("Lista de opciones\n1 Mezclar deck\n2 Sacar una carta\n3 carta al azar" +
                "\n4 Generar una mano de 5 cartas\n0 salir");
    }
    public static void main(String[] args) {
        ArrayList<Card> myHand = new ArrayList<>();
        Deck myDeck = new Deck();
        Scanner sc =  new Scanner(System.in);
        String[] myCardValues={"2","3","4","5","6","7","8","9","10","A","J","Q","K",};
        boolean isPlaying = true;

        myDeck.fill(myCardValues);
        showMenu();


        do{
            System.out.printf("Inserte un número del 1 al 4 para elegír la función o 0 para salir del programa:");
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
                case 0:
                    isPlaying = false;
                    break;
                default:
                    System.out.println("opción invalida, solo números del 0 al 4");
                    showMenu();
            }

        }while(isPlaying);
    }
}