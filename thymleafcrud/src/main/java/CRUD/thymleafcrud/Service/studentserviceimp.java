package CRUD.thymleafcrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CRUD.thymleafcrud.Repository.StudentRepo;
import CRUD.thymleafcrud.model.student;

@Service
public class studentserviceimp implements studentservice {

    @Autowired
   private StudentRepo studentRepo;

    @Override
    public List<student> getallstudents() {
           return studentRepo.findAll();
  
    }

    @Override
    public student savestudent(student student) {
      
        return studentRepo.save(student);
    
}

    @Override
    public student updatestudent(student student) {
     
        return studentRepo.save(student);
    }

    @Override
    public student getstudentbyid(Long id) {
        
         return studentRepo.findById(id).get();
    }

}