package com.hm.nLayeredDemo.business.abstracts;
import com.hm.nLayeredDemo.core.utilities.results.DataResult;
import com.hm.nLayeredDemo.core.utilities.results.Result;
import com.hm.nLayeredDemo.entities.concretes.Product;
import java.util.List;

// Business katmanında projede kullanacak olduğumuz operasyonların(metotlar vs.) imzasını tanımladığımız soyut sınıfımız.
public interface IProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);

}
