package com.felixcjy.superclay.system.controller;

import com.felixcjy.superclay.system.domain.entity.SysUser;
import com.felixcjy.superclay.system.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Felix(蔡济阳)
 * @since : 2025/1/23 09:20
 */
@RestController
@RequestMapping("/system/user")
public class SysUserController {
    private static final Logger logger = LoggerFactory.getLogger(SysUserController.class);

    private final SysUserService sysUserService;

    public SysUserController(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @GetMapping("/getUserInfoById")
    public SysUser getUserInfoById(String userId) {
        try {
            return sysUserService.getUserInfoById(userId);
        } catch (Exception e) {
            logger.error("getUserById error, param:{}", userId, e);
            return null;
        }
    }
}
