package com.zray.cam.dim.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@TableName("user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @TableField("id")
    private Long id;
    @TableField("name")
    private String name;
    @TableField("phone")
    private String phone;
    @TableField("password")
    private String password;
}
