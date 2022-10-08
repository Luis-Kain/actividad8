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

    public void fill(String[] valueToUse){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 13; k++){
                    switch (i){
                        case 0:
                            if(j == 0){
                                myCards.add(new Card("Pica","Negro",valueToUse[k]));

                            }else {
                                myCards.add(new Card("Trebol", "Negro", valueToUse[k]));
                            }
                            break;
                        case 1:
                            if (j == 0){
                                myCards.add(new Card("Diamante","Rojo",valueToUse[k]));
                            }else{
                                myCards.add(new Card("Corazon","Rojo",valueToUse[k]));
                            }
                            break;
                    }

                }
            }
        }
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
