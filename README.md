Run Spring Boot Application

Jalankan proyek Spring Boot dari IDE dengan Run atau menggunakan Maven:
mvn spring-boot:run

Test API dengan Postman

Buka Postman dan buat request untuk memastikan API berjalan dengan baik.

Get All Karyawan: GET http://localhost:8080/api/karyawan

Add Karyawan: POST http://localhost:8080/api/karyawan

json
{
  "nik": "12345",
  "namaLengkap": "John Doe",
  "jenisKelamin": "Laki-laki",
  "tanggalLahir": "1990-01-01",
  "alamat": "Jl. Contoh",
  "negara": "Indonesia"
}
