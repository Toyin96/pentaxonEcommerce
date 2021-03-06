package com.pentazon.product;

import com.pentazon.exceptions.ProductException;

public class ProductServiceImpl implements ProductService {

    private productDB productRepo = new productDB();

    /**
     * search for product with the specified id
     * @param productId
     * @return product with specified product id
     * @@throws ProductException
     */
    @Override
    public Product findProductById(String productId) throws ProductException {
        return productRepo.getProductById(productId);
    }
}