package com.example.splab.model;

public class Image extends Element{
    private String url;

    public Image(String url){
        this.url = url;
    }

    @Override 
    public String toString(){
        return url;
    }
}
