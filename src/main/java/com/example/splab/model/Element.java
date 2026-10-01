package com.example.splab.model;

import java.util.ArrayList;
import java.util.List;

public class Element {
    private List<Element> elements  = new ArrayList<>();

    public void printElementDetails(){
        for (Element element : elements){
            System.out.println(element.toString());
        }
    }

    public void add(Element object){
        elements.add(object);
    }

    public void remove(Element object){
        try{
            elements.remove(object);
        } catch (Exception e){
            System.out.println(e);
        }
        
    }

    public Element getElement(int index){
        try{
            return elements.get(index);
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    
}
