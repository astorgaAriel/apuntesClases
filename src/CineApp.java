import java.util.Scanner;
import java.lang.Math;

public class CineApp {

    public static void main(String[] args) {
        try {


            int edad;
            int precioEntrada = 3500;
            System.out.println("Ingrese su edad: ");
            edad = new Scanner(System.in).nextInt();
            int nuevoPrecio = 0;
            if (edad > 120 || edad < 0) {
                System.out.println("Ingresa una edad valida");
                main(args);
            } else if (edad < 5) {
                nuevoPrecio = Math.toIntExact(Math.round(precioEntrada * 0.40));

            } else if (edad > 60) {
                nuevoPrecio = Math.toIntExact(Math.round(precioEntrada * 0.45));
            } else {
                nuevoPrecio = precioEntrada;
                System.out.println("El valor de la entrada es " +nuevoPrecio+" pero por compras superiores a 2 entradas tienes 30% de descuento.\n ****Cauntas entradas deseas comprar****");
                Scanner sc = new Scanner(System.in);

                int entradas = sc.nextInt();

                if (entradas > 1) {
                    nuevoPrecio = Math.toIntExact(Math.round((entradas * nuevoPrecio)*0.70));
                }
            }
            System.out.println("El valor de la entrada es: " + nuevoPrecio);
        }catch (Exception e){
            System.out.println("Error al intentar ingresar los datos");
            System.out.println("intentalo de nuevo");
            main(args);
        }
    }
}