package com.sdabyd2.Cars;


import com.sdabyd2.Cars.entity.UserDetails;
import com.sdabyd2.Cars.entity.Vehicle;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

    private static final SessionFactory sessionFactory;

    // blok static podobny do konstruktora ale z wiekszym priorytetem
    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }

    public static void main(String[] args) {

        UserDetails userDetails = new UserDetails();
        userDetails.setUserName("Konrad");

        UserDetails userDetails2 = new UserDetails();
        userDetails2.setUserName("Adrian");

        UserDetails userDetails3 = new UserDetails();
        userDetails3.setUserName("Waldemar");

        UserDetails userDetails4 = new UserDetails();
        userDetails4.setUserName("Michal");

        UserDetails userDetails5 = new UserDetails();
        userDetails5.setUserName("Marcin");

        UserDetails userDetails6 = new UserDetails();
        userDetails6.setUserName("Jozef");

        UserDetails userDetails7 = new UserDetails();
        userDetails7.setUserName("Krystian");

        UserDetails userDetails8 = new UserDetails();
        userDetails8.setUserName("Maciej");

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("BMW");

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVehicleName("Audi");

        Vehicle vehicle3 = new Vehicle();
        vehicle3.setVehicleName("Porshe");

        Vehicle vehicle4 = new Vehicle();
        vehicle4.setVehicleName("Bentley");

        Vehicle vehicle5 = new Vehicle();
        vehicle5.setVehicleName("Maserati");

        Vehicle vehicle6 = new Vehicle();
        vehicle6.setVehicleName("Fiat");

        Vehicle vehicle7 = new Vehicle();
        vehicle7.setVehicleName("Skoda");

        Vehicle vehicle8 = new Vehicle();
        vehicle8.setVehicleName("Dacia");

        Vehicle vehicle9 = new Vehicle();
        vehicle9.setVehicleName("Lamborgini");

        Vehicle vehicle10 = new Vehicle();
        vehicle10.setVehicleName("Mercedes");

        Vehicle vehicle11 = new Vehicle();
        vehicle11.setVehicleName("Ariel");

        Vehicle vehicle12 = new Vehicle();
        vehicle12.setVehicleName("Pagani");

        vehicle.setUserDetails(userDetails);
        vehicle2.setUserDetails(userDetails2);
        vehicle3.setUserDetails(userDetails3);
        vehicle4.setUserDetails(userDetails4);
        vehicle5.setUserDetails(userDetails5);
        vehicle6.setUserDetails(userDetails6);
        vehicle7.setUserDetails(userDetails7);
        vehicle8.setUserDetails(userDetails8);
        vehicle9.setUserDetails(userDetails8);
        vehicle10.setUserDetails(userDetails2);
        vehicle11.setUserDetails(userDetails3);
        vehicle12.setUserDetails(userDetails5);

        Transaction transaction = null;
        Session session = getSession();

        transaction = session.beginTransaction();

        session.save(vehicle);
        session.save(vehicle2);
        session.save(vehicle3);
        session.save(vehicle4);
        session.save(vehicle5);
        session.save(vehicle6);
        session.save(vehicle7);
        session.save(vehicle8);
        session.save(vehicle9);
        session.save(vehicle10);
        session.save(vehicle11);
        session.save(vehicle12);

        transaction.commit();












    }
}
