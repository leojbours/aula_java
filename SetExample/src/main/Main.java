package main;

import entities.UserLogin;
import util.Reader;
import util.ReaderSimpleFactory;
import util.UserReader;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main
{
    public static void main( String[] args )
    {
        Reader<UserLogin> userLoginReader = ReaderSimpleFactory.getReader( UserLogin.class );
        
        String path = "src/in.txt";
        
        File file = new File( path );
        
        List<UserLogin> userLoginsList = userLoginReader.read( file );
        
        Set<UserLogin> userLoginsSet = new HashSet<>( userLoginsList );
        
        System.out.println( userLoginsSet.size() );
        
    }
}