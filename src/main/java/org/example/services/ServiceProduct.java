package org.example.services;

import org.example.beans.*;
import org.example.interfaces.InterfaceProduct;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduct implements InterfaceProduct {
    @Override
    public void addProduct(Product p) {
        //Create the Session Factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Feature.class)
                .addAnnotatedClass(OrderLine.class)
                .addAnnotatedClass(Cart.class)
                .buildSessionFactory();

        //Create A Session Object
        Session session=factory.getCurrentSession();

        try {
            //Begin Transaction
            session.beginTransaction();

            //Save Product
            session.save(p);

            //Commit Transaction
            session.getTransaction().commit();
            System.out.println(p.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        //Create the Session Factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Feature.class)
                .addAnnotatedClass(OrderLine.class)
                .addAnnotatedClass(Cart.class)
                .buildSessionFactory();

        //Create A Session Object
        Session session=factory.getCurrentSession();

        try {
            //Begin Transaction
            session.beginTransaction();

            //Create a retrieve Product Query
            List<Product> products=session.createQuery("from product p where p.category='"+category+"'",Product.class).getResultList();

            //Commit Transaction
            session.getTransaction().commit();

            return products;
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean updateProductById(Long id, Product newProduct) {
        return false;
    }

    @Override
    public boolean deleteProductById(Long id) {
        return false;
    }

    @Override
    public Product getProductById(int id) {
        //Create the Session Factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Feature.class)
                .addAnnotatedClass(OrderLine.class)
                .addAnnotatedClass(Cart.class)
                .buildSessionFactory();

        //Create A Session Object
        Session session = factory.getCurrentSession();

        //Begin Transaction
        session.beginTransaction();

        //Get the product by Id
        Product p = session.get(Product.class, id);

        //Commmit transaction
        session.getTransaction().commit();

        return p;

    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }
}
