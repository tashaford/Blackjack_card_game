package com.example.natashaford.cardgame;


import behaviours.Choice;

import java.util.concurrent.TimeUnit;

public class Game {

    private Player player;
    private Dealer dealer;
    private Deck deck;


    public Game() {
        player = new Player();
        dealer = new Dealer();
        deck = new Deck();
    }

    public void playGame() throws InterruptedException {
        deck.createDeck();
        deck.shuffleDeck();
        System.out.println("Welcome. Let's play Blackjack!");
        TimeUnit.SECONDS.sleep(2);
        dealer.addCard(dealer.dealCard((deck)));
        dealer.addCard(dealer.dealCard(deck));
        System.out.println("\nDealer has shown one card:");
        dealer.showCard();
        TimeUnit.SECONDS.sleep(2);
        player.addCard(dealer.dealCard(deck));
        player.addCard(dealer.dealCard(deck));
        System.out.println("\nPlayer was dealt:");
        player.showHand();
        System.out.println("Player's hand total is: " + player.getHandTotal());
        TimeUnit.SECONDS.sleep(2);
        quickPlayerWinner(player.getHandTotal());
        System.out.println("\nDealer shows all cards: ");
        dealer.showHand();
        System.out.println("Dealer's hand total is: " + dealer.getHandTotal());
        quickDealerWinner(dealer.getHandTotal());
        TimeUnit.SECONDS.sleep(2);
        displayWinner(player.getHandTotal(), dealer.getHandTotal());
    }

    private void checkTwistOrStick(Choice playerChoice) throws InterruptedException {
        if (playerChoice == Choice.TWIST) {
            player.addCard(dealer.dealCard(deck));
            System.out.println("\nPlayer's new card is:");
            player.showCard();
            System.out.println("Player's hand total is: " + player.getHandTotal());
            TimeUnit.SECONDS.sleep(2);
            if (player.getHandTotal() <= 21) {
                checkTwistOrStick(player.takeTurn());
            } else {
                System.out.println("\nSorry player, you are now bust with a hand total of : " + player.getHandTotal());
                TimeUnit.SECONDS.sleep(2);
            }
        } else {
            System.out.println("\nEnd of players turn. Player's hand total is: " + player.getHandTotal());
            TimeUnit.SECONDS.sleep(2);
        }
    }

    private void dealerTurn() throws InterruptedException {
        if (dealer.getHandValue() < 17) {
            dealer.addCard(dealer.dealCard(deck));
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\nDealer picked up a card:");
            dealer.showCard();
            System.out.println("Dealer's hand total is: " + dealer.getHandTotal());
            TimeUnit.SECONDS.sleep(2);
            dealerTurn();
        } else {
            System.out.println("\nEnd of dealers turn. Dealer's hand total is: " + dealer.getHandTotal());
            TimeUnit.SECONDS.sleep(2);
        }
    }

    private void quickPlayerWinner(int playerHand) throws InterruptedException {
        if (playerHand == 21) {
            System.out.println("\nPlayer automatically beats dealer with " + player.getHandValue() + "!");
        } else {
            checkTwistOrStick(player.takeTurn());
        }
    }

    private void quickDealerWinner(int dealerHand) throws InterruptedException {
        if (dealerHand == 21) {
            System.out.println("\nDealer automatically beats player with " + player.getHandValue() + "!");
        } else {
            dealerTurn();
        }
    }

    private void displayWinner(int playerHand, int dealerHand) {
        int i = 0;
        if (playerHand <= 21 && dealerHand <= 21) i = 1;
        if (playerHand <= 21 && dealerHand > 21) i = 2;
        if (playerHand > 21 && dealerHand <= 21) i = 3;
        if (playerHand > 21 && dealerHand > 21) i = 4;
        switch (i) {
            case 1:
                if (playerHand > dealerHand) {
                    System.out.println("\nPlayer beats dealer with " + player.getHandValue() + "!");
                } else {
                    System.out.println("\nDealer beats player with " + dealer.getHandValue() + "!");
                }
                break;
            case 2:
                System.out.println("\nPlayer beats dealer with " + player.getHandValue() + "!");
                break;
            case 3:
                System.out.println("\nDealer beats player with " + dealer.getHandValue() + "!");
                break;
            case 4:
                System.out.println("\nNo one wins, both dealer and player are bust");
        }
    }


}
