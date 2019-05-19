package com.nzy.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nzy.entity.Goods;
import com.nzy.service.GoodsService;

@Controller
public class GoodsController {
     @Autowired
     private GoodsService service;
     
     
     //展示
     @RequestMapping("list")
     public String list(Model model,@RequestParam(value="pageNum",defaultValue="1")Integer PageNum,String mohu){
    	   HashMap<String, Object> map = new HashMap<>();
    	   map.put("mohu", mohu);
    	   PageHelper.startPage(PageNum,5);
    	   
    	   List<Goods> list = service.list(map);
    	   PageInfo<Goods> page = new PageInfo<>(list);
    	   model.addAttribute("list", list);
    	   model.addAttribute("map", map);
    	   model.addAttribute("page", page);
    	   return "list";
     } 
     
     //添加页面
     @RequestMapping("tj")
     public String tj(){
    	 return "add";
     }
     
     //下拉框回显
     @RequestMapping("brandList")
     @ResponseBody
     public Object brandList(){
    	List list  = service.brandList();
    	return list;
     }
     
     //添加
     @RequestMapping("add")
     public String add(Goods goods){
    	 int i = service.add(goods);
    	 if(i>0){
    		 return "redirect:list";
    	 }else{
    		 return "error";
    	 }
     }
}
