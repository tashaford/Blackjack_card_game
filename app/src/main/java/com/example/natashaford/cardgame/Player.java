package com.example.natashaford.cardgame;


import java.util.Scanner;

import behaviours.Choice;

public class Player {

    private Card card;
    private Hand hand;
    private Scanner sc;


    public Player() {
        hand = new Hand();
        sc = new Scanner(System.in);
    }

    public int getHandSize() {
        return this.hand.getHandSize();
    }

    public void addCard(Card card) {
        this.hand.addCard(card);
    }

    public int getHandValue() {
        return this.hand.getHandValue();
    }

    public void showCard() {
        this.hand.showLastCard();
    }

    public void showHand() {
        this.hand.showHand();
    }

    public int getHandTotal() {
        return this.hand.getHandValue();
    }

    public Choice takeTurn() {
        System.out.println("\nPlayer, would you like to Twist or Stick?");
        String input = sc.nextLine().toUpperCase();
        char choice = input.charAt(0);
        switch (choice) {
            case 'S':
                return Choice.STICK;
            case 'T':
                return Choice.TWIST;
            default:
                System.out.println("Invalid choice");
                return takeTurn();
        }
    }
}

