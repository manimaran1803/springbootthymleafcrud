package CRUD.thymleafcrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CRUD.thymleafcrud.model.student;

public interface StudentRepo extends JpaRepository<student,Long> {
    
}
