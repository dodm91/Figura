package figura;

public class FiguraTest {

    public static void main(String[] args) {
        FiguraTest.testPunto();
        FiguraTest.testCirculo();
        FiguraTest.testTriangulo();
        FiguraTest.testCuadrado();
        FiguraTest.testRectangulo();
        FiguraTest.DibujarCasa();

    }

    public static void testPunto() {
        System.out.println("TEST DE LA CLASE PUNTO");
        Punto p = new Punto();
        System.out.println(p); //Es como poner p.toString()
        System.out.println();

        Punto p1 = new Punto(3, 4);
        System.out.println("La distancia entre el punto " + p + " y el punto " + p1 + " es " + p.Distancia(p1));
        System.out.println();
    }

    public static void testCirculo() {
        System.out.println();
        System.out.println("TEST DE LA CLASE CIRCULO");
        Punto p = new Punto(3, 4);

        Circulo c = new Circulo();
        System.out.println(c);
        System.out.println("Su area es: " + c.Area());
        System.out.println("Su perimetro es: " + c.Perimetro());
        System.out.println();

        Circulo c1 = Circulo.Circulo(4);
        System.out.println(c1);
        System.out.println("Su area es: " + c1.Area());
        System.out.println("Su perimetro es: " + c1.Perimetro());
        System.out.println();

        Circulo c2 = Circulo.Circulo(p);
        System.out.println(c2);
        System.out.println("Su area es: " + c2.Area());
        System.out.println("Su perimetro es: " + c2.Perimetro());
        System.out.println();

        Circulo c3 = new Circulo(p, 2);
        System.out.println(c3);
        System.out.println("Su area es: " + c3.Area());
        System.out.println("Su perimetro es: " + c3.Perimetro());
        System.out.println();

        System.out.println("Después de escalar " + c3 + " un 50% quedaría: ");
        c3.Escalar(50);
        System.out.println(c3);
        System.out.println();


    }

    public static void testTriangulo() {
        System.out.println();
        System.out.println("TEST DE LA CLASE TRIANGULO");
        Punto p = new Punto(3, 4);

        Triangulo t = new Triangulo();
        System.out.println(t);
        System.out.println("Su area es: " + t.Area());
        System.out.println("Su perimetro es: " + t.Perimetro());
        System.out.println();

        Triangulo t1 = new Triangulo(p, 5, 6);
        System.out.println(t1);
        System.out.println("Su area es: " + t1.Area());
        System.out.println("Su perimetro es: " + t1.Perimetro());
        System.out.println();


        Triangulo t2 = Triangulo.Triangulo(7, 8);
        System.out.println(t2);
        System.out.println("Su area es: " + t2.Area());
        System.out.println("Su perimetro es: " + t2.Perimetro());
        System.out.println();

        Triangulo t3 = Triangulo.Triangulo(p);
        System.out.println(t3);
        System.out.println("Su area es: " + t3.Area());
        System.out.println("Su perimetro es: " + t3.Perimetro());
        System.out.println();

        System.out.println("Después de escalar " + t1 + " un 50% quedaría: ");
        t1.Escalar(50);
        System.out.println(t1);
        System.out.println();

    }

    public static void testCuadrado() {
        System.out.println();
        System.out.println("TEST DE LA CLASE CUADRADO");
        Punto p = new Punto(3, 4);

        Cuadrado c = new Cuadrado();
        System.out.println(c);
        System.out.println("Su area es: " + c.Area());
        System.out.println("Su perimetro es: " + c.Perimetro());
        System.out.println();

        Cuadrado c1 = Cuadrado.Cuadrado(p, 8);
        System.out.println(c1);
        System.out.println("Su area es: " + c1.Area());
        System.out.println("Su perimetro es: " + c1.Perimetro());
        System.out.println();

        Cuadrado c2 = Cuadrado.Cuadrado(5);
        System.out.println(c2);
        System.out.println("Su area es: " + c2.Area());
        System.out.println("Su perimetro es: " + c2.Perimetro());
        System.out.println();

        Cuadrado c3 = Cuadrado.Cuadrado(p);
        System.out.println(c3);
        System.out.println("Su area es: " + c3.Area());
        System.out.println("Su perimetro es: " + c3.Perimetro());
        System.out.println();

        System.out.println("Después de escalar " + c1 + " un 50% quedaría: ");
        c1.Escalar(50);
        System.out.println(c1);
        System.out.println();

    }

    public static void testRectangulo() {
        System.out.println();
        System.out.println("TEST DE LA CLASE RECTANGULO");
        Punto p = new Punto(3, 4);

        Rectangulo r = new Rectangulo();
        System.out.println(r);
        System.out.println("Su area es: " + r.Area());
        System.out.println("Su perimetro es: " + r.Perimetro());
        System.out.println();


        Rectangulo r1 = Rectangulo.Rectangulo(p, 5, 8);
        System.out.println(r1);
        System.out.println("Su area es: " + r1.Area());
        System.out.println("Su perimetro es: " + r1.Perimetro());
        System.out.println();

        Rectangulo r2 = new Rectangulo(2, 4);
        System.out.println(r2);
        System.out.println("Su area es: " + r2.Area());
        System.out.println("Su perimetro es: " + r2.Perimetro());
        System.out.println();

        Rectangulo r3 = new Rectangulo(p);
        System.out.println(r3);
        System.out.println("Su area es: " + r3.Area());
        System.out.println("Su perimetro es: " + r3.Perimetro());
        System.out.println();

        System.out.println("Después de escalar " + r1 + " un 50% quedaría: ");
        r1.Escalar(50);
        System.out.println(r1);
        System.out.println();

        System.out.println("Después de modificar el ancho a 4 "
                + "y el alto a 8 de: " + r2 + "quedaría así:");
        r2.Escalar(4, 8);
        System.out.println(r2);
    }

    public static void DibujarCasa() {
        System.out.println();
        System.out.println("DIBUJAR CASA");
        Figura[] casa = new Figura[2];
        int i;
        double area;

        Cuadrado cuadrado = Cuadrado.Cuadrado(5.0);
        casa[0] = cuadrado;

        Rectangulo rectangulo = Rectangulo.Rectangulo(new Punto(0.0, 0.2),
                1.0, 2.0);
        casa[1] = rectangulo;

        Triangulo triangulo = new Triangulo(new Punto(-1.0, 5.0), 7.0, 4.0);
        casa[2] = triangulo;

        for (i = 0; i < casa.length; i++) {
            casa[i].Desplazar(0.0, 2.0);
        }

        for (i = 0; i < casa.length; i++) {
            System.out.println(casa[i].toString());
        }

        area = 0;
        for (i = 0; i < casa.length; i++) {
            area = area + casa[i].Area();
        }

        System.out.println(area);






    }
}
