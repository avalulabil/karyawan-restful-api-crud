package com.example.demo.entity.service;

import com.example.demo.entity.model.Karyawan;
import com.example.demo.entity.repository.KaryawanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaryawanService {

    @Autowired
    private KaryawanRepository karyawanRepository;

    public List<Karyawan> getAllKaryawan() {
        return karyawanRepository.findAll();
    }

    public Karyawan getKaryawanById(Long id) {
        return karyawanRepository.findById(id).orElse(null);
    }

    public Karyawan addKaryawan(Karyawan karyawan) {
        return karyawanRepository.save(karyawan);
    }

    public Karyawan updateKaryawan(Karyawan karyawan) {
        return karyawanRepository.save(karyawan);
    }

    public void deleteKaryawan(Long id) {
        karyawanRepository.deleteById(id);
    }
}
