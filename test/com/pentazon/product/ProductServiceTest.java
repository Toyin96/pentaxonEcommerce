package com.pentazon.product;

import com.pentazon.exception.ProductException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    ProductService productService;

    @BeforeEach
    void setUp() {
        productService  = new ProductServiceImpl();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findProduct() throws ProductException {
        Product product = null;

        product = productService.findProductById("AD0001");
        assertNotNull(product);

        assertThrows(ProductException.class, ()-> productService.findProductById("DUD007"));
    }


}