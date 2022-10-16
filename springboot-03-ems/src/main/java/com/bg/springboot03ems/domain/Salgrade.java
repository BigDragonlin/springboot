package com.bg.springboot03ems.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName salgrade
 */
@TableName(value ="salgrade")
@Data
public class Salgrade implements Serializable {
    /**
     * 
     */
    private Integer grade;

    /**
     * 
     */
    private Integer losal;

    /**
     * 
     */
    private Integer hisal;

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
        Salgrade other = (Salgrade) that;
        return (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getLosal() == null ? other.getLosal() == null : this.getLosal().equals(other.getLosal()))
            && (this.getHisal() == null ? other.getHisal() == null : this.getHisal().equals(other.getHisal()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getLosal() == null) ? 0 : getLosal().hashCode());
        result = prime * result + ((getHisal() == null) ? 0 : getHisal().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grade=").append(grade);
        sb.append(", losal=").append(losal);
        sb.append(", hisal=").append(hisal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}