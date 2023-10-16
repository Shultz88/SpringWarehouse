package ru.vsu.cs.warehouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vsu.cs.warehouse.dao.ProductDAO;
import ru.vsu.cs.warehouse.data.dto.ProductCreateDto;
import ru.vsu.cs.warehouse.data.mapper.ProductMapper;
import ru.vsu.cs.warehouse.entity.Product;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private ProductMapper productMapper;

    @Transactional
    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    @Transactional
    public void saveProduct(ProductCreateDto productCreateDto) {
        Product product = productMapper.productCreateDtoToProduct(productCreateDto);

        productDAO.saveProduct(product);
    }

    @Transactional
    public Product getProduct(int id) {
        return productDAO.getProduct(id);
    }

    @Transactional
    public void deleteProduct(int id) {
        productDAO.deleteProduct(id);
    }
}
