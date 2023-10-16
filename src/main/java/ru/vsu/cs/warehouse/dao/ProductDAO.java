package ru.vsu.cs.warehouse.dao;

import ru.vsu.cs.warehouse.entity.Product;

import java.util.List;


public interface ProductDAO {

    public List<Product> getAllProducts();

    public void saveProduct(Product product);

    public Product getProduct(int id);

    public void deleteProduct(int id);
}
