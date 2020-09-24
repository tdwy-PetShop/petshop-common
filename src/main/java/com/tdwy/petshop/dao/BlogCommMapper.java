package com.tdwy.petshop.dao;

import com.tdwy.petshop.bean.BlogComm;
import com.tdwy.petshop.bean.BlogCommExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogCommMapper {
    long countByExample(BlogCommExample example);

    int deleteByExample(BlogCommExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogComm record);

    int insertSelective(BlogComm record);

    List<BlogComm> selectByExample(BlogCommExample example);

    BlogComm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogComm record, @Param("example") BlogCommExample example);

    int updateByExample(@Param("record") BlogComm record, @Param("example") BlogCommExample example);

    int updateByPrimaryKeySelective(BlogComm record);

    int updateByPrimaryKey(BlogComm record);
}