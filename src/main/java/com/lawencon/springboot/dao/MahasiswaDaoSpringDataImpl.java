package com.lawencon.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lawencon.springboot.model.Mahasiswa;
import com.lawencon.springboot.repo.MahasiswaRepo;

@Repository(value = "springdata_jpql")
public class MahasiswaDaoSpringDataImpl implements MahasiswaDao {

	@Autowired
	private MahasiswaRepo mhsRepo;

	@Override
	public List<Mahasiswa> getAllMhsWithoutRelation() throws Exception {
		return mhsRepo.getAllMhsWithoutRelation();
	}

	@Override
	public List<Mahasiswa> getAllMhsWithRelation() throws Exception {
		return mhsRepo.getAllMhsWithRelation();
	}
}
