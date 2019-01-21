Create table transaksi_penjualan (
id_transaksi varchar(70) not null primary key,
tgl_transaksi timestamp not null default now(),
id_pelanggan varchar(70) not null
)engine = innoDb;



alter table transaksi_penjualan
  add constraint fk_transaksi_pelanggan foreign key (id_pelanggan)
  references pelanggan (id_pelanggan) on update cascade on delete restrict;

