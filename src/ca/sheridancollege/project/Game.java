package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The base Game class meant to be extended by specific games like War.
 * It contains a list of players and defines the structure for playing a game and declaring a winner.
 * 
 * @author dancye
 */
public abstract class Game {
    
    protected ArrayList<Player> players; // The players in the game
    private String name; // The name of the game

    // Constructor
    public Game(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    // Adds a player to the game
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Gets the list of players
    public ArrayList<Player> getPlayers() {
        return players;
    }

    // Gets the name of the game
    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void play();

    // Abstract method to declare a winner
    public abstract String declareWinner();
}
