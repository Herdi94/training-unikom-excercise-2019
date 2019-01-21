# Soal praktek

1. Buatlah project dengan springboot untuk membuat aplikasi dengan tema e-commerce (Toko online)
2. Ketentuan minimal system yang harus di handle
    - Master data toko
    - Master data produk
    - Transaksi Penjualan (Flow transaksi bebas)
    - Master pelanggan

# Soal teori

1. Apa fungsi Hibernate ORM dan jelaskan mengapa?
    Untuk memetakan model domain berorientasi objek dengan database relasional
    Untuk memetakan DBMS dari bahasa pemrograman java dibutuhkan JDBC sebagai drivernya, maka dengan adanya
    Hibernate ORM proses CRUD DBMS tidak lagi dilakukan pada DBMSnya akan tetapi
    diimplementasikan ke bahasa pemrograman java
2. Jelaskan menurut pendapat anda dari beberapa fungsi annotation di hibernate seperti berikut:
    - ```@Entity``` : untuk menandai class tersebut adalah entitas
    - ```@Table```  : untuk menandai class tersebut adalah tabel
    - ```@Column``` : untuk menandai variabel tersebut merupakan sebuah column
    - ```@OneToOne``` : setiap baris data pada tabel pertama dihubungkan hanya  ke satu baris data pada tabel kedua
    - ```@ManyToOne``` : setiap baris data pada tabel pertama dihubungkan ke satu baris atau lebih
                        data dan tabel kedua hanya memilih satu
    - ```@OneToMany``` : setiap baris data pada tabel pertama dihubungkan hanya ke satu baris
                         data dan tabel kedua memilih satu atau lebih data
    - ```@JoinColumn``` : untuk menggabungkan beberapa column dalam tabel
    - ```@JoinTable```  : untuk menggabungkan beberapa tabel dalam database
    - ```@GeneratedValue``` : untuk menjalankan fungsi generated property

3. Jelaskan menurut pendapat anda mengenai Dependency injection di springframework?
   Dependency injection merupakan sebuah design pattern yang memudahkan dalam menulis kode yang loosely coupled,
   highly modular dimana ketergantungan antar class tidaklah tinggi.
   Dependency injection di spring framework berguna untuk memasukkan class ke class lain. prosesnya
   terjadi dari injeksi setter yang berada pada injeksi konstruksi.

4. Jelaskan menurut pendapat anda mengenai container / context di spring framework?
   container di spring framework digunakan untuk menangani konfigurasi, umumnya berdasarkan anotasi atau file xml.
   container juga dapat mengelola kelas java yang dipilih melalui beanfactory

5. Jelaskan menurut pendapat anda fungsi dari beberapa fitur annotation di spring frameork seperti berikut:
    - ```@ComponentScan``` : digunakan untuk mengidentifikasi package dasar
    - ```@Autowired``` : untuk membuat object dari entity yang bertipe data sesuai
    - ```@Bean```  :  untuk menangani metadata konfigurasi seperti : getter, setter
    - ```@Component``` : merupakan anotasi yang digunakan pada stereotip umum untuk komponen apapun yang dikelola oleh spring framework
    - ```@Repository``` : merupakan anotasi yang digunakan pada stereotip umum untuk lapisan persistensi
    - ```@Service``` : merupakan anotasi yang digunakan pada stereotip umum untuk lapisan layanan
    - ```@Controller``` : merupakan anotasi yang digunakan pada stereotip umum untuk lapisan persistensi (spring mvc)
    - ```@RestController``` : merupakan anotasi yang digunakan lapisan persistensi melalui API
    - ```@RequestMapping``` : untuk melakukan request terhadap API
    - ```@GetMapping``` : untuk mendapatkan data dari API
    - ```@PostMapping``` : untuk mengirim data dari API
    - ```@PutMapping``` : untuk menyimpan data pada mode API
    - ```@DeleteMapping``` : untuk delete data pada mode API

## Cara mengerjakan

- Fork repository ini, kemudian setelah di fork, clone ke local komputer anda.
- Setelah selesai silahkan di push ke repository masing-masing.
- Selamat mengerjakan :) & good luck
