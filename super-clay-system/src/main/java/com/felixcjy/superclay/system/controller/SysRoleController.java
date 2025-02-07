package com.felixcjy.superclay.system.controller;

import cn.hutool.core.util.IdUtil;
import com.felixcjy.superclay.system.domain.entity.SysRole;
import com.felixcjy.superclay.system.service.SysRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Felix(蔡济阳)
 * @since : 2025/2/7 15:26
 */
@RestController
@RequestMapping("/system/role/test")
public class SysRoleController {
    private static final Logger logger = LoggerFactory.getLogger(SysRoleController.class);

    private final SysRoleService sysRoleService;

    public SysRoleController(SysRoleService sysRoleService) {
        this.sysRoleService = sysRoleService;
    }
}
