package eu.domroese.toolbox.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class OttProject {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String project;

    private String color;

	public OttProject() {
	}

	public OttProject(String project, String color) {
		this.project = project;
		this.color = color;
	}

	public Integer getId() {return id;}

	public void setId(Integer id) {this.id = id;}

	public String getProject() {return project;}

	public void setProject(String project) {this.project = project;}

	public String getColor() {return color;}

	public void setColor(String color) {this.color = color;}
}