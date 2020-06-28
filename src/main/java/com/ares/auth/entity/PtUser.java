package com.ares.auth.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 平台角色表
 * </p>
 *
 * @author 代码机
 * @since 2020-06-28
 */
@TableName("pt_user")
public class PtUser extends Model<PtUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色编码
     */
    private String code;

    /**
     * 角色备注，标明角色作用
     */
    private String remark;

    /**
     * 是否超级管理员 0:否 1:是
     */
    private Integer adminFlag;

    /**
     * 是否有效 0:无效 1:有效
     */
    private Integer enableFlag;

    /**
     * 是否删除 0:保存 1:删除
     */
    private Integer deleteFlag;

    /**
     * 创建日期
     */
    private Long createTime;

    /**
     * 创建人
     */
    private Integer createUid;

    /**
     * 更新日期
     */
    private Long updateTime;

    /**
     * 更新人
     */
    private Integer updateUid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Integer getAdminFlag() {
        return adminFlag;
    }

    public void setAdminFlag(Integer adminFlag) {
        this.adminFlag = adminFlag;
    }
    public Integer getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(Integer enableFlag) {
        this.enableFlag = enableFlag;
    }
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
    public Integer getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
    public Integer getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(Integer updateUid) {
        this.updateUid = updateUid;
    }

    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String CODE = "code";

    public static final String REMARK = "remark";

    public static final String ADMIN_FLAG = "admin_flag";

    public static final String ENABLE_FLAG = "enable_flag";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_UID = "create_uid";

    public static final String UPDATE_TIME = "update_time";

    public static final String UPDATE_UID = "update_uid";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "PtUser{" +
        "id=" + id +
        ", name=" + name +
        ", code=" + code +
        ", remark=" + remark +
        ", adminFlag=" + adminFlag +
        ", enableFlag=" + enableFlag +
        ", deleteFlag=" + deleteFlag +
        ", createTime=" + createTime +
        ", createUid=" + createUid +
        ", updateTime=" + updateTime +
        ", updateUid=" + updateUid +
        "}";
    }
}
