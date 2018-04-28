package com.yu.ssm.mapper;

import com.yu.ssm.po.Voter;
import com.yu.ssm.po.VoterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoterMapper {
    int countByExample(VoterExample example);

    int deleteByExample(VoterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Voter record);

    int insertSelective(Voter record);

    List<Voter> selectByExample(VoterExample example);

    Voter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Voter record, @Param("example") VoterExample example);

    int updateByExample(@Param("record") Voter record, @Param("example") VoterExample example);

    int updateByPrimaryKeySelective(Voter record);

    int updateByPrimaryKey(Voter record);
}