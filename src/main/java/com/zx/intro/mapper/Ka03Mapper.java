package com.zx.intro.mapper;

import com.zx.intro.dao.Ka03;
import com.zx.intro.dao.Ka03Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ka03Mapper {
    long countByExample(Ka03Example example);

    int deleteByExample(Ka03Example example);

    int insert(Ka03 record);

    int insertSelective(Ka03 record);

    int count();

    List<Ka03> selectByExample(Ka03Example example);

    int updateByExampleSelective(@Param("record") Ka03 record, @Param("example") Ka03Example example);

    int updateByExample(@Param("record") Ka03 record, @Param("example") Ka03Example example);
}