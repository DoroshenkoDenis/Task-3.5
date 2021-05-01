package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.exception.NotFoundException;
import ru.netology.manager.ProductManager;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager productManager = new ProductManager(repository);
    private Book first = new Book(1, "name1", 100, "author1");
    private Book second = new Book(2, "name2", 200, "author2");
    private Smartphone third = new Smartphone(3, "name3", 300, "vendor1");
    private Smartphone forth = new Smartphone(4, "name4", 400, "vendor2");
    private Smartphone fifth = new Smartphone(4, "name5", 500, "vendor2");

    @BeforeEach
    void setUp() {
        productManager.add(first);
        productManager.add(second);
        productManager.add(third);
        productManager.add(forth);
        productManager.add(fifth);
    }

    @Test
    void removeByIdIfExists() {
        int id = 2;
        repository.removeById(id);

        Product[] expected = new Product[]{first, third, forth, fifth};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeByIdIfNotExists() {
        int id = 6;
        Exception e = assertThrows(NotFoundException.class, () -> repository.removeById(id));
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
}