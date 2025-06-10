package ca.sheridancollege.project;

public class WarGame extends Game {

    private int rounds = 0;
    private static final int MAX_ROUNDS = 100; // Set a round cap

    public WarGame(String name) {
        super(name);
    }

    @Override
    public void play() {
        rounds = 0;

        System.out.println("Starting the game: " + getName());

        // Main game loop with round limit
        while (players.get(0).getHandSize() > 0 &&
               players.get(1).getHandSize() > 0 &&
               rounds < MAX_ROUNDS) {

            rounds++;

            Card card1 = players.get(0).playCard();
            Card card2 = players.get(1).playCard();

            System.out.println("\nRound " + rounds);
            System.out.println(players.get(0).getName() + " plays " + card1);
            System.out.println(players.get(1).getName() + " plays " + card2);

            int value1 = ((PlayingCard) card1).getValue();
            int value2 = ((PlayingCard) card2).getValue();

            if (value1 > value2) {
                System.out.println(players.get(0).getName() + " wins the round!");
                players.get(0).addCard(card1);
                players.get(0).addCard(card2);
            } else if (value1 < value2) {
                System.out.println(players.get(1).getName() + " wins the round!");
                players.get(1).addCard(card1);
                players.get(1).addCard(card2);
            } else {
                System.out.println("It's a tie! Both cards are discarded.");
                // Skip adding the cards back, to avoid infinite loop
            }
        }

        System.out.println("\nGame Over!");

        // If max rounds hit
        if (rounds >= MAX_ROUNDS) {
            System.out.println("Max rounds reached. Possible infinite tie.");
        }

        System.out.println("Winner: " + declareWinner());
    }

    @Override
    public String declareWinner() {
        int size1 = players.get(0).getHandSize();
        int size2 = players.get(1).getHandSize();

        if (size1 > size2) {
            return players.get(0).getName();
        } else if (size2 > size1) {
            return players.get(1).getName();
        } else {
            return "It's a tie!";
        }
    }
}
