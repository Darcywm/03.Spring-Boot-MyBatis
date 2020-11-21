package com.springboot.service;

import com.springboot.entity.Student;
import com.springboot.util.PageRequest;
import com.springboot.util.PageResult;

public interface StudentService {
    Student findBySno(String sno);

    PageResult list(PageRequest pageRequest, String keyword);

    int create(Student student);

    int update(Student student);

    int delete(String sno);
}
