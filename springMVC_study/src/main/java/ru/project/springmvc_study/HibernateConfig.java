package ru.project.springmvc_study;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@EnableTransactionManagement
@org.springframework.context.annotation.Configuration
public class HibernateConfig {

    @Bean
    public SessionFactory sessionFactory(DataSource dataSource) {
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Alien.class);

        Properties props = new Properties();
        props.put(Environment.DRIVER, "org.postgresql.Driver");
        props.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
        props.put(Environment.USER, "postgres");
        props.put(Environment.PASS, "postgres");
        props.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        props.put(Environment.HBM2DDL_AUTO, "update");
        props.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        props.put(Environment.SHOW_SQL, "true");

        cfg.setProperties(props);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties())
                .build();

        return cfg.buildSessionFactory(serviceRegistry);
    }
}
