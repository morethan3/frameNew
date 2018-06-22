package com.staging.frame.web.dao;

import com.staging.frame.web.model.Evaluation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Created by Li B.
 * @date Created in 2018/6/22.
 */
@Mapper
public interface BaseManager {

    @Select("select name,evaluation,evaluation_type as evaluationType from t_frame_evaluation")
    List<Evaluation> getAllEvaluations();

    @Select("select name,evaluation,evaluation_type as evaluationType from t_frame_evaluation limit #{start},#{num}")
    List<Evaluation> getNumberEvaluations(@Param("start") int start, @Param("num") int num);

}
