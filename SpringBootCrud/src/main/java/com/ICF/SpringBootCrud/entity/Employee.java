package com.ICF.SpringBootCrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="EMPLOYEE_TABLE")
public class Employee {
	
	
	public Employee(int id, String firstname, String lastname, String startdate, String designation, String dept,
			String end_date, String status, String dob, String reporting_mgr, String gender, String bloodgroup,
			String address) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.startdate = startdate;
		this.designation = designation;
		this.dept = dept;
		this.end_date = end_date;
		this.status = status;
		this.dob = dob;
		this.reporting_mgr = reporting_mgr;
		this.gender = gender;
		this.bloodgroup = bloodgroup;
		this.address = address;
	}
	@Id
	@GeneratedValue
	private int id;
	private String firstname;
	private String lastname;
	private String startdate;
	private String designation;
	private String dept;
	private String end_date;
	private String status;
	private String dob;
	private String reporting_mgr;
	private String gender;
	private String bloodgroup;
	private String address;
	
	
	public int getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getReporting_mgr() {
		return reporting_mgr;
	}
	public void setReporting_mgr(String reporting_mgr) {
		this.reporting_mgr = reporting_mgr;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
}
