package com.example.demo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Hit
 */
@XmlRootElement
public class Hit {

    public Hit() {
        stdt = "121212";
    }

    public Hit(String stdt) {
        this.stdt = stdt;
    }

    String stdt;

    public String getStdt() {
        return stdt;
    }

    public void setStdt(String stdt) {
        this.stdt = stdt;
    }

}