import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertirMoneda {
    public static void conversion (String monedaPrincipal, String monedaConvertir, ConsultarDivisa consulta, Scanner lectura){
        double cantidad;
        double  cantidadConvertida;

        Monedas monedas = consulta.buscaMoneda(monedaPrincipal, monedaConvertir);
        System.out.println("La tasa de conversion para hoy\n "+monedaPrincipal+ " = "+monedas.conversion_rate()+" "+monedaConvertir);
        System.out.println("Ingrese la cantidad de " + monedaPrincipal);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaPrincipal +" = " + Math.round(cantidadConvertida * 100.0) / 100.0 + " "+ monedaConvertir );
    }
    public static void  otraMonedaConvertir(ConsultarDivisa consulta, Scanner lectura){
        System.out.println("Ingrese el codigo de la moneda principal: ");
        String monedaPrincipal = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese el tipo de moneda que desea convertir");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        conversion(monedaPrincipal, monedaObjetivo, consulta, lectura);
    }




}
