# Java-OOP-Concept

Object Oriented Programming 

Object Oriented Programming is a programming paradigm used by industries when developing an Application Program.
The main feature of Object-Oriented Programming comprises ADT (Abstract Data Type), Inheritance, Dynamic Binding to
implement true polymirphism, Generic Programming and else.

Konsep OOP

Class -> template untuk membuat object. Class terdiri dari data member dan member function.
Object -> instansiasi dari class.
Class adalah tipe data, sedangkan object adalah variabel

Contoh : 
Class Mahasiswa terdiri dari:
	- Data member: NIM, Nama, IPK.
	- Member function: belajar.

Dari class Mahasiswa tersebut akan dibuat object seperti Anto, Bella dan object mahasiswa lainnya.

Konsep OOP :
1. Encapsulation
   Class membungkus attribute dan member fucntion ke dalam object. tujuuuannya untuk information hiding
2. Inheritance
   Membuat tipe class baru dari tipe class yang sudah ada.
3. Polymorphism
	a. Overloading
	   Nama fungsi sama, parameter berbeda. Parameter dibedakan dari jumlah parameter, tipe data parameter, urutan parameter.
	b. Overriding
	   Nama fungsi sama namun isi fungsinya berbeda. Biasanya diterapkan ke class yang memiliki inheritance.

Setter -> function yang digunakan untuk memberi nilai ke data member.
Getter -> function yang digunakan untuk memperoleh nilai data member.

Constructor -> function khusus yang mendeskripsikan bagaimana instansiasi dari class dibentuk.
ketika membuat instansiasi dari class, maka  constructor akan pertama kali dipanggil
secara default, constructor telah ada.
constructor dapat juga dibuat (user-defined constructor) dan dapat di overloading

Access Modifier
1. private: hanya dapat diakses oleh class sendiri.
2. protected: hanya dapat diakses oleh class sendiri dan subclass
3. public: dapat di akses ke semua class dan package
4. no access modifier: dapat di akses pada class dan package yang sama

Access Modifier	class	package	subclass  otherpackage
public		Y	Y	Y		Y
protected	Y	Y	Y		N
no access 	Y	Y	N		N
private		Y	N	N		N


Generic Programming
Generic class atau generic method memungkinkan kita untuk memanggil tipe object yang dapat dibaca oleh class / method.
Dengan penggunaan generic, kita dapat mengimplementasikan algoritma yang bekerja pada tipe object berbeda.
