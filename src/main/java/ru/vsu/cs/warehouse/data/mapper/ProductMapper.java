package ru.vsu.cs.warehouse.data.mapper;

import org.springframework.stereotype.Component;
import ru.vsu.cs.warehouse.data.dto.ProductCreateDto;
import ru.vsu.cs.warehouse.entity.Product;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ProductMapper {

    @Transactional
    public Product productCreateDtoToProduct(ProductCreateDto productCreateDto){
        Product product = new Product();


        Date dateOfProduction;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateOfProduction = format.parse(productCreateDto.getDateOfProduction());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Date storageLife;
        try {
            storageLife = format.parse(productCreateDto.getDateOfProduction());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        product.setCount(productCreateDto.getCount());
        product.setName(productCreateDto.getName());
        product.setDateOfProduction(dateOfProduction);
        product.setStorageLife(storageLife);

        return product;
    }
}
