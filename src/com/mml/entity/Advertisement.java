package com.mml.entity;
// Generated 2016-7-7 16:21:12 by Hibernate Tools 4.0.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Advertisement generated by hbm2java
 */
@Entity
@Table(name = "advertisement", catalog = "mml")
public class Advertisement implements java.io.Serializable {

	private Integer adId;
	private Seller seller;

	public Advertisement() {
	}

	public Advertisement(Seller seller) {
		this.seller = seller;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ad_ID", unique = true, nullable = false)
	public Integer getAdId() {
		return this.adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "s_ID", nullable = false)
	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

}