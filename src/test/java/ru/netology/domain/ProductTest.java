package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product item = new Product(1, "name1", 1000);

    @Test
    public void shouldCompareNameIfExist(){
        String text = "name1";
        assertTrue(item.matches(text));
    }

    @Test
    public void shouldCompareNameIfNotExist(){
        String text = "name2";
        assertFalse(item.matches(text));
    }
}