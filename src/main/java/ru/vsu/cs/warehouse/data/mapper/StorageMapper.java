package ru.vsu.cs.warehouse.data.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.vsu.cs.warehouse.data.dto.StorageCreateDto;
import ru.vsu.cs.warehouse.entity.Product;
import ru.vsu.cs.warehouse.entity.Storage;
import ru.vsu.cs.warehouse.service.ProductService;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class StorageMapper {
    
    @Autowired
    private ProductService productService;

    @Transactional
    public Storage storageCreateDtoToStorage(StorageCreateDto storageCreateDto) {
        Storage storage = new Storage();


        Product product = productService.getProduct(storageCreateDto.getProductId());
        if (product == null) {
            return null;
        }


        Date dateOfReceipt;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateOfReceipt = format.parse(storageCreateDto.getDateOfReceipt());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        int rackNumber = storageCreateDto.getRackNumber();
        if(rackNumber <= 0){
            return null;
        }

        storage.setDateOfReceipt(dateOfReceipt);
        storage.setProduct(product);
        storage.setRackNumber(rackNumber);

        return storage;
    }
}
