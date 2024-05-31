package com.laptrinhjava.ASM3.service;


import com.laptrinhjava.ASM3.models.Course;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseService {
    private List<Course> listCourse = new ArrayList<>();

    public void add(Course newCourse) {
        listCourse.add(newCourse);
    }

    public List<Course> getAll() {
        return listCourse;
    }

    public List<Course> getUpcomingCourses() {
        LocalDate today = LocalDate.now();
        return listCourse.stream()
                .filter(course -> course.getStartDate().isAfter(today))
                .collect(Collectors.toList());
    }
}
