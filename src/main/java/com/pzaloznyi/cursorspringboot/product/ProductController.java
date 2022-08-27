package com.pzaloznyi.cursorspringboot.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductService service;

    public ProductController(@Autowired ProductService service) {

        this.service = service;
    }

    @GetMapping("/products")
    public List<Product> getAll() {
        return service.getProducts();
    }

    @GetMapping("/products/{name}")
    public Product get(@PathVariable String name) {
        return service.getProducts().stream()
                .filter(p -> p.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    @PostMapping("/products")
    public void create(@RequestBody Product product) {
        service.createProduct(product);
    }

    @DeleteMapping("/products/{name}")
    public void deleteByName(@PathVariable String name) {
        service.delete(name);
    }
}
