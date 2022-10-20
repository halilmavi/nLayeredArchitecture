package com.hm.nLayeredDemo.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

// Product tablosunda her üründe kategori çeşit bilgisi yazar.
// Yani kategori bilgisi tekrar eder o yüzden kategori tablosunda OneToMany() birden çoka anotasyonunu tanımlıyoruz.
// Bir kategori ismi tanımlıdır ama bu birden fazla productta kullanılır.

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="categories")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "products"})
public class Category {

    @Id
    @Column(name = "category_id")
    private int categoryId;

    @Column(name="category_name")
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
