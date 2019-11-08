package com.example.demo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * HitList
 */
@XmlRootElement
public class HitList {

    List<Hit> hitList;

    public List<Hit> getHitList() {
        return hitList;
    }

    public void setHitList(List<Hit> hitList) {
        this.hitList = hitList;
    }
}