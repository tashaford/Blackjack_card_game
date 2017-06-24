package com.example.natashaford.cardgame;


public class Dealer{

    private Hand hand;

    public Dealer(){
        hand = new Hand();
    }

    public int getHandSize(){
        return this.hand.getHandSize();
    }

    public Card dealCard(Deck deck){
        return deck.getCard();
    }

    public void addCard(Card card){
        this.hand.addCard(card);
    }

    public int getHandValue(){
        return this.hand.getHandValue();
    }

    public void showCard(){
        this.hand.showLastCard();
    }

    public void showHand(){
        this.hand.showHand();
    }

    public int getHandTotal(){
        return this.hand.getHandValue();
    }

}
