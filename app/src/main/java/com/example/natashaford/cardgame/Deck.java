package com.example.natashaford.cardgame;


import java.util.ArrayList;
import java.util.Collections;

import behaviours.Rank;
import behaviours.Suit;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public void createDeck(){
        for (Rank names : Rank.values()) {
            for (Suit suits : Suit.values()){
                cards.add(new Card(names, suits));
            }
        }
    }

    public int getDeckSize(){
        return this.cards.size();
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public Card getCard(){
        return cards.remove(0);
    }

}
