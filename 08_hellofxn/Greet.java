/*
Nada Hameed
APCS
HW08 -- Refactor Freshie Zero
10/01/2021

DISCOVERIES: All three are printed (Nada/Ray/Mr. Mykolyk + greeting)
UNRESOLVED QUESTIONS: Is there a way to choose only one to print (greet only one person) when running the code?
*/

public class Greet {
	public static void main(String[] args){
		Greet("Nada");
		Greet("Ray");
		Greet("Mr. Mykolyk");
	}
	public static void Greet(String a){
	System.out.println("Hey there, " + a + ". How are you today?");
}
}
