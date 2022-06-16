package com.btc.ReportGeneration;

public class Student {

	private int rollNo;
	private String studentName;
	private int KannadaScore;
	public int getRollNo() {
		return rollNo;
	}


	public Student(int rollNo, String studentName, int kannadaScore, int englishScore, int hindiScore, int total) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		KannadaScore = kannadaScore;
		EnglishScore = englishScore;
		HindiScore = hindiScore;
		this.total = total;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", KannadaScore=" + KannadaScore
				+ ", EnglishScore=" + EnglishScore + ", HindiScore=" + HindiScore + ", total=" + total + "]";
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getKannadaScore() {
		return KannadaScore;
	}


	public void setKannadaScore(int kannadaScore) {
		KannadaScore = kannadaScore;
	}


	public int getEnglishScore() {
		return EnglishScore;
	}


	public void setEnglishScore(int englishScore) {
		EnglishScore = englishScore;
	}


	public int getHindiScore() {
		return HindiScore;
	}


	public void setHindiScore(int hindiScore) {
		HindiScore = hindiScore;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	private int EnglishScore;
	private int HindiScore;
	
	private int total;
	
	
	public Student() {
	}
}

//	public Student(int rollNo, String studentName, int KannadaScore, int EnglishScore, int HindiScore) {
//		super();
//		this.rollNo = rollNo;
//		this.studentName = studentName;
//		this.KannadaScore = KannadaScore;
//		this.EnglishScore = EnglishScore;
//		this.HindiScore = HindiScore;
//	}
//
//
//	public int getRollNo() {
//		return rollNo;
//	}
//
//
//	public void setRollNo(int rollNo) {
//		this.rollNo = rollNo;
//	}
//
//
//	public String getStudentName() {
//		return studentName;
//	}
//
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//
//
//	public int getMathsScore() {
//		return mathsScore;
//	}
//
//
//	public void setMathsScore(int mathsScore) {
//		this.mathsScore = mathsScore;
//	}
//
//
//	public int getChemistryScore() {
//		return chemistryScore;
//	}
//
//
//	public void setChemistryScore(int chemistryScore) {
//		this.chemistryScore = chemistryScore;
//	}
//
//
//	public int getPhysicsScore() {
//		return physicsScore;
//	}
//
//
//	public void setPhysicsScore(int physicsScore) {
//		this.physicsScore = physicsScore;
//	}
//
//
//	public int getTotal() {
//		return total;
//	}
//
//
//	public void setTotal(int total) 
//	{
//		this.total =getPhysicsScore()+getChemistryScore()+getMathsScore();
//	}
//
//
//	@Override
//	public String toString() {
//		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", mathsScore=" + mathsScore
//				+ ", chemistryScore=" + chemistryScore + ", physicsScore=" + physicsScore + ", total=" + total + "]";
//	}
//	
//	
//	
//	
//}