package com.multipolar.bootcamp.spring.appecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaksi_penjualan")
public class TransaksiPenjualan {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id_transaksi", nullable = false, unique = true)
    private String id_transaksi;

    @Column(name = "tgl_transaksi", nullable = false)
    private Timestamp tgl_transaksi;

    @ManyToOne
    @JoinColumn(name = "id_pelanggan", nullable = false)
    private Pelanggan pelanggan;

   /* @OneToMany(mappedBy = "transaksi_penjualan")
    public List<DetailTransaksi> details = new ArrayList<>();*/

}
