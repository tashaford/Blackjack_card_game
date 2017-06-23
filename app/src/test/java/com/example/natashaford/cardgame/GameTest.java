package com.example.natashaford.cardgame;

import org.junit.Before;
import org.junit.Test;

import behaviours.Rank;
import behaviours.Suit;

import static org.junit.Assert.assertEquals;


public class GameTest {

    Player player;
    Deck deck;
    Card card;
    Rank rank;
    Suit suit;

    @Before
    public void before() {
        player = new Player();
        deck = new Deck();
        card = new Card(rank.THREE, suit.DIAMONDS);
    }


    @Test
    public void checkCreateDeck() {
        deck.createDeck();
        assertEquals(52, deck.getDeckSize());
    }

    @Test
    public void checkDeckAfterCardTaken(){
        deck.createDeck();
        player.drawCard(deck.getCard());
        assertEquals(51, deck.getDeckSize());
    }

    @Test
    public void checkGetRank(){
        assertEquals(rank.THREE, card.getRank());
    }

    @Test
    public void checkGetSuit(){
        assertEquals(suit.DIAMONDS, card.getSuit());
    }

}
