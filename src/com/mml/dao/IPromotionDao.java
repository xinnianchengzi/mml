package com.mml.dao;
// Generated 2016-7-7 16:28:03 by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Promotion.
 * @see com.mml.dao.Promotion
 * @author Hibernate Tools
 */
@Stateless
public class IPromotionDao {

	private static final Log log = LogFactory.getLog(IPromotionDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Promotion transientInstance) {
		log.debug("persisting Promotion instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Promotion persistentInstance) {
		log.debug("removing Promotion instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Promotion merge(Promotion detachedInstance) {
		log.debug("merging Promotion instance");
		try {
			Promotion result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Promotion findById(Integer id) {
		log.debug("getting Promotion instance with id: " + id);
		try {
			Promotion instance = entityManager.find(Promotion.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
