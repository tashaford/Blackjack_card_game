package com.example.natashaford.cardgame;


import behaviours.Rank;
import behaviours.Suit;


public class Card {

    Rank rank;
    Suit suit;
    Card card;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }


    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }


}
