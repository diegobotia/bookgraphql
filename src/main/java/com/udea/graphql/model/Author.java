package com.udea.graphql.model;

import org.springframework.graphql.data.method.annotation.SchemaMapping;

public class Author {


    private String name;
   // private String thumbnail;


    public Author(String name) {
        this.name = name;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}