package com.hm.nLayeredDemo.business.abstracts;
import com.hm.nLayeredDemo.entities.concretes.Product;
import java.util.List;

// Business katmanında projede kullanacak olduğumuz operasyonların(metotlar vs.) imzasını tanımladığımız soyut sınıfımız.
public interface IProductService {
    List<Product> getAll();

}
