package com.mml.entity;
// Generated 2016-7-7 16:21:12 by Hibernate Tools 4.0.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Administer generated by hbm2java
 */
@Entity
@Table(name = "administer", catalog = "mml")
public class Administer implements java.io.Serializable {

	private Integer AId;
	private String AName;
	private String APassword;
	private String AVerify;
	private String ASuperOrNot;
	private Date ARegTime;

	public Administer() {
	}

	public Administer(String AName, String APassword, String AVerify, String ASuperOrNot, Date ARegTime) {
		this.AName = AName;
		this.APassword = APassword;
		this.AVerify = AVerify;
		this.ASuperOrNot = ASuperOrNot;
		this.ARegTime = ARegTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "a_ID", unique = true, nullable = false)
	public Integer getAId() {
		return this.AId;
	}

	public void setAId(Integer AId) {
		this.AId = AId;
	}

	@Column(name = "a_Name", nullable = false, length = 10)
	public String getAName() {
		return this.AName;
	}

	public void setAName(String AName) {
		this.AName = AName;
	}

	@Column(name = "a_Password", nullable = false, length = 16)
	public String getAPassword() {
		return this.APassword;
	}

	public void setAPassword(String APassword) {
		this.APassword = APassword;
	}

	@Column(name = "a_Verify", nullable = false, length = 2)
	public String getAVerify() {
		return this.AVerify;
	}

	public void setAVerify(String AVerify) {
		this.AVerify = AVerify;
	}

	@Column(name = "a_SuperOrNot", nullable = false, length = 2)
	public String getASuperOrNot() {
		return this.ASuperOrNot;
	}

	public void setASuperOrNot(String ASuperOrNot) {
		this.ASuperOrNot = ASuperOrNot;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "a_RegTime", nullable = false, length = 19)
	public Date getARegTime() {
		return this.ARegTime;
	}

	public void setARegTime(Date ARegTime) {
		this.ARegTime = ARegTime;
	}

}
