package com.pluralsight.SimpleSpringweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

public interface ProductDao {
     void add(Product product);
     List<Product> getAll();

}
