package com.zm.mapper;

import com.zm.bean.TChe;
import com.zm.bean.TCheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCheMapper {
    long countByExample(TCheExample example);

    int deleteByExample(TCheExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TChe record);

    int insertSelective(TChe record);

    List<TChe> selectByExample(TCheExample example);

    TChe selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TChe record, @Param("example") TCheExample example);

    int updateByExample(@Param("record") TChe record, @Param("example") TCheExample example);

    int updateByPrimaryKeySelective(TChe record);

    int updateByPrimaryKey(TChe record);
}