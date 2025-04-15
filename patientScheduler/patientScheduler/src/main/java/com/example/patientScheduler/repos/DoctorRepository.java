package com.example.patientScheduler.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.patientScheduler.entities.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}
