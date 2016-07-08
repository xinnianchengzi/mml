package com.mml.dao;
// Generated 2016-7-7 16:28:03 by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Discount.
 * @see com.mml.dao.Discount
 * @author Hibernate Tools
 */
@Stateless
public class IDiscountDao {

	private static final Log log = LogFactory.getLog(IDiscountDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Discount transientInstance) {
		log.debug("persisting Discount instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Discount persistentInstance) {
		log.debug("removing Discount instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Discount merge(Discount detachedInstance) {
		log.debug("merging Discount instance");
		try {
			Discount result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Discount findById(Integer id) {
		log.debug("getting Discount instance with id: " + id);
		try {
			Discount instance = entityManager.find(Discount.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
