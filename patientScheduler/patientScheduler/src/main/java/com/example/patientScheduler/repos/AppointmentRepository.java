package com.example.patientScheduler.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.patientScheduler.entities.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment,Long> {

}
