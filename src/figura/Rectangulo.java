package figura;

import java.math.*;

public class Rectangulo extends Cuadrado {

    double alto;

    public Rectangulo() {
        super();
        this.alto = 0;
    }

    public static Rectangulo Rectangulo(Punto p, double ancho, double alto){
        Rectangulo r;
        
        r = new Rectangulo();
        r.origen = p;
        r.ancho = ancho;
        r.alto = alto;
        return r;
    }
    /*
    public Rectangulo(Punto p, double ancho, double alto) {
        super();
        this.ancho = ancho;
        this.alto = alto;
    }
*/
    public Rectangulo(double ancho, double alto) {
        super();
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(Punto p) {
        super();
        this.origen = p;
        this.alto = 0;
    }


    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    double Area() {
        return (ancho * alto);
    }

    @Override
    double Perimetro() {
        return (ancho * 2 + alto * 2);
    }

    @Override
    void Escalar(double porc) {
        super.Escalar(porc);
        this.alto = alto + alto * porc / 100;
    }

    void Escalar(double nAncho, double nAlto) {
        this.ancho = nAncho;
        this.alto = nAlto;
    }

    @Override
    public String toString() {
        return "Rectangulo( " + super.toString() + " - Alto: " + this.alto + " )";
    }
}