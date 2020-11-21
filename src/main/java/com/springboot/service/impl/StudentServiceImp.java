package com.springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.util.PageRequest;
import com.springboot.util.PageResult;
import com.springboot.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Student;
import com.springboot.mapper.StudentMapper;
import com.springboot.service.StudentService;

import java.util.List;

@Service("studentService")
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student findBySno(String sno) {
        return studentMapper.findBySno(sno);
    }

    @Override
    public PageResult list(PageRequest pageRequest, String keyword) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest, keyword));
    }

    @Override
    public int create(Student student) {
        return studentMapper.create(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int delete(String sno) {
        return studentMapper.delete(sno);
    }

    private PageInfo<Student> getPageInfo(PageRequest pageRequest, String keyword) {
        int currentPage = pageRequest.getCurrentPage();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(currentPage, pageSize);
        List<Student> list = studentMapper.list(keyword);
        return new PageInfo<>(list);
    }


}
