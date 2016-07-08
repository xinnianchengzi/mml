package com.mml.dao;
// Generated 2016-7-7 16:28:03 by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Coupon.
 * @see com.mml.dao.Coupon
 * @author Hibernate Tools
 */
@Stateless
public class ICouponDao {

	private static final Log log = LogFactory.getLog(ICouponDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Coupon transientInstance) {
		log.debug("persisting Coupon instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Coupon persistentInstance) {
		log.debug("removing Coupon instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Coupon merge(Coupon detachedInstance) {
		log.debug("merging Coupon instance");
		try {
			Coupon result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Coupon findById(Integer id) {
		log.debug("getting Coupon instance with id: " + id);
		try {
			Coupon instance = entityManager.find(Coupon.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
