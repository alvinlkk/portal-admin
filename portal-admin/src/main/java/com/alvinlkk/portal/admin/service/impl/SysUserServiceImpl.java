package com.alvinlkk.portal.admin.service.impl;

import com.alvinlkk.portal.admin.dao.SysUserMapper;
import com.alvinlkk.portal.admin.model.SysUser;
import com.alvinlkk.portal.admin.page.PageRequest;
import com.alvinlkk.portal.admin.page.PageResult;
import com.alvinlkk.portal.admin.page.PageUtils;
import com.alvinlkk.portal.admin.service.SysUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(getPageInfo(pageRequest));
    }

    /**
     * 调用分页插件完成分页
     * @param pageRequest
     * @return
     */
    private PageInfo<SysUser> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<SysUser> sysMenus = sysUserMapper.findPage();
        return new PageInfo<SysUser>(sysMenus);
    }
}
