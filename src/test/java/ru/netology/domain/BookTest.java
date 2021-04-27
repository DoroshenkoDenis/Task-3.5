package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book = new Book(1, "nameA", 300, "Bob");

    @Test
    public void shouldCompareNameIfExist(){
        String text = "nameA";
        assertTrue(book.matches(text));
    }

    @Test
    public void shouldCompareNameIfNotExist(){
        String text = "nameB";
        assertFalse(book.matches(text));
    }

    @Test
    public void shouldCompareAuthorIfExist(){
        String text = "Bob";
        assertTrue(book.matches(text));
    }

    @Test
    public void shouldCompareAuthorIfNotExist(){
        String text = "Mark";
        assertFalse(book.matches(text));
    }

}