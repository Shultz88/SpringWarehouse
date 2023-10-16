package ru.vsu.cs.warehouse.service;

import ru.vsu.cs.warehouse.data.dto.StorageCreateDto;
import ru.vsu.cs.warehouse.entity.Storage;

import java.util.List;

public interface StorageService {

    public List<Storage> getAllStorages();

    public void saveStorage(StorageCreateDto storageCreateDto);

    public Storage getStorage(int id);

    public void deleteStorage(int id);
}
