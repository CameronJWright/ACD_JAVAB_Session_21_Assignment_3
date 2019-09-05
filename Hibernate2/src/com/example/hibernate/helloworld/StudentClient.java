package com.example.hibernate.helloworld;

import java.sql.Date;

public class StudentClient {

	private int STUD_ID;
	private String STUD_NAME;
	private int STUD_MARKS;
	private Date STUD_JOIN_DATE;

	public StudentClient() {
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
