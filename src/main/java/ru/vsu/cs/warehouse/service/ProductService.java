package ru.vsu.cs.warehouse.service;

import ru.vsu.cs.warehouse.data.dto.ProductCreateDto;
import ru.vsu.cs.warehouse.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProducts();

    public void saveProduct(ProductCreateDto productCreateDto);

    public Product getProduct(int id);

    public void deleteProduct(int id);
}
