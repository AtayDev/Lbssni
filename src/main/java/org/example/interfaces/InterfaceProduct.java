package org.example.interfaces;

import org.example.beans.Product;

import java.util.List;

public interface InterfaceProduct {
    public void addProduct(Product p);
    public List<Product> getProductByCategory(String category);
    public boolean updateProductById(Long id, Product newProduct);
    public boolean deleteProductById(Long id);
    public Product getProductById(int id);
    public List<Product> getAllProducts();
}
