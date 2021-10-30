package org.example;

import org.example.beans.Client;
import org.example.beans.Feature;
import org.example.beans.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Generate_Orders {
    public static void main(String[] args){
        Order o=new Order("30/10/2021","UNDELIVERED");
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Feature.class)
                .buildSessionFactory();

        Session session=factory.getCurrentSession();

        //Begin Transaction
        session.beginTransaction();
        Client client=session.get(Client.class,1);
        o.setClient(client);

        //add the order to the client's list of orders
        client.add(o);
        session.save(o);

        session.getTransaction().commit();
        session.close();

    }
}
