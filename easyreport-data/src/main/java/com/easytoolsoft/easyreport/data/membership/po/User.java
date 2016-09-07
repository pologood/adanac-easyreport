package com.easytoolsoft.easyreport.data.membership.po;

import java.io.Serializable;
import java.util.Date;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 系统用户(ezrpt_member_user表)持久化类
 *
 * @author Tom Deng
 */
@SuppressWarnings("serial")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User implements Serializable {
	/**
	 * 系统用户标识
	 */
	private Integer id;
	/**
	 * 系统用户所属角色集合(role_id以英文逗号分隔)
	 */
	private String roles;
	/**
	 * 系统用户账号
	 */
	private String account;
	/**
	 * 系统用户密码
	 */
	private String password;
	/**
	 * 加盐
	 */
	private String salt;
	/**
	 * 系统用户姓名
	 */
	private String name;
	/**
	 * 系统用户电子邮箱
	 */
	private String email;
	/**
	 * 系统用户用户电话号码,多个用英文逗号分开
	 */
	private String telephone;
	/**
	 * 系统用户的状态,1表示启用,0表示禁用,默认为1,其他保留
	 */
	private Byte status;
	/**
	 * 系统用户备注
	 */
	private String comment;
	/**
	 * 系统用户记录创建时间
	 */
	private Date gmtCreated;
	/**
	 * 系统用户记录更新时间戳
	 */
	private Date gmtModified;

	/**
	 * 获取系统用户密码的凭证盐(account+salt)
	 *
	 * @return account+salt
	 */
	public String getCredentialsSalt() {
		return this.account + this.salt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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
