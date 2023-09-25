public class Card {
    final String rank;
    final String suit;

    Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }
    public String getSuit() {
        return suit;
    }

    public String toString() {
        return String.format("%s of %s",rank, suit);
    }

    public boolean equals(Object o) {
        Card temp = (Card)o;
        return (this.rank.equals(temp.rank) && this.suit.equals(temp.suit));
    }
}