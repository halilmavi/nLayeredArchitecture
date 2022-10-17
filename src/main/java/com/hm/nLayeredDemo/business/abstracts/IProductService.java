package com.hm.nLayeredDemo.business.abstracts;

import com.hm.nLayeredDemo.entities.concretes.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

}
