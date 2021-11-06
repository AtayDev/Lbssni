package org.example;

import org.example.beans.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Generate_OrderLine {
    public static void main(String[] args){
        OrderLine ol1=new OrderLine();
        OrderLine ol2=new OrderLine();

        Order o1=new Order("01/01/2021","UNDELIVERED");
        Order o2=new Order("99/99/9999","UNDELIVERED");

        Product p1=new Product();
        Product p2=new Product();

        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Feature.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(OrderLine.class)
                .buildSessionFactory();

        //Create Session
        Session session=factory.getCurrentSession();

        //Begin Transaction
        session.beginTransaction();

        o1.setClient(session.get(Client.class,1));
        o2.setClient(session.get(Client.class,2));

        session.save(o1);
        session.save(o2);
        session.save(p1);
        session.save(p2);

        ol1.setOrder(o1);
        ol1.setProduct(p1);
        ol1.setQtyOrdered(5);
        ol1.setTotalPrice(p1.getUnitPrice()*ol1.getQtyOrdered());



        ol2.setOrder(o2);
        ol2.setProduct(p2);
        ol2.setQtyOrdered(12);
        ol2.setTotalPrice(p1.getUnitPrice()*ol1.getQtyOrdered());

        session.save(ol1);
        session.save(ol2);

        session.getTransaction().commit();
        session.close();

    }
}
