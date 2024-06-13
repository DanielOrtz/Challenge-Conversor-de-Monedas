import java.util.Scanner;
import java.util.function.Consumer;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarDivisa consulta = new ConsultarDivisa();

        int seleccion=0;
        while (seleccion !=8){
            System.out.println("******************************************* \n"+
                 "Buen dia, sea bienvenido/a al convesor de monedas Alura\n"+
             "Selecciona la conversion que quieres utilizar\n\n" +
             "1.- Dollar a peso Argentino\n" +
             "2.- Peso Argentino a Dolar\n" +
             "3.- Dollar a Real Brasilero\n" +
             "4.- Real Brasilero a Dolar\n" +
             "5.- Dolar a peso Colombiano\n" +
             "6.- Peso Colombiano a Dolar\n" +
             "7.- Convertir otra moneda\n" +
             "8.- Salir\n"+
             "*******************************************");
            seleccion = lectura.nextInt();
            lectura.nextLine();

            switch (seleccion){
                case 1:
                    ConvertirMoneda.conversion("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.conversion("ARS", "USD", consulta, lectura);
                break;
                case 3:
                    ConvertirMoneda.conversion("USD", "BRL", consulta, lectura);
                break;
                case 4:
                    ConvertirMoneda.conversion("BRL", "USD", consulta, lectura);
                break;
                case 5:
                    ConvertirMoneda.conversion("USD", "COP", consulta, lectura);
                break;
                case 6:
                    ConvertirMoneda.conversion("COP", "USD", consulta, lectura);
                break;
                case 7:
                    ConvertirMoneda.otraMonedaConvertir(consulta, lectura);
                break;
                case 8:
                    System.out.println("Terminando con la conversion de monedas");
                default:
                    System.out.println("Esta seleccion no es valida");
                    break;

            }
        }
    }
}
