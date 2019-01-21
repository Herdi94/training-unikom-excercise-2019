package com.multipolar.bootcamp.spring.appecommerce.service;

import com.multipolar.bootcamp.spring.appecommerce.entity.TransaksiPenjualan;
import com.multipolar.bootcamp.spring.appecommerce.repository.DetailTransaksiRepository;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransaksiPenjualanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;

@Service
@Transactional(readOnly = true)

public class TransaksiService {

    @Autowired
    private TransaksiPenjualanRepository transaksiPenjualanRepository;
    @Autowired
    private DetailTransaksiRepository detailTransaksiRepository;

    public Iterable<TransaksiPenjualan> findAll() {
        return transaksiPenjualanRepository.findAll();
    }

    public Optional<TransaksiPenjualan> findById(String id) {
        return this.transaksiPenjualanRepository.findById(id);
    }

}
