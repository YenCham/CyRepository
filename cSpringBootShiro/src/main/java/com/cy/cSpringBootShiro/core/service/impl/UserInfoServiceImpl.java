package com.cy.cSpringBootShiro.core.service.impl;

import com.cy.cSpringBootShiro.core.bean.UserInfo;
import com.cy.cSpringBootShiro.core.repository.UserInfoRepository;
import com.cy.cSpringBootShiro.core.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ${DESCRIPTION}
 *
 * @author ChenYan
 * @date2019年02月11日 17:39
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoRepository.findByUsername(username);
    }
}
