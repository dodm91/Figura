package figura;

public abstract class Figura {

    protected Punto origen = new Punto();
    private int numFiguras = 0;

    public Figura() {
        numFiguras++;
    }

    public void Desplazar(double dx, double dy) {
        this.origen.Desplazar(dx, dy);
    }

    abstract double Area();

    abstract double Perimetro();

    abstract void Escalar(double n);
}
