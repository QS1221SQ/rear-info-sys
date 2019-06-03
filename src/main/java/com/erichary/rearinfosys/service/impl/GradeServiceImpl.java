package com.erichary.rearinfosys.service.impl;

import com.erichary.rearinfosys.dao.mapper.GradeMapper;
import com.erichary.rearinfosys.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName GradeServiceImpl
 * @Description
 * @Author yanglichao
 * @Date 2019/6/3
 * @Version 1.0
 **/
@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public List<Map<String, String>> getGrade() {
        return gradeMapper.getGrade();
    }
}
