package com.springtut.springtutorial.model;

public class Course {
    private long id;
    private String name;
    private String author;

    // constructor
    public Course(long id, String name, String author){
        this.id = id;
        this.name = name;
        this.author = author;

    }// end of constrctor 

    public long getId() {
        return this.id;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", author='" + getAuthor() + "'" +
            "}";
    }
    
    // getters 
    //to string 
}
