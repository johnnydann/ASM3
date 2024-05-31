package com.laptrinhjava.ASM3.models;

import java.time.LocalDate;

public class Course {
    private int id;
    private String lectureName;
    private String place;
    private LocalDate startDate;

    public Course(int id, LocalDate startDate, String place, String lectureName) {
        this.id = id;
        this.startDate = startDate;
        this.place = place;
        this.lectureName = lectureName;
    }

    public Course() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
