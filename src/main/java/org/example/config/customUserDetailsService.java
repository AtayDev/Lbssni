package org.example.config;

import org.example.beans.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.Query;
import java.util.List;

@Service
public class customUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //Must add all the annotated objects
        //Create the Session Factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Client.class)
               .addAnnotatedClass(Feature.class)
               .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(OrderLine.class)
                .addAnnotatedClass(Cart.class)
                .buildSessionFactory();

        //Create A Session Object
        Session session=factory.getCurrentSession();
        //Begin Transaction
        session.beginTransaction();

        //Query the username
        //Map the client class
        Query query=session.createQuery("from client c where c.username='"+username+"'",Client.class);
        List<Client> clients=query.getResultList();

        //Commit Transaction
        session.getTransaction().commit();

        return new customUserDetails(clients.get(0));
    }
}
