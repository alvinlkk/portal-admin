package com.alvinlkk.portal.admin.service.impl;

import com.alvinlkk.portal.admin.dao.SysUserMapper;
import com.alvinlkk.portal.admin.model.SysUser;
import com.alvinlkk.portal.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户逻辑实现类
 *
 * @author alvinkk
 * @create 2019-01-15 20:42
 **/
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findByUserId(Long userId) {
        return sysUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findPage();
    }
}
