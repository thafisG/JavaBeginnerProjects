import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
       Scanner scanner = new Scanner(System.in);
 
       int distanciaPercorrida = Integer.parseInt(scanner.nextLine());
       double totalCombustivel = Double.parseDouble(scanner.nextLine());
       
       double consumoMedio = distanciaPercorrida / totalCombustivel;
       
       System.out.printf("%.3f km/l%n", consumoMedio);
 
    }
 
}
