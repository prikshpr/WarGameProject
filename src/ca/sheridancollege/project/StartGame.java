package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class StartGame {
    public static void main(String[] args) {
        WarGame game = new WarGame("War");

        // Create two players using anonymous subclasses of abstract Player
        Player p1 = new Player("Alice") {
            public void play() {}
        };

        Player p2 = new Player("Bob") {
            public void play() {}
        };

        // Add players to the game
        game.addPlayer(p1);
        game.addPlayer(p2);

        // Create a standard 52-card deck
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        ArrayList<PlayingCard> deck = new ArrayList<>();

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                // Values range from 2 to 14 (2=lowest, A=highest)
                deck.add(new PlayingCard(suit, ranks[i], i + 2));
            }
        }

        // Shuffle the deck
        Collections.shuffle(deck);

        // Distribute cards evenly to both players
        for (int i = 0; i < deck.size(); i++) {
            if (i % 2 == 0) {
                p1.addCard(deck.get(i));
            } else {
                p2.addCard(deck.get(i));
            }
        }

        // Start the game
        game.play();
    }
}
