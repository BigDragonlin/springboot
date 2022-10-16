package com.bg.springboot05mybatisplus.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName dept
 */
@TableName(value ="dept")
@Data
public class Dept implements Serializable {
    /**
     * 
     */
    @TableId(value = "DEPTNO")
    private Integer DEPTNO;

    /**
     * 
     */
    @TableField(value = "DNAME")
    private String DNAME;

    /**
     * 
     */
    @TableField(value = "LOC")
    private String LOC;

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
        Dept other = (Dept) that;
        return (this.getDEPTNO() == null ? other.getDEPTNO() == null : this.getDEPTNO().equals(other.getDEPTNO()))
            && (this.getDNAME() == null ? other.getDNAME() == null : this.getDNAME().equals(other.getDNAME()))
            && (this.getLOC() == null ? other.getLOC() == null : this.getLOC().equals(other.getLOC()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDEPTNO() == null) ? 0 : getDEPTNO().hashCode());
        result = prime * result + ((getDNAME() == null) ? 0 : getDNAME().hashCode());
        result = prime * result + ((getLOC() == null) ? 0 : getLOC().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", DEPTNO=").append(DEPTNO);
        sb.append(", DNAME=").append(DNAME);
        sb.append(", LOC=").append(LOC);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}