package com.mml.entity;
// Generated 2016-7-7 16:21:12 by Hibernate Tools 4.0.0.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Seller generated by hbm2java
 */
@Entity
@Table(name = "seller", catalog = "mml")
public class Seller implements java.io.Serializable {

	private Integer SId;
	private String SName;
	private String SPassword;
	private String SPhome;
	private String SEmail;
	private String SAd;
	private String SAddress;
	private String SLogo;
	private String SPost;
	private String SActivityA;
	private String SActivityB;
	private String SActivityC;
	private String STelCode;
	private String SMailCode;
	private String SVerify;
	private Date SRegTime;
	private Set<Chart> charts = new HashSet<Chart>(0);
	private Set<Goods> goodses = new HashSet<Goods>(0);
	private Set<Gift> gifts = new HashSet<Gift>(0);
	private Set<Advertisement> advertisements = new HashSet<Advertisement>(0);
	private Set<Viewboard> viewboards = new HashSet<Viewboard>(0);
	private Set<Comment> comments = new HashSet<Comment>(0);

	public Seller() {
	}

	public Seller(String SName, String SPassword, String SPhome, String SEmail, String SAddress, String SLogo,
			String SPost, String SActivityA, String SActivityB, String SActivityC, String STelCode, String SMailCode,
			String SVerify, Date SRegTime) {
		this.SName = SName;
		this.SPassword = SPassword;
		this.SPhome = SPhome;
		this.SEmail = SEmail;
		this.SAddress = SAddress;
		this.SLogo = SLogo;
		this.SPost = SPost;
		this.SActivityA = SActivityA;
		this.SActivityB = SActivityB;
		this.SActivityC = SActivityC;
		this.STelCode = STelCode;
		this.SMailCode = SMailCode;
		this.SVerify = SVerify;
		this.SRegTime = SRegTime;
	}

	public Seller(String SName, String SPassword, String SPhome, String SEmail, String SAd, String SAddress,
			String SLogo, String SPost, String SActivityA, String SActivityB, String SActivityC, String STelCode,
			String SMailCode, String SVerify, Date SRegTime, Set<Chart> charts, Set<Goods> goodses, Set<Gift> gifts,
			Set<Advertisement> advertisements, Set<Viewboard> viewboards, Set<Comment> comments) {
		this.SName = SName;
		this.SPassword = SPassword;
		this.SPhome = SPhome;
		this.SEmail = SEmail;
		this.SAd = SAd;
		this.SAddress = SAddress;
		this.SLogo = SLogo;
		this.SPost = SPost;
		this.SActivityA = SActivityA;
		this.SActivityB = SActivityB;
		this.SActivityC = SActivityC;
		this.STelCode = STelCode;
		this.SMailCode = SMailCode;
		this.SVerify = SVerify;
		this.SRegTime = SRegTime;
		this.charts = charts;
		this.goodses = goodses;
		this.gifts = gifts;
		this.advertisements = advertisements;
		this.viewboards = viewboards;
		this.comments = comments;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "s_ID", unique = true, nullable = false)
	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	@Column(name = "s_Name", nullable = false, length = 10)
	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	@Column(name = "s_Password", nullable = false, length = 16)
	public String getSPassword() {
		return this.SPassword;
	}

	public void setSPassword(String SPassword) {
		this.SPassword = SPassword;
	}

	@Column(name = "s_Phome", nullable = false, length = 11)
	public String getSPhome() {
		return this.SPhome;
	}

	public void setSPhome(String SPhome) {
		this.SPhome = SPhome;
	}

	@Column(name = "s_Email", nullable = false, length = 30)
	public String getSEmail() {
		return this.SEmail;
	}

	public void setSEmail(String SEmail) {
		this.SEmail = SEmail;
	}

	@Column(name = "s_Ad", length = 2)
	public String getSAd() {
		return this.SAd;
	}

	public void setSAd(String SAd) {
		this.SAd = SAd;
	}

	@Column(name = "s_Address", nullable = false, length = 50)
	public String getSAddress() {
		return this.SAddress;
	}

	public void setSAddress(String SAddress) {
		this.SAddress = SAddress;
	}

	@Column(name = "s_Logo", nullable = false, length = 50)
	public String getSLogo() {
		return this.SLogo;
	}

	public void setSLogo(String SLogo) {
		this.SLogo = SLogo;
	}

	@Column(name = "s_Post", nullable = false, length = 50)
	public String getSPost() {
		return this.SPost;
	}

	public void setSPost(String SPost) {
		this.SPost = SPost;
	}

	@Column(name = "s_ActivityA", nullable = false, length = 50)
	public String getSActivityA() {
		return this.SActivityA;
	}

	public void setSActivityA(String SActivityA) {
		this.SActivityA = SActivityA;
	}

	@Column(name = "s_ActivityB", nullable = false, length = 50)
	public String getSActivityB() {
		return this.SActivityB;
	}

	public void setSActivityB(String SActivityB) {
		this.SActivityB = SActivityB;
	}

	@Column(name = "s_ActivityC", nullable = false, length = 50)
	public String getSActivityC() {
		return this.SActivityC;
	}

	public void setSActivityC(String SActivityC) {
		this.SActivityC = SActivityC;
	}

	@Column(name = "s_TelCode", nullable = false, length = 6)
	public String getSTelCode() {
		return this.STelCode;
	}

	public void setSTelCode(String STelCode) {
		this.STelCode = STelCode;
	}

	@Column(name = "s_MailCode", nullable = false, length = 10)
	public String getSMailCode() {
		return this.SMailCode;
	}

	public void setSMailCode(String SMailCode) {
		this.SMailCode = SMailCode;
	}

	@Column(name = "s_Verify", nullable = false, length = 2)
	public String getSVerify() {
		return this.SVerify;
	}

	public void setSVerify(String SVerify) {
		this.SVerify = SVerify;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "s_RegTime", nullable = false, length = 19)
	public Date getSRegTime() {
		return this.SRegTime;
	}

	public void setSRegTime(Date SRegTime) {
		this.SRegTime = SRegTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seller")
	public Set<Chart> getCharts() {
		return this.charts;
	}

	public void setCharts(Set<Chart> charts) {
		this.charts = charts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seller")
	public Set<Goods> getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set<Goods> goodses) {
		this.goodses = goodses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seller")
	public Set<Gift> getGifts() {
		return this.gifts;
	}

	public void setGifts(Set<Gift> gifts) {
		this.gifts = gifts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seller")
	public Set<Advertisement> getAdvertisements() {
		return this.advertisements;
	}

	public void setAdvertisements(Set<Advertisement> advertisements) {
		this.advertisements = advertisements;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seller")
	public Set<Viewboard> getViewboards() {
		return this.viewboards;
	}

	public void setViewboards(Set<Viewboard> viewboards) {
		this.viewboards = viewboards;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seller")
	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

}
