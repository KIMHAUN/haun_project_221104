package com.shinsunyoung.springbootcrud.model;

import com.shinsunyoung.springbootcrud.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
