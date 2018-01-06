package com.xiejinpeng.service;

import cn.e3.pojo.TbItem;

public interface ItemService {
	
	/**
	 * 根据id查询一条数据
	 */
	public TbItem findTbItemById(Long itemId);

}
