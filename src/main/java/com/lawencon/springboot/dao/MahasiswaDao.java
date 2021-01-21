package com.lawencon.springboot.dao;

import java.util.List;

import com.lawencon.springboot.model.Mahasiswa;

public interface MahasiswaDao {

	List<Mahasiswa> getAllMhsWithoutRelation() throws Exception;

	List<Mahasiswa> getAllMhsWithRelation() throws Exception;

}
