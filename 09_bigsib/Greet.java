/*
Roaring '20s - Nada Hameed + Ray, Jeffery Tang + Mathias, Jefford Shau + Dylan
APCS
HW09 -- Greet calls class BigSib calls method greet --> this is Greet
10/04/2021
*/

public class Greet {
    public static void main( String[] args ) {
        BigSib.greet("Flim");
        BigSib.greet("Flam");
        BigSib.greet("Kazaam");
    }
}

/*
DISCOVERIES:
- BigSib.java doesn't need a main method because you never directly run BigSib.java.
 -> Instead, you run BigSib.java through Greet.java, which does need a main method.

UNRESOLVED QS:
-
*/
