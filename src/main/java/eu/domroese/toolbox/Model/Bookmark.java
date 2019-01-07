package eu.domroese.toolbox.Model;

import javax.persistence.*;

@Entity
public class Bookmark {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    private String url;

    private String title;

    private String group;


    /* Constructors */
    public Bookmark() {}

    public Bookmark(String url) {
        this.url = url;
    }

    public Bookmark(String url, String title) {
        this.url = url;
        this.title = title;
    }

    public Bookmark(String url, String title, String group) {
        this.url = url;
        this.title = title;
        this.group = group;
    }

    /* /Constructors */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    /* /getters and setters */
}
