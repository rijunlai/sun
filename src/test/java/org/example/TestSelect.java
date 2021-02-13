/**
 *
 */
package org.example;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.domain.Student;
import org.example.util.MyBatisUtils;
import org.junit.Test;

import java.util.List;

public class TestSelect {
    @Test
    public void testSelectStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectStudents(1005);
        for (Student stu:students) {
            System.out.println(stu);
        }
    }

    @Test
    public void testInsertStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(1006);
        student.setName("lairijun");
        student.setEmail("444");
        student.setAge(23);
        int nums = dao.insertStudent(student);
        sqlSession.commit();
        System.out.println(nums);
    }
}
