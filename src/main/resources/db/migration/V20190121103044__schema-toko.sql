Create table toko (
id_toko varchar(70) not null primary key,
nama_toko varchar(50) not null,
alamat_toko text not null,
telp_toko varchar(14) not null
)engine = innoDb;

alter table produk
  add constraint fk_produk_toko foreign key (id_toko)
  references toko (id_toko) on update cascade on delete restrict;

