package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.TransaksiPenjualan;
import com.multipolar.bootcamp.spring.appecommerce.entity.TransaksiPenjualan;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransaksiPenjualanRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("api/transaksi")
public class TransaksiPenjualanApi {

    @Autowired
    private TransaksiPenjualanRepository repository;

    //@PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/list")
    public Iterable<TransaksiPenjualan> findAll() {
        log.info("method ini di akses");
        return repository.findAll();
    }

    //@PostAuthorize("hasRole('ADMIN')")
    @GetMapping("/{id}")
    public ResponseEntity<TransaksiPenjualan> findById(@PathVariable("id") String id) {
        log.info("method ini di akses");
        Optional<TransaksiPenjualan> transaksiPenjualanOptional = repository.findById(id);
        if (transaksiPenjualanOptional.isPresent())
            return ResponseEntity.ok(transaksiPenjualanOptional.get());
        else
            return ResponseEntity.noContent().build();
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public ResponseEntity<TransaksiPenjualan> save(Principal principal, @RequestBody TransaksiPenjualan transaksiPenjualan) {
        transaksiPenjualan.setTgl_transaksi(Timestamp.valueOf(LocalDateTime.now()));
        transaksiPenjualan = repository.save(transaksiPenjualan);
        log.info("{}", transaksiPenjualan);
        return ResponseEntity.ok(transaksiPenjualan);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id) {
        Optional<TransaksiPenjualan>transaksiPenjualanOptional = repository.findById(id);
        if (transaksiPenjualanOptional.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.noContent().build();
        }
    }

}
