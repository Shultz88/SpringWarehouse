package ru.vsu.cs.warehouse.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.vsu.cs.warehouse.entity.Storage;

import java.util.List;

@Repository
public class StorageDAOImpl implements StorageDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Storage> getAllStorages() {
        return null;
    }

    public void saveStorage(Storage storage) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(storage);
    }

    public Storage getStorage(int id) {
        Session session = sessionFactory.getCurrentSession();

        Storage storage = session.get(Storage.class, id);

        return storage;
    }

    public void deleteStorage(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Storage> query = session.createQuery("delete from Storage " + "where id =:storageId");

        query.setParameter("storageId", id);
        query.executeUpdate();
    }
}
