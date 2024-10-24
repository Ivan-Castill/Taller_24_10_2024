package Calificaciones;

public class Notas {
    double nota1;
    double nota2;

    public Notas(double nota1,double nota2){
        this.nota1=nota1;
        this.nota2=nota2;
    }
    public double promedio(){
        return (nota1+nota2)/2;
    }
    public void imprimirPromedio(){
        System.out.print("El promedio es: "+promedio()+"\n");
    }
}
