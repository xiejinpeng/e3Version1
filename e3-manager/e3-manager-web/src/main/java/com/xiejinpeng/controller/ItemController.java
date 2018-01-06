package com.xiejinpeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiejinpeng.service.ItemService;

import cn.e3.pojo.TbItem;

@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@ResponseBody
	@RequestMapping("/{itemId}")
	public TbItem findItemById(@PathVariable Long itemId){
		return itemService.findTbItemById(itemId);
	}
}
