package CRUD.thymleafcrud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ThymleafcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymleafcrudApplication.class, args);
	}
	/* 
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {
		student student1=new student("mani", "maran", "manimaarna@gmail.com");
              studentRepo.save(student1);
			  	student student2=new student("sathish", "kumar", "manimaarna@gmail.com");
              studentRepo.save(student2);
			  	student student3=new student("rahul", "kumar", "manimaarna@gmail.com");
              studentRepo.save(student3);
	}
      */
}
