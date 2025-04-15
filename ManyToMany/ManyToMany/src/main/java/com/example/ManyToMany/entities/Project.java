package com.example.ManyToMany.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	//This Class is considered as parent class
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String project_name;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "project_programmer", joinColumns = @JoinColumn(name = "p_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "pg_id", referencedColumnName = "id"))
	List<Programmer> programmers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public List<Programmer> getProgrammers() {
		return programmers;
	}

	public void setProgrammers(List<Programmer> programmers) {
		this.programmers = programmers;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", project_name=" + project_name + ", programmers=" + programmers + "]";
	}

}
