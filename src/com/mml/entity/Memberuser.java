package com.mml.entity;
// Generated 2016-7-7 16:21:12 by Hibernate Tools 4.0.0.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Memberuser generated by hbm2java
 */
@Entity
@Table(name = "memberuser", catalog = "mml")
public class Memberuser implements java.io.Serializable {

	private Integer MId;
	private Grades grades;
	private String MName;
	private String MPassword;
	private String MPhone;
	private String MEmail;
	private int MPoints;
	private BigDecimal MBalance;
	private String MTelCode;
	private String MMailCode;
	private String MVerify;
	private Date MRegTime;
	private Set<Viewboard> viewboards = new HashSet<Viewboard>(0);
	private Set<Chart> charts = new HashSet<Chart>(0);
	private Set<Couponget> coupongets = new HashSet<Couponget>(0);
	private Set<Comment> comments = new HashSet<Comment>(0);
	private Set<Orders> orderses = new HashSet<Orders>(0);
	private Set<Address> addresses = new HashSet<Address>(0);

	public Memberuser() {
	}

	public Memberuser(Grades grades, String MName, String MPassword, String MPhone, String MEmail, int MPoints,
			String MVerify) {
		this.grades = grades;
		this.MName = MName;
		this.MPassword = MPassword;
		this.MPhone = MPhone;
		this.MEmail = MEmail;
		this.MPoints = MPoints;
		this.MVerify = MVerify;
	}

	public Memberuser(Grades grades, String MName, String MPassword, String MPhone, String MEmail, int MPoints,
			BigDecimal MBalance, String MTelCode, String MMailCode, String MVerify, Date MRegTime,
			Set<Viewboard> viewboards, Set<Chart> charts, Set<Couponget> coupongets, Set<Comment> comments,
			Set<Orders> orderses, Set<Address> addresses) {
		this.grades = grades;
		this.MName = MName;
		this.MPassword = MPassword;
		this.MPhone = MPhone;
		this.MEmail = MEmail;
		this.MPoints = MPoints;
		this.MBalance = MBalance;
		this.MTelCode = MTelCode;
		this.MMailCode = MMailCode;
		this.MVerify = MVerify;
		this.MRegTime = MRegTime;
		this.viewboards = viewboards;
		this.charts = charts;
		this.coupongets = coupongets;
		this.comments = comments;
		this.orderses = orderses;
		this.addresses = addresses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "m_ID", unique = true, nullable = false)
	public Integer getMId() {
		return this.MId;
	}

	public void setMId(Integer MId) {
		this.MId = MId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "grades_ID", nullable = false)
	public Grades getGrades() {
		return this.grades;
	}

	public void setGrades(Grades grades) {
		this.grades = grades;
	}

	@Column(name = "m_Name", nullable = false, length = 10)
	public String getMName() {
		return this.MName;
	}

	public void setMName(String MName) {
		this.MName = MName;
	}

	@Column(name = "m_Password", nullable = false, length = 16)
	public String getMPassword() {
		return this.MPassword;
	}

	public void setMPassword(String MPassword) {
		this.MPassword = MPassword;
	}

	@Column(name = "m_Phone", nullable = false, length = 11)
	public String getMPhone() {
		return this.MPhone;
	}

	public void setMPhone(String MPhone) {
		this.MPhone = MPhone;
	}

	@Column(name = "m_Email", nullable = false, length = 30)
	public String getMEmail() {
		return this.MEmail;
	}

	public void setMEmail(String MEmail) {
		this.MEmail = MEmail;
	}

	@Column(name = "m_Points", nullable = false)
	public int getMPoints() {
		return this.MPoints;
	}

	public void setMPoints(int MPoints) {
		this.MPoints = MPoints;
	}

	@Column(name = "m_Balance", precision = 10)
	public BigDecimal getMBalance() {
		return this.MBalance;
	}

	public void setMBalance(BigDecimal MBalance) {
		this.MBalance = MBalance;
	}

	@Column(name = "m_TelCode", length = 6)
	public String getMTelCode() {
		return this.MTelCode;
	}

	public void setMTelCode(String MTelCode) {
		this.MTelCode = MTelCode;
	}

	@Column(name = "m_MailCode", length = 10)
	public String getMMailCode() {
		return this.MMailCode;
	}

	public void setMMailCode(String MMailCode) {
		this.MMailCode = MMailCode;
	}

	@Column(name = "m_Verify", nullable = false, length = 2)
	public String getMVerify() {
		return this.MVerify;
	}

	public void setMVerify(String MVerify) {
		this.MVerify = MVerify;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "m_RegTime", length = 19)
	public Date getMRegTime() {
		return this.MRegTime;
	}

	public void setMRegTime(Date MRegTime) {
		this.MRegTime = MRegTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberuser")
	public Set<Viewboard> getViewboards() {
		return this.viewboards;
	}

	public void setViewboards(Set<Viewboard> viewboards) {
		this.viewboards = viewboards;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberuser")
	public Set<Chart> getCharts() {
		return this.charts;
	}

	public void setCharts(Set<Chart> charts) {
		this.charts = charts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberuser")
	public Set<Couponget> getCoupongets() {
		return this.coupongets;
	}

	public void setCoupongets(Set<Couponget> coupongets) {
		this.coupongets = coupongets;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberuser")
	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberuser")
	public Set<Orders> getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set<Orders> orderses) {
		this.orderses = orderses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberuser")
	public Set<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

}
