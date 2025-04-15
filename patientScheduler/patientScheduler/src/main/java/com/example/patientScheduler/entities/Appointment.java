package com.example.patientScheduler.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private java.sql.Timestamp appointment_time;
	private boolean started;
	private boolean ended;
	private String reason;
	@ManyToOne
	private Patient patient;
	@ManyToOne
	private Doctor doctor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.sql.Timestamp getAppointment_time() {
		return appointment_time;
	}

	public void setAppointment_time(java.sql.Timestamp appointment_time) {
		this.appointment_time = appointment_time;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public boolean isEnded() {
		return ended;
	}

	public void setEnded(boolean ended) {
		this.ended = ended;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", appointment_time=" + appointment_time + ", started=" + started + ", ended="
				+ ended + ", reason=" + reason + ", patient=" + patient + ", doctor=" + doctor + "]";
	}

}
