package Calificaciones;

public class Persona {
    String nombre;
    int edad;
    int telefono;

    public Persona(String nombre,int edad,int telfono){
        this.nombre=nombre;
        this.edad=edad;
        this.telefono=telfono;
    }

    public void imprimirDatos(){
        System.out.print("\nNombre del estudiante: "+nombre);
        System.out.print("\nEdad del estudiante: "+edad);
        System.out.print("\nTelefono del estudiante: +593"+telefono+"\n");

    }
}
