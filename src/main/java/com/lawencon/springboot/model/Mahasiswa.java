package com.lawencon.springboot.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Mahasiswa implements Serializable {

	private static final long serialVersionUID = 4713658422040708569L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String nim;
	private String nama;

	@ManyToOne(fetch = FetchType.LAZY) // lazy = tidak ditarik, eager = auto tarik
	@JoinColumn(name = "univ_id")
	private Universitas universitas;

	@Column(name = "waktu_masuk")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate waktuMasuk;

	@Column(name = "waktu_masuk_time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime waktuMasukTime;

	public LocalDateTime getWaktuMasukTime() {
		return waktuMasukTime;
	}

	public void setWaktuMasukTime(LocalDateTime waktuMasukTime) {
		this.waktuMasukTime = waktuMasukTime;
	}

	public LocalDate getWaktuMasuk() {
		return waktuMasuk;
	}

	public void setWaktuMasuk(LocalDate waktuMasuk) {
		this.waktuMasuk = waktuMasuk;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Universitas getUniversitas() {
		return universitas;
	}

	public void setUniversitas(Universitas universitas) {
		this.universitas = universitas;
	}
}
