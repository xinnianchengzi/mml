package com.mml.entity;
// Generated 2016-7-7 16:21:12 by Hibernate Tools 4.0.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categorya generated by hbm2java
 */
@Entity
@Table(name = "categorya", catalog = "mml")
public class Categorya implements java.io.Serializable {

	private Integer categoryAid;
	private String categoryAname;
	private Set<Goods> goodses = new HashSet<Goods>(0);
	private Set<Categoryb> categorybs = new HashSet<Categoryb>(0);

	public Categorya() {
	}

	public Categorya(String categoryAname) {
		this.categoryAname = categoryAname;
	}

	public Categorya(String categoryAname, Set<Goods> goodses, Set<Categoryb> categorybs) {
		this.categoryAname = categoryAname;
		this.goodses = goodses;
		this.categorybs = categorybs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "CategoryAID", unique = true, nullable = false)
	public Integer getCategoryAid() {
		return this.categoryAid;
	}

	public void setCategoryAid(Integer categoryAid) {
		this.categoryAid = categoryAid;
	}

	@Column(name = "CategoryAName", nullable = false, length = 10)
	public String getCategoryAname() {
		return this.categoryAname;
	}

	public void setCategoryAname(String categoryAname) {
		this.categoryAname = categoryAname;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categorya")
	public Set<Goods> getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set<Goods> goodses) {
		this.goodses = goodses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categorya")
	public Set<Categoryb> getCategorybs() {
		return this.categorybs;
	}

	public void setCategorybs(Set<Categoryb> categorybs) {
		this.categorybs = categorybs;
	}

}
