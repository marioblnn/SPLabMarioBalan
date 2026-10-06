package com.example.splab.model;

import lombok.Data;

import java.awt.*;

@Data
public class ImageProxy {
    private Image realImage;
    private Dimension dim;
    private String url;

    public ImageProxy(Image realImage, Dimension dim, String url){
        this.realImage = realImage;
        this.dim = dim;
        this.url = url;
    }

    public Image loadImage(){;
        if (realImage == null){
            realImage = new Image(this.url);
        }
        return realImage;
    }

}
