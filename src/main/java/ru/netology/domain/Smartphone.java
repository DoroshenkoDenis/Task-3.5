package ru.netology.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Smartphone extends Product {
    private String vendor;

    public Smartphone(int id, String name, int price, String vendor) {
        super(id, name, price);
        this.vendor = vendor;
    }

//    @Override
//    public boolean matches(String search) {
//        if (super.matches(search)) {
//            return true;
//        }
//        return search.equalsIgnoreCase(vendor);
//    }

    @Override
    public boolean matches(String search) {
        return super.matches(search) || search.equalsIgnoreCase(vendor);
    }
}
