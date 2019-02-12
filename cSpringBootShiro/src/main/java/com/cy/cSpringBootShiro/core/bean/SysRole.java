package com.cy.cSpringBootShiro.core.bean;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 系统角色实体类
 *
 * @author ChenYan
 * @date2019年02月11日 17:11
 */
@Entity
@Data
public class SysRole implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @Id
    @GeneratedValue
    private long id;

    /**
     * 角色标识程序中判断使用,如"admin",这个是唯一的:
     */
    private String role;

    /**
     * 角色描述,UI界面显示使用
     */
    private String description;

    /**
     * 是否可用,如果不可用将不会添加给用户
     */
    private Boolean available = Boolean.FALSE;

    /**
     * 角色 -- 权限关系：多对多关系;
     */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="SysRolePermission",joinColumns={@JoinColumn(name="roleId")},inverseJoinColumns={@JoinColumn(name="permissionId")})
    private List<SysPermission> permissions;

    /**
     * 一个角色对应多个用户
     */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="SysUserRole",joinColumns={@JoinColumn(name="roleId")},inverseJoinColumns={@JoinColumn(name="uid")})
    private List<UserInfo> userInfos;

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("{");
        sb.append("\"id\":\"").append(id).append("\"");
        sb.append(",\"role\":\"").append(role).append("\"");
        sb.append(",\"description\":\"").append(description).append("\"");
        sb.append(",\"available\":\"").append(available).append("\"}");

        return sb.toString();
    }
}
