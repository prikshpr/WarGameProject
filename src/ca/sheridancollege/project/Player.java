package ca.sheridancollege.project;

public abstract class Player {

    private String name;
    protected GroupOfCards hand = new GroupOfCards();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCard(Card card) {
        hand.addCard(card);
    }

    public int getHandSize() {
        return hand.getSize();
    }

    public Card playCard() {
        return hand.drawCard();
    }

    public abstract void play();
}
