package com.example.demo.entity.repository;

import com.example.demo.entity.model.Karyawan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KaryawanRepository extends JpaRepository<Karyawan, Long> {
}