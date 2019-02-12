package com.cy.cSpringBootShiro.core.service;

import com.cy.cSpringBootShiro.core.bean.UserInfo;

/**
 * ${DESCRIPTION}
 *
 * @author ChenYan
 * @date2019年02月11日 17:38
 */
public interface UserInfoService {

    /**
     * 通过username查找用户信息
     * @param username
     * @return
     */
    public UserInfo findByUsername(String username);
}
