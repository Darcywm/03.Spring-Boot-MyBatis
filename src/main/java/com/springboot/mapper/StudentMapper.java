package com.springboot.mapper;

import com.springboot.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface StudentMapper {

    Student findBySno(String sno);

    List<Student> list(String keyword);

    int create(Student student);

    int update(Student student);

    int delete(String sno);
}
