package com.pluralsight.SimpleSpringweb;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao{

    public SimpleProductDao() {
        this.productList = new ArrayList<>();
    }

    private List<Product> productList;
    @Override
    public void add(Product product) {
        this.productList.add(product);

    }
    @Override
    public List<Product> getAll() {
      return productList;
    }

}
