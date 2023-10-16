package ru.vsu.cs.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.vsu.cs.warehouse.data.dto.ProductCreateDto;
import ru.vsu.cs.warehouse.entity.Product;
import ru.vsu.cs.warehouse.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product> showAllProducts() {
        List<Product> allProducts = productService.getAllProducts();

        return allProducts;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {

        Product product = productService.getProduct(id);

//        if (product == null) {
//            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in Database!");
//        }

        return product;
    }

    @PostMapping()
    public ProductCreateDto addNewProduct(@RequestBody ProductCreateDto productCreateDto){

        productService.saveProduct(productCreateDto);

        return productCreateDto;
    }

    @PutMapping()
    public ProductCreateDto updateProduct(@RequestBody ProductCreateDto productCreateDto) {

        productService.saveProduct(productCreateDto);

        return productCreateDto;
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id){

        Product product = productService.getProduct(id);

//        if(employee == null) {
//            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in database");
//        }

        productService.deleteProduct(id);

        return "Product with ID = " + id + " was deleted!";

    }
}
