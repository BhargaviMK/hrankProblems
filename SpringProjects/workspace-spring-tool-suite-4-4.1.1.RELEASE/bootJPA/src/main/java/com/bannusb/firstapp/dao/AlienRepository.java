package com.bannusb.firstapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bannusb.firstapp.dto.AlienDTO;
import com.bannusb.firstapp.model.Alien;

public interface AlienRepository extends CrudRepository<Alien, Integer>{

	AlienDTO findByAlang(String alang);
	List<Alien> findByAidGreaterThan(int aid);

	@Query("from Alien where alang=?1 order by aname")
	List<Alien> findByAlangSorted(String alang);
}
