package com.staging.frame.web.service.impl;

import com.staging.frame.web.dao.BaseManager;
import com.staging.frame.web.dao.BaseMysqlCRUDMapper;
import com.staging.frame.web.model.Evaluation;
import com.staging.frame.web.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author Created by Li B.
 * @date Created in 2018/6/22.
 */
@Component
public class EvaluationServiceImpl implements EvaluationService{
    @Autowired
    private BaseManager baseManager;

    @Override
    public List<Evaluation> getAllEvaluations() {
        return baseManager.getAllEvaluations();
    }
}
