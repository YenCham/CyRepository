package com.cy.cSpringBootShiro.core.bean;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 权限实体类
 *
 * @author ChenYan
 * @date2019年02月11日 16:41
 */
@Entity
@Data
public class SysPermission implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 资源类型，[menu|button]
     */
    @Column(columnDefinition = "enum('menu','button')")
    private String resourceType;

    /**
     * 资源路径
     */
    private String url;

    /**
     * 权限字符串,
     * menu例子：role:*，
     * button例子：role:create,role:update,role:delete,role:view
     */
    private String permission;

    /**
     * 父编号
     */
    private long parentId;

    /**
     * 父编号列表
     */
    private String parentIds;

    private Boolean available = Boolean.FALSE;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="SysRolePermission", joinColumns={@JoinColumn(name="permissionId")}, inverseJoinColumns={@JoinColumn(name="roleId")})
    private List<SysRole> roles;

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("{");
        sb.append("\"id\":\"").append(id).append("\"");
        sb.append(",\"name\":\"").append(name).append("\"");
        sb.append(",\"resourceType\":\"").append(resourceType).append("\"");
        sb.append(",\"url\":\"").append(url).append("\"");
        sb.append(",\"permission\":\"").append(permission).append("\"");
        sb.append(",\"parentId\":\"").append(parentId).append("\"");
        sb.append(",\"parentIds\":\"").append(parentIds).append("\"");
        sb.append(",\"available\":\"").append(available).append("\"}");

        return sb.toString();
    }
}
