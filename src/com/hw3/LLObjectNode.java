package com.hw3;

import java.util.Arrays;

/**
 * Created by Aaron on 10/30/2016.
 */
public class LLObjectNode {
    private Object info;
    private LLObjectNode link;

    public LLObjectNode(Object info) {
        this.info = info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setLink(LLObjectNode link) {
        this.link = link;
    }

    public Object getInfo() {
        return info;
    }

    public LLObjectNode getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "LLObjectNode{" +
                "info=" + info +
                ", link=" + link +
                '}';
    }
}
