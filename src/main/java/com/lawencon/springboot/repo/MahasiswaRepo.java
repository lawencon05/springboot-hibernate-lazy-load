package com.lawencon.springboot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lawencon.springboot.model.Mahasiswa;

@Repository
public interface MahasiswaRepo extends JpaRepository<Mahasiswa, Long> {

	@Query(value = "FROM Mahasiswa ")
	List<Mahasiswa> getAllMhsWithoutRelation() throws Exception;

	@Query(value = "FROM Mahasiswa m LEFT JOIN FETCH m.universitas u ")
	List<Mahasiswa> getAllMhsWithRelation() throws Exception;
}
