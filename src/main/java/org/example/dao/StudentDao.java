package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.domain.Student;

import java.util.List;

public interface StudentDao {

    public List<Student> selectStudents(@Param("id") Integer id);

    public int insertStudent(Student student);

}
