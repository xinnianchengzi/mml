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
 * Viewboard generated by hbm2java
 */
@Entity
@Table(name = "viewboard", catalog = "mml")
public class Viewboard implements java.io.Serializable {

	private Integer VId;
	private Seller seller;
	private Memberuser memberuser;
	private String VMessage;

	public Viewboard() {
	}

	public Viewboard(Seller seller, Memberuser memberuser, String VMessage) {
		this.seller = seller;
		this.memberuser = memberuser;
		this.VMessage = VMessage;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "v_ID", unique = true, nullable = false)
	public Integer getVId() {
		return this.VId;
	}

	public void setVId(Integer VId) {
		this.VId = VId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "s_ID", nullable = false)
	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "m_ID", nullable = false)
	public Memberuser getMemberuser() {
		return this.memberuser;
	}

	public void setMemberuser(Memberuser memberuser) {
		this.memberuser = memberuser;
	}

	@Column(name = "v_Message", nullable = false, length = 200)
	public String getVMessage() {
		return this.VMessage;
	}

	public void setVMessage(String VMessage) {
		this.VMessage = VMessage;
	}

}
