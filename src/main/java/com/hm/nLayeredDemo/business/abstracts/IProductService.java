package com.hm.nLayeredDemo.business.abstracts;
import com.hm.nLayeredDemo.core.utilities.results.DataResult;
import com.hm.nLayeredDemo.core.utilities.results.Result;
import com.hm.nLayeredDemo.entities.concretes.Product;
import java.util.List;

/*
 Business katmanında IProductService sınıfında projede kullanacak olduğumuz operasyonların(metotlar vs.) imzasını tanımladığımız soyut sınıfımız.
 JPA Repository sınıfı yapılandırılmış ayarlar sayesinde bu iş sınıfımızda belirli metot isim kalıplarına uyarak
 metotlarımızı oluşturabiliriz. Yani metotlar getBy ile başladığımızda bir where koşulu yazılacağını biliyor. Hangi tablo sutun ismi ile işlem yapacaksak ona göre yapılandırırız.
 Örneğin getByProductNameAndCategoryId metodunun imzası ile ürün ismi ve kategorisinin id' sine göre tetiklenecek olan metodun imzasını tanımladık.
*/
public interface IProductService {

    DataResult<List<Product>> getAll();
    Result add(Product product);

    DataResult<Product> getByProductName(String productName);
    DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
    DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
    DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
    DataResult<List<Product>> getByProductNameContains(String productName);
    DataResult<List<Product>> getByProductNameStartsWith(String productName);
    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);


}
