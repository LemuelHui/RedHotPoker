package com.stackedstudio.redhotpoker;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void checkDeckSizeAtTheStart() {
        Deck deck = new Deck();
        assertEquals(52, deck.getSize());
    }

    @Test
    public void checkDeckSizeAfterDealingTwoCards() {
        Deck deck = new Deck();
        deck.dealCards(2);
        assertEquals(50, deck.getSize());
    }

    @Test
    public void checkOutputWhenDealingTooManyCardsAtTheStart() {
        Deck deck = new Deck();
        assertNull(deck.dealCards(53));
    }

    @Test
    public void checkOutputWhenDealingTooManyCardsDuringGame() {
        Deck deck = new Deck();
        deck.dealCards(10);
        assertNull(deck.dealCards(43));
    }

    @Test
    public void checkOutputWhenLastCardIsDealt() {
        Deck deck = new Deck();
        deck.dealCards(51);
        assertNotNull(deck.dealCards(1));
    }

    @Test
    public void checkDeckIsRandomised() {
        Deck deck = new Deck(7);
        ArrayList<Card> cards = deck.getCards();
        assertEquals(new Card(Card.Numbers.KING, Card.Suits.DIAMONDS), cards.get(0));
        assertEquals(new Card(Card.Numbers.KING, Card.Suits.SPADES), cards.get(1));
        assertEquals(new Card(Card.Numbers.NINE, Card.Suits.CLUBS), cards.get(2));
    }
}