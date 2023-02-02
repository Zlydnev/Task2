package anton.task2.product.factory;

import anton.task2.product.apple.phone.Phone;

import java.util.List;

public interface AbstractProductFactory {
    List<Phone> getPhones();
}
