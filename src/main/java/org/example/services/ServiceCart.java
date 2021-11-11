package org.example.services;

import org.example.beans.*;
import org.example.interfaces.InterfaceCart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCart implements InterfaceCart {
    @Override
    public void addToCart(Cart cart) {
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
            session.save(cart);

            //Commit Transaction
            session.getTransaction().commit();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Cart> getItemsInCart(int id) {
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
        try{
            session.beginTransaction();

            List<Cart> items=session.createQuery("from cart c where c.idClient='"+id+"'",Cart.class).getResultList();

            session.getTransaction().commit();

            return items;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
