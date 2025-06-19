import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjecicioFactorial {
    public static void main(String[] args) {

        int num = 0;

            try {

                Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese el numero entero no negativo: ");
                num = Integer.parseInt(sc.nextLine());

                int resFactorial = 1;
               
                for (int i = 2; i <= num; i++) {
                    int res =
                            resFactorial *= i;
                    System.out.println(i);
                }
                System.out.println(resFactorial);
            } catch (Exception e) {
                System.out.println("El numero es incorrecto intenta de nuevo con un numero  entero y positivo");
                main(args);
            }




    }
}