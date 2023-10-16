package ru.vsu.cs.warehouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vsu.cs.warehouse.dao.StorageDAO;
import ru.vsu.cs.warehouse.data.dto.StorageCreateDto;
import ru.vsu.cs.warehouse.data.mapper.StorageMapper;
import ru.vsu.cs.warehouse.entity.Storage;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageDAO storageDAO;
    @Autowired
    private StorageMapper storageMapper;

    @Transactional
    public List<Storage> getAllStorages() {
        return storageDAO.getAllStorages();
    }

    @Transactional
    public void saveStorage(StorageCreateDto storageCreateDto) {
        Storage storage = storageMapper.storageCreateDtoToStorage(storageCreateDto);

        storageDAO.saveStorage(storage);
    }

    @Transactional
    public Storage getStorage(int id) {
        return storageDAO.getStorage(id);
    }

    @Transactional
    public void deleteStorage(int id) {
        storageDAO.deleteStorage(id);
    }
}
