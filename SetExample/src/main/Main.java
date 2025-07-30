package main;

import entities.UserLogin;
import util.Reader;
import util.ReaderSimpleFactory;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class Main
{
    public static void main( String[] args )
    {
        Reader<UserLogin> userLoginReader = ReaderSimpleFactory.getReader( UserLogin.class );
        
        File file = new File( "src/in.txt" );
        
        Set<UserLogin> userLogins = new HashSet<>( userLoginReader.read( file ) );
        
        System.out.println( "Total logins: " + userLogins.size() );
    }
}