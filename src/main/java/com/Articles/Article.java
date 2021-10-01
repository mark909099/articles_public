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
    private boolean published;

    public Article( String title, String content, int year, boolean published) {
        this.title = title;
        this.content = content;
        this.year = year;
        this.published = published;
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

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }
}
