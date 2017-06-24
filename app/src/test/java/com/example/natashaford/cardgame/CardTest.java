package com.example.natashaford.cardgame;

import org.junit.Before;
import org.junit.Test;

import behaviours.Rank;
import behaviours.Suit;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;
    Rank rank;
    Suit suit;

    @Before
    public void before(){
        card = new Card(rank.THREE, suit.DIAMONDS);
    }

    @Test
    public void checkGetSuit(){
        assertEquals(suit.DIAMONDS, card.getSuit());
    }

    @Test
    public void checkGetName(){
        assertEquals(rank.THREE, card.getRank());
    }

    @Test
    public void checkGetCardValue(){
        assertEquals(3, card.getCardValue());
    }

    @Test
    public void checkGetCardName() {
        assertEquals("THREE of DIAMONDS", card.getCardName());
    }

}
