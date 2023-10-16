package ru.vsu.cs.warehouse.dao;

import ru.vsu.cs.warehouse.entity.Storage;

import java.util.List;


public interface StorageDAO {

    public List<Storage> getAllStorages();

    public void saveStorage(Storage storage);

    public Storage getStorage(int id);

    public void deleteStorage(int id);
}
