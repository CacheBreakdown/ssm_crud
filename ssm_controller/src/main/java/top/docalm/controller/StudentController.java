package top.docalm.controller;
/**
 * 控制层类，实现对学生数据库的增删改查
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.docalm.pojo.Student;
import top.docalm.service.StudentService;

import java.util.List;

@Controller
@RequestMapping("/student")//所有的方法路径都是以/student开头
public class StudentController {
    @Autowired
    private StudentService studentService;

    //查询所有学生的方法
    @RequestMapping("/all")
    public String all(Model model) {
        List<Student> allStudent = studentService.findAllStudent();
        model.addAttribute("allStudents", allStudent);
        return "allStudent";
    }

    //添加学生的方法
    @RequestMapping("/add")
    public String add(Student student) {
        studentService.addStudent(student);
        //添加完成之后重定向到查询所有学生的控制器处理
        return "redirect:/student/all";
    }


    //删除学生的方法
    @RequestMapping("/delete")
    public String delete(int id) {
        studentService.deleteStudent(id);
        return "redirect:/student/all";
    }

    //添加学生的方法
    @RequestMapping("/update")
    public String update(Student student) {
        studentService.updateStudent(student);
        return "redirect:/student/all";
    }

    //根据id查询学生
    @RequestMapping("/select")
    public String findByID(Model model, int id) {
        Student stu = studentService.findStudentById(id);
        model.addAttribute("stu", stu);
        return "allStudent";
    }
}
