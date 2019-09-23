package com.example.student.tuan2p3bai2;

public class Product extends Goods{
    private Catalog dmuc;

    public Product(Catalog dmuc) {
        this.dmuc = dmuc;
    }

    public Product(String id, String name) {
        super(id, name);
    }

    public Product(String id, String name, Catalog dmuc) {
        super(id, name);
        this.dmuc = dmuc;
    }

    public Catalog getDmuc() {
        return dmuc;
    }

    public void setDmuc(Catalog dmuc) {
        this.dmuc = dmuc;
    }


}
