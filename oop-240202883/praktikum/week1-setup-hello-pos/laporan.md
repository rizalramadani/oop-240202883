# Laporan Praktikum Minggu 1
"Pengenalan Paradigma dan Setup Proyek"

## Identitas
- Nama  : Rizal Ramadani
- NIM   : 240202883
- Kelas : 3IKR B

---

## Tujuan
Mahasiswa mampu mendefinisikan paradigma prosedural, OOP, dan fungsional.
Mahasiswa mampu membandingkan kelebihan dan keterbatasan tiap paradigma.
Mahasiswa mampu memberikan contoh program sederhana untuk masing-masing paradigma.
Mahasiswa aktif dalam diskusi kelas (bertanya, menjawab, memberi opini).
---

## Dasar Teori
Paradigma pemrograman adalah cara pandang dalam menyusun program:

Prosedural: program dibangun sebagai rangkaian perintah (fungsi/prosedur).
OOP (Object-Oriented Programming): program dibangun dari objek yang memiliki data (atribut) dan perilaku (method).
Fungsional: program dipandang sebagai pemetaan fungsi matematika, lebih menekankan ekspresi dan transformasi data.

## Langkah Praktikum
1. Menginstall JDK versi terbaru dan cek instalasinya menggunakan perintah java -version
2. Membuat file program HelloProcedural.java, HelloOOP.java, dan HelloFunctional.java.
3. Menulis kode sesuai paradigma yang diminta.
4. Melakukan eksekusi program
5. Mengecek hasil eksekusi di terminal.
6. Membuat commit ke repository GitHub dengan pesan commit "week1-setup-hello-pos"

## Kode Program
HelloFuncional

// HelloFunctional
import java.util.function.BiConsumer;

public class HelloFunctional {
    public static void main(String[] args) {
        BiConsumer<String, String> introduce =
            (nim, name) -> System.out.println("Hello World, I am " + name + " - " + nim);

        introduce.accept("240202883", "Rizal Ramadani");
    }
}

HelloOOP

// HelloOOP
class Student {
    String nim;
    String name;
    Student(String nim, String name) {
        this.nim = nim;
        this.name = name;
    }

    void introduce() {
        System.out.println("Hello World, I am " + name + " - " + nim);
    }
}

public class HelloOOP {
    public static void main(String[] args) {
        Student s = new Student("240202883", "Rizal Ramadani");
        s.introduce();
    }
}

HelloProcedural

// HelloProcedural
public class HelloProcedural {
    public static void main(String[] args) {
        String nim = "240202883";
        String name = "Rizal Ramadani";
        System.out.println("Hello World, I am " + name + " - " + nim);
    }
}

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hello.functional.png)
)
---

## Analisis
Analisis Konsep Dasar OOP
Menjelaskan prinsip-prinsip utama seperti encapsulation, inheritance, polymorphism, dan abstraction, serta bagaimana masing-masing membantu membangun program yang modular, efisien, dan mudah dipelihara.

🔹 Analisis Program OOP
Menganalisis sebuah kode Java, Python, C++, atau bahasa lain yang berbasis objek — melihat bagaimana kelas, objek, dan relasi antar objek digunakan.

🔹 Analisis Desain OOP (UML)
Membahas struktur desain seperti class diagram, sequence diagram, atau object diagram untuk memahami hubungan antar kelas dan perilaku sistem.

🔹 Analisis Penerapan OOP dalam Proyek Nyata
Contohnya: bagaimana OOP diterapkan dalam sistem perpustakaan, aplikasi kasir, sistem akademik, dsb.
## Kesimpulan
Pemrograman Berorientasi Objek (OOP) adalah paradigma pemrograman yang berfokus pada objek sebagai representasi dari dunia nyata. Setiap objek memiliki atribut (data) dan metode (perilaku) yang saling berhubungan. Dengan pendekatan ini, program menjadi lebih terstruktur, modular, mudah dikembangkan, serta mudah dipelihara.

1 OOP memudahkan pengembang dalam membangun sistem yang kompleks dengan cara membaginya menjadi bagian-bagian kecil yang saling berinteraksi. Empat pilar utama OOP yaitu:

2 Encapsulation (Enkapsulasi) → menyembunyikan detail data dan hanya menyediakan antarmuka yang diperlukan.

3 Inheritance (Pewarisan) → memungkinkan kelas baru mewarisi sifat dan perilaku dari kelas lain.

4 Polymorphism (Polimorfisme) → memungkinkan satu interface memiliki banyak bentuk perilaku.

5 Abstraction (Abstraksi) → menyederhanakan kompleksitas dengan menampilkan hal-hal penting saja.
## Quiz
1. Apakah OOP selalu lebih baik dari prosedural? 
 jawaban :  Tidak selalu.
OOP lebih baik untuk program besar karena terstruktur, mudah dikembangkan, dan bisa digunakan ulang.
Namun, pemrograman prosedural lebih cocok untuk program kecil yang sederhana dan cepat dijalankan.
Jadi, pilihannya tergantung pada kebutuhan dan kompleksitas proyek.  

2. Kapan functional programming lebih cocok digunakan dibanding OOP atau prosedural?
 jawaban : functional programming cocok untuk pemrosesan data yang kompleks, paralel, dan butuh hasil yang pasti, sedangkan OOP atau prosedural lebih cocok untuk sistem yang berorientasi objek atau urutan proses.  

3. Bagaimana paradigma (prosedural, OOP, fungsional) memengaruhi maintainability dan scalability aplikasi?
 jwaban :  OOP (Object-Oriented Programming) lebih sesuai untuk sistem yang berorientasi pada objek, di mana terdapat interaksi antar entitas dengan atribut dan perilaku tertentu. Pemrograman prosedural cocok untuk program yang mengikuti urutan langkah-langkah logis dan tidak terlalu kompleks. Dengan demikian, functional programming unggul dalam pengolahan data dan komputasi, sedangkan OOP dan prosedural lebih baik digunakan untuk membangun sistem yang meniru struktur dunia nyata atau alur proses tertentu.

4.   Mengapa OOP lebih cocok untuk mengembangkan aplikasi POS dibanding prosedural?
 jawaban :  Dengan menggunakan OOP, pengembang bisa:

1 Membuat struktur kode yang modular, sehingga tiap bagian (misalnya kelas Produk atau Transaksi) dapat dikembangkan atau diperbaiki tanpa mengganggu bagian lain.

2 Memanfaatkan pewarisan (inheritance) untuk menghemat kode, misalnya kelas BarangElektronik dapat mewarisi sifat dari kelas Produk.

3 Menggunakan enkapsulasi, sehingga data penting seperti harga atau stok terlindungi dan hanya bisa diakses lewat metode tertentu.

4 Mempermudah pemeliharaan dan pengembangan fitur baru, seperti diskon, laporan harian, atau integrasi pembayaran digital, tanpa mengubah seluruh struktur program.

5. Mengapa OOP lebih cocok untuk mengembangkan aplikasi POS dibanding prosedural?
 jawaban : Paradigma fungsional mengurangi kode berulang dengan memanfaatkan fungsi-fungsi reusable dan deklaratif, memungkinkan pengembang menulis kode yang lebih singkat, bersih, dan mudah dirawat dibandingkan paradigma prosedural atau OOP.)
