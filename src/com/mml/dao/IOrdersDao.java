package com.mml.dao;
// Generated 2016-7-7 16:28:03 by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Orders.
 * @see com.mml.dao.Orders
 * @author Hibernate Tools
 */
@Stateless
public class IOrdersDao {

	private static final Log log = LogFactory.getLog(IOrdersDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Orders transientInstance) {
		log.debug("persisting Orders instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Orders persistentInstance) {
		log.debug("removing Orders instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Orders merge(Orders detachedInstance) {
		log.debug("merging Orders instance");
		try {
			Orders result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Orders findById(Integer id) {
		log.debug("getting Orders instance with id: " + id);
		try {
			Orders instance = entityManager.find(Orders.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
