package com.fctech.manager.user.dao;

import java.util.List;
import java.util.Map;

import com.fctech.manager.common.base.TreeBeanVo;

public interface TreeBeanVoMapper {

	public List<TreeBeanVo> listByMap(Map<String, Object> params);
}