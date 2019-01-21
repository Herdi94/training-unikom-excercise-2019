Create table produk (
id_produk varchar(70) not null primary key,
nama_produk varchar(50) not null,
ukuran_produk integer(3) not null,
warna_produk varchar(30) not null,
harga_produk double not null,
id_toko varchar(70) not null
)engine = innoDb;
