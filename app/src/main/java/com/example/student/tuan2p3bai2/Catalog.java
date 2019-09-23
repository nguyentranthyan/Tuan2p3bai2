package com.example.student.tuan2p3bai2;

import java.util.ArrayList;

public class Catalog extends Goods {
    private ArrayList<Product> listsp = null;

    public Catalog() {
        super();
        this.listsp = new ArrayList<Product>();
    }

    public boolean isDuplicte(Product p) {
        for (Product p1 : listsp) {
            if (p1.getId().trim().equalsIgnoreCase(p.getId().trim()))
                return true;
        }
        return false;
    }

    public Boolean addproduct(Product p){
        boolean isdup=isDuplicte(p);
        if(!isdup){
            p.setDmuc(this);
        }
        return !isdup;
    }

    public ArrayList<Product> getListsp() {
        return listsp;
    }
    public int size(){
        return listsp.size();
    }
    public Product get(int i){
        return listsp.get(i);
    }
}
