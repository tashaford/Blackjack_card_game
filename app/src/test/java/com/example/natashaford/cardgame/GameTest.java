package com.example.natashaford.cardgame;


import org.junit.Before;
import org.junit.Test;

import behaviours.Rank;
import behaviours.Suit;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Player player;
    private Dealer dealer;
    private Deck deck;
    private Card card;
    private Rank rank;
    private Suit suit;


    @Before
    public void before() {
        game = new Game();
        player = new Player();
        dealer = new Dealer();
        deck = new Deck();
        card = new Card(rank.THREE, suit.DIAMONDS);
    }

    @Test
    public void testCardValues(){
        player.addCard(new Card(Rank.EIGHT, Suit.CLUBS));
        assertEquals(8, player.getHandValue());
    }








}
