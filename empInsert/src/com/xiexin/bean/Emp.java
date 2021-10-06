package com.xiexin.bean;

import java.io.Serializable;

/**
 * emp
 * @author 
 */
public class Emp implements Serializable {
    private Integer empnum;

    private String empname;

    private String empsex;

    private Integer deptnum;

    private Integer parentnum;

    public Emp() {
        super();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empnum=" + empnum +
                ", empname='" + empname + '\'' +
                ", empsex='" + empsex + '\'' +
                ", deptnum=" + deptnum +
                ", parentnum=" + parentnum +
                '}';
    }

    public Integer getEmpnum() {
        return empnum;
    }

    public void setEmpnum(Integer empnum) {
        this.empnum = empnum;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpsex() {
        return empsex;
    }

    public void setEmpsex(String empsex) {
        this.empsex = empsex;
    }

    public Integer getDeptnum() {
        return deptnum;
    }

    public void setDeptnum(Integer deptnum) {
        this.deptnum = deptnum;
    }

    public Integer getParentnum() {
        return parentnum;
    }

    public void setParentnum(Integer parentnum) {
        this.parentnum = parentnum;
    }

    public Emp(String empname, String empsex, Integer deptnum, Integer parentnum) {
        this.empname = empname;
        this.empsex = empsex;
        this.deptnum = deptnum;
        this.parentnum = parentnum;
    }

    public Emp(Integer empnum, String empname, String empsex, Integer deptnum, Integer parentnum) {
        this.empnum = empnum;
        this.empname = empname;
        this.empsex = empsex;
        this.deptnum = deptnum;
        this.parentnum = parentnum;
    }
}