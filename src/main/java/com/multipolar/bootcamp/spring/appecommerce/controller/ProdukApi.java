package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Produk;
import com.multipolar.bootcamp.spring.appecommerce.repository.ProdukRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("api/produk")
public class ProdukApi {

    @Autowired
    private ProdukRepository repository;

    //@PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/list")
    public Iterable<Produk> findAll() {
        log.info("method ini di akses");
        return repository.findAll();
    }

    //@PostAuthorize("hasRole('ADMIN')")
    @GetMapping("/{id}")
    public ResponseEntity<Produk> findById(@PathVariable("id") String id) {
        log.info("method ini di akses");
        Optional<Produk> produkOptional = repository.findById(id);
        if (produkOptional.isPresent())
            return ResponseEntity.ok(produkOptional.get());
        else
            return ResponseEntity.noContent().build();
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public ResponseEntity<Produk> save(Principal principal, @RequestBody Produk produk) {
        produk.setNama_produk(principal.getName());
        produk.setWarna_produk(principal.getName());
        produk = repository.save(produk);
        log.info("{}", produk);
        return ResponseEntity.ok(produk);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id) {
        Optional<Produk>produkOptional = repository.findById(id);
        if (produkOptional.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.noContent().build();
        }
    }

}
