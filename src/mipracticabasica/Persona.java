package mipracticabasica;

public class Persona {
    int edad;

    public Persona(int edad){
        this.edad=edad;
    }
    public int ImprimirEdad() {
        System.out.println("Tu edad es : ");
        return edad;
    }
    public boolean verificarMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public void mostrarResultado(){
        System.out.print(+ImprimirEdad());
        if (verificarMayorDeEdad()) {
            System.out.println("\nEl usuario es mayor de edad.");
        } else {
            System.out.println("\nEl usuario es menor de edad.");
        }
    }
}
