package ru.vsu.cs.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.vsu.cs.warehouse.data.dto.StorageCreateDto;
import ru.vsu.cs.warehouse.entity.Storage;
import ru.vsu.cs.warehouse.service.ProductService;
import ru.vsu.cs.warehouse.service.StorageService;
import ru.vsu.cs.warehouse.service.StorageService;

import java.util.List;

@RestController
@RequestMapping("/api/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    @GetMapping()
    public List<Storage> showAllStorages() {
        List<Storage> allStorages = storageService.getAllStorages();

        return allStorages;
    }

    @GetMapping("/{id}")
    public Storage getStorage(@PathVariable int id) {

        Storage Storage = storageService.getStorage(id);

//        if (Storage == null) {
//            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in Database!");
//        }

        return Storage;
    }

    @PostMapping()
    public String addNewStorage(@RequestBody StorageCreateDto storageCreateDto){

        storageService.saveStorage(storageCreateDto);

        return "Storage was created!";
    }

    @PutMapping()
    public String updateStorage(@RequestBody StorageCreateDto storageCreateDto) {

        storageService.saveStorage(storageCreateDto);

        return "Storage was updated!";
    }

    @DeleteMapping("/{id}")
    public String deleteStorage(@PathVariable int id){

        Storage Storage = storageService.getStorage(id);

//        if(employee == null) {
//            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in database");
//        }

        storageService.deleteStorage(id);

        return "Storage with ID = " + id + " was deleted!";

    }
    
}
