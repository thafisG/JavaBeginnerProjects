import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String linha = entrada.readLine();

        String[] partes = linha.split(" ");

        double baseA = Double.parseDouble(partes[0]);
        double baseB = Double.parseDouble(partes[1]);
        double altura = Double.parseDouble(partes[2]);

        double raio = 3.14159;

        double areaTriangulo = (baseA * altura) / 2;
        double areaCirculo = raio * altura * altura;
        double areaTrapezio = ((baseA + baseB) * altura) / 2;
        double areaQuadrado = baseB * baseB;
        double areaRetangulo = baseA * baseB;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    }
}
