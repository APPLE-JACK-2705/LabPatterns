package Adapter;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.io.Serializable;


@XmlAccessorType(XmlAccessType.FIELD)
public class Student implements Serializable {

    @XmlAttribute
    private String firstName;
    private String secondName;
    private String course;

    @JsonProperty("Name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("SurName")
    public String getSecondName() {
        return secondName;
    }

    @JsonProperty("Course")
    public String getCourse() {
        return course;
    }

    @JsonProperty("Name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("SurName")
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @JsonProperty("Course")
    public void setCourse(String course) {
        this.course = course;
    }
}
