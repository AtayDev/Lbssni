package org.example.services;

import org.example.beans.*;
import org.example.interfaces.InterfaceClient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.Query;
import java.util.List;

@Service
public class ServiceClient implements InterfaceClient {

    private PasswordEncoder passwordEncoder;
    @Override
    public void addClient(Client client) {
        //Create the Session Factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Feature.class)
                .addAnnotatedClass(OrderLine.class)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Cart.class)
                .buildSessionFactory();

        //Create A Session Object
        Session session=factory.getCurrentSession();

        try {
            //Begin Transaction
            session.beginTransaction();

            client.setRole("ROLE_CLIENT");

            passwordEncoder =new BCryptPasswordEncoder();
            //Encrypt the password and store it in the DB
            client.setPassword(passwordEncoder.encode(client.getPassword()));

            //Save Student
            session.save(client);

            //Commit Transaction
            session.getTransaction().commit();

            System.out.println(client);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean updateClientByUsername(String username, Client newClient) {
        return false;
    }

    @Override
    public boolean deleteClientByUsername(String username) {
        return false;
    }

    @Override
    public int getIdByUsername(String username) {
        //Create the Session Factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Feature.class)
                .addAnnotatedClass(OrderLine.class)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Cart.class)
                .buildSessionFactory();
        //Create A Session Object
        Session session=factory.getCurrentSession();

        //Begin Transaction
        session.beginTransaction();

        //Create Query
        Query query=session.createQuery("from client c where c.username='"+username+"'",Client.class);
        List<Client> clients=query.getResultList();
        int id =clients.get(0).getId();

        //Commit transaction
        session.getTransaction().commit();

        return id;

    }
}
