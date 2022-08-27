package com.pzaloznyi.cursorspringboot.product;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products;

    @PostConstruct
    private void init() {
        var one = new Product().setName("Mars").setPrice(BigDecimal.valueOf(15));
        var two = new Product().setName("Snickers").setPrice(BigDecimal.valueOf(20));
        products = Arrays.asList(one, two);
    }

    public void createProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void delete(String name) {
        products = products.stream().filter(x -> !x.getName().equals(name)).toList();
    }
}
