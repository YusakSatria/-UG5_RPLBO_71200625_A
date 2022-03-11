package com.ug5a2;

public class Buku {
    private String code;
    private static int nextNum = 1;
    private String title;
    private String writter;
    private long price;
    private Integer stock;
    public Buku (String argTitle,String argWritter, long argPrice, Integer argStock) {
        title = argTitle;
        writter = argWritter;
        price = argPrice;
        stock = argStock;
        code = "NV24510" + nextNum++;

    }

    public String getTitle() {
        return title;
    }

    public String getWritter() {
        return writter;
    }

    public long getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public String getCode() {
        return code;
    }
}