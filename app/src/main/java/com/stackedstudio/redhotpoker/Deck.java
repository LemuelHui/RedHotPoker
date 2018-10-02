package com.stackedstudio.redhotpoker;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;
    // Card position indicates which card is going to be dealt next.
    private int cardPosition = 0;
    private final String TAG = Deck.class.getSimpleName();

    Deck() {
        createNewDeck();
        shuffleDeck();
    }

    // This constructor should only be used during testing.
    Deck(int seed) {
        createNewDeck();
        shuffleDeck(seed);
    }

    /**
     * This function initialises a new deck of cards.
     */
    private void createNewDeck() {
        cards = new ArrayList<>();

        for (Card.Numbers number : Card.Numbers.values()) {
            for (Card.Suits suit : Card.Suits.values()) {
                Card card = new Card(number, suit);
                cards.add(card);
            }
        }
    }

    private void shuffleDeck() {
        Collections.shuffle(cards);
    }

    /**
     * This function should only be used during testing to ensure that we get consistent results.
     * @param seed It can be any integer but use the same number to ensure the randomised sequence
     *             remains the same.
     */
    private void shuffleDeck(int seed) {
        Collections.shuffle(cards, new Random(seed));
    }

    ArrayList<Card> dealCards(int numberOfCards) {
        // These checks protect the deck from invalid inputs.
        if (numberOfCards <= 0) {
            Log.e(TAG, "Cannot deal zero or less than zero cards.");
            return null;
        }

        if (getSize() < numberOfCards) {
            Log.e(TAG, "There are not enough cards left in the deck.");
            return null;
        }

        ArrayList<Card> cardsToDeal = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            Card card = cards.get(cardPosition);
            cardsToDeal.add(card);
            cardPosition++;
        }

        return cardsToDeal;
    }

    /**
     * This function returns the number of cards left on the deck.
     */
    @SuppressWarnings("WeakerAccess")
    int getSize() {
        return cards.size() - cardPosition;
    }

    ArrayList<Card> getCards() {
        return cards;
    }
}
