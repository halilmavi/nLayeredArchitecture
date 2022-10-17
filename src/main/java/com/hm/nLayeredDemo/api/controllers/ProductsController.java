package com.hm.nLayeredDemo.api.controllers;

import com.hm.nLayeredDemo.business.abstracts.IProductService;
import com.hm.nLayeredDemo.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
    @RestController, sınıfın dışardan gelen requestleri yakalaması gereken bir sınıf olduğu belirtilir.
    ResponseBody varsayılan olarak tanımlanır.(Eldeki veriyi JSON olarak serialize edip geri gönderirler.)
    @Controller anotasyonundan farklı olarak datanın kendisini JSON veya XML formatı ile direkt olarak sunabiliyor.
    @RequestMapping, request yapılacak olan URL adresinin path bilgisini tanımlamaya yarar. Bir URL'den istek geldiği zaman,
       istek atılan URL'in path bilgisi ile RequestMapping içerisinde tanımlanan path bilgisi uyuşuyorsa,
       @RequestMapping tanımlaması yapılan fonksiyon çalışır..
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
    public List<Product> getAll() {
        return this.productService.getAll();
    }

}
