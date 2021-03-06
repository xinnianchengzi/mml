package com.mml.dao;
// Generated 2016-7-7 16:28:03 by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Fullcut.
 * @see com.mml.dao.Fullcut
 * @author Hibernate Tools
 */
@Stateless
public class IFullcutDao {

	private static final Log log = LogFactory.getLog(IFullcutDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Fullcut transientInstance) {
		log.debug("persisting Fullcut instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Fullcut persistentInstance) {
		log.debug("removing Fullcut instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Fullcut merge(Fullcut detachedInstance) {
		log.debug("merging Fullcut instance");
		try {
			Fullcut result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Fullcut findById(Integer id) {
		log.debug("getting Fullcut instance with id: " + id);
		try {
			Fullcut instance = entityManager.find(Fullcut.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
