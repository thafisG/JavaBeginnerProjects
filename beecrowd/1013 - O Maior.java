import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        String linha = entrada.readLine();
        
        String[] partes = linha.split(" ");
        
        int a = Integer.parseInt(partes[0]);
        int b = Integer.parseInt(partes[1]);
        int c = Integer.parseInt(partes[2]);
        
        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        
        System.out.println(maiorABC + " eh o maior");
    }
}
