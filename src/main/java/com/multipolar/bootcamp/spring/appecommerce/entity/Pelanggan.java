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
@Table(name="pelanggan")
public class Pelanggan {

    @Id
    @GenericGenerator(name="uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id_pelanggan", unique = true, nullable = false)
    private String id_pelanggan;

    @Column(name = "nama_pelanggan", nullable = false)
    private String nama_pelanggan;

    @Type(type = "text")
    @Column(name="alamat_pelanggan", nullable = false)
    private String alamat;

    @Column(name = "telp_pelanggan", nullable = false)
    private String telp_pelanggan;

    @JsonIgnore
    @OneToMany(mappedBy = "pelanggan")
    private List<TransaksiPenjualan> daftarTransaksi = new ArrayList<>();

}
