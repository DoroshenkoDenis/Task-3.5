package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Smartphone smartphone = new Smartphone(1, "ZenPhoneMaxPro1", 20000, "Asus");

    @Test
    public void shouldCompareNameIfExist(){
        String text = "ZenPhoneMaxPro1";
        assertTrue(smartphone.matches(text));
    }

    @Test
    public void shouldCompareNameIfNotExist(){
        String text = "GalaxyA20";
        assertFalse(smartphone.matches(text));
    }

    @Test
    public void shouldCompareVendorIfExist(){
        String text = "Asus";
        assertTrue(smartphone.matches(text));
    }

    @Test
    public void shouldCompareVendorIfNotExist(){
        String text = "Samsung";
        assertFalse(smartphone.matches(text));
    }


}