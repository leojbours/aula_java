package application;

import model.controllers.CourseController;
import model.entities.Course;
import model.entities.Person;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );
        
        CourseController courseController = CourseController.getInstance();
        
        int personIdCount = 1;
        List<Person> personList = new ArrayList<>();
        
        int option;
        
        do
        {
            System.out.println( "1- Registrar curso" );
            System.out.println( "2- Cadastrar uma pessoa" );
            System.out.println( "3- Adicionar alunos a um curso" );
            System.out.println( "4- Adicionar professor a curso " );
            System.out.println( "5- Listar todos alunos de todos os cursos" );
            System.out.println( "0- Sair" );
            System.out.print( "Escolha uma opção: " );
            option = sc.nextInt();
            sc.nextLine();
            
            switch ( option )
            {
                case 1 ->
                {
                    System.out.print( "Digite o id do curso: " );
                    int id = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print( "Digite o nome do curso: " );
                    String name = sc.nextLine();
                    
                    courseController.addCourse( new Course( id, name ) );
                }
                
                case 2 ->
                {
                    System.out.print( "Digite o nome da pessoa: " );
                    String name = sc.nextLine();
                    
                    personList.add( new Person( personIdCount, name ) );
                    personIdCount++;
                }
                
                case 3 ->
                {
                    String nextPerson;
                    
                    printCourses( courseController.getCourses() );
                    System.out.print( "Escolha um curso (digite o id): " );
                    Course selectedCouse = courseController.getCourseById( sc.nextInt() );
                    
                    do
                    {
                        printPersons( personList );
                        System.out.print( "Escolha uma pessoa (digite o id): " );
                        int personId = sc.nextInt();
                        sc.nextLine();
                        
                        Person selectedPerson = new Person();
                        
                        for ( Person person : personList )
                        {
                            if ( person.getId() == personId )
                            {
                                selectedPerson = person;
                            }
                        }
                        
                        selectedCouse.addStudent( selectedPerson );
                        
                        System.out.print( "Deseja adicionar mais algum aluno? " );
                        nextPerson = sc.nextLine();
                    }
                    while ( nextPerson.toLowerCase().charAt( 0 ) != 'n' );
                    
                }
                
                case 4 ->
                {
                    printCourses( courseController.getCourses() );
                    System.out.print( "Escolha um curso (digite o id): " );
                    Course selectedCouse = courseController.getCourseById( sc.nextInt() );
                    
                    printPersons( personList );
                    System.out.print( "Escolha uma pessoa (digite o id): " );
                    int personId = sc.nextInt();
                    sc.nextLine();
                    
                    Person selectedPerson = new Person();
                    
                    for ( Person person : personList )
                    {
                        if ( person.getId() == personId )
                        {
                            selectedPerson = person;
                        }
                    }
                    
                    selectedCouse.setProfessor( selectedPerson );
                }
                
                case 5 ->
                {
                    System.out.println( "----- Students -----" );
                    Set<Person> students = new HashSet<>( courseController.getAllCoursesStudents() );
                    students.forEach( System.out::println );
                    System.out.println( "Total: " + students.size() );
                    System.out.println( "--------------------" );
                }
            }
        }
        while ( option != 0 );
    }
    
    public static void printCourses( List<Course> courses )
    {
        System.out.println( "----- Cursos Cadastrados ----- " );
        for ( Course course : courses )
        {
            System.out.println( course );
        }
        System.out.println("-------------------------------");
    }
    
    public static void printPersons( List<Person> personList )
    {
        System.out.println( "----- Pessoas Cadastradas ----- " );
        for ( Person person : personList )
        {
            System.out.println( person );
        }
        System.out.println("-------------------------------");
        
        System.out.println( "Qual pessoa deseja adicionar? (escreva o id)" );
    }
}