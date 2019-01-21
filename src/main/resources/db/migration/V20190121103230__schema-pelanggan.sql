Create table pelanggan (
id_pelanggan varchar(70) not null primary key,
nama_pelanggan varchar(50) not null,
alamat_pelanggan text not null,
telp_pelanggan varchar(14) not null
)engine = innoDb;

insert into pelanggan(id_pelanggan, nama_pelanggan, alamat_pelanggan, telp_pelanggan) values
('001', 'Jaka Perkasa','Jl. Mulya no. 23', '089734565457'),
('002', 'Jono Zaki','Jl. Ciliwung no. 87', '089742323242'),
('003', 'Sarip Anshor','Jl. Guli no. 32', '089612352345');
