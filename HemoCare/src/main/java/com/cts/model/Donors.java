package com.cts.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Donors {

	//(donor_id, user_id, name, blood_type, contact_number, availability_status, location)
	
	private int donor_id;
	private int user_id;
	private String name;
	private String blood_type;
	private String contact_number;
	private String availability_status;
	private String location;
	
	
	public int getDonor_id() {
		return donor_id;
	}
	public void setDonor_id(int donor_id) {
		this.donor_id = donor_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBlood_type() {
		return blood_type;
	}
	public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getAvailability_status() {
		return availability_status;
	}
	public void setAvailability_status(String availability_status) {
		this.availability_status = availability_status;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
