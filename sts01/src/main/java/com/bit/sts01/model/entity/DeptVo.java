package com.bit.sts01.model.entity;

import java.sql.ResultSet;

public class DeptVo {
int deptno;
String dname,loc;


public DeptVo(ResultSet rs, String string, String string2, String string3) {
	
	
}

public DeptVo(int deptno, String dname, String loc) {
	super();
	this.deptno = deptno;
	this.dname = dname;
	this.loc = loc;
}

public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
@Override
public String toString() {
	return "DeptVo [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
}



}
