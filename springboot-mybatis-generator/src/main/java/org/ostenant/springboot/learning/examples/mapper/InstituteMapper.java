package org.ostenant.springboot.learning.examples.mapper;

import org.ostenant.springboot.learning.examples.model.Institute;

import java.util.List;

public interface InstituteMapper {

    int deleteById(Integer id);

    int save(Institute record);

    Institute findById(Integer id);

    int update(Institute record);

    List<Institute> findAll();

    List<Institute> findByIds(List<Integer> list);

    int deleteByIds(List<Integer> list);

    int saveBatch(List<Institute> list);

    int updateBatch(List<Institute> list);
}