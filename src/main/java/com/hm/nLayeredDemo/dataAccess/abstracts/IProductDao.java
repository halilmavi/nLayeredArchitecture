package com.hm.nLayeredDemo.dataAccess.abstracts;

import com.hm.nLayeredDemo.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/*
    JPA, Java Persistence Api’nin kısaltması olup Java uygulamarında ilişkisel veriler için geliştirilmiş bir kütüphanedir.
    Extends etmiş olduğumuz JpaRepository interface ile Veritabanı ile ilgili CRUD işlemlerini kolay bir şekilde tanımlayabileceğiz.
    JpaRepository' e parametre olarak geçmiş olduğumuz Product ve Integer, çalışacak olduğumuz sınıfı ve Id' nin tipini bildirmemiz gerekiyor.
    JpaRepository sayesinde; getBy ile başlaması koşulu ile kendimize farklı operasyonları tanımlayabiliriz.
    Tanımladığımız operasyonları and ve or koşullarını ekleyerek tanımlayabiliriz. Jpa bizim operasyon ismimize göre arka planda SQL sorgusu gibi çalıştırıyor.
    İmzalarını tanınladığımız metotların doğru çalışması için isimlendirme kurallarına uymamız gerekiyor mutlaka.

*/

public interface IProductDao extends JpaRepository<Product, Integer> {
    Product getByProductName(String productName);
    Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
    List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
    List<Product> getByCategory_CategoryIdIn(List<Integer> categories);
    List<Product> getByProductNameContains(String productName);
    List<Product> getByProductNameStartsWith(String productName);

    @Query("From Product where productName=:productName and category.categoryId=:categoryId")
    List<Product> getByNameAndCategory(String productName, int categoryId);

}
