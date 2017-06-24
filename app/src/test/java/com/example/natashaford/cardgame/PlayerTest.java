package com.example.natashaford.cardgame;


import org.junit.Before;
import org.junit.Test;

import behaviours.Rank;
import behaviours.Suit;

import static org.junit.Assert.assertEquals;

public class PlayerTest {


    Player player;
    Deck deck;
    Rank rank;
    Suit suit;
    Card card1;
    Card card2;

    @Before
    public void before(){
        player = new Player();
        deck = new Deck();
        card1 = new Card(rank.THREE, suit.CLUBS);
        card2 = new Card(rank.FOUR, suit.DIAMONDS);
    }

    @Test
    public void checkHandSize(){
        assertEquals(0, player.getHandSize());
    }

    @Test
    public void checkHandValue(){
        player.addCard(card1);
        player.addCard(card2);
        assertEquals(7, player.getHandValue());
    }
}
