package com.mml.dao;
// Generated 2016-7-7 16:28:03 by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Goods.
 * @see com.mml.dao.Goods
 * @author Hibernate Tools
 */
@Stateless
public class IGoodsDao {

	private static final Log log = LogFactory.getLog(IGoodsDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Goods transientInstance) {
		log.debug("persisting Goods instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Goods persistentInstance) {
		log.debug("removing Goods instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Goods merge(Goods detachedInstance) {
		log.debug("merging Goods instance");
		try {
			Goods result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Goods findById(Integer id) {
		log.debug("getting Goods instance with id: " + id);
		try {
			Goods instance = entityManager.find(Goods.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
