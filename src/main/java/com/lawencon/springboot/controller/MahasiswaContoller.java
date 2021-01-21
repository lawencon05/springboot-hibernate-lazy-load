package com.lawencon.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lawencon.springboot.model.Mahasiswa;
import com.lawencon.springboot.service.MahasiswaService;

/**
 * @author lawencon05
 */
@RestController
@RequestMapping("/mhs")
public class MahasiswaContoller {

	@Autowired
	private MahasiswaService mahasiswaService;

	@GetMapping("with")
	public ResponseEntity<?> getAllMhsWithRelation() throws Exception {
		List<Mahasiswa> listMhs = new ArrayList<>();
		try {
			listMhs = mahasiswaService.getAllMhsWithRelation();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(listMhs, HttpStatus.OK);
	}

	@GetMapping("without")
	public ResponseEntity<?> getAllMhsWithoutRelation() throws Exception {
		List<Mahasiswa> listMhs = new ArrayList<>();
		try {
			listMhs = mahasiswaService.getAllMhsWithoutRelation();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(listMhs, HttpStatus.OK);
	}

}
