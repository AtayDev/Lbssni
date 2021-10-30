package org.example;

import org.example.beans.Client;
import org.example.beans.Feature;
import org.example.beans.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Generate {
    public static void main(String [] args){
        Client c=new Client("jabran","anadi","jabran@gmail.com","test123","0621324510","ROLE_CLIENT");
        //Session Factory
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Feature.class)
                .buildSessionFactory();
        //Create Session
        Session session=factory.getCurrentSession();
        session.beginTransaction();

        session.save(c);
        session.getTransaction().commit();
        session.close();


    }
}
