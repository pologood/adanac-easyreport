package com.easytoolsoft.easyreport.data.membership.po;

import java.io.Serializable;
import java.util.Date;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 系统角色(ezrpt_member_role表)持久化类
 *
 * @author Tom Deng
 */
@SuppressWarnings("serial")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Role implements Serializable {
	/**
	 * 系统角色标识
	 */
	private Integer id;
	/**
	 * 系统角色所拥有的模块集合(module_id以英文逗号分隔)
	 */
	private String modules;
	/**
	 * 系统角色所拥有的操作集合(permission_id以英文逗号分隔)
	 */
	private String permissions;
	/**
	 * 系统角色名称
	 */
	private String name;
	/**
	 * 系统角色英语名
	 */
	private String code;
	/**
	 * 是否为系统角色,1表示是，0表示否,默认为0
	 */
	private Byte isSystem;
	/**
	 * 系统角色的状态,1表示启用,0表示禁用,默认为1,其他保留
	 */
	private Byte status;
	/**
	 * 系统角色的排序顺序
	 */
	private Integer sequence;
	/**
	 * 系统角色备注
	 */
	private String comment;
	/**
	 * 创建用户
	 */
	private String createUser;
	/**
	 * 系统角色记录创建时间
	 */
	private Date gmtCreated;
	/**
	 * 系统角色记录更新时间戳
	 */
	private Date gmtModified;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModules() {
		return modules;
	}

	public void setModules(String modules) {
		this.modules = modules;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
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

	public Byte getIsSystem() {
		return isSystem;
	}

	public void setIsSystem(Byte isSystem) {
		this.isSystem = isSystem;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getGmtCreated() {
		return gmtCreated;
	}

	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

}
