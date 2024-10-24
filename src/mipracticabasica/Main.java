package mipracticabasica;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese su edad:");
        int edad=scanner.nextInt();
        Persona person1=new Persona(edad);
        person1.mostrarResultado();
    }
}