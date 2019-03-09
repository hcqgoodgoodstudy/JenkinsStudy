package com.hcq.service.impl;

import com.hcq.dao.CarMapper;
import com.hcq.service.CarService;
import com.hcq.util.JedisUtil;
import com.hcq.util.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * fileName:CarServiceImpl
 * description:
 * author:hcq
 * createTime:2019-03-03 8:01
 */
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarMapper mapper;
 /*   @Autowired
    JedisUtil util;*/
    public List<String> getNames() {
        /*List<String> value= (List<String>) util.get("names");
        if(value!=null){
            System.out.println("查缓存");
            return value;
        }else{
            System.out.println("查数据库");
            List<String> list=mapper.selectName();
            util.put("names",list);*/
            return mapper.selectName();
    }
}
