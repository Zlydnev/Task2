package anton.task2.marketplace;

import anton.task2.card.Card;
import anton.task2.card.type.Elcart;
import anton.task2.card.type.Visa;
import anton.task2.client.Client;

import java.util.Scanner;

//  Класс для регистрации типа карты
public class TransactionService {

    public Card setPayment(Client client){
        System.out.println("Choose card type: ");
        System.out.println("Add (Visa) to select a Visa card");
        System.out.println("Add (Elcart) to select a Elcart card");
        Card card = null;
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        while (b){
            String typeOfCard = scanner.next();
            if(typeOfCard.equals("Elcart")){
                System.out.println("You have chosen a Elcart card");
                card = new Card(client.getId(), new Elcart());
                b = false;
            }
            else if(typeOfCard.equals("Visa")){
                System.out.println("You have chosen a Visa card");
                card = new Card(client.getId(), new Visa());
                b = false;
            }else{
                System.out.println("Enter the type from the suggested options!");
            }
        }
        client.setTypeOfCart(card.getTypeOfCart());
        System.out.println("Your card number: " + card.getCartNumber());
        return card;
    }
}
