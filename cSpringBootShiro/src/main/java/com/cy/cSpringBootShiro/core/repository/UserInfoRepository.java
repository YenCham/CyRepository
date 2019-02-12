package com.cy.cSpringBootShiro.core.repository;

import com.cy.cSpringBootShiro.core.bean.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * UserInfo持久化类
 *
 * @author ChenYan
 * @date2019年02月11日 17:36
 */
public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {

    /**
     * 通过username查找用户信息
     */
    public UserInfo findByUsername(String username);
}
