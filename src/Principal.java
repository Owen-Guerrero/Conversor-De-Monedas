
import java.util.Scanner;

public class Principal {

    public static int menu(){
        Scanner sc = new Scanner(System.in);
        String opcion;
        int op=1;
        System.out.println("**********************************************************");
        System.out.println("*        BIENVENIDO/A AL CONVERSOR DE MONEDA DEGs        *");
        System.out.println("**********************************************************");

        do {
            if (op>7 || op<1){
                System.out.println("*********************************************************************************");
                System.out.println("*       POR FAVOR, INGRESE UNA OPCIÓN VÁLIDA O DEG TE VISITARÁ ESTA NOCHE      *");
                System.out.println("*********************************************************************************");
            }
            System.out.println("1) Dólar ===> Peso argentino");
            System.out.println("2) Peso argentino ===> Dólar");
            System.out.println("3) Dólar ===> Real brasileño");
            System.out.println("4) Real brasileño ===> Dólar");
            System.out.println("5) Dólar ===> Peso colombiano");
            System.out.println("6) Peso colombiano ===> Dólar");
            System.out.println("7) Salir");
            System.out.print("Elija una opción válida: ");
            opcion = sc.nextLine();

            try{
                op= Integer.parseInt(opcion);
            }catch (NumberFormatException e){
                op = 0;
            }
        }while (op>7 || op<1 );
        System.out.println("**********************************************************");
            return op;


    }

    public static void main(String[] args) {
        ConsultaCambio cambio = new ConsultaCambio();
        Scanner sc = new Scanner(System.in);
        String x="";
        String y="";
        String monto="";
        Double mo=1.0;


        while (true){
            switch (menu()){
                case 1:
                    x = "USD";
                    y = "ARS";
                    break;
                case 2:
                    x = "ARS";
                    y = "USD";
                    break;
                case 3:
                    x = "USD";
                    y = "BRL";
                    break;
                case 4:
                    x = "BRL";
                    y = "USD";
                    break;
                case 5:
                    x = "USD";
                    y = "COP";
                    break;
                case 6:
                    x = "COP";
                    y = "USD";
                    break;
                case 7:
                    System.out.println("Saliendo del programa :[\n" +
                            "Vuelva Pronto...");
                    System.exit(0);

            }
            System.out.println("Ingrese monto a cambiar:");
            do {
                if (mo<0){
                    System.out.println("Ingrese monto correcto: ");
                }
                monto = sc.nextLine();

                try{
                    mo= Double.parseDouble(monto);
                }catch (NumberFormatException e){
                    mo = -1.0;
                }
            }while (mo<0);
            Moneda moneda = cambio.buscaCambio(mo, x, y);
            System.out.println("El valor "+mo+" ["+x+"]"+" " +
                    "corresonde al valor final de .... " +moneda+" ["+y+"]" );
//xd
        }
    }
}
