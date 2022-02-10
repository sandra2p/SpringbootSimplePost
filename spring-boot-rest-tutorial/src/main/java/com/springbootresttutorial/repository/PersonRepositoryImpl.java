package com.springbootresttutorial.repository;

import org.springframework.stereotype.Service;
import com.springbootresttutorial.dto.PersonDTO;

@Service
public class PersonRepositoryImpl implements PersonRepository {

	@Override
	public void persist(final PersonDTO personDTO) {
		// implementation of persisting to database
	}
}
