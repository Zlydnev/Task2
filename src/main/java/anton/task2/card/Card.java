package anton.task2.card;

import anton.task2.card.type.TypeOfCard;

public class Card {
    private final int id;
    private final int cartNumber;
    private TypeOfCard typeOfCard;


    public Card(int id, TypeOfCard typeOfCard) {
        this.id = id;
        this.cartNumber = 1000000+ (int) (Math.random() * 1000000);
        this.typeOfCard = typeOfCard;
    }

    public int getId() {
        return id;
    }

    public int getCartNumber() {
        return cartNumber;
    }

    public TypeOfCard getTypeOfCart() {
        return typeOfCard;
    }

    public void setTypeOfCart(TypeOfCard typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    public String payment(){
        return "Payment in progress...";
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cartNumber=" + cartNumber +
                ", typeOfCard=" + typeOfCard +
                '}';
    }
}
