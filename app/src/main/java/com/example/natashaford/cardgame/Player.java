package com.example.natashaford.cardgame;


public class Player {

    Card card;

    public int getHandSize(){
        return card.getRank().getValue();
    }

    public void drawCard(Card card) {
        this.card = card;
    }

    public String getName(){
        return card.getRank() + " of " + card.getSuit();
    }
}