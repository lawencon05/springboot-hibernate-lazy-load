package com.lawencon.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lawencon.springboot.model.Mahasiswa;

@Repository(value = "hibernate_hql")
public class MahasiswaDaoHibernateImpl implements MahasiswaDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Mahasiswa> getAllMhsWithoutRelation() throws Exception {
		List<Mahasiswa> listMhs = em.createQuery("FROM Mahasiswa", Mahasiswa.class).getResultList();
		return listMhs;
	}

	@Override
	public List<Mahasiswa> getAllMhsWithRelation() throws Exception {
		List<Mahasiswa> listMhs = em.createQuery("FROM Mahasiswa as m JOIN FETCH m.universitas u", Mahasiswa.class)
				.getResultList();
		return listMhs;
	}
}
