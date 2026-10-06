package com.example.splab.model;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println(paragraph);
    }
}