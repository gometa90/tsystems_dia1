package com.tsystems.dia1.work.configuration;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    static {
	try {
	    sessionFactory = new Configuration()//
		    .addAnnotatedClass(com.tsystems.dia1.work.dominio.CountryEntity.class)//
		    .addAnnotatedClass(com.tsystems.dia1.work.dominio.HibernateCityEntity.class)//
		    .buildSessionFactory();
	} catch (Throwable ex) {
	    throw new ExceptionInInitializerError(ex);
	}
    }

    public static Session getSession() throws HibernateException {
	return sessionFactory.openSession();
    }
}
