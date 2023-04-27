import java.awt.geom.Arc2D;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double idadeTerrestre = scanner.nextDouble();
        String planeta = scanner.next();

        double anoTotal;
        if (planeta.equals("Marte")) {
            anoTotal = idadeTerrestre / 1.88;
            System.out.printf("Idade equivalente em Marte: %.2f anos", anoTotal);
        }else if(planeta.equals("Venus")){
            anoTotal = idadeTerrestre / 0.62;
            System.out.printf("Idade equivalente em Venus: %.2f anos", anoTotal);
        } else if (planeta.equals("Jupiter")){
            anoTotal = idadeTerrestre / 11.68;
            System.out.printf("Idade equivalente em Jupiter: %.2f anos", anoTotal);
        }
        else {
            System.out.println("Planeta invalido.");
        }


        //TODO: Crie as condições para calcular a idade equivalente de cada planeta.

        //TODO: Imprima a saída conforme descrito neste desafio.
    }
}