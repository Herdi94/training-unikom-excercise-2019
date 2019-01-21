package com.multipolar.bootcamp.spring.appecommerce.repository;

import com.multipolar.bootcamp.spring.appecommerce.entity.DetailTransaksi;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;

public interface DetailTransaksiRepository extends CrudRepository<DetailTransaksi, String> {

    /*@Modifying
    @Query("update detail_transaksi set qty = :qty and total_harga = :total_harga where id = :id")
    int updateJumlahProdukById(
            @Param("id") String id,
            @Param("qty") Integer qty,
            @Param("total_harga") Double total_harga);*/
}
