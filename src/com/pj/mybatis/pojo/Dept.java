package com.pj.mybatis.pojo;

public class Dept {
private String deptNo;
private String dname;
private String loc;
public String getDeptNo() {
	return deptNo;
}
public void setDeptNo(String deptNo) {
	this.deptNo = deptNo;
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
	return "Dept [[deptNo=" + deptNo + ", dname=" + dname + ", loc=" + loc + "]]";
}

}
