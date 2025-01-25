package com.felixcjy.superclay.system.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 角色信息表映射实体
 *
 * @author: Felix(蔡济阳)
 * @since : 2025/1/22 15:55
 */
@TableName("sys_role")
public class SysRole implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 角色ID */
    @TableField("role_id")
    private String roleId;

    /** 角色标识 */
    @TableField("role_sign")
    private String roleSign;

    /** 角色名称 */
    @TableField("role_name")
    private String roleName;

    /** 显示顺序 */
    @TableField("role_sort")
    private int roleSort;

    /** 备注 */
    @TableField("remark")
    private String remark;

    /** 角色状态 */
    @TableField("status")
    private char status;

    /** 删除标志 */
    @TableField("del_flag")
    private char delFlag;

    /** 创建者 */
    @TableField("create_user_id")
    private String createdUserId;

    /** 创建时间 */
    @TableField("create_date_time")
    private LocalDateTime createDateTime;

    /** 更新者 */
    @TableField("update_user_id")
    private String updateUserId;

    /** 更新时间 */
    @TableField("update_date_time")
    private LocalDateTime updateDateTime;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleSign() {
        return roleSign;
    }

    public void setRoleSign(String roleSign) {
        this.roleSign = roleSign;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getRoleSort() {
        return roleSort;
    }

    public void setRoleSort(int roleSort) {
        this.roleSort = roleSort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public char getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(char delFlag) {
        this.delFlag = delFlag;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }
}
