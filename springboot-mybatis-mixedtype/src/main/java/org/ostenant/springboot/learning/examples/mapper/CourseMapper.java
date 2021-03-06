package org.ostenant.springboot.learning.examples.mapper;

import org.apache.ibatis.annotations.*;
import org.ostenant.springboot.learning.examples.model.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseMapper {
    @Delete({
            "delete from course",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteById(Integer id);

    @Insert({
            "insert into course (id, name, ",
            "lesson_period, score)",
            "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
            "#{lessonPeriod,jdbcType=DOUBLE}, #{score,jdbcType=DOUBLE})"
    })
    int save(Course record);

    @Select({
            "select",
            "id, name, lesson_period, score",
            "from course",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("org.ostenant.springboot.learning.examples.mapper.CourseMapper.BaseResultMap")
    Course findById(Integer id);

    int update(Course record);

    List<Course> findAll();

    List<Course> findByIds(List<Integer> list);

    int deleteByIds(List<Integer> list);

    int saveBatch(List<Course> list);

    int updateBatch(List<Course> list);
}