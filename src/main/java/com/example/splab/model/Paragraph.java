package com.example.splab.model;



public class Paragraph extends Element{
    private String text;

    public Paragraph(String text){
        this.text = text;
    }

    public void printParagraph(AlignStrategy alignStrategy){
        alignStrategy.render(this);
    }

    @Override 
    public String toString(){
        return text;
    }
}
