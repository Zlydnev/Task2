package anton.task2;

import anton.task2.card.Card;
import anton.task2.client.Client;
import anton.task2.distributor.PaymentProcessController;
import anton.task2.distributor.paymentprocess.PaymentProcess;
import anton.task2.marketplace.ClientService;
import anton.task2.marketplace.ProductService;
import anton.task2.marketplace.TransactionService;
import anton.task2.product.apple.phone.Phone;
import anton.task2.product.factory.AbstractProductFactory;
import anton.task2.product.factory.ApplePhoneFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class Task2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Task2Application.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Vasilev Ivan Petrovich", true));
        clients.add(new Client("Frolov Aleksey Timofeevich", false));
        clients.add(new Client("Trayanov Georgiy Sergeevich", true));
        clients.add(new Client("Olegov Kirill Olegovich", false));

        while (true) {
            ClientService clientService = new ClientService();
            TransactionService transactionService = new TransactionService();
            ProductService productService = new ProductService();
            for (Client client : clients) {
                System.out.println(client);
            }
            System.out.println("Add your id: ");
            int id = clients.size() + 1;
            try {
                id = scanner.nextInt();
            }catch (Throwable e){
                System.out.println("There is no such ID");
            }


            if (Collections.binarySearch(clients, id) < 0) {
                clients.add(clientService.registerClient());

            } else {
                Client client = clients.get(Collections.binarySearch(clients, id));

                AbstractProductFactory abstractProductFactory = new ApplePhoneFactory();
                List<Phone> phones = abstractProductFactory.getPhones();
                Phone phone = productService.getPhone(phones);
                System.out.println(phone.getDescription());

                Card card = transactionService.setPayment(client);

                PaymentProcessController paymentProcessController = new PaymentProcessController();
                PaymentProcess paymentProcess = paymentProcessController.getPaymentProcess(client);
                System.out.println(paymentProcess.paymentProcess(card.payment()));
            }
            System.out.println("Write stop if you want to stop");
            String startOrStop = scanner.next();
            if(startOrStop.equals("stop")){
                break;
            }
        }
    }
}
