package com.lxw.controller;

import com.lxw.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description
 *
 * @author lxw 2019/07/22 18:40
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/insert/person")
    @ResponseBody
    public String insertPerson(int id,String name)
    {
       int i=personService.insert(id,name);
       if(i>0)
       {
           return "insert successful!!";
       }
       else
       {
           return "not successful";
       }
    }




    @RequestMapping("/insert/person2")
    @ResponseBody
    public String insertPerson2(int id,String name)
    {
        int i=personService.insertTwo(id,name);
        if(i>0)
        {
            return "insert successful!!";
        }
        else
        {
            return "not successful";
        }
    }

}
