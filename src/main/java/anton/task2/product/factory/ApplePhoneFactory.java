package anton.task2.product.factory;

import anton.task2.product.apple.phone.Phone;
import anton.task2.product.apple.phone.iphone.*;

import java.util.ArrayList;
import java.util.List;

public class ApplePhoneFactory implements AbstractProductFactory {
    @Override
    public List<Phone> getPhones() {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Iphone7());
        phones.add(new Iphone8());
        phones.add(new Iphone9());
        phones.add(new Iphone10());
        phones.add(new Iphone11());
        phones.add(new Iphone12());

        return phones;
    }



}
