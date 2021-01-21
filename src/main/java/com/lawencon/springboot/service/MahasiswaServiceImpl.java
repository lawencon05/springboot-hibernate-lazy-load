package com.lawencon.springboot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lawencon.springboot.dao.MahasiswaDao;
import com.lawencon.springboot.model.Mahasiswa;

@Service
@Transactional
public class MahasiswaServiceImpl implements MahasiswaService {

	@Autowired
	@Qualifier(value = "springdata_jpql")
	private MahasiswaDao mahasiswaDao;

	@Override
	public List<Mahasiswa> getAllMhsWithoutRelation() throws Exception {
		return mahasiswaDao.getAllMhsWithoutRelation();
	}

	@Override
	public List<Mahasiswa> getAllMhsWithRelation() throws Exception {
		return mahasiswaDao.getAllMhsWithRelation();
	}

}
