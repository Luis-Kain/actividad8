import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.Collections;
public class Deck {
    private ArrayList<Card> myCards = new ArrayList<>();

    public Deck(ArrayList<Card> myCards) {
        this.myCards = myCards;
    }

    public Deck() {
    }

    public void fill(){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 13; k++){
                    switch (i){
                        case 0:
                            if(j == 0){
                                myCards.add(new Card("Pica","Negro",selectValue(k)));

                            }else {
                                myCards.add(new Card("Trebol", "Negro", selectValue(k)));
                            }
                            break;
                        case 1:
                            if (j == 0){
                                myCards.add(new Card("Diamante","Rojo",selectValue(k)));
                            }else{
                                myCards.add(new Card("Corazon","Rojo",selectValue(k)));
                            }
                            break;
                    }

                }
            }
        }
    }

    public String selectValue(int number){
        String result = "";
        switch (number){
            case 0:
                result = "2";
                break;
            case 1:
                result = "3";
                break;
            case 2:
                result = "4";
                break;
            case 3:
                result = "5";
                break;
            case 4:
                result = "6";
                break;
            case 5:
                result = "7";
                break;
            case 6:
                result = "8";
                break;
            case 7:
                result = "9";
                break;
            case 8:
                result = "10";
                break;
            case 9:
                result = "A";
                break;
            case 10:
                result = "J";
                break;
            case 11:
                result = "Q";
                break;
            case 12:
                result = "K";
                break;
        }
        return result;


    }

    public void shuffle(){
        Collections.shuffle(myCards);
        System.out.println("Se mezcló el Deck");
    }

    public void head(){
        System.out.println(myCards.get(0));
        myCards.remove(0);
        System.out.println("Quedan " + myCards.size() + " en el deck");
    }

    public void pick(){
        double randomNum = Math.random()*(myCards.size());
        System.out.println(myCards.get((int) randomNum));
        myCards.remove((int)randomNum);
        System.out.println("Quedan "+ myCards.size() + " en el deck");
    }
    public void hand(ArrayList<Card> userHand){
        for (int i = 0; i<5; i++){
            userHand.removeAll(userHand);
            userHand.add(myCards.get(0));
            System.out.println(userHand.get(0));
            myCards.remove(0);

        }
        System.out.println("Quedan " + myCards.size() + " cartas en el deck");
    }

    public ArrayList<Card> getMyCards() {
        return myCards;
    }

    public void setMyCards(ArrayList<Card> myCards) {
        this.myCards = myCards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "myCards=" + myCards +
                '}';
    }
}
