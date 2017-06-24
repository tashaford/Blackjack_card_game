package com.example.natashaford.cardgame;


import behaviours.Rank;
import behaviours.Suit;

public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank(){
        return this.rank;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public int getCardValue(){
        return getRank().getValue();
    }

    public String getCardName() {
        return getRank() + " of " + getSuit();
    }

}
