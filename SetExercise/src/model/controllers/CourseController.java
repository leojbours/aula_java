package model.controllers;

import model.entities.Course;
import model.entities.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CourseController
{
    private static CourseController instance;
    
    public static CourseController getInstance()
    {
        if ( instance == null )
        {
            instance = new CourseController();
        }
        
        return instance;
    }
    
    List<Course> courses = new ArrayList<>();
    
    public void addCourse( Course course )
    {
        if ( course != null )
        {
            courses.add( course );
        }
    }
    
    public void removeCourse( Course course )
    {
        if ( course != null )
        {
            courses.remove( course );
        }
    }
    
    public Course getCourseById( int id )
    {
        for ( Course course : courses )
        {
            if ( course.getId() == id )
            {
                return course;
            }
        }
        
        return new Course();
    }
    
    public List<Course> getCourses()
    {
        return courses;
    }
    
    public Collection<Person> getAllCoursesStudents()
    {
        List<Person> persons = new ArrayList<>();
        
        for ( Course course : courses )
        {
            persons.addAll( course.getStudents() );
        }
        
        return persons;
    }
}
