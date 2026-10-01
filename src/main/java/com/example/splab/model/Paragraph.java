package com.example.splab.model;



public class Paragraph extends Element{
    private String text;

    public Paragraph(String text){
        this.text = text;
    }

    @Override 
    public String toString(){
        return text;
    }
}
