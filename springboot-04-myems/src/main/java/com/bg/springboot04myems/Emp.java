package com.bg.springboot04myems;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

/**
 * 
 * @TableName emp
 */
@TableName(value ="emp")
@Data
public class Emp implements Serializable {
    /**
     * 
     */
    @TableId(value = "EMPNO")
    private Integer EMPNO;

    /**
     * 
     */
    @TableField(value = "ENAME")
    private String ENAME;

    /**
     * 
     */
    @TableField(value = "JOB")
    private String JOB;

    /**
     * 
     */
    @TableField(value = "MGR")
    private Integer MGR;

    /**
     * 
     */
    @TableField(value = "HIREDATE")
    private LocalDate HIREDATE;

    /**
     * 
     */
    @TableField(value = "SAL")
    private Double SAL;

    /**
     * 
     */
    @TableField(value = "COMM")
    private Double COMM;

    /**
     * 
     */
    @TableField(value = "DEPTNO")
    private Integer DEPTNO;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
        Emp other = (Emp) that;
        return (this.getEMPNO() == null ? other.getEMPNO() == null : this.getEMPNO().equals(other.getEMPNO()))
            && (this.getENAME() == null ? other.getENAME() == null : this.getENAME().equals(other.getENAME()))
            && (this.getJOB() == null ? other.getJOB() == null : this.getJOB().equals(other.getJOB()))
            && (this.getMGR() == null ? other.getMGR() == null : this.getMGR().equals(other.getMGR()))
            && (this.getHIREDATE() == null ? other.getHIREDATE() == null : this.getHIREDATE().equals(other.getHIREDATE()))
            && (this.getSAL() == null ? other.getSAL() == null : this.getSAL().equals(other.getSAL()))
            && (this.getCOMM() == null ? other.getCOMM() == null : this.getCOMM().equals(other.getCOMM()))
            && (this.getDEPTNO() == null ? other.getDEPTNO() == null : this.getDEPTNO().equals(other.getDEPTNO()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEMPNO() == null) ? 0 : getEMPNO().hashCode());
        result = prime * result + ((getENAME() == null) ? 0 : getENAME().hashCode());
        result = prime * result + ((getJOB() == null) ? 0 : getJOB().hashCode());
        result = prime * result + ((getMGR() == null) ? 0 : getMGR().hashCode());
        result = prime * result + ((getHIREDATE() == null) ? 0 : getHIREDATE().hashCode());
        result = prime * result + ((getSAL() == null) ? 0 : getSAL().hashCode());
        result = prime * result + ((getCOMM() == null) ? 0 : getCOMM().hashCode());
        result = prime * result + ((getDEPTNO() == null) ? 0 : getDEPTNO().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", EMPNO=").append(EMPNO);
        sb.append(", ENAME=").append(ENAME);
        sb.append(", JOB=").append(JOB);
        sb.append(", MGR=").append(MGR);
        sb.append(", HIREDATE=").append(HIREDATE);
        sb.append(", SAL=").append(SAL);
        sb.append(", COMM=").append(COMM);
        sb.append(", DEPTNO=").append(DEPTNO);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}