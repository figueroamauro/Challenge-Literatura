package ar.com.old.literatura.models;

import java.util.List;

public class Book {
    private Long id;
    private String title;
    private List<String> languages;
    private List<Author> authors;
    private int downloadCount;

    public Book(Long id, String title, List<String> languages, List<Author> authors, int downloadCount) {
        this.id = id;
        this.title = title;
        this.languages = languages;
        this.authors = authors;
        this.downloadCount = downloadCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }
}
