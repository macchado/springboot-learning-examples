package org.ostenant.springboot.learning.examples.controller;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Madison on 2017/6/26.
 */
public interface BasicController<E, I extends Serializable> {

    int deleteById(I id);

    int save(E entity);

    List<E> findAll();

    E findById(I id);

    int update(E record);
}
