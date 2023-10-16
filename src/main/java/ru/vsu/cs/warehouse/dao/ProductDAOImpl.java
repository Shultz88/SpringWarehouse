package ru.vsu.cs.warehouse.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.vsu.cs.warehouse.entity.Product;

import java.util.List;


@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Product> getAllProducts() {
        Session session = sessionFactory.getCurrentSession();

        Query<Product> query = session.createQuery("from Product", Product.class);

        List<Product> allProducts = query.getResultList();

        return allProducts;
    }

    public void saveProduct(Product product) {

        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(product);
    }

    public Product getProduct(int id) {

        Session session = sessionFactory.getCurrentSession();

        Product product = session.get(Product.class, id);

        return product;
    }

    public void deleteProduct(int id) {

        Session session = sessionFactory.getCurrentSession();
        Query<Product> query = session.createQuery("delete from Product " + "where id =:productId");

        query.setParameter("productId", id);
        query.executeUpdate();

    }
}
