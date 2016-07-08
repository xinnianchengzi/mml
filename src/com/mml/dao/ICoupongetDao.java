package com.mml.dao;
// Generated 2016-7-7 16:28:03 by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mml.entity.Couponget;
import com.mml.entity.CoupongetId;

/**
 * Home object for domain model class Couponget.
 * @see com.mml.dao.Couponget
 * @author Hibernate Tools
 */
@Stateless
public class ICoupongetDao {

	private static final Log log = LogFactory.getLog(ICoupongetDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Couponget transientInstance) {
		log.debug("persisting Couponget instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Couponget persistentInstance) {
		log.debug("removing Couponget instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Couponget merge(Couponget detachedInstance) {
		log.debug("merging Couponget instance");
		try {
			Couponget result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Couponget findById(CoupongetId id) {
		log.debug("getting Couponget instance with id: " + id);
		try {
			Couponget instance = entityManager.find(Couponget.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
