package com.springboot.controller;

import com.springboot.entity.Student;
import com.springboot.service.StudentService;
import com.springboot.util.PageRequest;
import com.springboot.util.PageResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "students")
public class StudentController {

    /*
    1. 异常处理
    2. 返回参数统一 { status: 0, data: {  list: [] } }
    { status: 1, status_text: "xxx出现了错误" }
    3. 代码重构
    4. druid
     */

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/{sno}")
    public Student queryStudentBySno(@PathVariable(value = "sno") String sno) {
        log.debug("hello");
        return studentService.findBySno(sno);
    }


    // url上的参数为自动绑定成对象
    @GetMapping(value = "/list")
    public PageResult list(PageRequest pageRequest, String keyword) {
        return studentService.list(pageRequest, keyword);
    }

    @PostMapping(value = "/")
    public int create(@RequestBody Student student) {
        return studentService.create(student);
    }


    /*
    这里还需要修改，应该是根据传过来的id，获取旧的student, 然后构造新的数据
    所以这里是有bug的
     */
    @PostMapping(value = "/{sno}")
    public int update(Student student) {
        return studentService.update(student);
    }

    @DeleteMapping(value = "/{sno}")
    public int delete(@PathVariable(value = "sno") String sno) {
        return studentService.delete(sno);
    }


}
