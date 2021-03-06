package org.ostenant.springboot.learning.examples.service.impl;

import org.ostenant.springboot.learning.examples.mapper.InstituteMapper;
import org.ostenant.springboot.learning.examples.model.Institute;
import org.ostenant.springboot.learning.examples.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class InstituteServiceImpl implements InstituteService {

    @Autowired
    private InstituteMapper instituteMapper;

    public int deleteById(Integer id) {
        return instituteMapper.deleteById(id);
    }

    public int save(Institute record) {
        return instituteMapper.save(record);
    }

    @Transactional(readOnly = true)
    public List<Institute> findAll() {
        return instituteMapper.findAll();
    }

    @Transactional(readOnly = true)
    public Institute findById(Integer id) {
        return instituteMapper.findById(id);
    }

    public int update(Institute record) {
        return instituteMapper.update(record);
    }

}
