package top.docalm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.docalm.dao.StudentDao;
import top.docalm.pojo.Student;

import java.util.List;

/**
 * 服务层
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<Student> findAllStudent() {
        return studentDao.findAll();
    }

    public void addStudent(Student student) {
        studentDao.add(student);
    }

    public void deleteStudent(int id) {
        studentDao.delete(id);
    }

    public void updateStudent(Student student) {
        studentDao.update(student);
    }

    public Student findStudentById(int id){
        return studentDao.findById(id);
    }
}
