package com.example.hibernate.helloworld;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentAnno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STUD_ID", unique = true, nullable = false)
	private int STUD_ID;

	@Column(name = "STUD_NAME", unique = false, nullable = false)
	private String STUD_NAME;

	@Column(name = "STUD_MARKS", unique = false, nullable = false)
	private int STUD_MARKS;

	@Column(name = "STUD_JOIN_DATE", unique = false, nullable = false)
	private Date STUD_JOIN_DATE;

	public StudentAnno() {
		// TODO Auto-generated constructor stub
	}

	public int getSTUD_ID() {
		return STUD_ID;
	}

	public void setSTUD_ID(int sTUD_ID) {
		STUD_ID = sTUD_ID;
	}

	public String getSTUD_NAME() {
		return STUD_NAME;
	}

	public void setSTUD_NAME(String sTUD_NAME) {
		STUD_NAME = sTUD_NAME;
	}

	public int getSTUD_MARKS() {
		return STUD_MARKS;
	}

	public void setSTUD_MARKS(int sTUD_MARKS) {
		STUD_MARKS = sTUD_MARKS;
	}

	public Date getSTUD_JOIN_DATE() {
		return STUD_JOIN_DATE;
	}

	public void setSTUD_JOIN_DATE(Date sTUD_JOIN_DATE) {
		STUD_JOIN_DATE = sTUD_JOIN_DATE;
	}

}
