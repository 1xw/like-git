package com.lxw.service;

import com.lxw.mapper.PersonMapper;
import com.lxw.repository.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description
 *
 * @author lxw 2019/07/22 18:35
 */

@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;


    public int insert(int id,String name)
    {
       return personMapper.insert(new Person(id,name));
    }

    @Transactional
    public int insertTwo(int id,String name)
    {
         personMapper.insert(new Person(id,name));
         int i=10/0;
         personMapper.insert(new Person(id+1,name+"12345"));
         return 1;
    }



}
