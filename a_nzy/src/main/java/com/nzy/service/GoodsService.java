package com.nzy.service;

import java.util.HashMap;
import java.util.List;

import com.nzy.entity.Goods;

public interface GoodsService {
    //展示
	List<Goods> list(HashMap<String, Object> map);
    //下拉框回显
	List brandList();
    //添加
	int add(Goods goods);

}
