package mipracticabasica;

public class Persona {
    int edad;

    public Persona(int edad){
        this.edad=edad;
    }
    public void imprimirEdad(){
        System.out.println("La edad es : "+ edad);
    }
    public boolean verificarMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public void mostrarResultado(){
        System.out.println("Tu edad es: "+edad);
        if (verificarMayorDeEdad()) {
            System.out.println("El usuario es mayor de edad.");
        } else {
            System.out.println("El usuario es menor de edad.");
        }
    }
}
