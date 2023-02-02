package anton.task2.marketplace;

import anton.task2.product.apple.phone.Phone;

import java.util.List;
import java.util.Scanner;

//  Класс для демонстрации товара
public class ProductService {
    public Phone getPhone(List<Phone> phones){
        for(int i = 0; i<phones.size(); ++i){
            System.out.println("Number " + i + ": " + phones.get(i).getDescription());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter item number");
        int itemNumber = scanner.nextInt();
        while(itemNumber > phones.size()){
            itemNumber = scanner.nextInt();
            System.out.println("Enter item number again");
        }
        return  phones.get(itemNumber);
    }
}
