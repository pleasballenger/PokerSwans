public class Card {
    private String suit;
    private String value;

    public Card (String suit, String value) {
        if (suit == null || value == null) {
            throw new IllegalArgumentException("Cannot be null");
        }
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

}
