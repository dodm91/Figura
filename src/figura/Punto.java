package figura;

import java.math.*;

public class Punto {

    private double x;
    private double y;

    public Punto() {
        x = 0;
        y = 0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void Desplazar(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double Distancia(Punto p) {
        return Math.pow(Math.pow(this.x - p.getX(), 2.0)
                + Math.pow(this.y - p.getY(), 2.0), 0.5);

    }

    public void Sumar(Punto p) {
        this.x += p.getX();
        this.y += p.getY();
    }

    @Override
    public String toString() {
        return "Punto( " + x + " - " + y + " )";
    }

    public Punto copiar() {
        Punto copia;
        copia = new Punto(this.x, this.y);
        return copia;
    }

    public static Punto copiar(Punto p) {
        Punto copia;
        copia = new Punto(p.getX(), p.getY());
        return copia;
    }

    public boolean iguales(Punto p) {
        return this.x == p.getX() && this.y == p.getY();
    }
}
