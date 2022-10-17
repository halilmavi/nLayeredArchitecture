package com.hm.nLayeredDemo.dataAccess.abstracts;

import com.hm.nLayeredDemo.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/*
    JPA, Java Persistence Api’nin kısaltması olup Java uygulamarında ilişkisel veriler için geliştirilmiş bir kütüphanedir.
    Extends etmiş olduğumuz JpaRepository interface ile Veritabanı ile ilgili CRUD işlemlerini kolay bir şekilde tanımlayabileceğiz.
*/

public interface IProductDao extends JpaRepository <Product,Integer>{

}
