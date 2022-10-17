package com.hm.nLayeredDemo.business.concretes;

import com.hm.nLayeredDemo.business.abstracts.IProductService;
import com.hm.nLayeredDemo.dataAccess.abstracts.IProductDao;
import com.hm.nLayeredDemo.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
    @Service anotastonu ile springe bu sınıfın bir iş sınıfı olduğunu tanımlama işlemi yapıyoruz.
    @Autowired anotasyonu, Constructor, değişken ya da setter metodlar için dependency injection işlemi gerçekleştirir.
     Bu iş sınıfımızda, veritabanı tablolarını ifade eden somut sınıfımıza direkt erişmek yerine veritabanı sınıfınının referans adresini
     tutan Interface sınıfını parametre olarak tanımladık. ProductManager sınıfı tetiklendiğinde Spring boot arka planda bu interface sınıfına
     karşılık gelecek olan bir instance(yani iş sınıfında kullanabileceğimiz somut bir veritabanı sınıfını) oluşturur. Böyle bir yaklaşımı yapmamızın sebebi de
     İlerleyen süreçlerde farklı bir veritabanı teknolojisine geçildiğinde; veritabanı sınıfını direkt burada kullansaydık bir çok yerde kod değişikliği yapmamız gerekecekti.
*/

@Service
public class ProductManager implements IProductService {
    private IProductDao productDao;

    @Autowired
    public ProductManager(IProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
