package ru.project.springmvc_study;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Alien> getAliens() {
        try (Session session = sessionFactory.openSession()) {
            List<Alien> aliens = session.createQuery("from Alien", Alien.class).list();
            return aliens;
        }
    }

    @Transactional
    public void save(Alien alien) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.persist(alien);
            session.getTransaction().commit();
        }
    }
}
