package com.resort.ResortManagementProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resort.ResortManagementProject.entity.Facilities;
import com.resort.ResortManagementProject.repository.FacilitiesRepository;


@Service
public class FacilitiesService {
	
	@Autowired
	private FacilitiesRepository facilitiesRepo;
	
	public Facilities saveFacilities(Facilities facilities) {
		Facilities saveRoom= facilitiesRepo.save(facilities);
		return saveRoom;
	}

	public Facilities getFacilitiesById(int id) {
		Optional<Facilities> findById = facilitiesRepo.findById(id);
		Facilities facilities = findById.get();
		return facilities;
	}
	
	public List<Facilities> getAllFacilitiesData(){
		List<Facilities> facilities= facilitiesRepo.findAll();
		return facilities;
	}
	
	public String deleteFacility(int id) {
		facilitiesRepo.deleteById(id);
		return "facility deleted successfully";
    }
	
}
