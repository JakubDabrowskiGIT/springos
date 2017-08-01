package pl.kurs2.springos.controller.dao;

import pl.kurs2.springos.model.Person;

import java.util.List;

public interface PersonDao {
    List<Person> findBySurname(String surname);
    List<Person> findAllCorrect();
    Person findOne(Long id);



}
