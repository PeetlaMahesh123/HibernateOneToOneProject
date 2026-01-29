package com.OnetoMany.HibernateOneToMany.main;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.OnetoMany.HibernateOneToMany.Entity.Address;
import com.OnetoMany.HibernateOneToMany.Entity.Student;
import com.OnetoMany.HibernateOneToMany.util.HibernateUtil;



public class MainApp {

    public static void main(String[] args) {

        // Create Address
        Address address = new Address();
        address.setCity("Hyderabad");
        address.setState("Telangana");

        // Create Student
        Student student = new Student();
        student.setName("Mahesh");
        student.setAddress(address);

        // Hibernate Session
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(student); // Saves BOTH student & address

        transaction.commit();
        session.close();

        System.out.println("Data inserted successfully!");
    }
}
