package com.felixcjy.superclay.system.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.felixcjy.superclay.common.domain.dto.PageDTO;
import com.felixcjy.superclay.system.domain.entity.SysUser;
import com.felixcjy.superclay.system.mapper.SysUserMapper;
import com.felixcjy.superclay.system.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * @author: Felix(蔡济阳)
 * @since : 2025/1/23 09:21
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    private final SysUserMapper sysUserMapper;

    public SysUserServiceImpl(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }

    @Override
    public SysUser getUserInfoById(String userId) {
        return sysUserMapper.selectById(userId);
    }

    @Override
    public Object getUserListByInfo(String name) {
        Page<SysUser> sysUserPage = new Page<>(1,10);
        IPage<SysUser> sysUserIPage = sysUserMapper.getUserListByInfo(sysUserPage,name);
        return new PageDTO<>(sysUserIPage.getTotal(),
                sysUserIPage.getPages(),
                sysUserIPage.getRecords(),
                sysUserIPage.getCurrent(),
                sysUserIPage.getSize());
    }
}
