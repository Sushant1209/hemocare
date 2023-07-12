package com.cts.service;

import java.util.List;

import com.cts.model.Donors;

public interface DonorsService {
	
	List<Donors> getAll();

	Donors getById(int Donor_id);

	void addDonors(Donors donors);

	void updateDonors(Donors donors);

	void deleteDonors(int Donor_id);

}
