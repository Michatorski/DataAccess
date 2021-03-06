package org.iesf.instituto.jdbc;

import java.util.Objects;


public class Group {

    private Integer id;
    private String course;
    private String letter;
    private String title;
    private int year;

    public Group(Integer id, String course, String letter, String title, int year) {
        this.id = id;
        this.course = course;
        this.letter = letter;
        this.title = title;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return year == group.year && Objects.equals(id, group.id) && Objects.equals(course, group.course) && Objects.equals(letter, group.letter) && Objects.equals(title, group.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, course, letter, title, year);
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", course='" + course + '\'' +
                ", letter='" + letter + '\'' +
                ", title=" + title +
                ", year=" + year +
                '}';
    }
}
