package com.example.natashaford.cardgame;


import java.util.ArrayList;

public class Hand {

    ArrayList<Card> hands;

    public Hand() {
        this.hands = new ArrayList<Card>();
    }


    public void addCard(Card card) {
        hands.add(card);
    }

    public int getHandSize() {
        return this.hands.size();
    }

    public void showHand() {
        for (Card item : hands) {
            System.out.println(item.getCardName());
        }
    }

    public void showLastCard(){
        System.out.println(hands.get(hands.size()-1).getCardName());
    }

    public int getHandValue(){
        int total = 0;
        for (Card item : hands){
            total += item.getCardValue();
        }
        return total;
    }

}
