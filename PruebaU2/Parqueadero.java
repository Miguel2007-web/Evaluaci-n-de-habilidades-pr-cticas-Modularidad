import java.util.Scanner;

public class Parqueadero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese los minutos: ");
        int minutos = sc.nextInt();

        while (minutos < 1 || minutos > 1440) {
            System.out.print("Ingrese minutos entre 1 y 1440: ");
            minutos = sc.nextInt();
        }

        System.out.print("Tipo (A=Auto, M=Moto): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        int horas = minutos / 60;

        if (minutos % 60 != 0) {
            horas++;
        }

        double total;

        if (tipo == 'A') {
            total = horas * 1.00;
        } else {
            total = horas * 0.50;
        }

        if (horas > 8) {
            total = total * 0.80;
        }

        System.out.println("Horas cobradas: " + horas);
        System.out.printf("Total: $%2f%n", total);

        sc.close();
    }
}