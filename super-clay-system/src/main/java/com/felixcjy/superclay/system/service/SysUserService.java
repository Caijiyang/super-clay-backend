package com.felixcjy.superclay.system.service;

import com.felixcjy.superclay.system.domain.entity.SysUser;

/**
 * @author: Felix(蔡济阳)
 * @since : 2025/1/23 09:21
 */
public interface SysUserService {
    SysUser getUserInfoById(String userId);
}
