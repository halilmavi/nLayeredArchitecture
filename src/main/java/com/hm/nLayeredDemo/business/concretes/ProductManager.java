package com.hm.nLayeredDemo.business.concretes;

import com.hm.nLayeredDemo.business.abstracts.IProductService;
import com.hm.nLayeredDemo.core.utilities.results.DataResult;
import com.hm.nLayeredDemo.core.utilities.results.Result;
import com.hm.nLayeredDemo.core.utilities.results.SuccessDataResult;
import com.hm.nLayeredDemo.core.utilities.results.SuccessResult;
import com.hm.nLayeredDemo.dataAccess.abstracts.IProductDao;
import com.hm.nLayeredDemo.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
    ProductManager, projede kullanacak olduğumuz operasyonların gövdesini doldurduğumuz, iş kuralları tanımladığımız sınıfımız. IProductService interface'ni implemente ediyor..
    @Service anotastonu ile springe bu sınıfın bir iş sınıfı olduğunu tanımlama işlemi yapıyoruz.
    @Autowired anotasyonu, Constructor, değişken ya da setter metodlar için dependency injection işlemi gerçekleştirir.
     Bu iş sınıfımızda, veritabanı tablolarını ifade eden somut sınıfımıza direkt erişmek yerine veritabanı sınıfınının referans adresini
     tutan Interface sınıfını parametre olarak tanımladık. ProductManager sınıfı tetiklendiğinde Spring boot arka planda bu interface sınıfına
     karşılık gelecek olan bir instance(yani iş sınıfında kullanabileceğimiz somut bir veritabanı sınıfını) oluşturur. Böyle bir yaklaşımı yapmamızın sebebi de
     ORM teknolojilerimizi değiştirme durumuna karşı bu kısımları yeniden düzenlememek için interface uzerinden tanimladik.
*/

@Service
public class ProductManager implements IProductService {

    /*
     Bir bağımlılığı constructor üzerinden inject etme işlemi yaptık. Yani direkt somut sınıfına erişmesini istemediğimiz sınıfların soyut sınıfını constructor
     üzerinden parametre olarak geçiyoruz. ProductManager sınıfından bir instance oluşturulduğunda direkt parametre olarak, IProductDao soyut sınıfına karşılık gelen
     somut bir sınıftan instance oluşturup bize döndürüyor. Burada instance oluşturma işlemini @Autowired anotasyonu yapıyor.
    */
    private IProductDao productDao;

    @Autowired
    public ProductManager(IProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Success Listed");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Product Added");
    }

    @Override
    public DataResult<Product> getByProductName(String productName) {
        return new SuccessDataResult<Product>(this.productDao.getByProductName(productName), "Data Listelendi");
    }

    @Override
    public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<Product>(this.productDao.getByProductNameAndCategory_CategoryId(productName, categoryId), "Data Listelendi");

    }

    @Override
    public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId), "Data Listelendi");

    }

    @Override
    public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByCategory_CategoryIdIn(categories), "Data Listelendi");

    }

    @Override
    public DataResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameContains(productName), "Data Listelendi");

    }

    @Override
    public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName), "Data Listelendi");

    }

    @Override
    public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByNameAndCategory(productName, categoryId), "Data Listelendi");

    }



}
