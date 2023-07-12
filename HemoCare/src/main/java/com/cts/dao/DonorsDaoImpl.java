package com.cts.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.model.Donors;

@Repository
public class DonorsDaoImpl implements DonorsDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Donors> getAll(){
		
		return jdbcTemplate.query("select * from Donors", new RowMapper<Donors>() {

			@Override
			public Donors mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
//(donor_id, user_id, name, blood_type, contact_number, availability_status, location)
				Donors donors = new Donors();
				donors.setDonor_id(rs.getInt(1));
				donors.setUser_id(rs.getInt(2));
				donors.setName(rs.getString(3));
				donors.setBlood_type(rs.getString(4));
				donors.setContact_number(rs.getString(5));
				donors.setAvailability_status(rs.getString(6));
				donors.setLocation(rs.getString(7));
				
				return donors;
			}
			
		});
		
	}
	
	@Override
	public Donors getById(int Donor_id) {
		return jdbcTemplate.queryForObject("select * from Donors where Donor_id=?", 
				(rs,rowNum)->new Donors(rs.getInt("donor_id"),rs.getInt("user_id"),
						rs.getString("name"),rs.getString("blood_type"),rs.getString("contact_number"),rs.getString("availability_status"),rs.getString("location")),Donor_id);
	}
	
	@Override
	public void addDonors(Donors donors) {
		jdbcTemplate.update("insert into Donors values(?,?,?,?,?,?,?)",
				donors.getDonor_id(),donors.getUser_id(),donors.getName(),donors.getBlood_type(),donors.getContact_number(),donors.getAvailability_status(),donors.getLocation());
	}
	
	@Override
	public void updateDonors(Donors donors) {
		jdbcTemplate.update("update Donors set user_id=?, name=?, blood_type=?, contact_number=?, availability_status=?, location=? where donor_id=?",
				donors.getUser_id(),donors.getName(),donors.getBlood_type(),donors.getContact_number(),donors.getAvailability_status(),donors.getLocation(),donors.getDonor_id());
	}
	
	@Override
	public void deleteDonors(int Donor_id) {
		jdbcTemplate.update("delete from Donors where donor_id =?", Donor_id);
	}

	
}
