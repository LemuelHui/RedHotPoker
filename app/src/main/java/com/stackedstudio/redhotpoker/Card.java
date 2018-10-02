package com.stackedstudio.redhotpoker;

import android.support.annotation.NonNull;

/**
 * This card class is rather self-explanatory.
 */
public class Card {

    private Numbers number;
    private Suits suit;

    Card(Numbers number, Suits suit) {
        this.number = number;
        this.suit = suit;
    }
    
    @SuppressWarnings("WeakerAccess")
    public Numbers getNumber() {
        return number;
    }

    @SuppressWarnings("WeakerAccess")
    public Suits getSuit() {
        return suit;
    }

    @NonNull
    @Override
    public String toString() {
        return getNumber().toString() + " of " + getSuit().toString();
    }

    enum Numbers {
        ACE {
            @NonNull
            @Override
            public String toString() {
                return "Ace";
            }
        }, TWO {
            @NonNull
            @Override
            public String toString() {
                return "Two";
            }
        }, THREE {
            @NonNull
            @Override
            public String toString() {
                return "Three";
            }
        }, FOUR {
            @NonNull
            @Override
            public String toString() {
                return "Four";
            }
        }, FIVE {
            @NonNull
            @Override
            public String toString() {
                return "Five";
            }
        }, SIX {
            @NonNull
            @Override
            public String toString() {
                return "Six";
            }
        }, SEVEN {
            @NonNull
            @Override
            public String toString() {
                return "Seven";
            }
        }, EIGHT {
            @NonNull
            @Override
            public String toString() {
                return "Eight";
            }
        }, NINE {
            @NonNull
            @Override
            public String toString() {
                return "Nine";
            }
        }, TEN {
            @NonNull
            @Override
            public String toString() {
                return "Ten";
            }
        }, JACK {
            @NonNull
            @Override
            public String toString() {
                return "Jack";
            }
        }, QUEEN {
            @NonNull
            @Override
            public String toString() {
                return "Queen";
            }
        }, KING {
            @NonNull
            @Override
            public String toString() {
                return "King";
            }
        }
    }

    enum Suits {
        SPADES {
            @NonNull
            @Override
            public String toString() {
                return "Spades";
            }
        }, HEARTS {
            @NonNull
            @Override
            public String toString() {
                return "Hearts";
            }
        }, CLUBS {
            @NonNull
            @Override
            public String toString() {
                return "Clubs";
            }
        }, DIAMONDS {
            @NonNull
            @Override
            public String toString() {
                return "Diamonds";
            }
        }
    }
}
