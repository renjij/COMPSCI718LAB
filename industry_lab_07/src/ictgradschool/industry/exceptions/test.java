package ictgradschool.industry.exceptions;

public class test {
    //Lab 1-06
    private void tryCatch06() {
        try {
        try06(0, "" );
        System.out.println( "A" );
    } catch (ArithmeticException e ) {
        System.out.println( "B Error" ); }
    }
    private void try06( int num , String s ) {
        System. out. println( "C" );
        try {
        num = s.length();
        num = 200 / num ;
        } catch (NullPointerException e ) {
        System. out .println( "E Error" ); }
        System. out .println( "F" ); }

    //Lab 1-07
    private void tryCatch07() {
        try07(0, null );
        System.out.println( "A" );
    }
    private void try07( int num , String s ) {
        System.out.println( "B" );
        try {
            num = s .length();
        } catch (NullPointerException e) {
            System.out.println("Error");
        }
        System.out.println( "C" );
    }

    //Lab 1-08
    private void tryCatch08() {
        try {
        try08(0, null );
        System.out.println( "A" );
        } catch (NullPointerException e ) {
        System.out.println( "B" ); }
    }
    private void try08( int num , String s ) {
        System.out.println( "C" );
        try {
        num = s.length();
        System.out.println( "D" );
        } finally {
        System.out.println( "E" );
        }
        System.out.println( "F" ); }

    //Lab 1-09
    private void throwsClause09() {
        try {
        throws09( null );
        System. out .println( "A" );
        } catch (NullPointerException e ) {
        System. out .println( e );
        }
        System. out .println( "B" );
    }
    private void throws09(String numS ) throws NullPointerException {
        if ( numS == null ) {
        throw new NullPointerException( "Null String" );
        }
        System. out .println( "C" );
    }

    //Lab 1-10
    private void throwsClause10() {
        try {
        throws10( null );
        System. out .println( "A" );
        } catch (ArithmeticException e ) {
        System. out .println( e );
        } finally {
        System. out .println( "B" );
        }
        System. out .println( "C" );
    }
    private void throws10(String numS ) throws NullPointerException {
        if ( numS == null ) {
        throw new NullPointerException( "Bad String" );
        }
        System. out .println( "D" );
    }


    public static void main(String[] args) {
        test t = new test();
        t.throwsClause10();
    }


}
