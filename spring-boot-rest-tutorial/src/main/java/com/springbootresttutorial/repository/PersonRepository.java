package com.springbootresttutorial.repository;

import com.springbootresttutorial.dto.PersonDTO;

public interface PersonRepository {

	void persist(PersonDTO personDTO);

}
