package com.bg.springboot04myems.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class Employee {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private Date birth;
    private Integer gender;
    private Integer departmentId;

    public Employee(Integer id, String name, String email, Integer gender, Integer departmentid) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.departmentId = departmentid;
        this.birth = new Date();
    }


    public Employee() {
    }
}
