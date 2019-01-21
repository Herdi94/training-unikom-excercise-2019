package com.multipolar.bootcamp.spring.appecommerce.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="toko")
public class Toko {

    @Id
    @GenericGenerator(name="uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id_toko", unique = true, nullable = false)
    private String id_toko;

    @Column(name="nama_toko", nullable = false)
    private String nama_toko;

    @Type(type = "text")
    @Column(name = "alamat_toko", nullable = false)
    private String alamat_toko;

    @Column(name = "telp_toko", nullable = false)
    private String telp_toko;

    @JsonIgnore
    @OneToMany(mappedBy = "toko")
    private List<Produk> daftarProduk = new ArrayList<>();
    }
