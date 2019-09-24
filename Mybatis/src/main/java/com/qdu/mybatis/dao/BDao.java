package com.qdu.mybatis.dao;


import com.qdu.mybatis.pojo.B;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BDao {
    B selB(int i);
}
