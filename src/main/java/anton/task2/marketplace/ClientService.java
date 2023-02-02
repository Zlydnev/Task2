package anton.task2.marketplace;

import anton.task2.client.Client;

import java.util.Scanner;

public class ClientService {

    public Client registerClient(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add surname: ");
        String surname = scanner.next();
        System.out.print("Add name: ");
        String name = scanner.next();
        System.out.print("Add patronymic: ");
        String patronymic = scanner.next();
        name = String.join(" ", name, surname, patronymic);

        System.out.println("Are you a pensioner?");
        System.out.println("Add (yes) if you are retired");
        System.out.println("Add (no) if you are not retired");
        String signOfPensioner = scanner.next();
        boolean signOfPensionerResult = false;
        if(signOfPensioner.equals("yes")){
            signOfPensionerResult = true;
        }
        Client client = new Client(name, signOfPensionerResult);
        System.out.println("Your ID = " + client.getId());
        return client;
    }

}
