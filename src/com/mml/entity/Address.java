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
 * Address generated by hbm2java
 */
@Entity
@Table(name = "address", catalog = "mml")
public class Address implements java.io.Serializable {

	private Integer addressId;
	private Memberuser memberuser;
	private String phoneNumber;
	private String MAddress;

	public Address() {
	}

	public Address(Memberuser memberuser) {
		this.memberuser = memberuser;
	}

	public Address(Memberuser memberuser, String phoneNumber, String MAddress) {
		this.memberuser = memberuser;
		this.phoneNumber = phoneNumber;
		this.MAddress = MAddress;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "address_ID", unique = true, nullable = false)
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "m_ID", nullable = false)
	public Memberuser getMemberuser() {
		return this.memberuser;
	}

	public void setMemberuser(Memberuser memberuser) {
		this.memberuser = memberuser;
	}

	@Column(name = "phone_Number", length = 11)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "m_Address", length = 100)
	public String getMAddress() {
		return this.MAddress;
	}

	public void setMAddress(String MAddress) {
		this.MAddress = MAddress;
	}

}
