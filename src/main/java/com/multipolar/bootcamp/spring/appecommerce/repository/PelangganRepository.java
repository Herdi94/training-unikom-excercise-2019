package com.multipolar.bootcamp.spring.appecommerce.repository;

import com.multipolar.bootcamp.spring.appecommerce.entity.Pelanggan;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PelangganRepository extends CrudRepository<Pelanggan, String> {

    /*@Modifying
    @Query("update pelanggan set nama_pelanggan = ?1 where id_pelanggan = ?2")
    int updateNamaPelanggan(String nama_pelanggan, String id_pelanggan);*/

//    List<Pelanggan> findByNama(String nama_pelanggan);
}
