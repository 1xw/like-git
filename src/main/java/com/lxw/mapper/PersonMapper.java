package com.lxw.mapper;

import com.lxw.repository.Person;

public interface PersonMapper {
    int insert(Person person);

    int insertSelective(Person person);
}