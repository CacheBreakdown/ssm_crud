package top.docalm.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import top.docalm.pojo.Student;

import java.util.List;

/**
 * 持久层接口
 */
@Repository
public interface StudentDao {
    //查询所有学生
    @Select("select * from student")
    List<Student> findAll();

    //添加学生
    @Insert("insert into student values(null,#{name},#{sex},#{address})")
    void add(Student student);


    //删除学生
    @Delete("delete from student where id = #{id}")
    void delete(int id);


    //修改学生信息
    @Update("update student set name = #{name},sex = #{sex},address = #{address} where id = #{id}")
    void update(Student student);


    //根据id查询学生
    @Select("select * from student where id = #{id}")
    Student findById(int id);
}
