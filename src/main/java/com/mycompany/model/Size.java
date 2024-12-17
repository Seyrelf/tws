package com.mycompany.model;

public enum Size {

    SMALL("S"),BIG("B");
    private final String size;
    Size(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
}
