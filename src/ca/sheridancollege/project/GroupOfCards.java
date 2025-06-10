package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {
    private ArrayList<Card> cards;

    public GroupOfCards() {
        cards = new ArrayList<>();
    }

    // Adds a card to the group
    public void addCard(Card card) {
        cards.add(card);
    }

    // Shuffles the cards
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Draws (removes and returns) the top card from the group
    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0); // Removes and returns the first card
        }
        return null;
    }

    // Returns the number of cards remaining
    public int getSize() {
        return cards.size();
    }

    // Returns the full list (if needed externally)
    public ArrayList<Card> getCards() {
        return cards;
    }
}
