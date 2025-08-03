package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Course
{
    private int id;
    private String name;
    private Person professor;
    private List<Person> students = new ArrayList<>();
    
    public Course() {}
    
    public Course( int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return id + " - " + name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId( int id )
    {
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName( String name )
    {
        this.name = name;
    }
    
    public Person getProfessor()
    {
        return professor;
    }
    
    public void setProfessor( Person professor )
    {
        this.professor = professor;
    }
    
    public List<Person> getStudents()
    {
        return students;
    }
    
    public void setStudents( List<Person> students )
    {
        this.students = students;
    }
    
    public void addStudent( Person person )
    {
        students.add( person );
    }
}
