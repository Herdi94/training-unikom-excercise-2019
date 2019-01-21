package com.multipolar.bootcamp.spring.appecommerce.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="produk")
public class Produk {

    @Id
@GenericGenerator(name="uuid_gen", strategy = "uuid2")
@GeneratedValue(generator = "uuid_gen")
    @Column(name = "id_produk", nullable = false, unique = true)
    private String id_produk;

    @Column(name = "nama_produk", nullable = false)
    private String nama_produk;


    @Column(name = "ukuran_produk", nullable = false)
    private Integer ukuran_produk;

    @Column(name = "warna_produk", nullable = false)
    private String warna_produk;

    @Column(name = "harga_produk", nullable = false)
    private Double harga_produk;

    @ManyToOne
    @JoinColumn(name = "id_toko", nullable = false)
    private Toko toko;

}
