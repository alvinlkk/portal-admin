package com.alvinlkk.portal.admin.service;

import com.alvinlkk.portal.admin.model.SysUser;

import java.util.List;

/**
 * 用户接口
 *
 * @author alvinkk
 * @create 2019-01-15 20:41
 **/
public interface SysUserService {

    /**
     * 根据用户ID查找用户
     * @param userId
     * @return
     */
    SysUser findByUserId(Long userId);

    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();
}
