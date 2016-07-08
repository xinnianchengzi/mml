package com.mml.dao;
// Generated 2016-7-7 16:28:03 by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Viewboard.
 * @see com.mml.dao.Viewboard
 * @author Hibernate Tools
 */
@Stateless
public class IViewboardDao {

	private static final Log log = LogFactory.getLog(IViewboardDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Viewboard transientInstance) {
		log.debug("persisting Viewboard instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Viewboard persistentInstance) {
		log.debug("removing Viewboard instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Viewboard merge(Viewboard detachedInstance) {
		log.debug("merging Viewboard instance");
		try {
			Viewboard result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Viewboard findById(Integer id) {
		log.debug("getting Viewboard instance with id: " + id);
		try {
			Viewboard instance = entityManager.find(Viewboard.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
