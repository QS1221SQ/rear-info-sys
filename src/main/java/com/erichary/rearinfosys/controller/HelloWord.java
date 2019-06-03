package com.erichary.rearinfosys.controller;

import com.erichary.rearinfosys.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName HelloWord
 * @Description 测试
 * @Author yanglichao
 * @Date 2019/6/3
 * @Version 1.0
 **/
@RestController
@RequestMapping("test")
public class HelloWord {

    @Autowired
    private GradeService gradeService;

    @RequestMapping(value = "/getGrade", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Map<String, String>> getGrade() {
        return gradeService.getGrade();
    }
}
