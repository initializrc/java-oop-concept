# __java-oop-concept__

<hr>

## Object Oriented Programming 

> Object Oriented Programming is a programming paradigm used by industries when developing an Application Program. The main feature of Object-Oriented Programming comprises ADT (Abstract Data Type), Inheritance, Dynamic Binding to implement true polymirphism, Generic Programming and else.

<br>
<hr>

## Konsep OOP

1. Class & Object

	- Class ialah template untuk membuat object. Class terdiri dari data member dan member function. Contoh class Mahasiswa terdiri dari:
		- Data member: NIM, Nama, IPK.
		- Member function: belajar.
	- Object merupakan instansiasi dari class.
	Class adalah tipe data, sedangkan object adalah variabel. Dari class Mahasiswa tersebut akan dibuat object seperti Anto, Bella dan object mahasiswa lainnya.

2. Constructor 
	- Merupakan function khusus yang mendeskripsikan bagaimana instansiasi dari class dibentuk.
	ketika membuat instansiasi dari class, maka  constructor akan pertama kali dipanggil secara default, constructor telah ada. Constructor dapat juga dibuat (*user-defined constructor*) dan dapat di *overloading*

3. Encapsulation 
	- Class membungkus attribute dan member function ke dalam object. Tujuannya untuk information hiding.

4. Getter & Setter
	- Getter -> function yang digunakan untuk memperoleh nilai data member.
	- Setter -> function yang digunakan untuk memberi nilai ke data member.

5. Inheritance
	- Membuat tipe class baru dari tipe class yang sudah ada (Pewarisan).

6. Polymorphism
	- Overloading
	   Nama fungsi sama, parameter berbeda. Parameter dibedakan dari jumlah parameter, tipe data parameter, urutan parameter.
	- Overriding
	   Nama fungsi sama namun isi fungsinya berbeda. Biasanya diterapkan ke class yang memiliki inheritance. Bertujuan untuk mengubah *behavior* dari *method parent class* dengan *behavior method child class*.



7. Access Modifier
	- private: hanya dapat diakses oleh class sendiri.
	- protected: hanya dapat diakses oleh class sendiri dan subclass.
	- public: dapat di akses ke semua class dan package
	- no access modifier: dapat di akses pada class dan package yang sama

	| Access Modifier | Class | Package | Subclass | Other Package |
	| :------------- | :---: | :-----: | :------: | :-----------: |
	| public          |   Y   |	   Y    |	  Y    |	   Y       | 
	| protected       |	  Y   |	   Y    |	  Y    |	   N	   |
	| no access 	  |	  Y   |	   Y    |	  N    |	   N	   |
	| private 		  |   Y   |    N    |     N    |       N       |

<hr>
Generic Programming
Generic class atau generic method memungkinkan kita untuk memanggil tipe object yang dapat dibaca oleh class / method.
Dengan penggunaan generic, kita dapat mengimplementasikan algoritma yang bekerja pada tipe object berbeda.
