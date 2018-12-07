package eu.domroese.toolbox.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class OttTime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String project;
    private String story;
    private String task;
    private Date start;
    @Column(nullable = true)
    private Date end;

    public Integer getId() {return id;}

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
