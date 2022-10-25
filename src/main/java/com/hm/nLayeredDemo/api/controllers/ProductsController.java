package com.hm.nLayeredDemo.api.controllers;

import com.hm.nLayeredDemo.business.abstracts.IProductService;
import com.hm.nLayeredDemo.core.utilities.results.DataResult;
import com.hm.nLayeredDemo.core.utilities.results.Result;
import com.hm.nLayeredDemo.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
    Burada tanımlamış olduğumuz api katmanında, projemizi dış dünyaya (mobil uygulama, farklı bir web uygulaması, masaüstü uygulaması) açtığımız katmandır.
    @RestController, sınıfın dışardan gelen requestleri yakalaması gereken bir sınıf olduğu belirtilir.
    ResponseBody varsayılan olarak tanımlanır.(Eldeki veriyi JSON olarak serialize edip geri gönderirler.)
    @Controller anotasyonundan farklı olarak datanın kendisini JSON veya XML formatı ile direkt olarak sunabiliyor. Bu da farklı uygulamalarında kullanabileceği veriyi döndürür.
    @RequestMapping, request yapılacak olan URL adresinin path bilgisini tanımlamaya yarar. Bir URL'den istek geldiği zaman,
       istek atılan URL'in path bilgisi ile RequestMapping içerisinde tanımlanan path bilgisi uyuşuyorsa,
       @RequestMapping tanımlaması yapılan fonksiyon çalışır..
    @RequestParam clienttan gelecek olan datayı api' nin parametreleri kabul edeceği json formatına dönüştürür.

 */
@RestController
@RequestMapping("/api/products")
public class ProductsController {
    @Autowired
    private IProductService productService;

    ProductsController(IProductService productService) {
        super();
        this.productService = productService;
    }

    @GetMapping("/getall")
    public DataResult<List<Product>> getAll() {
        return this.productService.getAll();
    }

    //@RequestBody anotasyonu ile client' ın göndereceği datayı json formatına döndürerek veritabanı sınıfımızdaki nesnelerle eşleşme işlemi yapıyor.
    @PostMapping("/add")
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }

    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName) {
        return this.productService.getByProductName(productName);
    }

    @GetMapping("/getByProductNameAndCategoryId")
    public DataResult<Product> getByProductNameAndCategoryId(@RequestParam String productName, @RequestParam int categoryId) {
        return this.productService.getByProductNameAndCategoryId(productName, categoryId);
    }

}
