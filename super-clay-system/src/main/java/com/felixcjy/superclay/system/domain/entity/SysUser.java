package com.felixcjy.superclay.system.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 用户表映射实体
 *
 * @author: Felix(蔡济阳)
 * @since : 2025/1/21 17:54
 */
@TableName("sys_user")
public class SysUser implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    @TableId("user_id")
    private String userId;

    /** 账号 */
    @TableField("user_account")
    private String userAccount;

    /** 姓名 */
    @TableField("user_name")
    private String userName;

    /** 昵称 */
    @TableField("nick_name")
    private String nickName;

    /** 性别 */
    @TableField("sex")
    private String sex;

    /** 密码 */
    @TableField("password")
    private String password;

    /** 电话 */
    @TableField("phone_number")
    private String phoneNumber;

    /** 邮箱 */
    @TableField("email")
    private String email;

    /** 用户类型 */
    @TableField("user_type")
    private String userType;

    /** 用户头像 */
    @TableField("avatar")
    private String avatar;

    /** 备注 */
    @TableField("remark")
    private String remark;

    /** 账号状态（0 正常, 1 停用） */
    @TableField("status")
    private String status;

    /** 删除标志（0 正常, 1 删除） */
    @TableField("del_flag")
    private String delFlag;

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

    /** 最后登录日期 */
    @TableField("last_login_date_time")
    private LocalDateTime lastLoginDateTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
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

    public LocalDateTime getLastLoginDateTime() {
        return lastLoginDateTime;
    }

    public void setLastLoginDateTime(LocalDateTime lastLoginDateTime) {
        this.lastLoginDateTime = lastLoginDateTime;
    }

    public static void main(String[] args) {
        System.out.println("fe2d7d49d6d84666b36c472e9d41787b".length());
    }
}