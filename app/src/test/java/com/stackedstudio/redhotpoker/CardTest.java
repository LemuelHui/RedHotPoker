package com.stackedstudio.redhotpoker;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * These tests are to ensure that the card class behaves as expected.
 */
public class CardTest {

    @Test
    public void aceOfSpadesToString() {
        Card card = new Card(Card.Numbers.ACE, Card.Suits.SPADES);
        assertEquals("Ace of Spades", card.toString());
    }

    @Test
    public void jackOfDiamondsToString() {
        Card card = new Card(Card.Numbers.JACK, Card.Suits.DIAMONDS);
        assertEquals("Jack of Diamonds", card.toString());
    }

    @Test
    public void kingOfHeartsToString() {
        Card card = new Card(Card.Numbers.KING, Card.Suits.HEARTS);
        assertEquals("King of Hearts", card.toString());
    }

    @Test
    public void getNumber() {
        Card card = new Card(Card.Numbers.QUEEN, Card.Suits.HEARTS);
        assertEquals("Queen", card.getNumber().toString());
    }

    @Test
    public void getSuit() {
        Card card = new Card(Card.Numbers.QUEEN, Card.Suits.HEARTS);
        assertEquals("Hearts", card.getSuit().toString());
    }
}