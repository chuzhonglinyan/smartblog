package com.yuntian.smartblog.model.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.yuntian.smartblog.model.entity.UserAccount;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: yuntian
 * @Date: 2018/8/22 21:40
 * @Description:  前端用户信息
 */
public class UserAccountVo extends UserAccount {


    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
