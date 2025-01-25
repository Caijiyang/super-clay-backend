package com.felixcjy.superclay.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.felixcjy.superclay.system.domain.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Felix(蔡济阳)
 * @since : 2025/1/23 09:01
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    IPage<SysUser> getUserListByInfo(@Param("page") Page<SysUser> page,
                                     @Param("name") String name);
}
