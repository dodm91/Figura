package figura;

import java.math.*;

public class Cuadrado extends Figura {

    protected double ancho;

    public Cuadrado() {
        super();
        this.origen = new Punto();
        this.ancho = 0;
    }

    public static Cuadrado Cuadrado(Punto p, double ancho) {
        Cuadrado c;

        c = new Cuadrado();
        c.origen = p;
        c.ancho = ancho;
        return c;
    }

    public static Cuadrado Cuadrado(double ancho) {
        Cuadrado c;

        c = new Cuadrado();
        c.origen = new Punto();
        c.ancho = ancho;
        return c;
    }

    public static Cuadrado Cuadrado(Punto p) {
        Cuadrado c;

        c = new Cuadrado();
        c.origen = p;
        c.ancho = 0;
        return c;
    }

    /*    
     public Cuadrado(Punto p, double ancho) {
        
     this.origen = p;
     this.ancho = ancho;
     }
     
     public Cuadrado(double ancho) {
     super();
     this.origen = new Punto();
     this.ancho = ancho;
     }

     public Cuadrado(Punto p) {
     super();
     this.origen = p;
     this.ancho = 0;
     }*/
    
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    double Area() {
        return (this.ancho * this.ancho);
    }

    @Override
    double Perimetro() {
        return (this.ancho * 4);
    }

    @Override
    void Escalar(double porc) {
        this.ancho = ancho + ancho * porc / 100;
    }

    @Override
    public String toString() {
        return "Cuadrado( Origen: " + origen.toString()
                + " - Ancho: " + this.ancho + " )";
    }
}
