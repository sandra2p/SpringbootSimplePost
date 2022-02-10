package com.springbootresttutorial.services;

import org.springframework.stereotype.Service;

import com.springbootresttutorial.dto.PersonDTO;

@Service
public class PersonServiceImpl implements PersonService {

  @Override
  public boolean isValid(PersonDTO personDTO) {
    return personDTO != null
        && personDTO.getProfession() != null
        && personDTO.getProfession().equals("Software Developer");
  }
}