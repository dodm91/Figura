package figura;

import java.math.*;

public class Triangulo extends Figura {

    double base;
    double altura;

    public Triangulo() {
        super();
        this.origen = new Punto();
        this.base = 0;
        this.altura = 0;
    }

    public Triangulo(Punto p, double b, double a) {
        super();
        this.origen = p;
        this.base = b;
        this.altura = a;
    }

    public static Triangulo Triangulo(double b, double a) {
        Triangulo t;

        t = new Triangulo(new Punto(), b, a);
        return t;
    }

    public static Triangulo Triangulo(Punto p) {
        Triangulo t;

        t = new Triangulo(p, 0, 0);
        return t;
    }

   /* public Triangulo(double b, double a) {
        super();
        this.origen = new Punto();
        this.base = b;
        this.altura = a;
    }

    public Triangulo(Punto p) {
        super();
        this.origen = p;
        this.base = 0;
        this.altura = 0;
    }*/

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    double Area() {
        return ((this.base * this.altura) / 2);
    }

    @Override
    double Perimetro() {
        return (Math.pow(Math.pow(this.altura, 2.0)
                + Math.pow((this.base / 2), 2.0), 0.5) * 2 + base);
    }

    @Override
    void Escalar(double porc) {
        this.base = base + base * porc / 100;
        this.altura = altura + altura * porc / 100;
    }

    @Override
    public String toString() {
        return "Triangulo( Origen: " + origen.toString()
                + " - Base: " + this.base + " - Altura: " + this.altura + ")";
    }
}
