package com.hm.nLayeredDemo.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*
  Annotation yapısı JDK 1.5 ile Java diline ve Java komutlarına ek bilgi eklemek için kullanılan ifadelerdir.
  Entity anatasyonu, Product classının artık bir veritabanı nesnesi olduğunu tanımladık.Entity sınıfı bir POJO sınıfıdır. Final yada Inner class olarak tanımlanamaz.
  Table anatastonu, java sınıfımız ve veritabanı tablolarını eşleştirmek için kullanılır. Şu an Product sınıfını veritabanındaki products tablosu ile eşleştirme işlemi yaptık.
  Column anatasyonu ile de veritabanındaki eşleştirdiğimiz tablodaki özellikleri buradaki field'lar ile eşleştirme yapıyoruz.
  Id anatasyonunu da tanımlıyoruz çünkü veritabanı işlemlerimizi de bu id ye göre yapacak.
  GeneratedValue ile id nin 1 er artırılması gerektiğini tanımlıyoruz. Postgresql' de tanımladığımız için GenerationType'nı Identity olarak tanımladık.
  Lombok ile getter setterları ve parametreli parametresiz constructor'ları  arka planda otomatik oluşturma işlemi yaptık
 */

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="products")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private int id;

    //@Column(name="category_id")
    //private int categoryId;

    @Column(name="product_name")
    private String productName;

    @Column(name="unit_price")
    private double unitPrice;

    @Column(name="units_in_stock")
    private short unitsInStock;

    @Column(name="quantity_per_unit")
    private String quantityPerUnit;

    @ManyToOne()
    @JoinColumn(name="category_id")
    private Category category;

}