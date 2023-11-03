package createdeck;

import java.util.LinkedList;
import java.util.List;

public class Deck {

    // 2 for loops and 4 nested loops 
        
    private List<Card> deck; 
    
    public Deck() {
        //create new deck 
        deck = new LinkedList <> ();
        for (String s: Constants.SUITS) {
            for (int i = 0; i < Constants.NAMES.length; i++) {
                // suit, name, value
                Card c = new Card(suit, Constants.NAMES[i], Constants.VALUES[i]);
                deck.add(card);
            }
        }
        public void shuffle() {

        }
        public Cards take() {
            List<Cards> cards = take(1);
            return cards.get(0);
        }
        public List<Card> take(int count) {
            List<Cards> toReturn = newLinkedList<> ();
            int i = 0;
            while (!deck.isEmpty() && (i < count)) {
                toReturn.add(deck.remove(0));
                i++;
            }
                /* for(int i = 0; i < count; i++)
                toReturn.add(deck.remove(i));
            return toReturn; */
        }
    }
}
/* an array uses integer as index but maps use strings as index. 
one uses integer for key: ordered ; the other uses strings for key
map is an associative array! */

//list is an interface. arraylist & linked list aere implementations of list