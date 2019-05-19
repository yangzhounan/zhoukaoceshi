package com.nzy.mapper;

import java.util.HashMap;
import java.util.List;

import com.nzy.entity.Goods;

public interface GoodsMapper {
    //展示
	List<Goods> list(HashMap<String, Object> map);
    //下拉框
	List brandList();
	//添加
	int add(Goods goods);

	

}
