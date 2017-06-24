package com.example.natashaford.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void checkGetDeckSize(){
        assertEquals(0, deck.getDeckSize());
    }

    @Test
    public void checkCreateDeckSize(){
        deck.createDeck();
        assertEquals(52, deck.getDeckSize());
    }

    @Test
    public void checkCardIsRemoved(){
        deck.createDeck();
        deck.getCard();
        assertEquals(51, deck.getDeckSize());
    }
}
