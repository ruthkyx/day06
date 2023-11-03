/* in a deck:
 suits - D, S, H, C 
 name - 1, 2, 3, 4, 5, 6 ,7, 8, 9, 10, J, Q, K
 value - 1, 2, 3, 4, 5, 6 ,7, 8, 9, 10, 10, 10, 10
deck is a collection of cards. - to use set or list? in this case, its better to use list cos its ordered
 */

package createdeck;


// this is the usual method we use but 
/* public class Card {
    public static void main(String[] args) [
        
        private String suit;
        private String name; 
        private String Integer value; 

        public Card(String suit, String name, Integer value) {
            this.suit = suit; 
            this.name = name;
            this.value = value;
        }

        // value of card shouldn't change so you should only have getters
        public String getSuit() {return suit;}
        public String getName() {return name;}
        public String getInteger() {return Integer;}

    ]
}
*/

// value object - record
public record Card(String suit, String anme, Integer value) {
    public String display() {
        return "Suit: %s, Name: %s, Value: %d".formatted(suit(), name(), value());
    }
}