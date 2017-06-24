package com.example.natashaford.cardgame;

import org.junit.Before;
import org.junit.Test;

import behaviours.Rank;
import behaviours.Suit;

import static org.junit.Assert.assertEquals;


public class HandTest {

    private Hand hand;
    Card card1;
    Card card2;
    Rank rank;
    Suit suit;

    @Before
    public void before(){
        hand = new Hand();
        card1 = new Card(rank.THREE, suit.CLUBS);
        card2 = new Card(rank.FOUR, suit.DIAMONDS);
    }

    @Test
    public void checkGetHandSize(){
        assertEquals(0, hand.getHandSize());
    }
    @Test
    public void checkAddCard(){
        hand.addCard(card1);
        hand.addCard(card2);
        assertEquals(2, hand.getHandSize());
    }

    @Test
    public void checkHandValue(){
        hand.addCard(card1);
        hand.addCard(card2);
        assertEquals(7, hand.getHandValue());
    }
}
