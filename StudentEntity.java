package com.entity;

public class StudentEntity {
  private int ID;
  private String NAME;
  private int AGE;
  private String CITY ;
  
  public StudentEntity(){
	  
  }
  
  
  
public StudentEntity(int iD, String nAME, int aGE, String cITY) {
	super();
	ID = iD;
	NAME = nAME;
	AGE = aGE;
	CITY = cITY;
}



public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getNAME() {
	return NAME;
}
public void setNAME(String nAME) {
	NAME = nAME;
}
public int getAGE() {
	return AGE;
}
public void setAGE(int aGE) {
	AGE = aGE;
}
public String getCITY() {
	return CITY;
}
public void setCITY(String cITY) {
	CITY = cITY;
}



@Override
public String toString() {
	return "StudentEntity [ID=" + ID + ", NAME=" + NAME + ", AGE=" + AGE + ", CITY=" + CITY + "]";
}
  

  
}
