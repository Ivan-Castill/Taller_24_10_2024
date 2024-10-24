package Calificaciones;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Persona persona1=new Persona("Ivan",26,982158101);
        Notas notas=new Notas(8.2,9.5);

        persona1.imprimirDatos();
        notas.imprimirPromedio();
    }
}
