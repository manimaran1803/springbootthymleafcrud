package CRUD.thymleafcrud.Controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import CRUD.thymleafcrud.Service.studentservice;
import CRUD.thymleafcrud.model.student;


@Controller
public class StudentController {

    @Autowired
   private studentservice studentservice;


   @GetMapping("/student")
   public String Liststudents(Model model){

     model.addAttribute("student", studentservice.getallstudents());
    
    return "student";
   }

   @GetMapping("/student/new")
   public String createstudentform(Model model){
    student student=new student();

    model.addAttribute("student", student);
    
    return "create_student" ;
   }


   @PostMapping("/student")
   public String saveStudent(@ModelAttribute("student") student student){
    studentservice.savestudent(student);
    return "redirect:/student";
   }



   @GetMapping("student/edit/{id}")
   public String editstudentform(@PathVariable Long id,Model model){
    model.addAttribute("student", studentservice.getstudentbyid(id));
    
    return "edit_student" ;
   }


   @PostMapping("/student/{id}")
   public String updatestudent(@PathVariable Long id,@ModelAttribute("student") student student,Model model){

    student existingstudent=studentservice.getstudentbyid(id);
    existingstudent.setFirstName(student.getFirstName());
    existingstudent.setLastName(student.getLastName());
    existingstudent.setEmail(student.getEmail());

    studentservice.updatestudent(existingstudent);

    return "redirect:/student" ;
   }
    
}
