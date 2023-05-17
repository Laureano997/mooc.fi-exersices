/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laure
 */
public class Book {
    private String author;
    private String name;
    private int page;

    public Book(String author, String name, int page) {
        this.author = author;
        this.name = name;
        this.page = page;
    }

    
    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return page;
    }

    @Override
    public String toString() {
        return author + ", " + name + ", " + page  + " pages";
    }

   
    
    
    
}
