package org.example.configuration;

import org.example.models.Person;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

public class Configuration {
    private static final SessionFactory connection;

    static {
        connection = new org.hibernate.cfg.Configuration()
                .setProperty(Environment.DRIVER,"org.postgresql.Driver")
                .setProperty(Environment.DIALECT,"org.hibernate.dialect.PostgreSQL10Dialect")
                .setProperty(Environment.URL,"jdbc:postgresql://localhost:5432/postgres")//jdbc:postgresql://localhost:5432/postgres
                .setProperty(Environment.USER,"postgres")
                .setProperty(Environment.PASS,",sql.111217S")
                .setProperty(Environment.HBM2DDL_AUTO,"validate")
                .setProperty(Environment.SHOW_SQL,"true")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();
    }

    public static SessionFactory getConnection() {
        return connection;
    }
}
