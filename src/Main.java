import java.util.*;
public class Main {
    public static double calculaPreco(double x, String y) {
        double resultado = 0;
        if (x <= 5) {
            switch (y) {
                case "macas":
                    resultado = x * 1.80d;
                    break;
                case "morangos":
                    resultado = x * 2.50d;

            }
        } else {
            switch (y) {
                case "macas":
                    resultado = x * 1.50d;
                    break;
                case "morangos":
                    resultado = x * 2.20d;
            }
        }
        return resultado;
    }

    public static double calculaPrecoTotal(int macas,int morangos){
        return calculaPreco(macas,"macas") + calculaPreco(morangos,"morangos");
    }

    public static double aplicaPorcentagem(int x, int y){
        return (double) 10.00d / 100.00d * calculaPrecoTotal(x,y);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        if((morangos + macas) > 8 || calculaPrecoTotal(macas,morangos) > 25.00){
            System.out.println(calculaPrecoTotal(macas,morangos) - aplicaPorcentagem(macas,morangos));
        }else {
            System.out.println(calculaPreco(macas, "macas") + calculaPreco(morangos, "morangos"));
        }
    }
}