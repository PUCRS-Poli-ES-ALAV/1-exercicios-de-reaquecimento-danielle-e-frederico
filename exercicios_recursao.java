import java.util.Scanner;

public class exercicios_recursao()
{

    public static void main(String args[]){
        System.out.println(mul(6,4));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma string: ");
        String str = scanner.nextLine();
        String revString = inverter(str);
        System.out.println("A string invertida: "+revString);
    }

    public static int mul (int a, int b){
        if (a == 0 || b == 0){
            return 0;
        }

        return a + mul(a, b-1);
    }

    public static double soma_meios (int n){
        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1.0;
        }

        return (1.0 / n) + soma_meios(n - 1);
    }

    public static String inverter(String str){
        if (str.isEmpty()){
            return str;
        }

        return inverter(str.substring(1)) + str.charAt(0);
    }
}