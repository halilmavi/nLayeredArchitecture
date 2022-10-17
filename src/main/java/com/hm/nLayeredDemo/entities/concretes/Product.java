package com.hm.nLayeredDemo.entities.concretes;

import javax.persistence.*;

/*
  Annotation yapısı JDK 1.5 ile Java diline ve Java komutlarına ek bilgi eklemek için kullanılan ifadelerdir.
  Entity anatasyonu, Product classının artık bir veritabanı nesnesi olduğunu tanımladık.Entity sınıfı bir POJO sınıfıdır. Final yada Inner class olarak tanımlanamaz.
  Table anatastonu, java sınıfımız ve veritabanı tablolarını eşleştirmek için kullanılır. Şu an Product sınıfını veritabanındaki products tablosu ile eşleştirme işlemi yaptık.
  Column anatasyonu ile de veritabanındaki eşleştirdiğimiz tablodaki özellikleri buradaki field'lar ile eşleştirme yapıyoruz.
  Id anatasyonunu da tanımlıyoruz çünkü veritabanı işlemlerimizi de bu id ye göre yapacak.
  GeneratedValue ile id nin 1 er artırılması gerektiğini tanımlıyoruz.
 */

@Entity
@Table(name = "products")
public class Product {

    @GeneratedValue
    @Id
    @Column(name = "product_id")
    private int id;

    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "units_in_stock")
    private short unitsInStock;

    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;

    public Product(){}

    public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock, String quantityPerUnit) {
        super();
        this.id = id;
        this.categoryId = categoryId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.quantityPerUnit = quantityPerUnit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public short getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(short unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }
}
