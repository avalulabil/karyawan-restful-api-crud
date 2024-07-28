package com.example.demo.entity.controller;

import ch.qos.logback.classic.Logger;
import com.example.demo.entity.model.Karyawan;
import com.example.demo.entity.service.KaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/api/karyawan")
public class KaryawanController {

    @Autowired
    private KaryawanService karyawanService;

    @GetMapping
    public List<Karyawan> getAllKaryawan() {

        return karyawanService.getAllKaryawan();
    }

    @GetMapping("/{id}")
    public Karyawan getKaryawanById(@PathVariable Long id) {
        return karyawanService.getKaryawanById(id);
    }

    @PostMapping
    public Karyawan addKaryawan(@RequestBody Karyawan karyawan) {
        return karyawanService.addKaryawan(karyawan);
    }

    @PutMapping("/{id}")
    public Karyawan updateKaryawan(@PathVariable Long id, @RequestBody Karyawan karyawan) {
        karyawan.setId(id);
        return karyawanService.updateKaryawan(karyawan);
    }

    @DeleteMapping("/{id}")
    public void deleteKaryawan(@PathVariable Long id) {
        karyawanService.deleteKaryawan(id);
    }
}
