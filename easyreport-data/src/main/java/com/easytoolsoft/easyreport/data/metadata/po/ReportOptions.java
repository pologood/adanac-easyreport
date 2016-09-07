package com.easytoolsoft.easyreport.data.metadata.po;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 报表配置选项(ezrpt_meta_report表的options字段)持久化类
 *
 * @author Tom Deng
 */
@SuppressWarnings("serial")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ReportOptions implements Serializable {
	/**
	 * 报表默认展示多少天的数据
	 */
	private Integer dataRange;
	/**
	 * 布局形式.1横向;2纵向
	 */
	private Integer layout;
	/**
	 * 统计列布局形式.1横向;2纵向
	 */
	private Integer statColumnLayout;

	public Integer getDataRange() {
		return dataRange;
	}

	public void setDataRange(Integer dataRange) {
		this.dataRange = dataRange;
	}

	public Integer getLayout() {
		return layout;
	}

	public void setLayout(Integer layout) {
		this.layout = layout;
	}

	public Integer getStatColumnLayout() {
		return statColumnLayout;
	}

	public void setStatColumnLayout(Integer statColumnLayout) {
		this.statColumnLayout = statColumnLayout;
	}

}
