package com.example.demo.entity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.antlr.v4.runtime.misc.NotNull;


import java.sql.Date;


@Entity
@Table(name ="karyawan")
public class Karyawan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nik;

    @Column(nullable = false)
    private String nama_lengkap;

    @Column(nullable = false)
    @NotNull
    private String jenis_kelamin;


    private String alamat;

    @Column(nullable = false)
    private String negara;

    private Date tanggal_Lahir;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNamaLengkap() {
        return nama_lengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.nama_lengkap = namaLengkap;
    }

    public String getJenisKelamin() {
        return jenis_kelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenis_kelamin = jenisKelamin;
    }

    public Date getTanggalLahir() {
        return tanggal_Lahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggal_Lahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }
}