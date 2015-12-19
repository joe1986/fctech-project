package com.fctech.manager.common.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 树形控件
 *
 * 
 */
public class TreeBeanVo {
	private String menuId;

	private String menuName;

	private String menuUrl;

	private String parentMenuId;

	private List<TreeBeanVo> children = new ArrayList<TreeBeanVo>(); // 子节点

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public List<TreeBeanVo> getChildren() {
		return children;
	}

	public void setChildren(List<TreeBeanVo> children) {
		this.children = children;
	}

	public String getParentMenuId() {
		return parentMenuId;
	}

	public void setParentMenuId(String parentMenuId) {
		this.parentMenuId = parentMenuId;
	}

}
