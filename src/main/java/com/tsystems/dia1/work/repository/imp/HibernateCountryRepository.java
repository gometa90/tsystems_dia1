package com.tsystems.dia1.work.repository.imp;

import java.util.List;
import java.util.Optional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.tsystems.dia1.work.configuration.HibernateUtil;
import com.tsystems.dia1.work.domain.CountryEntity;
import com.tsystems.dia1.work.repository.CountryRepository;
import com.tsystems.dia1.work.services.RepositoryConnectionException;

public class HibernateCountryRepository implements CountryRepository {

    @SuppressWarnings("unchecked")
    @Override
    public List<CountryEntity> findByNameStartWith(String startWith) throws RepositoryConnectionException {

	Criteria nameStartWithCriteria = HibernateUtil.getSession().createCriteria(CountryEntity.class);
	nameStartWithCriteria.add(Restrictions.ilike("countryName", startWith, MatchMode.START));
	return nameStartWithCriteria.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public Optional<CountryEntity> findByCode(String code) throws RepositoryConnectionException {
	Query<CountryEntity> createQuery = HibernateUtil.getSession()
		.createQuery("FROM CountryEntity WHERE countryCode = :mycode");
	createQuery.setParameter("mycode", code);
	CountryEntity uniqueResult = (CountryEntity) createQuery.uniqueResult();

	if (uniqueResult != null) {
	    return Optional.of(uniqueResult);
	} else {
	    return Optional.empty();
	}
    }

}
