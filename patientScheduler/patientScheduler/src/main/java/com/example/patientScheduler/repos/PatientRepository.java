package com.example.patientScheduler.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.patientScheduler.entities.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long> {

}
