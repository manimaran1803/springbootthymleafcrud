package CRUD.thymleafcrud.Service;

import java.util.List;

import CRUD.thymleafcrud.model.student;

public interface studentservice {
    
    List<student>getallstudents();

    student savestudent(student student);

    student updatestudent(student student);

    student getstudentbyid(Long id);
}
