package com.cy.cSpringBootShiro.core.bean;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author ChenYan
 * @date2019年02月11日 16:31
 */
@Entity
@Data
public class UserInfo implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @Id
    @GeneratedValue
    private long uid;

    /**
     * 账号
     */
    @Column(unique = true)
    private String username;

    /**
     * 名称（昵称或者真实姓名，不同系统不同定义）
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 加密密码的盐
     */
    private String salt;

    /**
     * 用户状态,
     * 0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 ,
     * 1:正常状态,
     * 2：用户被锁定.
     */
    private int state;

    /**
     * 一个用户具有多个角色
     */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="SysUserRole",joinColumns={@JoinColumn(name="uid")},inverseJoinColumns={@JoinColumn(name="roleId")})
    private List<SysRole> roleList;

    /**
     * 密码盐.
     * @return
     */
    public String getCredentialsSalt(){
        return this.username+this.salt;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("{");
        sb.append("\"uid\":\"").append(uid).append("\"");
        sb.append(",\"username\":\"").append(username).append("\"");
        sb.append(",\"name\":\"").append(name).append("\"");
        sb.append(",\"password\":\"").append(password).append("\"");
        sb.append(",\"salt\":\"").append(salt).append("\"");
        sb.append(",\"state\":\"").append(state).append("\"}");

        return sb.toString();
    }
}
