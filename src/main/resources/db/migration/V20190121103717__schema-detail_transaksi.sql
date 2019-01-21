create table detail_transaksi
(
  id varchar(70) not null primary key,
  id_produk varchar(70) not null,
  id_transaksi varchar(70) not null,
  qty integer(10) not null,
  total_harga double not null
) engine = InnoDB;


alter table detail_transaksi
  add constraint fk_detail_produk foreign key (id_produk)
    references produk (id_produk) on update cascade on delete restrict;

alter table detail_transaksi
  add constraint fk_detail_transaksi foreign key (id_transaksi)
    references transaksi_penjualan (id_transaksi) on update cascade on delete restrict;



