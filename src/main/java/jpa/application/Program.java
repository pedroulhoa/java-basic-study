package jpa.application;

import jpa.entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

    public static void main(String[] args) {

        // Instantiate
        //        Person p1 = new Person(null, "John Martin", "john@mail.com");
        //        Person p2 = new Person(null, "Bob Dilan", "bob@mail.com");
        //        Person p3 = new Person(null, "Anne Prinson", "anne@mail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
        EntityManager em = emf.createEntityManager();

        // Find
        Person p = em.find(Person.class, 2);
        System.out.println(p);

        // Remove
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        // Save
        //        em.getTransaction().begin();
        //        em.persist(p1);
        //        em.persist(p2);
        //        em.persist(p3);
        //        em.getTransaction().commit();
        //        System.out.println("Save success!");

        em.close();
        emf.close();

    }

}
