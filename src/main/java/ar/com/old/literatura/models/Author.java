package ar.com.old.literatura.models;

public class Author {
    private Long id;
    private String name;
    private short birthYear;
    private short birthDeath;


    public Author(Long id, String name, short birthYear, short birthDeath) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.birthDeath = birthDeath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(short birthYear) {
        this.birthYear = birthYear;
    }

    public short getBirthDeath() {
        return birthDeath;
    }

    public void setBirthDeath(short birthDeath) {
        this.birthDeath = birthDeath;
    }
}
