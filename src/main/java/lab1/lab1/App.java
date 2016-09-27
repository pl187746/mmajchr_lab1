package lab1.lab1;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj nazwe pliku: ");
        String fileName = scan.nextLine();
        System.out.print("Podaj string poprawny: ");
        String strPopr = scan.nextLine();
        System.out.print("Podaj string niepoprawny: ");
        String strNiePopr = scan.nextLine();
    }
}
