package com.example.splab.model;




public class Section extends Element{
    private String title;

    public Section(String title){
        this.title = title;
    }

    @Override 
    public String toString(){
        return title;
    }
}
