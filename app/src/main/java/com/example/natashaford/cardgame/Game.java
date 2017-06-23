package com.example.natashaford.cardgame;

import behaviours.Rank;


public class Game {

    private Player player_one;
    private Player player_two;
    private Deck deck;


    public Game() {
        player_one = new Player();
        player_two = new Player();
        deck = new Deck();
    }

    public void playGame() {
        deck.createDeck();
        deck.shuffleDeck();
        player_one.drawCard(deck.getCard());
        player_two.drawCard(deck.getCard());
        System.out.println("Player one played " + player_one.getName());
        System.out.println("Player two played " + player_two.getName());
        int winner = compareRank(player_one.getHandSize(), player_two.getHandSize());
        displayWinner(winner);
    }

    private int compareRank(int player_one_card_value, int player_two_card_value) {
        if (player_one_card_value == player_two_card_value){
            return 0;
        }
        if (player_one_card_value > player_two_card_value){
            return 1;
            }

        return -1;

    }

    private void displayWinner(int result) {
        switch (result) {
            case 0:
                System.out.println("It's a draw");
                break;
            case 1:
                System.out.println("Player one wins");
                break;
            case -1:
                System.out.println("Player two wins");
        }

    }
}


