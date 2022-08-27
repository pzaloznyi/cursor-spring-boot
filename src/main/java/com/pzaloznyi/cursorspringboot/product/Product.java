package com.pzaloznyi.cursorspringboot.product;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Product setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
}
