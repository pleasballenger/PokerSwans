import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stats {
    private ArrayList<Card> hand;
    private ArrayList<Card> community;
    private int pot;
    private int players;

    public Stats(Card card1, Card card2, int players) {
        if (card1 == null || card2 == null) {
            throw new IllegalArgumentException("Cannot be null");
        }

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(card1);
        hand.add(card2);
        this.hand = hand;

        pot = 0;

        ArrayList<Card> community = new ArrayList<>();
        this.community = community;

        this.players = players;
    }

    public String getHand() {
        String hand = "";
        hand += this.hand.get(0).getValue();
        hand += this.hand.get(1).getValue();

        if (this.hand.get(0).getSuit().equals(this.hand.get(1).getSuit())) {
            hand += "s";
        }
        else {
            hand += "o";
        }

        return hand;
    }

    public void setFlop(Card card1, Card card2, Card card3) {
        community.add(card1);
        community.add(card2);
        community.add(card3);
    }

    public void setTurn(Card card) {
        community.add(card);
    }

    public void setRiver(Card card) {
        community.add(card);
    }

    public ArrayList<Card> getCommunity() {
        return this.community;
    }

    public float preFlopWin () {

    }

}
