package com.tdwy.petshop.dao;

import com.tdwy.petshop.bean.ProComm;
import com.tdwy.petshop.bean.ProCommExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProCommMapper {
    long countByExample(ProCommExample example);

    int deleteByExample(ProCommExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProComm record);

    int insertSelective(ProComm record);

    List<ProComm> selectByExample(ProCommExample example);

    ProComm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProComm record, @Param("example") ProCommExample example);

    int updateByExample(@Param("record") ProComm record, @Param("example") ProCommExample example);

    int updateByPrimaryKeySelective(ProComm record);

    int updateByPrimaryKey(ProComm record);
}