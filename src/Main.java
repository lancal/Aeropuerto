import java.util.Scanner;
import java.lang.Math;

public class Main {
        public static void Menu(){
            System.out.println();
            System.out.println("****************************");
            System.out.println("      Welcome to Menu       ");
            System.out.println("   Please choose a Option   ");
            System.out.println("****************************");
            System.out.println("  1)  Listar ID Aviones     ");
            System.out.println("  2)  Cant. Pasajeros       ");
            System.out.println("  3)  Cant. Asientos        ");
            System.out.println("  4)  Datos Avión           ");
            System.out.println("  5)  Subir Pasajeros       ");
            System.out.println("  6)  Bajar Pasajeros       ");
            System.out.println("  7)  Salir                 ");
            System.out.println("****************************");

        }

        public static int optionValidated(int option){

            if (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option !=7){

                System.out.println("Favor, dar una opción válida");

                return menuOption();

            }

            return option;
        }
        public static int menuOption(){
            Menu();
            Scanner scan = new Scanner(System.in);

            System.out.print("Opción: ");
            return scan.nextInt();
        }

        public static double number(String number){

            Scanner scan = new Scanner(System.in);

            System.out.print("Numero " + number + ": ");
            return scan.nextDouble();
        }
        public static void main(String[] args) {

            boolean flag = true;

            while (flag){

                int option = menuOption();
                int optionValidate = optionValidated(option);

                if (optionValidate == 1) {

                    System.out.print("Opcion 1");
                }

                if (optionValidate == 2) {

                    System.out.print("Opcion 2");
                }

                if (optionValidate == 3) {

                    System.out.print("Opcion 3");
                }

                if (optionValidate == 4) {

                    System.out.print("Opcion 4");
                }

                if (optionValidate == 5) {

                    System.out.print("Opcion 5");
                }

                if(optionValidate == 6 ) {

                    System.out.print("Opcion 6");

                }

                if(optionValidate == 7 ) {
                    flag = false;
                }

            }
        }
}
