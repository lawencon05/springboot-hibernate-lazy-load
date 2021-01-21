package com.lawencon.springboot.service;

import java.util.List;

import com.lawencon.springboot.model.Mahasiswa;

public interface MahasiswaService {

	List<Mahasiswa> getAllMhsWithoutRelation() throws Exception;

	List<Mahasiswa> getAllMhsWithRelation() throws Exception;
}
