package com.bg.springboot04myems;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
    @TableField(value = "GRADE")
    private Integer GRADE;

    /**
     * 
     */
    @TableField(value = "LOSAL")
    private Integer LOSAL;

    /**
     * 
     */
    @TableField(value = "HISAL")
    private Integer HISAL;

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
        return (this.getGRADE() == null ? other.getGRADE() == null : this.getGRADE().equals(other.getGRADE()))
            && (this.getLOSAL() == null ? other.getLOSAL() == null : this.getLOSAL().equals(other.getLOSAL()))
            && (this.getHISAL() == null ? other.getHISAL() == null : this.getHISAL().equals(other.getHISAL()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGRADE() == null) ? 0 : getGRADE().hashCode());
        result = prime * result + ((getLOSAL() == null) ? 0 : getLOSAL().hashCode());
        result = prime * result + ((getHISAL() == null) ? 0 : getHISAL().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", GRADE=").append(GRADE);
        sb.append(", LOSAL=").append(LOSAL);
        sb.append(", HISAL=").append(HISAL);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}