package br.edu.ifpb;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        professor p1 = new professor();
        professor p2 = new professor(10,"Evil Queen",30,1500.50,15);

        System.out.println(p1.toString());
        System.out.println("p2.toString() = " + p2.toString());
    }
}
