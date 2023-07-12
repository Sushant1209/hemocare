package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.DonorsDao;
import com.cts.model.Donors;

@Service
public class DonorsServiceImpl implements DonorsService {
	
	@Autowired
	private DonorsDao donorsDao;

	@Override
	public List<Donors> getAll() {
		// TODO Auto-generated method stub
		return donorsDao.getAll();
	}

	@Override
	public Donors getById(int Donor_id) {
		// TODO Auto-generated method stub
		return donorsDao.getById(Donor_id);
	}

	@Override
	public void addDonors(Donors donors) {
		// TODO Auto-generated method stub
		donorsDao.addDonors(donors);
		
	}

	@Override
	public void updateDonors(Donors donors) {
		// TODO Auto-generated method stub
		donorsDao.updateDonors(donors);
		
	}

	@Override
	public void deleteDonors(int Donor_id) {
		// TODO Auto-generated method stub
		donorsDao.deleteDonors(Donor_id);
		
	}

}
