package com.example.student.tuan2p3bai2;

public class Goods {
    private String id;
    private String name;

    public Goods() {
    }

    public Goods(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id+"-"+this.name;
    }
}
