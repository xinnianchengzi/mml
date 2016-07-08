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
 * Grades generated by hbm2java
 */
@Entity
@Table(name = "grades", catalog = "mml")
public class Grades implements java.io.Serializable {

	private Integer gradesId;
	private String gradesName;
	private Integer gradesPoints;
	private Set<Memberuser> memberusers = new HashSet<Memberuser>(0);

	public Grades() {
	}

	public Grades(String gradesName) {
		this.gradesName = gradesName;
	}

	public Grades(String gradesName, Integer gradesPoints, Set<Memberuser> memberusers) {
		this.gradesName = gradesName;
		this.gradesPoints = gradesPoints;
		this.memberusers = memberusers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "grades_ID", unique = true, nullable = false)
	public Integer getGradesId() {
		return this.gradesId;
	}

	public void setGradesId(Integer gradesId) {
		this.gradesId = gradesId;
	}

	@Column(name = "grades_Name", nullable = false, length = 10)
	public String getGradesName() {
		return this.gradesName;
	}

	public void setGradesName(String gradesName) {
		this.gradesName = gradesName;
	}

	@Column(name = "grades_Points")
	public Integer getGradesPoints() {
		return this.gradesPoints;
	}

	public void setGradesPoints(Integer gradesPoints) {
		this.gradesPoints = gradesPoints;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "grades")
	public Set<Memberuser> getMemberusers() {
		return this.memberusers;
	}

	public void setMemberusers(Set<Memberuser> memberusers) {
		this.memberusers = memberusers;
	}

}