/*
Team Not-In-Service: Nada Hameed + Ray, Fang Min Chen + Cat, Prattay Dey + Winnie
APCS
HW10 -- Refactor Big Sib One
10/05/2021
*/

public class Greet {
    public static void main( String[] args ){
        System.out.println(BigSibgreet("Crosby") );
        System.out.println(BigSibgreet("Stills") );
        System.out.println(BigSibgreet("Nash") );
    }
    public static String BigSibgreet(String x) {
        return ("Why hello, " + x);
    }
}

