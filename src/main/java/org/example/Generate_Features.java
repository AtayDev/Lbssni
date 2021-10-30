package org.example;

import org.example.beans.Client;
import org.example.beans.Feature;
import org.example.beans.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//OneToOne Mapping
public class Generate_Features {
    public static void main(String[] args){
        Feature f=new Feature(175,75,22,50,43,40,35);
        //Session Factory
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Feature.class)
                .buildSessionFactory();
        //Create Session
        Session session=factory.getCurrentSession();



        session.beginTransaction();

        //Get the client and set the features id
        session.get(Client.class,1).setFeature(f);
        session.save(f);

        session.getTransaction().commit();
        session.close();
    }
}
