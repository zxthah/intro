package com.zx.intro.dao;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Ka03 implements Serializable {
    private String aaa027;

    private String ake001;

    private String ake002;

    private String aka165;

    private String aka198;

    private String aka096;

    private String aka097;

    private String ake115;

    private String aka173;

    private String aka052;

    private String aka063;

    private String aac004;

    private String aka065;

    private String ake003;

    private String batchNo;

    private Date createDate;

    private Date updateDate;

    private String removed;

    private static final long serialVersionUID = 1L;

    public String getAaa027() {
        return aaa027;
    }

    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }

    public String getAke001() {
        return ake001;
    }

    public void setAke001(String ake001) {
        this.ake001 = ake001;
    }

    public String getAke002() {
        return ake002;
    }

    public void setAke002(String ake002) {
        this.ake002 = ake002;
    }

    public String getAka165() {
        return aka165;
    }

    public void setAka165(String aka165) {
        this.aka165 = aka165;
    }

    public String getAka198() {
        return aka198;
    }

    public void setAka198(String aka198) {
        this.aka198 = aka198;
    }

    public String getAka096() {
        return aka096;
    }

    public void setAka096(String aka096) {
        this.aka096 = aka096;
    }

    public String getAka097() {
        return aka097;
    }

    public void setAka097(String aka097) {
        this.aka097 = aka097;
    }

    public String getAke115() {
        return ake115;
    }

    public void setAke115(String ake115) {
        this.ake115 = ake115;
    }

    public String getAka173() {
        return aka173;
    }

    public void setAka173(String aka173) {
        this.aka173 = aka173;
    }

    public String getAka052() {
        return aka052;
    }

    public void setAka052(String aka052) {
        this.aka052 = aka052;
    }

    public String getAka063() {
        return aka063;
    }

    public void setAka063(String aka063) {
        this.aka063 = aka063;
    }

    public String getAac004() {
        return aac004;
    }

    public void setAac004(String aac004) {
        this.aac004 = aac004;
    }

    public String getAka065() {
        return aka065;
    }

    public void setAka065(String aka065) {
        this.aka065 = aka065;
    }

    public String getAke003() {
        return ake003;
    }

    public void setAke003(String ake003) {
        this.ake003 = ake003;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemoved() {
        return removed;
    }

    public void setRemoved(String removed) {
        this.removed = removed;
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
        Ka03 other = (Ka03) that;
        return (this.getAaa027() == null ? other.getAaa027() == null : this.getAaa027().equals(other.getAaa027()))
            && (this.getAke001() == null ? other.getAke001() == null : this.getAke001().equals(other.getAke001()))
            && (this.getAke002() == null ? other.getAke002() == null : this.getAke002().equals(other.getAke002()))
            && (this.getAka165() == null ? other.getAka165() == null : this.getAka165().equals(other.getAka165()))
            && (this.getAka198() == null ? other.getAka198() == null : this.getAka198().equals(other.getAka198()))
            && (this.getAka096() == null ? other.getAka096() == null : this.getAka096().equals(other.getAka096()))
            && (this.getAka097() == null ? other.getAka097() == null : this.getAka097().equals(other.getAka097()))
            && (this.getAke115() == null ? other.getAke115() == null : this.getAke115().equals(other.getAke115()))
            && (this.getAka173() == null ? other.getAka173() == null : this.getAka173().equals(other.getAka173()))
            && (this.getAka052() == null ? other.getAka052() == null : this.getAka052().equals(other.getAka052()))
            && (this.getAka063() == null ? other.getAka063() == null : this.getAka063().equals(other.getAka063()))
            && (this.getAac004() == null ? other.getAac004() == null : this.getAac004().equals(other.getAac004()))
            && (this.getAka065() == null ? other.getAka065() == null : this.getAka065().equals(other.getAka065()))
            && (this.getAke003() == null ? other.getAke003() == null : this.getAke003().equals(other.getAke003()))
            && (this.getBatchNo() == null ? other.getBatchNo() == null : this.getBatchNo().equals(other.getBatchNo()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getRemoved() == null ? other.getRemoved() == null : this.getRemoved().equals(other.getRemoved()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAaa027() == null) ? 0 : getAaa027().hashCode());
        result = prime * result + ((getAke001() == null) ? 0 : getAke001().hashCode());
        result = prime * result + ((getAke002() == null) ? 0 : getAke002().hashCode());
        result = prime * result + ((getAka165() == null) ? 0 : getAka165().hashCode());
        result = prime * result + ((getAka198() == null) ? 0 : getAka198().hashCode());
        result = prime * result + ((getAka096() == null) ? 0 : getAka096().hashCode());
        result = prime * result + ((getAka097() == null) ? 0 : getAka097().hashCode());
        result = prime * result + ((getAke115() == null) ? 0 : getAke115().hashCode());
        result = prime * result + ((getAka173() == null) ? 0 : getAka173().hashCode());
        result = prime * result + ((getAka052() == null) ? 0 : getAka052().hashCode());
        result = prime * result + ((getAka063() == null) ? 0 : getAka063().hashCode());
        result = prime * result + ((getAac004() == null) ? 0 : getAac004().hashCode());
        result = prime * result + ((getAka065() == null) ? 0 : getAka065().hashCode());
        result = prime * result + ((getAke003() == null) ? 0 : getAke003().hashCode());
        result = prime * result + ((getBatchNo() == null) ? 0 : getBatchNo().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getRemoved() == null) ? 0 : getRemoved().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aaa027=").append(aaa027);
        sb.append(", ake001=").append(ake001);
        sb.append(", ake002=").append(ake002);
        sb.append(", aka165=").append(aka165);
        sb.append(", aka198=").append(aka198);
        sb.append(", aka096=").append(aka096);
        sb.append(", aka097=").append(aka097);
        sb.append(", ake115=").append(ake115);
        sb.append(", aka173=").append(aka173);
        sb.append(", aka052=").append(aka052);
        sb.append(", aka063=").append(aka063);
        sb.append(", aac004=").append(aac004);
        sb.append(", aka065=").append(aka065);
        sb.append(", ake003=").append(ake003);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", removed=").append(removed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}