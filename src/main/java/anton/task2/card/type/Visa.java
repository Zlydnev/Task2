package anton.task2.card.type;

public class Visa implements TypeOfCard {
    @Override
    public String getDescription() {
        return "Visa cart";
    }

    @Override
    public String toString() {
        return "Visa";
    }
}
