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

    /**
     * This function checks whether the number and suit for two cards is the same.
     * @param obj The other card to compare to the current card.
     * @return True if the number and suit is the same and false, if otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        // These checks ensure that this function behaves as expected.
        if (obj == null) {
            return false;
        }

        if (!Card.class.isAssignableFrom(obj.getClass())) {
            return false;
        }

        final Card otherCard = (Card) obj;

        return this.getNumber().equals(otherCard.getNumber()) &&
                this.getSuit().equals(otherCard.getSuit());
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
