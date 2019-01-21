package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Pelanggan;
import com.multipolar.bootcamp.spring.appecommerce.repository.PelangganRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.security.Principal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("api/pelanggan")
public class PelangganApi {

    @Autowired
    private PelangganRepository repository;

    //@PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/list")
    public Iterable<Pelanggan> findAll() {
        log.info("method ini di akses");
        return repository.findAll();
    }

    //@PostAuthorize("hasRole('ADMIN')")
    @GetMapping("/{id}")
    public ResponseEntity<Pelanggan> findById(@PathVariable("id") String id) {
        log.info("method ini di akses");
        Optional<Pelanggan> pelangganOptional = repository.findById(id);
        if (pelangganOptional.isPresent())
            return ResponseEntity.ok(pelangganOptional.get());
        else
            return ResponseEntity.noContent().build();
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public ResponseEntity<Pelanggan> save(Principal principal, @RequestBody Pelanggan pelanggan) {
        pelanggan.setNama_pelanggan(principal.getName());
        pelanggan.setTelp_pelanggan(principal.getName());
        pelanggan = repository.save(pelanggan);
        log.info("{}", pelanggan);
        return ResponseEntity.ok(pelanggan);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id) {
        Optional<Pelanggan>pelangganOptional = repository.findById(id);
        if (pelangganOptional.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    /*@GetMapping("/findByNama")
    public List<Pelanggan> findByNama(@RequestParam("nama_pelanggan") String nama_pelanggan){
        return repository.findByNama(nama_pelanggan);
    }*/

    /*@PutMapping("/")
    @Transactional
    public ResponseEntity<Pelanggan> updateNamaPelanggan(@RequestBody Pelanggan pelanggan) {
        repository.updateNamaPelanggan(pelanggan.getNama_pelanggan(), pelanggan.getId_pelanggan());
        return ResponseEntity.ok(pelanggan);
    }*/

}
