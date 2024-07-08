import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero ");
        int numero = scanner.nextInt();

        String resultado = "indefinido";


        if (numero < 0){
            resultado = "negativo";
        }
        if (numero > 0){
            resultado = "positivo";
        }
        if (numero %2 == 0){
            System.out.println("o numero " + numero + " par");
        }
        if (numero %2 != 0){
            System.out.println("o numero " + numero + " é impar");
        }


        System.out.println("o numero " + numero + " é um numero " + resultado);



        }
    }
