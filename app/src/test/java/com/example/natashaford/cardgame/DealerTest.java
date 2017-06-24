package com.example.natashaford.cardgame;

import org.junit.Before;
import org.junit.Test;

import behaviours.Rank;
import behaviours.Suit;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    Rank rank;
    Suit suit;
    Card card1;
    Card card2;

    @Before
    public void before(){
        dealer = new Dealer();
        deck = new Deck();
        card1 = new Card(rank.THREE, suit.CLUBS);
        card2 = new Card(rank.FOUR, suit.DIAMONDS);
    }

    @Test
    public void checkHandSize(){
        assertEquals(0, dealer.getHandSize());
    }

    @Test
    public void checkHandValue(){
        dealer.addCard(card1);
        dealer.addCard(card2);
        assertEquals(7, dealer.getHandValue());
    }

}