package com.Articles;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "articles")
public class Article {
    @Id
    private String id;
    private String title;
    private String content;
    private int year;

    public Article( String title, String content, int year) {
        this.title = title;
        this.content = content;
        this.year = year;
    }

    public String getId() { return id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getYear() { return year; }

    public void setYear(int year) {
        this.year = year;
    }
}
