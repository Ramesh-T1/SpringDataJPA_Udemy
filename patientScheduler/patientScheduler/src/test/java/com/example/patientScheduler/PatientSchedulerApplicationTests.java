package com.example.patientScheduler;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.patientScheduler.entities.Appointment;
import com.example.patientScheduler.entities.Doctor;
import com.example.patientScheduler.entities.Insurance;
import com.example.patientScheduler.entities.Patient;
import com.example.patientScheduler.repos.AppointmentRepository;
import com.example.patientScheduler.repos.DoctorRepository;
import com.example.patientScheduler.repos.PatientRepository;

@SpringBootTest
class PatientSchedulerApplicationTests {
	@Autowired
	DoctorRepository drepo;
	
	@Autowired
	PatientRepository prepo;
	
	@Autowired
	AppointmentRepository apprepo;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void createDoctor() {
		Doctor dr=new Doctor();
		dr.setFirst_name("Rakmesh");
		dr.setLast_name("Nadar");
		dr.setSpeciality("MBBS");
		drepo.save(dr);
	}
	
	@Test
	public void createPatient() {
		Doctor fd = null;
		Patient p=new Patient();
		p.setFirstName("Sonia");
		p.setLastName("Bendre");
		p.setPhone("8778811098");
		Insurance ins=new Insurance();
		ins.setProvider_name("Max Life Insurance");
		ins.setCopay(300d);
		p.setInsurance(ins);
		Optional<Doctor> d=drepo.findById(1L);
		if(d.isEmpty()) {
			System.out.println("No Doctors found with Id given....");
		}else {
			fd=d.get();
		}
		List<Doctor> ld=new ArrayList<>();
		ld.add(fd);
	    p.setDoctors(ld);
	    prepo.save(p);
	}
	
	@Test
	public void createAppointment() {
		Patient pg = null;
		Doctor dg = null;
		Appointment ap=new Appointment();
		Timestamp appointmentTime=new Timestamp(new Date().getTime());
		ap.setAppointment_time(appointmentTime);
		ap.setReason("I have Asthama");
		ap.setStarted(false);
		ap.setEnded(false);
		Optional<Patient> opp=prepo.findById(1L);
		if(opp.isEmpty()) {
			System.out.println("Patient with given Id is not present");
		}
		else {
			pg=opp.get();
		}
		ap.setPatient(pg);
		Optional<Doctor> opd=drepo.findById(1L);
		if(opd.isEmpty()) {
			System.out.println("Doctor is not present with given Id");
		}
		else {
			dg=opd.get();
		}
		ap.setDoctor(dg);
		apprepo.save(ap);
	}

}
