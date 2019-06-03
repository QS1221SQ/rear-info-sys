package com.erichary.rearinfosys.dao.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @ClassName GradeMapper
 * @Description
 * @Author yanglichao
 * @Date 2019/6/3
 * @Version 1.0
 **/
@Repository
public interface GradeMapper {
    List<Map<String, String>> getGrade();
}
