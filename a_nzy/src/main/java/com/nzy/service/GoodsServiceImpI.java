package com.nzy.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nzy.entity.Goods;
import com.nzy.mapper.GoodsMapper;
@Service
public class GoodsServiceImpI implements GoodsService {
    @Autowired
    private GoodsMapper dao;
    
    //展示
	@Override
	public List<Goods> list(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.list(map);
	}
    
	
	//下拉框回显
	@Override
	public List brandList() {
		// TODO Auto-generated method stub
		return dao.brandList();
	}

    //添加
	@Override
	public int add(Goods goods) {
		// TODO Auto-generated method stub
		return dao.add(goods);
	}

}
