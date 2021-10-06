package com.xiexin.bean;

import java.io.Serializable;

/**
 * dept
 * @author 
 */
public class Dept implements Serializable {
    private Integer deptnum;

    private String deptname;

    private String deptaddr;

    private Integer parentnum;

    private String status;

    private String parentname;

    private static final long serialVersionUID = 1L;

    public Integer getDeptnum() {
        return deptnum;
    }

    public void setDeptnum(Integer deptnum) {
        this.deptnum = deptnum;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptaddr() {
        return deptaddr;
    }

    public void setDeptaddr(String deptaddr) {
        this.deptaddr = deptaddr;
    }

    public Integer getParentnum() {
        return parentnum;
    }

    public void setParentnum(Integer parentnum) {
        this.parentnum = parentnum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Dept other = (Dept) that;
        return (this.getDeptnum() == null ? other.getDeptnum() == null : this.getDeptnum().equals(other.getDeptnum()))
            && (this.getDeptname() == null ? other.getDeptname() == null : this.getDeptname().equals(other.getDeptname()))
            && (this.getDeptaddr() == null ? other.getDeptaddr() == null : this.getDeptaddr().equals(other.getDeptaddr()))
            && (this.getParentnum() == null ? other.getParentnum() == null : this.getParentnum().equals(other.getParentnum()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getParentname() == null ? other.getParentname() == null : this.getParentname().equals(other.getParentname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeptnum() == null) ? 0 : getDeptnum().hashCode());
        result = prime * result + ((getDeptname() == null) ? 0 : getDeptname().hashCode());
        result = prime * result + ((getDeptaddr() == null) ? 0 : getDeptaddr().hashCode());
        result = prime * result + ((getParentnum() == null) ? 0 : getParentnum().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getParentname() == null) ? 0 : getParentname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptnum=").append(deptnum);
        sb.append(", deptname=").append(deptname);
        sb.append(", deptaddr=").append(deptaddr);
        sb.append(", parentnum=").append(parentnum);
        sb.append(", status=").append(status);
        sb.append(", parentname=").append(parentname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}