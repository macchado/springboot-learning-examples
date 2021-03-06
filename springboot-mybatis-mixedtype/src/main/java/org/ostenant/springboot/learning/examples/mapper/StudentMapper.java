package org.ostenant.springboot.learning.examples.mapper;

import org.apache.ibatis.annotations.*;
import org.ostenant.springboot.learning.examples.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {
    @Delete({
            "delete from student",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteById(Integer id);

    @Insert({
            "insert into student (id, name, ",
            "grade, class_number, ",
            "institute_id)",
            "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
            "#{grade,jdbcType=VARCHAR}, #{classNumber,jdbcType=VARCHAR}, ",
            "#{instituteId,jdbcType=INTEGER})"
    })
    int save(Student record);

    @Select({
            "select",
            "id, name, grade, class_number, institute_id",
            "from student",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("org.ostenant.springboot.learning.examples.mapper.StudentMapper.BaseResultMap")
    Student findById(Integer id);

    int update(Student record);

    List<Student> findAll();

    List<Student> findByIds(List<Integer> list);

    int deleteByIds(List<Integer> list);

    int saveBatch(List<Student> list);

    int updateBatch(List<Student> list);
}