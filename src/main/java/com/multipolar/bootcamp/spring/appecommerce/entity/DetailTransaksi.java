package com.multipolar.bootcamp.spring.appecommerce.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detail_transaksi")
public class DetailTransaksi {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    private String id;

    @Column(name = "qty", nullable = false)
    private Integer qty;

    @Column(name = "total_harga", nullable = false)
    private Double total_harga;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_transaksi", nullable = false)
    private TransaksiPenjualan transaksiPenjualan;

    @ManyToOne
    @JoinColumn(name = "id_produk", nullable = false)
    private Produk produk;
}
